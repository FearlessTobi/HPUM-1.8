package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FlyingBroomstick extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;

	public FlyingBroomstick() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Shape1 = new ModelRenderer(this, 12, 21)).addBox(0.0f, -0.5f, -0.5f, 20, 1, 1);
		this.Shape1.setRotationPoint(0.0f, 0.0f, 3.0f);
		this.Shape1.setTextureSize(64, 32);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 1.570796f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 52, 0)).addBox(-3.0f, -1.0f, -1.0f, 3, 2, 2);
		this.Shape2.setRotationPoint(0.0f, 0.0f, 3.0f);
		this.Shape2.setTextureSize(64, 32);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 1.570796f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 39, 0)).addBox(0.0f, -1.5f, -1.5f, 3, 3, 3);
		this.Shape3.setRotationPoint(0.0f, 0.0f, 5.0f);
		this.Shape3.setTextureSize(64, 32);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, -1.570796f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 18, 0)).addBox(0.0f, -2.0f, -2.0f, 6, 4, 4);
		this.Shape4.setRotationPoint(0.0f, 0.0f, 8.0f);
		this.Shape4.setTextureSize(64, 32);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, -1.570796f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 0, 0)).addBox(0.0f, -1.5f, -1.5f, 4, 3, 3);
		this.Shape5.setRotationPoint(0.0f, 0.0f, 14.0f);
		this.Shape5.setTextureSize(64, 32);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, -1.570796f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 0, 10)).addBox(0.0f, -1.0f, -1.0f, 3, 2, 2);
		this.Shape6.setRotationPoint(0.0f, 0.0f, 18.0f);
		this.Shape6.setTextureSize(64, 32);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 0.0f, -1.570796f, 0.0f);
		(this.Shape7 = new ModelRenderer(this, 17, 14)).addBox(0.0f, -0.5f, -0.4666667f, 2, 1, 1);
		this.Shape7.setRotationPoint(0.0f, 1.0f, 4.0f);
		this.Shape7.setTextureSize(64, 32);
		this.Shape7.mirror = true;
		this.setRotation(this.Shape7, 3.141593f, -1.570796f, 1.570796f);
		(this.Shape8 = new ModelRenderer(this, 27, 15)).addBox(0.0f, -0.5f, -0.5f, 3, 1, 1);
		this.Shape8.setRotationPoint(0.0f, 2.0f, 4.0f);
		this.Shape8.setTextureSize(64, 32);
		this.Shape8.mirror = true;
		this.setRotation(this.Shape8, 3.141593f, 0.0f, 1.047198f);
		(this.Shape9 = new ModelRenderer(this, 27, 15)).addBox(0.0f, -0.5f, -0.5f, 3, 1, 1);
		this.Shape9.setRotationPoint(0.0f, 2.0f, 4.0f);
		this.Shape9.setTextureSize(64, 32);
		this.Shape9.mirror = true;
		this.setRotation(this.Shape9, 3.141593f, 0.0f, 2.094395f);
		(this.Shape10 = new ModelRenderer(this, 38, 13)).addBox(0.0f, -0.5f, -0.5f, 2, 1, 1);
		this.Shape10.setRotationPoint(1.0f, 4.4f, 4.0f);
		this.Shape10.setTextureSize(64, 32);
		this.Shape10.mirror = true;
		this.setRotation(this.Shape10, 0.0f, 0.0f, 0.0f);
		(this.Shape11 = new ModelRenderer(this, 38, 13)).addBox(0.0f, -0.5f, -0.5f, 2, 1, 1);
		this.Shape11.setRotationPoint(-1.0f, 4.4f, 4.0f);
		this.Shape11.setTextureSize(64, 32);
		this.Shape11.mirror = true;
		this.setRotation(this.Shape11, 0.0f, -3.141593f, 0.0f);
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
		this.Shape7.render(f5);
		this.Shape8.render(f5);
		this.Shape9.render(f5);
		this.Shape10.render(f5);
		this.Shape11.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
