package com.gs.supernaturals.blocks;

import com.gs.supernaturals.Supernaturals;
import com.gs.supernaturals.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

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
                    () -> new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)),
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
}
