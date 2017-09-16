package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Dementor extends ModelBase {

	ModelRenderer Head;
	ModelRenderer BodyTop;
	ModelRenderer BodyBase;
	ModelRenderer ArmR;
	ModelRenderer ArmL;
	ModelRenderer HeadCape;
	ModelRenderer ArmRCape;
	ModelRenderer ArmLCape;

	public Dementor() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-3.5f, -7.0f, -3.5f, 7, 7, 7);
		this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.Head.setTextureSize(128, 64);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.BodyTop = new ModelRenderer(this, 24, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		this.BodyTop.setRotationPoint(0.0f, 0.0f, 1.0f);
		this.BodyTop.setTextureSize(128, 64);
		this.BodyTop.mirror = true;
		this.setRotation(this.BodyTop, 0.0f, 0.0f, 0.0f);
		(this.BodyBase = new ModelRenderer(this, 0, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 10, 4);
		this.BodyBase.setRotationPoint(0.0f, 11.6f, 1.0f);
		this.BodyBase.setTextureSize(128, 64);
		this.BodyBase.mirror = true;
		this.setRotation(this.BodyBase, 0.1745329f, 0.0f, 0.0f);
		(this.ArmR = new ModelRenderer(this, 48, 16)).addBox(-3.5f, -1.0f, -1.5f, 3, 12, 3);
		this.ArmR.setRotationPoint(-3.5f, 2.0f, 1.0f);
		this.ArmR.setTextureSize(128, 64);
		this.ArmR.mirror = true;
		this.setRotation(this.ArmR, -1.308997f, 0.0f, 0.0f);
		(this.ArmL = new ModelRenderer(this, 48, 16)).addBox(0.5f, -1.0f, -1.5f, 3, 12, 3);
		this.ArmL.setRotationPoint(3.5f, 2.0f, 1.0f);
		this.ArmL.setTextureSize(128, 64);
		this.ArmL.mirror = true;
		this.setRotation(this.ArmL, -1.308997f, 0.0f, 0.0f);
		(this.HeadCape = new ModelRenderer(this, 28, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		this.HeadCape.setRotationPoint(0.0f, 0.1f, 0.0f);
		this.HeadCape.setTextureSize(128, 64);
		this.HeadCape.mirror = true;
		this.setRotation(this.HeadCape, 0.0f, 0.0f, 0.0f);
		(this.ArmRCape = new ModelRenderer(this, 61, 16)).addBox(-4.0f, -2.0f, -2.0f, 4, 12, 4);
		this.ArmRCape.setRotationPoint(-3.5f, 2.0f, 1.0f);
		this.ArmRCape.setTextureSize(128, 64);
		this.ArmRCape.mirror = true;
		this.setRotation(this.ArmRCape, -1.308997f, 0.0f, 0.0f);
		(this.ArmLCape = new ModelRenderer(this, 61, 16)).addBox(0.0f, -2.0f, -2.0f, 4, 12, 4);
		this.ArmLCape.setRotationPoint(3.5f, 2.0f, 1.0f);
		this.ArmLCape.setTextureSize(128, 64);
		this.ArmLCape.mirror = true;
		this.setRotation(this.ArmLCape, -1.308997f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Head.render(f5);
		this.BodyTop.render(f5);
		this.BodyBase.render(f5);
		this.ArmR.render(f5);
		this.ArmL.render(f5);
		this.HeadCape.render(f5);
		this.ArmRCape.render(f5);
		this.ArmLCape.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
