package com.gs.supernaturals.effect;

import net.minecraft.potion.EffectType;
import net.minecraftforge.registries.ObjectHolder;

public class ModEffects {
    @ObjectHolder("supernaturals:bleeding")
    public static ModEffect BLEEDING = (ModEffect) new ModEffect(EffectType.HARMFUL, 16284963, "bleeding").setRegistryName("bleeding");
}
