package com.gs.supernaturals.blocks;

import com.gs.supernaturals.HasCustomLootTable;
import net.minecraft.block.OreBlock;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.conditions.MatchTool;
import net.minecraft.world.storage.loot.functions.ApplyBonus;
import net.minecraft.world.storage.loot.functions.ExplosionDecay;

import java.util.function.Supplier;

public class GemOreBlock extends OreBlock implements HasCustomLootTable {

    private final Supplier<? extends Item> gemItem;

    public GemOreBlock(Properties properties, Supplier<? extends Item> gemItem) {
        super(properties);
        this.gemItem = gemItem;
    }

    @Override
    public void registerLootTable(BlockLootTables generator) {
        if (generator instanceof ModBlocks.LootTable) {
            ((ModBlocks.LootTable) generator).registerLootTable(this, new LootTable.Builder()
                    .addLootPool(new LootPool.Builder()
                            .rolls(new RandomValueRange(1))
                            .addEntry(new AlternativesLootEntry.Builder()
                                    .alternatively(
                                            ItemLootEntry.builder(this)
                                                    .acceptCondition(ModBlocks.LootTable.SILK_TOUCH)
                                    ).alternatively(
                                            ItemLootEntry.builder(this.gemItem.get())
                                                    .acceptFunction(ApplyBonus.oreDrops(Enchantments.FORTUNE))
                                                    .acceptFunction(ExplosionDecay.builder())
                                    )
                            )

                    )
            );
        }
    }
}
