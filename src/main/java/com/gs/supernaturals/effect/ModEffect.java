package com.gs.supernaturals.effect;

import com.gs.supernaturals.Supernaturals;
import com.gs.supernaturals.core.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;

public  class ModEffect extends Effect {
    private final EffectType type;
    private final int liquidColor;
    private String name;

    public ModEffect(EffectType typeIn, int liquidColorIn, String name) {
        super(typeIn, liquidColorIn);
        this.type = typeIn;
        this.liquidColor = liquidColorIn;
        this.name = name;
    }

    @Override
    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
        if (this.equals(ModEffects.BLEEDING)) {
            if (entityLivingBaseIn.getHealth() > 0.0F) {
                entityLivingBaseIn.attackEntityFrom(DamageSource.GENERIC, 1.0F);
            }
        }
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        if (this.getEffect().equals(ModEffects.BLEEDING)) {
            int j = 10 >> amplifier;
            if (j > 0) {
                return duration % j == 0;
            } else {
                return true;
            }
        } else {
            return this.equals(Effects.HUNGER);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getLiquidColor() {
        return this.liquidColor;
    }

    @Override
    public EffectType getEffectType() {
        return this.type;
    }

    @Override
    public ModEffect getEffect() {
        return (ModEffect)this;
    }
}
