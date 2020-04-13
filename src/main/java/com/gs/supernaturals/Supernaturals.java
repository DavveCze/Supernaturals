package com.gs.supernaturals;

import com.gs.supernaturals.proxy.ClientProxy;
import com.gs.supernaturals.proxy.IProxy;
import com.gs.supernaturals.proxy.ServerProxy;
import com.gs.supernaturals.util.Reference;
import com.gs.supernaturals.world.gen.EntitySpawning;
import com.gs.supernaturals.world.gen.OreGeneration;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.gs.supernaturals.Supernaturals.MOD_ID;

@Mod(MOD_ID)
public class Supernaturals {

    public static final String MOD_ID = "supernaturals";

    public static final Logger LOGGER = LogManager.getLogger();

    public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

    public static final ItemGroup creativeTab = new ItemGroup(Reference.MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.IRON_DOOR);
        }
    };

    public Supernaturals() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        OreGeneration.setupOreGeneration();
        EntitySpawning.setupEntitySpawning();

        proxy.init();
    }
}
