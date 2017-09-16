package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Knarl extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer LegL;
	ModelRenderer LegR;
	ModelRenderer LegBackL;
	ModelRenderer LegBackR;
	ModelRenderer TopHead;
	ModelRenderer Snout;
	ModelRenderer Nose;

	public Knarl() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -1.5f, -2.0f, 3, 3, 2);
		this.Head.setRotationPoint(0.0f, 21.4f, -1.4f);
		this.Head.setTextureSize(64, 32);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 10)).addBox(-2.5f, -2.0f, -2.5f, 5, 4, 5);
		this.Body.setRotationPoint(0.0f, 21.0f, 1.0f);
		this.Body.setTextureSize(64, 32);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.LegL = new ModelRenderer(this, 0, 20)).addBox(-0.5f, 0.0f, -2.0f, 1, 1, 2);
		this.LegL.setRotationPoint(1.5f, 23.0f, 0.0f);
		this.LegL.setTextureSize(64, 32);
		this.LegL.mirror = true;
		this.setRotation(this.LegL, 0.0f, 0.0f, 0.0f);
		(this.LegR = new ModelRenderer(this, 0, 20)).addBox(-0.5f, 0.0f, -2.0f, 1, 1, 2);
		this.LegR.setRotationPoint(-1.5f, 23.0f, 0.0f);
		this.LegR.setTextureSize(64, 32);
		this.LegR.mirror = true;
		this.setRotation(this.LegR, 0.0f, 0.0f, 0.0f);
		(this.LegBackL = new ModelRenderer(this, 0, 20)).addBox(-0.5f, 0.0f, -2.0f, 1, 1, 2);
		this.LegBackL.setRotationPoint(1.5f, 23.0f, 3.0f);
		this.LegBackL.setTextureSize(64, 32);
		this.LegBackL.mirror = true;
		this.setRotation(this.LegBackL, 0.0f, 0.0f, 0.0f);
		(this.LegBackR = new ModelRenderer(this, 0, 20)).addBox(-0.5f, 0.0f, -2.0f, 1, 1, 2);
		this.LegBackR.setRotationPoint(-1.5f, 23.0f, 3.0f);
		this.LegBackR.setTextureSize(64, 32);
		this.LegBackR.mirror = true;
		this.setRotation(this.LegBackR, 0.0f, 0.0f, 0.0f);
		(this.TopHead = new ModelRenderer(this, 0, 5)).addBox(-2.0f, -1.0f, -1.0f, 4, 2, 2);
		this.TopHead.setRotationPoint(0.0f, 20.0f, -2.5f);
		this.TopHead.setTextureSize(64, 32);
		this.TopHead.mirror = true;
		this.setRotation(this.TopHead, 0.0f, 0.0f, 0.0f);
		(this.Snout = new ModelRenderer(this, 11, 0)).addBox(-1.0f, -0.5f, -2.0f, 2, 1, 2);
		this.Snout.setRotationPoint(0.0f, 22.0f, -2.5f);
		this.Snout.setTextureSize(64, 32);
		this.Snout.mirror = true;
		this.setRotation(this.Snout, 0.0f, 0.0f, 0.0f);
		(this.Nose = new ModelRenderer(this, 20, 0)).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 1);
		this.Nose.setRotationPoint(0.0f, 21.9f, -3.8f);
		this.Nose.setTextureSize(64, 32);
		this.Nose.mirror = true;
		this.setRotation(this.Nose, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Head.render(f5);
		this.Body.render(f5);
		this.LegL.render(f5);
		this.LegR.render(f5);
		this.LegBackL.render(f5);
		this.LegBackR.render(f5);
		this.TopHead.render(f5);
		this.Snout.render(f5);
		this.Nose.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
