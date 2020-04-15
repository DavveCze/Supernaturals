package com.gs.supernaturals.client.models;

import com.gs.supernaturals.entity.creatures.KitsuneEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class KitsuneEntityModel extends EntityModel<KitsuneEntity> {
    public ModelRenderer Head;
    public ModelRenderer TailLeft;
    public ModelRenderer TailCentre;
    public ModelRenderer TailRight;
    public ModelRenderer RightShoulder;
    public ModelRenderer LeftShoulder;
    public ModelRenderer WeirdThingInsideTheHead;
    public ModelRenderer BicepRight;
    public ModelRenderer BicepLeft;
    public ModelRenderer ForearmRight;
    public ModelRenderer Forearmleft;
    public ModelRenderer HandRight;
    public ModelRenderer Handleft;
    public ModelRenderer Chest;
    public ModelRenderer Abdomen;
    public ModelRenderer RightHip;
    public ModelRenderer LeftHip;
    public ModelRenderer ShinLeft;
    public ModelRenderer ShinRight;
    public ModelRenderer FootLeft;
    public ModelRenderer FootRight;
    public ModelRenderer AnkleLeft;
    public ModelRenderer AnkleLeft_1;
    public ModelRenderer RightEar;
    public ModelRenderer LeftEar;
    public ModelRenderer Snout;

    public KitsuneEntityModel() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Forearmleft = new ModelRenderer(this, 0, 0);
        this.Forearmleft.setRotationPoint(4.8F, 7.0F, -0.7F);
        this.Forearmleft.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(Forearmleft, -0.33161255787892263F, 0.0F, 0.0F);
        this.RightHip = new ModelRenderer(this, 40, 16);
        this.RightHip.setRotationPoint(0.0F, 12.0F, -1.2F);
        this.RightHip.addBox(0.0F, 0.0F, 0.0F, 4, 5, 5, 0.0F);
        this.LeftHip = new ModelRenderer(this, 32, 48);
        this.LeftHip.setRotationPoint(-2.8F, 12.0F, -1.2F);
        this.LeftHip.addBox(0.0F, 0.0F, 0.0F, 4, 5, 4, 0.0F);
        this.HandRight = new ModelRenderer(this, 0, 0);
        this.HandRight.setRotationPoint(-6.7F, 12.3F, -2.6F);
        this.HandRight.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(HandRight, 1.2217304763960306F, 0.0F, 0.0F);
        this.Abdomen = new ModelRenderer(this, 16, 16);
        this.Abdomen.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Abdomen.addBox(-3.0F, 7.0F, -2.0F, 6, 5, 4, 0.0F);
        this.AnkleLeft_1 = new ModelRenderer(this, 0, 0);
        this.AnkleLeft_1.setRotationPoint(-2.5F, 20.0F, 0.0F);
        this.AnkleLeft_1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.Handleft = new ModelRenderer(this, 0, 0);
        this.Handleft.setRotationPoint(4.5F, 12.3F, -2.6F);
        this.Handleft.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(Handleft, 1.2217304763960306F, 0.0F, 0.0F);
        this.RightEar = new ModelRenderer(this, 16, 14);
        this.RightEar.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.RightEar.addBox(-2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.BicepLeft = new ModelRenderer(this, 0, 0);
        this.BicepLeft.setRotationPoint(4.4F, 4.0F, -1.2F);
        this.BicepLeft.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.TailRight = new ModelRenderer(this, 0, 0);
        this.TailRight.setRotationPoint(-2.7F, 11.7F, 1.5F);
        this.TailRight.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(TailRight, 2.283414260384182F, -0.27314402793711257F, 0.0F);
        this.FootRight = new ModelRenderer(this, 0, 0);
        this.FootRight.setRotationPoint(0.3F, 22.0F, -2.0F);
        this.FootRight.addBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
        this.Chest = new ModelRenderer(this, 16, 16);
        this.Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chest.addBox(-4.0F, 0.0F, -2.0F, 8, 7, 4, 0.0F);
        this.WeirdThingInsideTheHead = new ModelRenderer(this, 24, 0);
        this.WeirdThingInsideTheHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WeirdThingInsideTheHead.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, 0.0F);
        this.Snout = new ModelRenderer(this, 0, 10);
        this.Snout.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.Snout.addBox(-0.5F, 0.0F, -5.0F, 3, 2, 3, 0.0F);
        this.FootLeft = new ModelRenderer(this, 0, 0);
        this.FootLeft.setRotationPoint(-2.8F, 22.0F, -2.0F);
        this.FootLeft.addBox(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
        this.LeftEar = new ModelRenderer(this, 16, 14);
        this.LeftEar.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.LeftEar.addBox(2.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.RightShoulder = new ModelRenderer(this, 40, 16);
        this.RightShoulder.setRotationPoint(-4.8F, 2.0F, 0.0F);
        this.RightShoulder.addBox(-3.0F, -2.0F, -2.0F, 4, 5, 5, 0.0F);
        this.AnkleLeft = new ModelRenderer(this, 0, 0);
        this.AnkleLeft.setRotationPoint(0.5F, 20.0F, 0.0F);
        this.AnkleLeft.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.BicepRight = new ModelRenderer(this, 0, 0);
        this.BicepRight.setRotationPoint(-6.8F, 4.0F, -1.1F);
        this.BicepRight.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(-1.0F, -3.19F, -1.0F);
        this.Head.addBox(-2.0F, -3.0F, -2.0F, 6, 6, 6, 0.0F);
        this.TailLeft = new ModelRenderer(this, 0, 0);
        this.TailLeft.setRotationPoint(1.6F, 11.7F, 2.0F);
        this.TailLeft.addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
        this.setRotateAngle(TailLeft, 2.276432943376204F, 0.27314402793711257F, 0.0F);
        this.TailCentre = new ModelRenderer(this, 0, 0);
        this.TailCentre.setRotationPoint(-1.1F, 11.7F, 2.0F);
        this.TailCentre.addBox(0.0F, 0.0F, 0.0F, 3, 13, 3, 0.0F);
        this.setRotateAngle(TailCentre, 2.276432943376204F, 0.0F, 0.0F);
        this.ShinLeft = new ModelRenderer(this, 0, 0);
        this.ShinLeft.setRotationPoint(-2.2F, 16.0F, -0.8F);
        this.ShinLeft.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(ShinLeft, 0.24434609527920614F, 0.0F, 0.0F);
        this.ForearmRight = new ModelRenderer(this, 0, 0);
        this.ForearmRight.setRotationPoint(-6.4F, 7.0F, -0.7F);
        this.ForearmRight.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(ForearmRight, -0.33161255787892263F, 0.0F, 0.0F);
        this.LeftShoulder = new ModelRenderer(this, 32, 48);
        this.LeftShoulder.setRotationPoint(4.8F, 2.0F, 0.0F);
        this.LeftShoulder.addBox(-1.0F, -2.0F, -2.0F, 4, 5, 4, 0.0F);
        this.ShinRight = new ModelRenderer(this, 0, 0);
        this.ShinRight.setRotationPoint(0.8F, 16.0F, -0.8F);
        this.ShinRight.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(ShinRight, 0.24434609527920614F, 0.0F, 0.0F);
        this.Head.addChild(this.RightEar);
        this.Head.addChild(this.Snout);
        this.Head.addChild(this.LeftEar);
    }

    @Override
    public void setRotationAngles(KitsuneEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

//    public void r(KitsuneEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.Forearmleft.offsetX, this.Forearmleft.offsetY, this.Forearmleft.offsetZ);
//        GlStateManager.translatef(this.Forearmleft.rotationPointX * scale, this.Forearmleft.rotationPointY * scale, this.Forearmleft.rotationPointZ * scale);
//        GlStateManager.scaled(0.7D, 1.1D, 0.9D);
//        GlStateManager.translatef(-this.Forearmleft.offsetX, -this.Forearmleft.offsetY, -this.Forearmleft.offsetZ);
//        GlStateManager.translatef(-this.Forearmleft.rotationPointX * scale, -this.Forearmleft.rotationPointY * scale, -this.Forearmleft.rotationPointZ * scale);
//        this.Forearmleft.render(scale);
//        GlStateManager.popMatrix();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.RightHip.offsetX, this.RightHip.offsetY, this.RightHip.offsetZ);
//        GlStateManager.translatef(this.RightHip.rotationPointX * scale, this.RightHip.rotationPointY * scale, this.RightHip.rotationPointZ * scale);
//        GlStateManager.scaled(0.6D, 0.8D, 0.5D);
//        GlStateManager.translatef(-this.RightHip.offsetX, -this.RightHip.offsetY, -this.RightHip.offsetZ);
//        GlStateManager.translatef(-this.RightHip.rotationPointX * scale, -this.RightHip.rotationPointY * scale, -this.RightHip.rotationPointZ * scale);
//        this.RightHip.render(scale);
//        GlStateManager.popMatrix();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.LeftHip.offsetX, this.LeftHip.offsetY, this.LeftHip.offsetZ);
//        GlStateManager.translatef(this.LeftHip.rotationPointX * scale, this.LeftHip.rotationPointY * scale, this.LeftHip.rotationPointZ * scale);
//        GlStateManager.scaled(0.6D, 0.8D, 0.6D);
//        GlStateManager.translatef(-this.LeftHip.offsetX, -this.LeftHip.offsetY, -this.LeftHip.offsetZ);
//        GlStateManager.translatef(-this.LeftHip.rotationPointX * scale, -this.LeftHip.rotationPointY * scale, -this.LeftHip.rotationPointZ * scale);
//        this.LeftHip.render(scale);
//        GlStateManager.popMatrix();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.HandRight.offsetX, this.HandRight.offsetY, this.HandRight.offsetZ);
//        GlStateManager.translatef(this.HandRight.rotationPointX * scale, this.HandRight.rotationPointY * scale, this.HandRight.rotationPointZ * scale);
//        GlStateManager.scaled(1.0D, 1.1D, 1.1D);
//        GlStateManager.translatef(-this.HandRight.offsetX, -this.HandRight.offsetY, -this.HandRight.offsetZ);
//        GlStateManager.translatef(-this.HandRight.rotationPointX * scale, -this.HandRight.rotationPointY * scale, -this.HandRight.rotationPointZ * scale);
//        this.HandRight.render(scale);
//        GlStateManager.popMatrix();
//        this.Abdomen.render(scale);
//        this.AnkleLeft_1.render(scale);
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.Handleft.offsetX, this.Handleft.offsetY, this.Handleft.offsetZ);
//        GlStateManager.translatef(this.Handleft.rotationPointX * scale, this.Handleft.rotationPointY * scale, this.Handleft.rotationPointZ * scale);
//        GlStateManager.scaled(1.0D, 1.1D, 1.1D);
//        GlStateManager.translatef(-this.Handleft.offsetX, -this.Handleft.offsetY, -this.Handleft.offsetZ);
//        GlStateManager.translatef(-this.Handleft.rotationPointX * scale, -this.Handleft.rotationPointY * scale, -this.Handleft.rotationPointZ * scale);
//        this.Handleft.render(scale);
//        GlStateManager.popMatrix();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.BicepLeft.offsetX, this.BicepLeft.offsetY, this.BicepLeft.offsetZ);
//        GlStateManager.translatef(this.BicepLeft.rotationPointX * scale, this.BicepLeft.rotationPointY * scale, this.BicepLeft.rotationPointZ * scale);
//        GlStateManager.scaled(1.2D, 1.2D, 1.2D);
//        GlStateManager.translatef(-this.BicepLeft.offsetX, -this.BicepLeft.offsetY, -this.BicepLeft.offsetZ);
//        GlStateManager.translatef(-this.BicepLeft.rotationPointX * scale, -this.BicepLeft.rotationPointY * scale, -this.BicepLeft.rotationPointZ * scale);
//        this.BicepLeft.render(scale);
//        GlStateManager.popMatrix();
//        this.TailRight.render(scale);
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.FootRight.offsetX, this.FootRight.offsetY, this.FootRight.offsetZ);
//        GlStateManager.translatef(this.FootRight.rotationPointX * scale, this.FootRight.rotationPointY * scale, this.FootRight.rotationPointZ * scale);
//        GlStateManager.scaled(0.8D, 1.3D, 0.8D);
//        GlStateManager.translatef(-this.FootRight.offsetX, -this.FootRight.offsetY, -this.FootRight.offsetZ);
//        GlStateManager.translatef(-this.FootRight.rotationPointX * scale, -this.FootRight.rotationPointY * scale, -this.FootRight.rotationPointZ * scale);
//        this.FootRight.render(scale);
//        GlStateManager.popMatrix();
//        this.Chest.render(scale);
//        this.WeirdThingInsideTheHead.render(scale);
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.FootLeft.offsetX, this.FootLeft.offsetY, this.FootLeft.offsetZ);
//        GlStateManager.translatef(this.FootLeft.rotationPointX * scale, this.FootLeft.rotationPointY * scale, this.FootLeft.rotationPointZ * scale);
//        GlStateManager.scaled(0.8D, 1.3D, 0.8D);
//        GlStateManager.translatef(-this.FootLeft.offsetX, -this.FootLeft.offsetY, -this.FootLeft.offsetZ);
//        GlStateManager.translatef(-this.FootLeft.rotationPointX * scale, -this.FootLeft.rotationPointY * scale, -this.FootLeft.rotationPointZ * scale);
//        this.FootLeft.render(scale);
//        GlStateManager.popMatrix();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.RightShoulder.offsetX, this.RightShoulder.offsetY, this.RightShoulder.offsetZ);
//        GlStateManager.translatef(this.RightShoulder.rotationPointX * scale, this.RightShoulder.rotationPointY * scale, this.RightShoulder.rotationPointZ * scale);
//        GlStateManager.scaled(0.8D, 0.8D, 0.7D);
//        GlStateManager.translatef(-this.RightShoulder.offsetX, -this.RightShoulder.offsetY, -this.RightShoulder.offsetZ);
//        GlStateManager.translatef(-this.RightShoulder.rotationPointX * scale, -this.RightShoulder.rotationPointY * scale, -this.RightShoulder.rotationPointZ * scale);
//        this.RightShoulder.render(scale);
//        GlStateManager.popMatrix();
//        this.AnkleLeft.render(scale);
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.BicepRight.offsetX, this.BicepRight.offsetY, this.BicepRight.offsetZ);
//        GlStateManager.translatef(this.BicepRight.rotationPointX * scale, this.BicepRight.rotationPointY * scale, this.BicepRight.rotationPointZ * scale);
//        GlStateManager.scaled(1.2D, 1.2D, 1.2D);
//        GlStateManager.translatef(-this.BicepRight.offsetX, -this.BicepRight.offsetY, -this.BicepRight.offsetZ);
//        GlStateManager.translatef(-this.BicepRight.rotationPointX * scale, -this.BicepRight.rotationPointY * scale, -this.BicepRight.rotationPointZ * scale);
//        this.BicepRight.render(scale);
//        GlStateManager.popMatrix();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.Head.offsetX, this.Head.offsetY, this.Head.offsetZ);
//        GlStateManager.translatef(this.Head.rotationPointX * scale, this.Head.rotationPointY * scale, this.Head.rotationPointZ * scale);
//        GlStateManager.scaled(1.1D, 1.1D, 1.1D);
//        GlStateManager.translatef(-this.Head.offsetX, -this.Head.offsetY, -this.Head.offsetZ);
//        GlStateManager.translatef(-this.Head.rotationPointX * scale, -this.Head.rotationPointY * scale, -this.Head.rotationPointZ * scale);
//        this.Head.render(scale);
//        GlStateManager.popMatrix();
//        this.TailLeft.render(scale);
//        this.TailCentre.render(scale);
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.ShinLeft.offsetX, this.ShinLeft.offsetY, this.ShinLeft.offsetZ);
//        GlStateManager.translatef(this.ShinLeft.rotationPointX * scale, this.ShinLeft.rotationPointY * scale, this.ShinLeft.rotationPointZ * scale);
//        GlStateManager.scaled(0.9D, 1.2D, 1.0D);
//        GlStateManager.translatef(-this.ShinLeft.offsetX, -this.ShinLeft.offsetY, -this.ShinLeft.offsetZ);
//        GlStateManager.translatef(-this.ShinLeft.rotationPointX * scale, -this.ShinLeft.rotationPointY * scale, -this.ShinLeft.rotationPointZ * scale);
//        this.ShinLeft.render(scale);
//        GlStateManager.popMatrix();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.ForearmRight.offsetX, this.ForearmRight.offsetY, this.ForearmRight.offsetZ);
//        GlStateManager.translatef(this.ForearmRight.rotationPointX * scale, this.ForearmRight.rotationPointY * scale, this.ForearmRight.rotationPointZ * scale);
//        GlStateManager.scaled(0.7D, 1.1D, 0.9D);
//        GlStateManager.translatef(-this.ForearmRight.offsetX, -this.ForearmRight.offsetY, -this.ForearmRight.offsetZ);
//        GlStateManager.translatef(-this.ForearmRight.rotationPointX * scale, -this.ForearmRight.rotationPointY * scale, -this.ForearmRight.rotationPointZ * scale);
//        this.ForearmRight.render(scale);
//        GlStateManager.popMatrix();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.LeftShoulder.offsetX, this.LeftShoulder.offsetY, this.LeftShoulder.offsetZ);
//        GlStateManager.translatef(this.LeftShoulder.rotationPointX * scale, this.LeftShoulder.rotationPointY * scale, this.LeftShoulder.rotationPointZ * scale);
//        GlStateManager.scaled(0.8D, 0.8D, 0.8D);
//        GlStateManager.translatef(-this.LeftShoulder.offsetX, -this.LeftShoulder.offsetY, -this.LeftShoulder.offsetZ);
//        GlStateManager.translatef(-this.LeftShoulder.rotationPointX * scale, -this.LeftShoulder.rotationPointY * scale, -this.LeftShoulder.rotationPointZ * scale);
//        this.LeftShoulder.render(scale);
//        GlStateManager.popMatrix();
//        GlStateManager.pushMatrix();
//        GlStateManager.translatef(this.ShinRight.offsetX, this.ShinRight.offsetY, this.ShinRight.offsetZ);
//        GlStateManager.translatef(this.ShinRight.rotationPointX * scale, this.ShinRight.rotationPointY * scale, this.ShinRight.rotationPointZ * scale);
//        GlStateManager.scaled(0.8D, 1.2D, 1.0D);
//        GlStateManager.translatef(-this.ShinRight.offsetX, -this.ShinRight.offsetY, -this.ShinRight.offsetZ);
//        GlStateManager.translatef(-this.ShinRight.rotationPointX * scale, -this.ShinRight.rotationPointY * scale, -this.ShinRight.rotationPointZ * scale);
//        this.ShinRight.render(scale);
//        GlStateManager.popMatrix();
//    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
