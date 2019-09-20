package com.gs.supernaturals.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;

public class ModEffectInstance extends EffectInstance {

    private final Effect potion;
    private int duration;
    private int amplifier;

    public ModEffectInstance(Effect potionIn, int durationIn, int amplifierIn, boolean ambientIn, boolean showParticlesIn) {
        super(potionIn, durationIn, amplifierIn, ambientIn, showParticlesIn);
        this.duration = durationIn;
        this.amplifier = amplifierIn;
        this.potion = potionIn;
    }

    public ModEffectInstance(EffectInstance other) {
        super(other);
        this.duration = other.getDuration();
        this.amplifier = other.getAmplifier();
        this.potion = other.getPotion();
    }

    @Override
    public boolean tick(LivingEntity entityIn) {
        if (this.duration > 0) {
            if (this.potion.isReady(this.duration, this.amplifier)) {
                this.performEffect(entityIn);
            }

            this.deincrementDuration();
        }

        return this.duration > 0;
    }

    private int deincrementDuration() { return --this.duration; }
}
