package com.gs.supernaturals.world.gen;

import com.gs.supernaturals.blocks.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {

    public static final ConfiguredFeature<?, ?> SILVER_ORE = Feature.ORE
            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SILVER_ORE.get().getDefaultState(), 9))
            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 64)));

    public static final ConfiguredFeature<?, ?> WHITE_GOLD_ORE = Feature.ORE
            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.WHITE_GOLD_ORE.get().getDefaultState(), 9))
            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 0, 0, 15)));

    public static final ConfiguredFeature<?, ?> AMETHYST_ORE = Feature.ORE
            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.AMETHYST_ORE.get().getDefaultState(), 3))
            .withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 32, 32, 80)));

    public static void setupOreGeneration() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SILVER_ORE);
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, WHITE_GOLD_ORE);
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, AMETHYST_ORE);
        }
    }
}
