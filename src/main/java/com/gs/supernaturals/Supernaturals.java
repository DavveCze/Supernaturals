package com.gs.supernaturals;

import com.gs.supernaturals.setup.ClientProxy;
import com.gs.supernaturals.setup.IProxy;
import com.gs.supernaturals.setup.ServerProxy;
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

    // Mod ID for reference
    public static final String MODID = "supernaturals";

    // Setup proxy
    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    // Main
    public Supernaturals() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    // Setup
    public void setup(final FMLCommonSetupEvent event) {
        proxy.init();
    }
}
