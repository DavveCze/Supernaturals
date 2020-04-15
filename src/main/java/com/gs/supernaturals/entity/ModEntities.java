package com.gs.supernaturals.entity;

import com.gs.supernaturals.Supernaturals;
import com.gs.supernaturals.entity.creatures.KitsuneEntity;
import com.gs.supernaturals.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = Supernaturals.MOD_ID)
public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Supernaturals.MOD_ID);

    public static final RegistryObject<EntityType<KitsuneEntity>> KITSUNE = register("kitsune",
            EntityType.Builder.create(KitsuneEntity::new, EntityClassification.CREATURE),
            0xfcba03, 0xe05702
    );

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> e) {
        addSpawn(KITSUNE.get(), 6, 2, 5, ForgeRegistries.BIOMES.getValues());

        EntitySpawnPlacementRegistry.register(KITSUNE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.WORLD_SURFACE, KitsuneEntity::spawnPlacement);
    }

    public static <T extends Entity> RegistryObject<EntityType<T>> register(String key, EntityType.Builder<T> builder, int primaryColor, int secondaryColor) {
        EntityType<T> type = builder.build(key);
        ModItems.ITEMS.register(
                key+"_spawn_egg",
                () -> new SpawnEggItem(type, primaryColor, secondaryColor,
                        new Item.Properties().group(ItemGroup.MISC)
                )
        );
        return ENTITIES.register(key, () -> type);
    }

    public static <T extends Entity> void addSpawn(EntityType<T> type, int weightedProb, int min, int max, Biome... biomes) {
        for (Biome biome : biomes) {
            biome.getSpawns(type.getClassification()).add(new Biome.SpawnListEntry(type, weightedProb, min, max));
        }
    }

    public static <T extends Entity> void addSpawn(EntityType<T> type, int weightedProb, int min, int max, Collection<Biome> biomes) {
        for (Biome biome : biomes) {
            biome.getSpawns(type.getClassification()).add(new Biome.SpawnListEntry(type, weightedProb, min, max));
        }
    }

    public static <T extends Entity> void addSpawnExcluding(EntityType<T> type, int weightedProb, int min, int max, Biome... biomesToExclude) {
        ArrayList<Biome> biomes = new ArrayList<>(ForgeRegistries.BIOMES.getValues());
        biomes.removeAll(Arrays.asList(biomesToExclude));
        biomes.forEach(biome -> {
            biome.getSpawns(type.getClassification()).add(new Biome.SpawnListEntry(type, weightedProb, min, max));
        });
    }

//    public static boolean spawnPredicateLight(IWorld world, BlockPos blockPos, Random random) {
//        if (world.getLightFor(LightType.SKY, blockPos) > random.nextInt(32)) {
//            return false;
//        } else {
//            int lvt_3_1_ = world.getWorld().isThundering() ? world.getNeighborAwareLightSubtracted(blockPos, 10) : world.getLight(blockPos);
//            return lvt_3_1_ <= random.nextInt(8);
//        }
//    }
//
//    public static boolean spawnPredicateCanSpawn(EntityType<? extends MobEntity> entityType, IWorld world, SpawnReason spawnReason, BlockPos blockPos, Random random) {
//        BlockPos blockpos = blockPos.down();
//        return spawnReason == SpawnReason.SPAWNER || world.getBlockState(blockpos).canEntitySpawn(world, blockpos, entityType);
//    }
}
