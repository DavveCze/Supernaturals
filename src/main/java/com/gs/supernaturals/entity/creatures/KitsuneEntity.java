package com.gs.supernaturals.entity.creatures;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class KitsuneEntity extends IronGolemEntity {
    public KitsuneEntity(EntityType<? extends IronGolemEntity> type, World worldIn) {
        super(type, worldIn);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new MeleeAttackGoal(this, 1.0D, true));
        this.goalSelector.addGoal(1, new MoveTowardsTargetGoal(this, 1D, 32F));
        this.goalSelector.addGoal(2, new MoveTowardsVillageGoal( this, 0.6D));
        this.goalSelector.addGoal(3, new MoveThroughVillageGoal(this, 0.6D, false, 4, () -> {
            return false;
        }));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 0.6D));
        this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));

        this.targetSelector.addGoal(1, new DefendVillageTargetGoal(this));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(35.0d);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0d);
    }

    public static <T extends MobEntity> boolean spawnPlacement(EntityType<T> type, IWorld world, SpawnReason spawnReason, BlockPos blockPos, Random random) {
        return true;
    }
}
