package com.gs.supernaturals;

import com.gs.supernaturals.blocks.ModBlocks;
import com.gs.supernaturals.data.LootTablesGenerator;
import com.gs.supernaturals.data.RecipesGenerator;
import com.gs.supernaturals.effect.ModEffects;
import com.gs.supernaturals.entity.ModEntities;
import com.gs.supernaturals.item.ModItems;
import com.gs.supernaturals.proxy.ClientProxy;
import com.gs.supernaturals.proxy.IProxy;
import com.gs.supernaturals.proxy.ServerProxy;
import com.gs.supernaturals.world.gen.OreGeneration;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.gs.supernaturals.Supernaturals.MOD_ID;

@Mod(MOD_ID)
public class Supernaturals {

    public static final String NAME = "Supernaturals";
    public static final String MOD_ID = "supernaturals";

    public static final Logger LOGGER = LogManager.getLogger();

    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public static final ItemGroup creativeTab = new ItemGroup(MOD_ID) {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.IRON_DOOR);
        }
    };

    public Supernaturals() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);
        bus.addListener(this::gatherData);

        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModEffects.EFFECTS.register(bus);
        ModEntities.ENTITIES.register(bus);
    }

    private void gatherData(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();

        if (e.includeServer()) {
            generator.addProvider(new LootTablesGenerator(generator));
            generator.addProvider(new RecipesGenerator(generator));
        }

    }

    private void setup(final FMLCommonSetupEvent event) {
        OreGeneration.setupOreGeneration();

        proxy.init();
    }
}
