package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Cup extends ModelBase {

	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape1;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;

	public Cup() {
		super.textureWidth = 512;
		super.textureHeight = 512;
		(this.Shape2 = new ModelRenderer(this, 0, 4)).addBox(0.0f, 0.0f, 0.0f, 6, 2, 6);
		this.Shape2.setRotationPoint(-3.0f, 22.0f, -3.0f);
		this.Shape2.setTextureSize(512, 512);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 0, 49)).addBox(0.0f, 0.0f, 0.0f, 3, 5, 3);
		this.Shape3.setRotationPoint(-1.5f, 16.0f, -1.5f);
		this.Shape3.setTextureSize(512, 512);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
		(this.Shape1 = new ModelRenderer(this, 0, 27)).addBox(0.0f, 0.0f, 0.0f, 4, 1, 4);
		this.Shape1.setRotationPoint(-2.0f, 21.0f, -2.0f);
		this.Shape1.setTextureSize(512, 512);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 0, 69)).addBox(0.0f, 0.0f, 0.0f, 5, 1, 5);
		this.Shape4.setRotationPoint(-2.5f, 16.0f, -2.5f);
		this.Shape4.setTextureSize(512, 512);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 37, 4)).addBox(0.0f, 0.0f, 0.0f, 7, 7, 7);
		this.Shape5.setRotationPoint(-3.5f, 9.0f, -3.5f);
		this.Shape5.setTextureSize(512, 512);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, 0.0f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 0, 93)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
		this.Shape6.setRotationPoint(-5.5f, 10.0f, 0.5f);
		this.Shape6.setTextureSize(512, 512);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 0.0f, 1.570796f, 0.0f);
		(this.Shape7 = new ModelRenderer(this, 0, 93)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
		this.Shape7.setRotationPoint(3.5f, 10.0f, 0.5f);
		this.Shape7.setTextureSize(512, 512);
		this.Shape7.mirror = true;
		this.setRotation(this.Shape7, 0.0f, 1.570796f, 0.0f);
		(this.Shape8 = new ModelRenderer(this, 0, 114)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		this.Shape8.setRotationPoint(5.0f, 11.0f, -0.5f);
		this.Shape8.setTextureSize(512, 512);
		this.Shape8.mirror = true;
		this.setRotation(this.Shape8, 0.0f, 0.0f, 0.0f);
		(this.Shape9 = new ModelRenderer(this, 0, 114)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		this.Shape9.setRotationPoint(-6.0f, 11.0f, -0.5f);
		this.Shape9.setTextureSize(512, 512);
		this.Shape9.mirror = true;
		this.setRotation(this.Shape9, 0.0f, 0.0f, 0.0f);
		(this.Shape10 = new ModelRenderer(this, 31, 114)).addBox(0.0f, 0.0f, 0.0f, 1, 4, 1);
		this.Shape10.setRotationPoint(-6.0f, 12.0f, 0.5f);
		this.Shape10.setTextureSize(512, 512);
		this.Shape10.mirror = true;
		this.setRotation(this.Shape10, 0.6981317f, 1.570796f, 0.0f);
		(this.Shape11 = new ModelRenderer(this, 31, 114)).addBox(0.0f, 0.0f, -1.0f, 1, 4, 1);
		this.Shape11.setRotationPoint(6.0f, 12.0f, 0.5f);
		this.Shape11.setTextureSize(512, 512);
		this.Shape11.mirror = true;
		this.setRotation(this.Shape11, -0.6981317f, 1.570796f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Shape2.render(f5);
		this.Shape3.render(f5);
		this.Shape1.render(f5);
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

	public void renderModel(final float f) {
		this.Shape2.render(f);
		this.Shape3.render(f);
		this.Shape1.render(f);
		this.Shape4.render(f);
		this.Shape5.render(f);
		this.Shape6.render(f);
		this.Shape7.render(f);
		this.Shape8.render(f);
		this.Shape9.render(f);
		this.Shape10.render(f);
		this.Shape11.render(f);
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
