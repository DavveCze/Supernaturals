package com.gs.supernaturals.data;

import com.google.common.collect.ImmutableList;
import com.gs.supernaturals.blocks.ModBlocks;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.*;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LootTablesGenerator extends LootTableProvider {
    public LootTablesGenerator(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(
                Pair.of(ModBlocks.LootTable::new, LootParameterSets.BLOCK)
        );
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker tracker) {
//        for (ResourceLocation resourcelocation : Sets.difference(ModLootTables.getLootTables(), map.keySet())) {
//            tracker.func_227530_a_("Missing built-in table: " + resourcelocation);
//        }

        map.forEach((resourceLocation, lootTable) -> {
            LootTableManager.func_227508_a_(tracker, resourceLocation, lootTable);
        });
    }
}
