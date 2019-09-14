package com.gs.supernaturals.core;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {

    @ObjectHolder("supernaturals:silver_ore")
    public static BlockItem SILVERORE;
    @ObjectHolder("supernaturals:silver_block")
    public static BlockItem SILVERBLOCK;
    @ObjectHolder("supernaturals:silver_ingot")
    public static Item SILVERINGOT;
    @ObjectHolder("supernaturals:silver_nugget")
    public static Item SILVERNUGGET;

    @ObjectHolder("supernaturals:white_gold_ore")
    public static BlockItem WHITEGOLDORE;
    @ObjectHolder("supernaturals:white_gold_block")
    public static BlockItem WHITEGOLDBLOCK;
    @ObjectHolder("supernaturals:white_gold_ingot")
    public static Item WHITEGOLDINGOT;
    @ObjectHolder("supernaturals:white_gold_nugget")
    public static Item WHITEGOLDNUGGET;

    @ObjectHolder("supernaturals:amethyst_ore")
    public static Item AMETHYST;

    @ObjectHolder("supernaturals:magic_wood")
    public static Item MAGICWOOD;
    @ObjectHolder("supernaturals:cursed_wood")
    public static Item CURSEDWOOD;

    @ObjectHolder("supernaturals:dagger")
    public static SwordItem DAGGER;
}
