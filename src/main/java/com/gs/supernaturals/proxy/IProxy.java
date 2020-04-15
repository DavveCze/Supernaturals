package com.gs.supernaturals.proxy;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public interface IProxy {

    void init();

    World getWorld();

    PlayerEntity getPlayer();
}
