package com.gs.supernaturals.world.gen;

import com.gs.supernaturals.core.ModBlocks;
import com.gs.supernaturals.core.ModEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeManager;

public class EntitySpawning {

    public static void setupEntitySpawning() {
        // CountRangeConfig(count, bottomOffset, topOffset, maximum)
        // Silver
        EntityClassification kitsuneClassification = EntityClassification.CREATURE;

        for(BiomeManager.BiomeType btype : BiomeManager.BiomeType.values()) {
            for (BiomeManager.BiomeEntry biomeEntry : BiomeManager.getBiomes(btype)) {
                biomeEntry.biome.getSpawns(kitsuneClassification).add(new Biome.SpawnListEntry(ModEntity.KITSUNE, 10, 1,100));
            }
        }
    }
}
