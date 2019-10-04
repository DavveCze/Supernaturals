package com.gs.supernaturals.client.renders;

import com.gs.supernaturals.client.models.KitsuneEntityModelUpdated;
import com.gs.supernaturals.entity.creatures.KitsuneEntity;
import com.gs.supernaturals.util.Reference;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class KitsuneEntityRender extends LivingRenderer<KitsuneEntity, KitsuneEntityModelUpdated> {
    public KitsuneEntityRender(EntityRendererManager manager) {
        super(manager, new KitsuneEntityModelUpdated(), 0f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(KitsuneEntity entity) {
        return new ResourceLocation(Reference.MODID, "textures/entity/kitsune_entity.png");
    }

    public static class RenderFactory implements IRenderFactory<KitsuneEntity> {
        @Override
        public EntityRenderer<? super KitsuneEntity> createRenderFor(EntityRendererManager manager) {
            return new KitsuneEntityRender(manager);
        }
    }
}
