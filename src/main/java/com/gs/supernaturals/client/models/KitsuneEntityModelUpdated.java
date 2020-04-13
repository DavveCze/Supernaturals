package com.gs.supernaturals.client.models;

import com.gs.supernaturals.entity.creatures.KitsuneEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

/**
 * ModelPlayer - Unakitinoneko
 * Created using Tabula 7.0.1
 */
public class KitsuneEntityModelUpdated extends EntityModel<KitsuneEntity> {
    public ModelRenderer Chest;
    public ModelRenderer Abdomen;
    public ModelRenderer RightShoulder;
    public ModelRenderer leftShoulder;
    public ModelRenderer Head;
    public ModelRenderer Waist;
    public ModelRenderer right_hip;
    public ModelRenderer tail1center;
    public ModelRenderer LeftHip;
    public ModelRenderer tail1right;
    public ModelRenderer tail1left;
    public ModelRenderer ShinRight;
    public ModelRenderer AnkleRight;
    public ModelRenderer FootRight;
    public ModelRenderer tail2center;
    public ModelRenderer tail3center;
    public ModelRenderer tail4center;
    public ModelRenderer ShinLeft;
    public ModelRenderer AnkleLeft;
    public ModelRenderer FootLeft;
    public ModelRenderer tail2right;
    public ModelRenderer tail3right;
    public ModelRenderer tail4right;
    public ModelRenderer tail2left;
    public ModelRenderer tail3left;
    public ModelRenderer tail4left;
    public ModelRenderer rarm2;
    public ModelRenderer rarm3;
    public ModelRenderer rclaws;
    public ModelRenderer larm2;
    public ModelRenderer larm3;
    public ModelRenderer lclaws;
    public ModelRenderer KatanaHandle;
    public ModelRenderer KatanaBlade;
    public ModelRenderer RightEar;
    public ModelRenderer Snout;
    public ModelRenderer leftear;
    public ModelRenderer nose;

