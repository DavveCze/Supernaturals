package com.gs.supernaturals.proxy;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ServerProxy implements IProxy {

    @Override
    public void init() {
    }

    @Override
    public World getWorld() {
        throw new IllegalStateException("Only run this on the client!");
    }

    @Override
    public PlayerEntity getPlayer() {
        throw new IllegalStateException("Only run this on the client!");
    }
}
