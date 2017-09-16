package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Chizpurfle extends ModelBase {

	ModelRenderer body;
	ModelRenderer leg1L;
	ModelRenderer leg2L;
	ModelRenderer leg3L;
	ModelRenderer leg1R;
	ModelRenderer leg2R;
	ModelRenderer leg3R;
	ModelRenderer head;
	ModelRenderer teeth;

	public Chizpurfle() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.body = new ModelRenderer(this, 11, 0)).addBox(-1.5f, -1.0f, -2.5f, 3, 2, 5);
		this.body.setRotationPoint(0.0f, 22.5f, 0.3f);
		this.body.setTextureSize(64, 32);
		this.setRotation(this.body, 0.0523599f, 0.0f, 0.0f);
		(this.leg1L = new ModelRenderer(this, 0, 7)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.leg1L.setRotationPoint(1.5f, 22.0f, -1.5f);
		this.leg1L.setTextureSize(64, 32);
		this.setRotation(this.leg1L, 0.0f, 0.0f, -0.2617994f);
		(this.leg2L = new ModelRenderer(this, 0, 7)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.leg2L.setRotationPoint(1.5f, 22.0f, 0.0f);
		this.leg2L.setTextureSize(64, 32);
		this.setRotation(this.leg2L, 0.0f, 0.0f, -0.2617994f);
		(this.leg3L = new ModelRenderer(this, 0, 7)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.leg3L.setRotationPoint(1.5f, 22.0f, 1.5f);
		this.leg3L.setTextureSize(64, 32);
		this.setRotation(this.leg3L, 0.0f, 0.0f, -0.2617994f);
		(this.leg1R = new ModelRenderer(this, 0, 7)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.leg1R.setRotationPoint(-1.5f, 22.0f, -1.5f);
		this.leg1R.setTextureSize(64, 32);
		this.setRotation(this.leg1R, 0.0f, 0.0f, 0.2617994f);
		(this.leg2R = new ModelRenderer(this, 0, 7)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.leg2R.setRotationPoint(-1.5f, 22.0f, 0.0f);
		this.leg2R.setTextureSize(64, 32);
		this.setRotation(this.leg2R, 0.0f, 0.0f, 0.2617994f);
		(this.leg3R = new ModelRenderer(this, 0, 7)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.leg3R.setRotationPoint(-1.5f, 22.0f, 1.5f);
		this.leg3R.setTextureSize(64, 32);
		this.setRotation(this.leg3R, 0.0f, 0.0f, 0.2617994f);
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -1.0f, -0.5f, 3, 2, 1);
		this.head.setRotationPoint(0.0f, 22.5f, -2.5f);
		this.head.setTextureSize(64, 32);
		this.setRotation(this.head, -0.1745329f, 0.0f, 0.0f);
		(this.teeth = new ModelRenderer(this, 0, 3)).addBox(-0.5f, -1.0f, -1.0f, 1, 2, 1);
		this.teeth.setRotationPoint(0.0f, 22.6f, -2.8f);
		this.teeth.setTextureSize(64, 32);
		this.setRotation(this.teeth, -0.0174533f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.body.render(f5);
		this.leg1L.render(f5);
		this.leg2L.render(f5);
		this.leg3L.render(f5);
		this.leg1R.render(f5);
		this.leg2R.render(f5);
		this.leg3R.render(f5);
		this.head.render(f5);
		this.teeth.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
