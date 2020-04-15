package com.gs.supernaturals;

import net.minecraft.data.loot.BlockLootTables;

public interface HasCustomLootTable {

    void registerLootTable(BlockLootTables generator);

}
