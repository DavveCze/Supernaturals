package com.gs.supernaturals.blocks;

import com.gs.supernaturals.HasCustomLootTable;
import com.gs.supernaturals.Supernaturals;
import com.gs.supernaturals.item.ModItems;
import net.minecraft.advancements.criterion.EnchantmentPredicate;
import net.minecraft.advancements.criterion.ItemPredicate;
import net.minecraft.advancements.criterion.MinMaxBounds;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.conditions.ILootCondition;
import net.minecraft.world.storage.loot.conditions.MatchTool;
import net.minecraft.world.storage.loot.functions.ApplyBonus;
import net.minecraft.world.storage.loot.functions.ILootFunction;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Supernaturals.MOD_ID);

    public static final RegistryObject<OreBlock> SILVER_ORE = register(
            "silver_ore",
            () -> new OreBlock(OreBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f)),
            new Item.Properties().group(Supernaturals.creativeTab)
    );

    public static final RegistryObject<Block> SILVER_BLOCK = register(
            "silver_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)),
            new Item.Properties().group(Supernaturals.creativeTab)
    );

    public static final RegistryObject<OreBlock> WHITE_GOLD_ORE = register(
            "white_gold_ore",
            () -> new OreBlock(OreBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)),
            new Item.Properties().group(Supernaturals.creativeTab)
    );

    public static final RegistryObject<Block> WHITE_GOLD_BLOCK = register(
            "white_gold_block",
                    () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)),
            new Item.Properties().group(Supernaturals.creativeTab)
    );

    public static final RegistryObject<Block> MAGIC_WOOD = register(
            "magic_wood",
                    () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)),
            new Item.Properties().group(Supernaturals.creativeTab)
    );

    public static final RegistryObject<Block> CURSED_WOOD = register(
            "cursed_wood",
                    () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)),
            new Item.Properties().group(Supernaturals.creativeTab)
    );

    public static final RegistryObject<OreBlock> AMETHYST_ORE = register(
            "amethyst_ore",
                    () -> new GemOreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f), ModItems.AMETHYST),
            new Item.Properties().group(Supernaturals.creativeTab)
    );

    public static final RegistryObject<Block> AMETHYST_BLOCK = register(
            "amethyst_block",
                    () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 6.0f).sound(SoundType.METAL)),
            new Item.Properties().group(Supernaturals.creativeTab)
    );

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, Item.Properties properties) {
        RegistryObject<T> b = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(b.get(), properties));
        return b;
    }

    public static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        return register(name, block, new Item.Properties());
    }

    public static class LootTable extends BlockLootTables {

        public static final ILootCondition.IBuilder SILK_TOUCH = MatchTool.builder(ItemPredicate.Builder.create().enchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.IntBound.atLeast(1))));

        @Override
        protected void addTables() {
            BLOCKS.getEntries().stream()
                    .map(RegistryObject::get)
                    .forEach(block -> {
                        if (block instanceof HasCustomLootTable) {
                            ((HasCustomLootTable) block).registerLootTable(this);
                        } else {
                            this.registerDropSelfLootTable(block);
                        }
                    });
        }

        @Override
        public void registerLootTable(Block blockIn, net.minecraft.world.storage.loot.LootTable.Builder table) {
            super.registerLootTable(blockIn, table);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return BLOCKS.getEntries().stream()
                    .map(RegistryObject::get)
                    .collect(Collectors.toList());
        }

    }
}
