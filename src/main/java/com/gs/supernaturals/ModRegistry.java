package com.gs.supernaturals;

import com.gs.supernaturals.effect.ModEffects;
import com.gs.supernaturals.entity.ModEntities;
import com.gs.supernaturals.effect.ModEffectInstance;
import com.gs.supernaturals.item.weapon.DaggerItem;
import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.gs.supernaturals.Supernaturals.creativeTab;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {

    // Register Potions
    @SubscribeEvent
    public static void onPotionRegistry(final RegistryEvent.Register<Potion> potionRegistryEvent) {
        potionRegistryEvent.getRegistry().register(new Potion(new EffectInstance(ModEffects.BLEEDING, 900,0, false,true)).setRegistryName("bleeding"));
    }

}
