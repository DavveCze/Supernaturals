package com.gs.supernaturals.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

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
//        ShapelessRecipeBuilder.shapelessRecipe(ModBlocks.SILVER_BLOCK.get())
//                .addIngredient(ModItems.SILVER_INGOT.get(), 9)
//                .addCriterion("has_silver_ingot", InventoryChangeTrigger.Instance.forItems(ModItems.SILVER_INGOT.get()))
//                .build(consumer);
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.SILVER_INGOT.get(), 9)
//                .addIngredient(ModBlocks.SILVER_BLOCK.get())
//                .addCriterion("has_silver_ingot", InventoryChangeTrigger.Instance.forItems(ModItems.SILVER_INGOT.get()))
//                .build(consumer, id("silver_ingot_from_block"));
//
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.SILVER_NUGGET.get(), 9)
//                .addIngredient(ModItems.SILVER_INGOT.get())
//                .addCriterion("has_silver_ingot", InventoryChangeTrigger.Instance.forItems(ModItems.SILVER_INGOT.get()))
//                .build(consumer);
//        ShapelessRecipeBuilder.shapelessRecipe(ModItems.SILVER_INGOT.get())
//                .addIngredient(ModItems.SILVER_NUGGET.get(), 9)
//                .addCriterion("has_silver_ingot", InventoryChangeTrigger.Instance.forItems(ModItems.SILVER_INGOT.get()))
//                .build(consumer, id("silver_ingot_from_nugget"));
    }

    private static ResourceLocation id(String name) {
        return new ResourceLocation(MOD_ID, name);
    }
}
