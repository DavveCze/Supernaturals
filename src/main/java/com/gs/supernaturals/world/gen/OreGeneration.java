package com.gs.supernaturals.world.gen;

import com.gs.supernaturals.blocks.ModBlocks;
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
        // Silver
        CountRangeConfig silverOrePlacement = new CountRangeConfig(10, 0, 0, 64);
        int silverOreVeinSize = 9;

        // White Gold
        CountRangeConfig whiteGoldOrePlacement = new CountRangeConfig(10, 0, 0, 15);
        int whiteGoldVeinSize = 9;

        // Amethyst
        CountRangeConfig amethystOrePlacement = new CountRangeConfig(20, 32, 32, 80);
        int amethystVeinSize = 3;

        for(BiomeManager.BiomeType btype : BiomeManager.BiomeType.values()) {
            for (BiomeManager.BiomeEntry biomeEntry : BiomeManager.getBiomes(btype)) {
                // Silver
                biomeEntry.biome.addFeature( GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig( OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SILVER_ORE.getDefaultState(), silverOreVeinSize), Placement.COUNT_RANGE, silverOrePlacement));
                // White Gold
                biomeEntry.biome.addFeature( GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig( OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.WHITE_GOLD_ORE.getDefaultState(), whiteGoldVeinSize), Placement.COUNT_RANGE, whiteGoldOrePlacement));
                // Amethyst
                biomeEntry.biome.addFeature( GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig( OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.AMETHYST_ORE.getDefaultState(), amethystVeinSize), Placement.COUNT_RANGE, whiteGoldOrePlacement));
            }
        }
    }
}
