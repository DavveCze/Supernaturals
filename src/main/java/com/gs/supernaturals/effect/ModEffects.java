package com.gs.supernaturals.effect;

import com.gs.supernaturals.Supernaturals;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

public class ModEffects {

    public static final DeferredRegister<Effect> EFFECTS = new DeferredRegister<>(ForgeRegistries.POTIONS, Supernaturals.MOD_ID);

    public static RegistryObject<Effect> BLEEDING = EFFECTS.register("bleeding", () ->
            new BleedingEffect(EffectType.HARMFUL, 16284963, "bleeding"));
}
