package com.gs.supernaturals.world.gen;

import com.gs.supernaturals.entity.ModEntities;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeManager;

public class EntitySpawning {

    public static void setupEntitySpawning() {
        // CountRangeConfig(count, bottomOffset, topOffset, maximum)
        // Silver
        EntityClassification kitsuneClassification = EntityClassification.CREATURE;

        for(BiomeManager.BiomeType btype : BiomeManager.BiomeType.values()) {
            for (BiomeManager.BiomeEntry biomeEntry : BiomeManager.getBiomes(btype)) {
                biomeEntry.biome.getSpawns(kitsuneClassification).add(new Biome.SpawnListEntry(ModEntities.KITSUNE, 10, 1,100));
            }
        }
    }
}
