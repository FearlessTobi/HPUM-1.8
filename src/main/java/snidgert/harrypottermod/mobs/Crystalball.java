package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Crystalball extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape6;
	ModelRenderer Shape5;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;

	public Crystalball() {
		super.textureWidth = 128;
		super.textureHeight = 128;
		(this.Shape1 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 2, 10);
		this.Shape1.setRotationPoint(-5.0f, 22.0f, -5.0f);
		this.Shape1.setTextureSize(64, 32);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 50, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
		this.Shape2.setRotationPoint(2.0f, 19.0f, 2.0f);
		this.Shape2.setTextureSize(64, 32);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 50, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
		this.Shape3.setRotationPoint(-3.0f, 19.0f, 2.0f);
		this.Shape3.setTextureSize(64, 32);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 50, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
		this.Shape4.setRotationPoint(-0.5f, 19.0f, -3.0f);
		this.Shape4.setTextureSize(64, 32);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 0, 21)).addBox(0.0f, 0.0f, 0.0f, 6, 6, 6);
		this.Shape6.setRotationPoint(-3.0f, 13.0f, -3.0f);
		this.Shape6.setTextureSize(64, 32);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 0.0f, 0.0f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 35, 19)).addBox(0.0f, 0.0f, 0.0f, 2, 3, 2);
		this.Shape5.setRotationPoint(-1.0f, 19.0f, -1.0f);
		this.Shape5.setTextureSize(64, 32);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, 0.0f, 0.0f);
		(this.Shape7 = new ModelRenderer(this, 50, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 1);
		this.Shape7.setRotationPoint(0.0f, 21.0f, 1.0f);
		this.Shape7.setTextureSize(64, 32);
		this.Shape7.mirror = true;
		this.setRotation(this.Shape7, 0.0f, -2.443461f, 0.0f);
		(this.Shape8 = new ModelRenderer(this, 50, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		this.Shape8.setRotationPoint(-0.5f, 21.0f, -2.0f);
		this.Shape8.setTextureSize(64, 32);
		this.Shape8.mirror = true;
		this.setRotation(this.Shape8, 0.0f, 0.0f, 0.0f);
		(this.Shape9 = new ModelRenderer(this, 50, 0)).addBox(0.0f, 0.0f, -1.0f, 3, 1, 1);
		this.Shape9.setRotationPoint(0.0f, 21.0f, 1.0f);
		this.Shape9.setTextureSize(64, 32);
		this.Shape9.mirror = true;
		this.setRotation(this.Shape9, 0.0f, -0.6981317f, 0.0f);
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
		this.Shape5.render(f5);
		this.Shape7.render(f5);
		this.Shape8.render(f5);
		this.Shape9.render(f5);
	}

	public void renderModel(final float f) {
		this.Shape1.render(f);
		this.Shape2.render(f);
		this.Shape3.render(f);
		this.Shape4.render(f);
		this.Shape6.render(f);
		this.Shape5.render(f);
		this.Shape7.render(f);
		this.Shape8.render(f);
		this.Shape9.render(f);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
