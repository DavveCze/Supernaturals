package com.gs.supernaturals.client.renders;

import com.gs.supernaturals.Supernaturals;
import com.gs.supernaturals.client.models.KitsuneEntityModelUpdated;
import com.gs.supernaturals.entity.creatures.KitsuneEntity;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class KitsuneEntityRenderer extends LivingRenderer<KitsuneEntity, KitsuneEntityModelUpdated> {
    public KitsuneEntityRenderer(EntityRendererManager manager) {
        super(manager, new KitsuneEntityModelUpdated(), 0f);
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(KitsuneEntity entity) {
        return new ResourceLocation(Supernaturals.MOD_ID, "textures/entity/kitsune_entity.png");
    }

}
