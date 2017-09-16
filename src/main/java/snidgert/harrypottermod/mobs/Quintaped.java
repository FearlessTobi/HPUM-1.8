package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Quintaped extends ModelBase {

	ModelRenderer head;
	ModelRenderer Body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer leg5;

	public Quintaped() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -2.0f, -3.5f, 8, 4, 7);
		this.head.setRotationPoint(0.0f, 19.0f, 0.0f);
		this.head.setTextureSize(128, 64);
		this.setRotation(this.head, -0.2617994f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 31, 0)).addBox(-4.0f, -2.0f, -4.0f, 8, 4, 8);
		this.Body.setRotationPoint(0.0f, 20.3f, 0.0f);
		this.Body.setTextureSize(128, 64);
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.leg1 = new ModelRenderer(this, 0, 12)).addBox(0.0f, 0.0f, -1.5f, 3, 6, 3);
		this.leg1.setRotationPoint(3.5f, 18.0f, 2.0f);
		this.leg1.setTextureSize(128, 64);
		this.setRotation(this.leg1, 0.0f, 0.0f, 0.0f);
		(this.leg2 = new ModelRenderer(this, 0, 12)).addBox(0.0f, 0.0f, -3.0f, 3, 6, 3);
		this.leg2.setRotationPoint(3.0f, 18.0f, -3.0f);
		this.leg2.setTextureSize(128, 64);
		this.setRotation(this.leg2, 0.0f, 0.0f, 0.0f);
		(this.leg3 = new ModelRenderer(this, 0, 12)).addBox(-3.0f, 0.0f, -3.0f, 3, 6, 3);
		this.leg3.setRotationPoint(-3.0f, 18.0f, -3.0f);
		this.leg3.setTextureSize(128, 64);
		this.setRotation(this.leg3, 0.0f, 0.0f, 0.0f);
		(this.leg4 = new ModelRenderer(this, 0, 12)).addBox(-3.0f, 0.0f, -1.5f, 3, 6, 3);
		this.leg4.setRotationPoint(-3.5f, 18.0f, 2.0f);
		this.leg4.setTextureSize(128, 64);
		this.setRotation(this.leg4, 0.0f, 0.0f, 0.0f);
		(this.leg5 = new ModelRenderer(this, 0, 12)).addBox(-1.5f, 0.0f, 0.0f, 3, 6, 3);
		this.leg5.setRotationPoint(0.0f, 18.0f, 4.0f);
		this.leg5.setTextureSize(128, 64);
		this.setRotation(this.leg5, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.head.render(f5);
		this.Body.render(f5);
		this.leg1.render(f5);
		this.leg2.render(f5);
		this.leg3.render(f5);
		this.leg4.render(f5);
		this.leg5.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
