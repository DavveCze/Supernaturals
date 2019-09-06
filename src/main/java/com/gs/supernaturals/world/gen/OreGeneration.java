package com.gs.supernaturals.world.gen;

import com.gs.supernaturals.core.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeManager;

public class OreGeneration {

    public static void setupOreGeneration() {
        // CountRangeConfig(count, bottomOffset, topOffset, maximum)
        CountRangeConfig silverOrePlacement = new CountRangeConfig(10, 0, 0, 64);
        int silverOreVeinSize = 9;

        for(BiomeManager.BiomeType btype : BiomeManager.BiomeType.values()) {
            for (BiomeManager.BiomeEntry biomeEntry : BiomeManager.getBiomes(btype)) {
                biomeEntry.biome.addFeature( GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig( OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SILVERORE.getDefaultState(), silverOreVeinSize), Placement.COUNT_RANGE, silverOrePlacement));
            }
        }
    }
}
