package com.gs.supernaturals.effect;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;

import javax.annotation.Nullable;

public class BleedingEffect extends Effect {
    private final EffectType type;
    private final int liquidColor;
    private String name;

    public BleedingEffect(EffectType typeIn, int liquidColorIn, String name) {
        super(typeIn, liquidColorIn);
        this.type = typeIn;
        this.liquidColor = liquidColorIn;
        this.name = name;
    }

    @Override
    public void performEffect(LivingEntity entityLivingBaseIn, int amplifier) {
        if (this.equals(ModEffects.BLEEDING)) {
            if (entityLivingBaseIn.getHealth() > 0.0F) {
                entityLivingBaseIn.attackEntityFrom(DamageSource.GENERIC, 3.0F);
            }
        }
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        if (this.equals(ModEffects.BLEEDING)) {
            int j = 25 >> amplifier;
            if (j > 0) {
                return duration % j == 0;
            } else {
                return true;
            }
        }
        return super.isReady(duration, amplifier);
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
    public BleedingEffect getEffect() {
        return this;
    }

    @Override
    public void affectEntity(@Nullable Entity source, @Nullable Entity indirectSource, LivingEntity entityLivingBaseIn, int amplifier, double health) {
        this.performEffect(entityLivingBaseIn, amplifier);
        super.affectEntity(source, indirectSource, entityLivingBaseIn, amplifier, health);
    }
}
