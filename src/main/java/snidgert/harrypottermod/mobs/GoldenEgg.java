package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GoldenEgg extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;

	public GoldenEgg() {
		super.textureWidth = 256;
		super.textureHeight = 256;
		(this.Shape1 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 2, 10);
		this.Shape1.setRotationPoint(-5.0f, 22.0f, -5.0f);
		this.Shape1.setTextureSize(256, 256);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 0, 19)).addBox(0.0f, 0.0f, 0.0f, 12, 5, 12);
		this.Shape2.setRotationPoint(-6.0f, 17.0f, -6.0f);
		this.Shape2.setTextureSize(256, 256);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 0, 45)).addBox(0.0f, 0.0f, 0.0f, 10, 4, 10);
		this.Shape3.setRotationPoint(-5.0f, 13.0f, -5.0f);
		this.Shape3.setTextureSize(256, 256);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 31, 80)).addBox(0.0f, 0.0f, 0.0f, 6, 4, 6);
		this.Shape4.setRotationPoint(-3.0f, 10.0f, -3.0f);
		this.Shape4.setTextureSize(256, 256);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 32, 97)).addBox(0.0f, 0.0f, 0.0f, 4, 3, 4);
		this.Shape6.setRotationPoint(-2.0f, 8.0f, -2.0f);
		this.Shape6.setTextureSize(256, 256);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 0.0f, 0.0f, 0.0f);
		(this.Shape7 = new ModelRenderer(this, 0, 95)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
		this.Shape7.setRotationPoint(-0.5f, 6.0f, -0.5f);
		this.Shape7.setTextureSize(256, 256);
		this.Shape7.mirror = true;
		this.setRotation(this.Shape7, 0.0f, 0.0f, 0.0f);
		(this.Shape8 = new ModelRenderer(this, 0, 105)).addBox(0.0f, 0.0f, -2.0f, 1, 1, 2);
		this.Shape8.setRotationPoint(-0.5f, 7.0f, -0.5f);
		this.Shape8.setTextureSize(256, 256);
		this.Shape8.mirror = true;
		this.setRotation(this.Shape8, 0.4363323f, 0.0f, 0.0f);
		(this.Shape9 = new ModelRenderer(this, 0, 115)).addBox(-1.0f, 0.0f, -3.0f, 1, 1, 3);
		this.Shape9.setRotationPoint(-0.5f, 7.0f, -0.5f);
		this.Shape9.setTextureSize(256, 256);
		this.Shape9.mirror = true;
		this.setRotation(this.Shape9, 0.2876179f, 2.530727f, 0.0f);
		(this.Shape10 = new ModelRenderer(this, 0, 115)).addBox(0.0f, 0.0f, -3.0f, 1, 1, 3);
		this.Shape10.setRotationPoint(0.5f, 7.0f, -0.5f);
		this.Shape10.setTextureSize(256, 256);
		this.Shape10.mirror = true;
		this.setRotation(this.Shape10, 0.2876179f, -2.530727f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Shape1.render(f5);
		this.Shape2.render(f5);
		this.Shape3.render(f5);
		this.Shape4.render(f5);
		this.Shape6.render(f5);
		this.Shape7.render(f5);
		this.Shape8.render(f5);
		this.Shape9.render(f5);
		this.Shape10.render(f5);
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
		this.Shape6.render(f);
		this.Shape7.render(f);
		this.Shape8.render(f);
		this.Shape9.render(f);
		this.Shape10.render(f);
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
