package com.gs.supernaturals.data;

import com.gs.supernaturals.blocks.ModBlocks;
import com.gs.supernaturals.item.ModItemTier;
import com.gs.supernaturals.item.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.block.Block;
import net.minecraft.data.*;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static com.gs.supernaturals.Supernaturals.MOD_ID;

public class RecipesGenerator extends RecipeProvider {
    public RecipesGenerator(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
//        CookingRecipeBuilder.smeltingRecipe(
//                Ingredient.fromItems(ModBlocks.SILVER_ORE.get().asItem()), ModItems.SILVER_INGOT.get(), 1.0f, 200)
//                .addCriterion("has_silver_ore", InventoryChangeTrigger.Instance.forItems(ModBlocks.SILVER_ORE.get()))
//                .build(consumer);
//

        buildMaterialRecipeSet("silver"    , consumer, ModItems.SILVER_INGOT    , ModItems.SILVER_NUGGET    , ModBlocks.SILVER_BLOCK);
        buildMaterialRecipeSet("white_gold", consumer, ModItems.WHITE_GOLD_INGOT, ModItems.WHITE_GOLD_NUGGET, ModBlocks.WHITE_GOLD_BLOCK);

        buildDaggerRecipeForTier(ModItems.DAGGER           , ItemTier.IRON         , consumer);
        buildDaggerRecipeForTier(ModItems.SILVER_DAGGER    , ModItemTier.SILVER    , consumer);
        buildDaggerRecipeForTier(ModItems.WHITE_GOLD_DAGGER, ModItemTier.WHITE_GOLD, consumer);
    }

    public void buildDaggerRecipeForTier(Supplier<? extends Item> result, IItemTier tier, Consumer<IFinishedRecipe> consumer) {
        Ingredient materialIng = tier.getRepairMaterial();
        Item material = materialIng.getMatchingStacks()[0].getItem();

        ShapedRecipeBuilder.shapedRecipe(result.get())
                .patternLine("I")
                .patternLine("S")
                .key('I', materialIng)
                .key('S', Items.STICK)
                .addCriterion("has_"+material.getRegistryName().getPath(), InventoryChangeTrigger.Instance.forItems(material))
                .build(consumer);
    }

    public void buildMaterialRecipeSet(String matName, Consumer<IFinishedRecipe> consumer, Supplier<Item> ingot, Supplier<Item> nugget, Supplier<Block> block) {
        ShapelessRecipeBuilder.shapelessRecipe(block.get())
                .addIngredient(block.get(), 9)
                .addCriterion("has_"+matName+"_ingot", this.hasItem(ingot.get()))
                .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ingot.get(), 9)
                .addIngredient(block.get())
                .addCriterion("has_"+matName+"_ingot", this.hasItem(ingot.get()))
                .setGroup(ingot.get().getRegistryName().getNamespace())
                .build(consumer, id(matName+"_ingot_from_block"));

        ShapelessRecipeBuilder.shapelessRecipe(nugget.get(), 9)
                .addIngredient(ingot.get())
                .addCriterion("has_"+matName+"_ingot", this.hasItem(ingot.get()))
                .build(consumer);

        ShapelessRecipeBuilder.shapelessRecipe(ingot.get())
                .addIngredient(nugget.get(), 9)
                .addCriterion("has_"+matName+"_ingot", this.hasItem(ingot.get()))
                .setGroup(ingot.get().getRegistryName().getNamespace())
                .build(consumer, id(matName+"_ingot_from_nugget"));
    }

    private static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
