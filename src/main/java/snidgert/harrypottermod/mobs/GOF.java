package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GOF extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;

	public GOF() {
		super.textureWidth = 128;
		super.textureHeight = 128;
		(this.Shape1 = new ModelRenderer(this, 0, 86)).addBox(0.0f, 0.0f, 0.0f, 14, 10, 14);
		this.Shape1.setRotationPoint(-7.0f, 14.0f, -7.0f);
		this.Shape1.setTextureSize(128, 128);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 0, 63)).addBox(0.0f, 0.0f, 0.0f, 10, 6, 10);
		this.Shape2.setRotationPoint(-5.0f, 8.0f, -5.0f);
		this.Shape2.setTextureSize(128, 128);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 0, 45)).addBox(0.0f, 0.0f, 0.0f, 4, 8, 4);
		this.Shape3.setRotationPoint(-2.0f, 0.0f, -2.0f);
		this.Shape3.setTextureSize(128, 128);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 0, 25)).addBox(0.0f, 0.0f, 0.0f, 9, 4, 9);
		this.Shape4.setRotationPoint(-4.5f, -4.0f, -4.5f);
		this.Shape4.setTextureSize(128, 128);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 10, 10);
		this.Shape5.setRotationPoint(-5.0f, -14.0f, -5.0f);
		this.Shape5.setTextureSize(128, 128);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, 0.0f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 58, 0)).addBox(0.0f, 0.0f, 0.0f, 9, 9, 9);
		this.Shape6.setRotationPoint(-4.5f, -23.0f, -4.5f);
		this.Shape6.setTextureSize(128, 128);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Shape1.render(f5);
		this.Shape2.render(f5);
		this.Shape3.render(f5);
		this.Shape4.render(f5);
		this.Shape5.render(f5);
		this.Shape6.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void renderModel(final float f) {
		this.Shape1.render(f);
		this.Shape2.render(f);
		this.Shape3.render(f);
		this.Shape4.render(f);
		this.Shape5.render(f);
		this.Shape6.render(f);
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
