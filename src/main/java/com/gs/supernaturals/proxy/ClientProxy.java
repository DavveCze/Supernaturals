package com.gs.supernaturals.proxy;

import com.gs.supernaturals.client.renders.KitsuneEntityRender;
import com.gs.supernaturals.entity.ModEntities;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy implements IProxy {

    @Override
    public void init() {
        RenderingRegistry.registerEntityRenderingHandler(ModEntities.KITSUNE.get(), KitsuneEntityRender::new);
    }

    @Override
    public World getWorld() {
        return Minecraft.getInstance().world;
    }

    @Override
    public PlayerEntity getPlayer() {
        return Minecraft.getInstance().player;
    }
}
