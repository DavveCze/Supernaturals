package com.gs.supernaturals.client.renders;

import com.gs.supernaturals.entity.creatures.KitsuneEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class ModRenderRegistry {
    public static void registryEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(KitsuneEntity.class, new KitsuneEntityRender.RenderFactory());
    }
}