    public KitsuneEntityModelUpdated() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.tail3center = new ModelRenderer(this, 0, 30);
        this.tail3center.setRotationPoint(0.5F, 3.9F, 0.5F);
        this.tail3center.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tail3center, -0.2033308578573394F, 0.0F, 0.0F);
        this.ShinRight = new ModelRenderer(this, 40, 23);
        this.ShinRight.setRotationPoint(0.5F, 6.0F, 0.7F);
        this.ShinRight.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(ShinRight, 0.6373942428283291F, 0.0F, 0.0F);
        this.Waist = new ModelRenderer(this, 35, 15);
        this.Waist.setRotationPoint(-0.5F, 10.2F, -0.3F);
        this.Waist.addBox(0.0F, 0.0F, 0.0F, 7, 3, 5, 0.0F);
        this.setRotateAngle(Waist, 0.06771877497737998F, 0.0F, 0.0153588974175501F);
        this.KatanaHandle = new ModelRenderer(this, 9, 50);
        this.KatanaHandle.setRotationPoint(0.8F, 4.3F, -2.5F);
        this.KatanaHandle.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F);
        this.rarm2 = new ModelRenderer(this, 8, 46);
        this.rarm2.setRotationPoint(0.0F, 2.6F, 0.8F);
        this.rarm2.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(rarm2, -0.11466813185602746F, 0.0F, -0.06771877497737998F);
        this.RightEar = new ModelRenderer(this, 18, 0);
        this.RightEar.setRotationPoint(-1.2F, -5.6F, 1.5F);
        this.RightEar.addBox(-0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(RightEar, 0.136659280431156F, 0.0F, 0.2033308578573394F);
        this.Abdomen = new ModelRenderer(this, 22, 0);
        this.Abdomen.setRotationPoint(0.5F, -1.1F, 0.0F);
        this.Abdomen.addBox(0.0F, 7.0F, 0.0F, 6, 5, 4, 0.0F);
        this.lclaws = new ModelRenderer(this, 54, 48);
        this.lclaws.setRotationPoint(2.1F, 4.3F, 0.0F);
        this.lclaws.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(lclaws, 0.0F, 0.0F, 1.0471975511965976F);
        this.rarm3 = new ModelRenderer(this, 30, 46);
        this.rarm3.setRotationPoint(-0.5F, 4.3F, 0.0F);
        this.rarm3.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rarm3, -0.11292280260403312F, 0.0F, -0.11292280260403312F);
        this.tail4right = new ModelRenderer(this, 16, 37);
        this.tail4right.setRotationPoint(0.5F, 2.8F, 0.4F);
        this.tail4right.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(tail4right, -0.11292280260403312F, 0.0F, 0.0F);
        this.right_hip = new ModelRenderer(this, 0, 10);
        this.right_hip.setRotationPoint(-0.5F, 1.3F, 0.1F);
        this.right_hip.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
        this.FootRight = new ModelRenderer(this, 48, 27);
        this.FootRight.setRotationPoint(-0.5F, 5.4F, -1.7F);
        this.FootRight.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(FootRight, 0.22689280275926282F, 0.0F, 0.0F);
        this.tail3left = new ModelRenderer(this, 21, 41);
        this.tail3left.setRotationPoint(0.5F, 3.9F, 0.5F);
        this.tail3left.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tail3left, -0.2033308578573394F, 0.0F, 0.0F);
        this.nose = new ModelRenderer(this, 0, 0);
        this.nose.setRotationPoint(1.0F, -0.1F, -0.4F);
        this.nose.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(nose, 0.31869712141416456F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 16, 9);
        this.Head.setRotationPoint(2.4F, -1.9F, 0.5F);
        this.Head.addBox(-2.0F, -3.0F, -2.0F, 6, 5, 6, 0.0F);
        this.larm3 = new ModelRenderer(this, 42, 48);
        this.larm3.setRotationPoint(-0.5F, 4.3F, 0.0F);
        this.larm3.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(larm3, -0.11292280260403312F, 0.0F, 0.11292280260403312F);
        this.Chest = new ModelRenderer(this, 0, 0);
        this.Chest.setRotationPoint(-3.1F, 0.0F, 0.0F);
        this.Chest.addBox(0.0F, 0.0F, 0.0F, 7, 6, 4, 0.0F);
        this.setRotateAngle(Chest, 0.022514747350726852F, 0.0F, 0.0F);
        this.tail1center = new ModelRenderer(this, 39, 6);
        this.tail1center.setRotationPoint(2.1F, 3.0F, 3.5F);
        this.tail1center.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(tail1center, 1.4570008595648662F, 0.0F, 0.0F);
        this.tail1right = new ModelRenderer(this, 16, 20);
        this.tail1right.setRotationPoint(1.1F, 3.1F, 2.4F);
        this.tail1right.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(tail1right, 1.1074114103904023F, -0.6101671064972176F, 0.022514747350726852F);
        this.ShinLeft = new ModelRenderer(this, 36, 31);
        this.ShinLeft.setRotationPoint(0.5F, 6.0F, 0.7F);
        this.ShinLeft.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(ShinLeft, 0.6373942428283291F, 0.0F, 0.0F);
        this.leftear = new ModelRenderer(this, 12, 10);
        this.leftear.setRotationPoint(1.2F, -5.2F, 1.5F);
        this.leftear.addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(leftear, 0.136659280431156F, 0.0F, -0.2033308578573394F);
        this.tail4left = new ModelRenderer(this, 0, 46);
        this.tail4left.setRotationPoint(0.5F, 2.8F, 0.4F);
        this.tail4left.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(tail4left, -0.11292280260403312F, 0.0F, 0.0F);
        this.Snout = new ModelRenderer(this, 51, 53);
        this.Snout.setRotationPoint(-0.5F, 0.2F, -4.6F);
        this.Snout.addBox(0.0F, 0.0F, -0.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(Snout, 0.15812683023068624F, 0.0F, 0.0F);
        this.KatanaBlade = new ModelRenderer(this, 0, 51);
        this.KatanaBlade.setRotationPoint(0.0F, -1.1F, -11.8F);
        this.KatanaBlade.addBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F);
        this.setRotateAngle(KatanaBlade, -0.091106186954104F, 0.0F, 0.0F);
        this.leftShoulder = new ModelRenderer(this, 51, 3);
        this.leftShoulder.setRotationPoint(6.2F, 0.6F, 0.5F);
        this.leftShoulder.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(leftShoulder, 0.0F, 0.0F, -0.24853488548399255F);
        this.RightShoulder = new ModelRenderer(this, 42, 0);
        this.RightShoulder.setRotationPoint(-1.8F, -0.1F, 0.5F);
        this.RightShoulder.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.setRotateAngle(RightShoulder, 0.0F, 0.0F, 0.24853488548399255F);
        this.tail2center = new ModelRenderer(this, 12, 28);
        this.tail2center.setRotationPoint(-0.5F, 2.1F, -0.5F);
        this.tail2center.addBox(0.0F, 0.0F, 0.0F, 4, 5, 4, 0.0F);
        this.LeftHip = new ModelRenderer(this, 0, 20);
        this.LeftHip.setRotationPoint(3.5F, 1.3F, 0.1F);
        this.LeftHip.addBox(0.0F, 0.0F, 0.0F, 4, 6, 4, 0.0F);
        this.tail1left = new ModelRenderer(this, 28, 23);
        this.tail1left.setRotationPoint(3.6F, 3.2F, 4.8F);
        this.tail1left.addBox(0.0F, 0.0F, 0.0F, 3, 5, 3, 0.0F);
        this.setRotateAngle(tail1left, 1.1074114103904023F, 0.6101671064972176F, 0.022514747350726852F);
        this.AnkleRight = new ModelRenderer(this, 54, 9);
        this.AnkleRight.setRotationPoint(0.5F, 3.5F, 1.0F);
        this.AnkleRight.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(AnkleRight, -0.9560913642424937F, 0.0F, 0.0F);
        this.tail4center = new ModelRenderer(this, 28, 31);
        this.tail4center.setRotationPoint(0.5F, 2.8F, 0.4F);
        this.tail4center.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(tail4center, -0.11292280260403312F, 0.0F, 0.0F);
        this.FootLeft = new ModelRenderer(this, 24, 36);
        this.FootLeft.setRotationPoint(-0.5F, 5.4F, -1.7F);
        this.FootLeft.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
        this.setRotateAngle(FootLeft, 0.22689280275926282F, 0.0F, 0.0F);
        this.tail3right = new ModelRenderer(this, 35, 39);
        this.tail3right.setRotationPoint(0.5F, 3.9F, 0.5F);
        this.tail3right.addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tail3right, -0.2033308578573394F, 0.0F, 0.0F);
        this.tail2left = new ModelRenderer(this, 47, 39);
        this.tail2left.setRotationPoint(-0.5F, 2.1F, -0.5F);
        this.tail2left.addBox(0.0F, 0.0F, 0.0F, 4, 5, 4, 0.0F);
        this.larm2 = new ModelRenderer(this, 22, 48);
        this.larm2.setRotationPoint(0.7F, 2.6F, 0.8F);
        this.larm2.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(larm2, -0.11466813185602746F, 0.0F, 0.06771877497737998F);
        this.rclaws = new ModelRenderer(this, 16, 45);
        this.rclaws.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.rclaws.addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        this.setRotateAngle(rclaws, 0.0F, 0.0F, -0.2937389131106456F);
        this.AnkleLeft = new ModelRenderer(this, 48, 32);
        this.AnkleLeft.setRotationPoint(0.5F, 3.5F, 1.0F);
        this.AnkleLeft.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
        this.setRotateAngle(AnkleLeft, -0.9560913642424937F, 0.0F, 0.0F);
        this.tail2right = new ModelRenderer(this, 0, 37);
        this.tail2right.setRotationPoint(-0.5F, 2.1F, -0.5F);
        this.tail2right.addBox(0.0F, 0.0F, 0.0F, 4, 5, 4, 0.0F);
        this.tail2center.addChild(this.tail3center);
        this.right_hip.addChild(this.ShinRight);
        this.Abdomen.addChild(this.Waist);
        this.larm3.addChild(this.KatanaHandle);
        this.RightShoulder.addChild(this.rarm2);
        this.Head.addChild(this.RightEar);
        this.Chest.addChild(this.Abdomen);
        this.larm3.addChild(this.lclaws);
        this.rarm2.addChild(this.rarm3);
        this.tail3right.addChild(this.tail4right);
        this.Waist.addChild(this.right_hip);
        this.AnkleRight.addChild(this.FootRight);
        this.tail2left.addChild(this.tail3left);
        this.Snout.addChild(this.nose);
        this.Chest.addChild(this.Head);
        this.larm2.addChild(this.larm3);
        this.Waist.addChild(this.tail1center);
        this.Waist.addChild(this.tail1right);
        this.LeftHip.addChild(this.ShinLeft);
        this.Head.addChild(this.leftear);
        this.tail3left.addChild(this.tail4left);
        this.Head.addChild(this.Snout);
        this.KatanaHandle.addChild(this.KatanaBlade);
        this.Chest.addChild(this.leftShoulder);
        this.Chest.addChild(this.RightShoulder);
        this.tail1center.addChild(this.tail2center);
        this.Waist.addChild(this.LeftHip);
        this.Waist.addChild(this.tail1left);
        this.ShinRight.addChild(this.AnkleRight);
        this.tail3center.addChild(this.tail4center);
        this.AnkleLeft.addChild(this.FootLeft);
        this.tail2right.addChild(this.tail3right);
        this.tail1left.addChild(this.tail2left);
        this.leftShoulder.addChild(this.larm2);
        this.rarm3.addChild(this.rclaws);
        this.ShinLeft.addChild(this.AnkleLeft);
        this.tail1right.addChild(this.tail2right);
    }

    @Override
    public void setRotationAngles(KitsuneEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
        this.Chest.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
    }

//    @Override
//    public void render(KitsuneEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//        this.Chest.render(f5);
//    }


    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
