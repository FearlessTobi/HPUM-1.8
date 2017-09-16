package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class RatFrom extends ModelBase {

	ModelRenderer Body2;
	ModelRenderer Body1;
	ModelRenderer Head;
	ModelRenderer Nose;
	ModelRenderer HearL;
	ModelRenderer HearR;
	ModelRenderer ThightL;
	ModelRenderer ThightR;
	ModelRenderer FootL1;
	ModelRenderer FootL2;
	ModelRenderer FootR1;
	ModelRenderer FootR2;
	ModelRenderer Tail;

	public RatFrom() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.Body2 = new ModelRenderer(this, 0, 25)).addBox(-2.5f, -2.0f, -2.0f, 5, 5, 5);
		this.Body2.setRotationPoint(0.0f, 20.0f, 5.0f);
		this.Body2.setTextureSize(128, 64);
		this.Body2.mirror = true;
		this.setRotation(this.Body2, 0.0f, 0.0f, 0.0f);
		(this.Body1 = new ModelRenderer(this, 0, 17)).addBox(-2.5f, -2.0f, -2.0f, 5, 4, 4);
		this.Body1.setRotationPoint(0.0f, 21.0f, 1.0f);
		this.Body1.setTextureSize(128, 64);
		this.Body1.mirror = true;
		this.setRotation(this.Body1, 0.0f, 0.0f, 0.0f);
		(this.Head = new ModelRenderer(this, 0, 4)).addBox(-2.0f, -2.0f, -4.0f, 4, 4, 4);
		this.Head.setRotationPoint(0.0f, 20.5f, -1.0f);
		this.Head.setTextureSize(128, 64);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Nose = new ModelRenderer(this, 0, 12)).addBox(-1.0f, -1.0f, -3.0f, 2, 2, 3);
		this.Nose.setRotationPoint(0.0f, 21.5f, -4.0f);
		this.Nose.setTextureSize(128, 64);
		this.Nose.mirror = true;
		this.setRotation(this.Nose, 0.0f, 0.0f, 0.0f);
		(this.HearL = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 2, 1);
		this.HearL.setRotationPoint(1.0f, 19.5f, -2.0f);
		this.HearL.setTextureSize(128, 64);
		this.HearL.mirror = true;
		this.setRotation(this.HearL, 0.0f, 0.0f, 0.4363323f);
		(this.HearR = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 2, 1);
		this.HearR.setRotationPoint(-1.0f, 19.5f, -2.0f);
		this.HearR.setTextureSize(128, 64);
		this.HearR.mirror = true;
		this.setRotation(this.HearR, 0.0f, 0.0f, -0.4363323f);
		(this.ThightL = new ModelRenderer(this, 30, 0)).addBox(0.0f, -2.0f, -2.0f, 2, 4, 4);
		this.ThightL.setRotationPoint(2.0f, 21.0f, 5.0f);
		this.ThightL.setTextureSize(128, 64);
		this.ThightL.mirror = true;
		this.setRotation(this.ThightL, 0.1047198f, 0.0f, 0.0f);
		(this.ThightR = new ModelRenderer(this, 30, 0)).addBox(-2.0f, -2.0f, -2.0f, 2, 4, 4);
		this.ThightR.setRotationPoint(-2.0f, 21.0f, 5.0f);
		this.ThightR.setTextureSize(128, 64);
		this.ThightR.mirror = true;
		this.setRotation(this.ThightR, 0.1047198f, 0.0f, 0.0f);
		(this.FootL1 = new ModelRenderer(this, 30, 8)).addBox(-1.0f, 0.0f, -2.0f, 2, 1, 4);
		this.FootL1.setRotationPoint(2.0f, 23.0f, -1.0f);
		this.FootL1.setTextureSize(128, 64);
		this.FootL1.mirror = true;
		this.setRotation(this.FootL1, 0.0f, 0.0f, 0.0f);
		(this.FootL2 = new ModelRenderer(this, 30, 8)).addBox(-1.0f, 0.0f, -2.0f, 2, 1, 4);
		this.FootL2.setRotationPoint(3.0f, 23.0f, 4.0f);
		this.FootL2.setTextureSize(128, 64);
		this.FootL2.mirror = true;
		this.setRotation(this.FootL2, 0.0f, 0.0f, 0.0f);
		(this.FootR1 = new ModelRenderer(this, 30, 8)).addBox(-1.0f, 0.0f, -2.0f, 2, 1, 4);
		this.FootR1.setRotationPoint(-2.0f, 23.0f, -1.0f);
		this.FootR1.setTextureSize(128, 64);
		this.FootR1.mirror = true;
		this.setRotation(this.FootR1, 0.0f, 0.0f, 0.0f);
		(this.FootR2 = new ModelRenderer(this, 30, 8)).addBox(-1.0f, 0.0f, -2.0f, 2, 1, 4);
		this.FootR2.setRotationPoint(-3.0f, 23.0f, 4.0f);
		this.FootR2.setTextureSize(128, 64);
		this.FootR2.mirror = true;
		this.setRotation(this.FootR2, 0.0f, 0.0f, 0.0f);
		(this.Tail = new ModelRenderer(this, 20, 25)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 8);
		this.Tail.setRotationPoint(0.0f, 21.0f, 8.0f);
		this.Tail.setTextureSize(128, 64);
		this.Tail.mirror = true;
		this.setRotation(this.Tail, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Body2.render(f5);
		this.Body1.render(f5);
		this.Head.render(f5);
		this.Nose.render(f5);
		this.HearL.render(f5);
		this.HearR.render(f5);
		this.ThightL.render(f5);
		this.ThightR.render(f5);
		this.FootL1.render(f5);
		this.FootL2.render(f5);
		this.FootR1.render(f5);
		this.FootR2.render(f5);
		this.Tail.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
