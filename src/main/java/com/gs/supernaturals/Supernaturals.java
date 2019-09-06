package com.gs.supernaturals;

import com.gs.supernaturals.core.ModBlocks;
import com.gs.supernaturals.setup.ClientProxy;
import com.gs.supernaturals.setup.IProxy;
import com.gs.supernaturals.setup.ServerProxy;
import com.gs.supernaturals.util.Reference;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("supernaturals")
public class Supernaturals {
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    // Setup proxy
    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    // Add Creative Tab
    public static final ItemGroup creativeTab = new ItemGroup(Reference.MODID) {
        // Sets the tab icon to the passed item
        // TODO: Update the item passed to Supernaturals item
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.IRON_DOOR);
        }
    };

    // Main
    public Supernaturals() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    // Setup
    private void setup(final FMLCommonSetupEvent event) {
        proxy.init();
    }
}
