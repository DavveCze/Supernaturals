package com.gs.supernaturals.core;

import com.gs.supernaturals.effect.ModEffectInstance;
import com.gs.supernaturals.item.weapon.Dagger;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.gs.supernaturals.Supernaturals.creativeTab;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {

    // Register Blocks
    @SubscribeEvent
    public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
        blockRegistryEvent.getRegistry().register(new OreBlock(OreBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0f,3.0f)).setRegistryName("silver_ore"));
        blockRegistryEvent.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)).setRegistryName("silver_block"));
        blockRegistryEvent.getRegistry().register(new OreBlock(OreBlock.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)).setRegistryName("white_gold_ore"));
        blockRegistryEvent.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL)).setRegistryName("white_gold_block"));
        blockRegistryEvent.getRegistry().register(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f, 3.0f)).setRegistryName("amethyst_ore"));
        blockRegistryEvent.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 6.0f).sound(SoundType.METAL)).setRegistryName("amethyst_block"));
        blockRegistryEvent.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("magic_wood"));
        blockRegistryEvent.getRegistry().register(new Block(Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("cursed_wood"));
    }

    // Register Potions
    @SubscribeEvent
    public static void onPotionRegistry(final RegistryEvent.Register<Potion> potionRegistryEvent) {
        potionRegistryEvent.getRegistry().register(new Potion(new EffectInstance(ModEffects.BLEEDING, 900,0, false,true)).setRegistryName("bleeding"));
    }

    // Register Items
    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
        itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.SILVERORE, new Item.Properties().group(creativeTab)).setRegistryName(ModBlocks.SILVERORE.getRegistryName()));
        itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.SILVERBLOCK, new Item.Properties().group(creativeTab)).setRegistryName(ModBlocks.SILVERBLOCK.getRegistryName()));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("silver_ingot"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("silver_nugget"));

        itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.WHITEGOLDORE, new Item.Properties().group(creativeTab)).setRegistryName(ModBlocks.WHITEGOLDORE.getRegistryName()));
        itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.WHITEGOLDBLOCK, new Item.Properties().group(creativeTab)).setRegistryName(ModBlocks.WHITEGOLDBLOCK.getRegistryName()));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("white_gold_ingot"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("white_gold_nugget"));

        // TODO: REMOVE THIS BLOCK ITEM BEFORE RELEASE
        itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.AMETHYSTORE, new Item.Properties().group(creativeTab)).setRegistryName(ModBlocks.AMETHYSTORE.getRegistryName()));

        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("amethyst"));
        itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.AMETHYSTBLOCK, new Item.Properties().group(creativeTab)).setRegistryName(ModBlocks.AMETHYSTBLOCK.getRegistryName()));

        itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.MAGICWOOD, new Item.Properties().group(creativeTab)).setRegistryName("magic_wood"));
        itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.CURSEDWOOD, new Item.Properties().group(creativeTab)).setRegistryName("cursed_wood"));

        itemRegistryEvent.getRegistry().register(new Dagger(ItemTier.IRON, 1, -2.4f, new SwordItem.Properties().maxDamage(150).group(creativeTab), new ModEffectInstance(ModEffects.BLEEDING,900,0,false,true), "iron_ingot").setRegistryName("dagger"));
        itemRegistryEvent.getRegistry().register(new Dagger(ItemTier.IRON, 1, -2.4f, new SwordItem.Properties().maxDamage(132).group(creativeTab), new ModEffectInstance(ModEffects.BLEEDING, 900, 0, false, true), "silver_ingot").setRegistryName("silver_dagger"));
        itemRegistryEvent.getRegistry().register(new Dagger(ItemTier.IRON, 1, -2.4f, new SwordItem.Properties().maxDamage(104).group(creativeTab), new ModEffectInstance(ModEffects.BLEEDING, 900, 0, false, true), "white_gold_ingot").setRegistryName("white_gold_dagger"));

        itemRegistryEvent.getRegistry().register(new SwordItem(ItemTier.WOOD, 9, -2.4f, new SwordItem.Properties().maxDamage(5).group(creativeTab)).setRegistryName("druid_leaf"));

        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("bear_fang"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("wolf_fur"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("wolf_heart"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("bird_wing"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("dolphin_fin"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("jaguar_fang"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("jaguar_coat"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("lizard_scale"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("lizard_heart"));

        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("silver_tip"));
        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("brew_glass"));


        itemRegistryEvent.getRegistry().register(new Item(new Item.Properties().group(creativeTab)).setRegistryName("scream_bottle"));
    }
}
