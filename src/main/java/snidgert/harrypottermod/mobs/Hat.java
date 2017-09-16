package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Hat extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;

	public Hat() {
		super.textureWidth = 128;
		super.textureHeight = 128;
		(this.Shape1 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 2, 16);
		this.Shape1.setRotationPoint(-8.0f, 22.0f, -8.0f);
		this.Shape1.setTextureSize(128, 128);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 0, 19)).addBox(0.0f, 0.0f, 0.0f, 12, 5, 12);
		this.Shape2.setRotationPoint(-6.0f, 18.0f, -6.0f);
		this.Shape2.setTextureSize(128, 128);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 0, 37)).addBox(0.0f, 0.0f, 0.0f, 8, 5, 8);
		this.Shape3.setRotationPoint(-4.0f, 14.5f, -4.0f);
		this.Shape3.setTextureSize(128, 128);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, -0.0872665f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 0, 52)).addBox(1.0f, -3.5f, 1.0f, 6, 4, 6);
		this.Shape4.setRotationPoint(-4.0f, 14.5f, -4.0f);
		this.Shape4.setTextureSize(128, 128);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, -0.122173f, 0.0f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 0, 67)).addBox(2.0f, -7.0f, 2.0f, 4, 4, 4);
		this.Shape5.setRotationPoint(-4.0f, 14.5f, -4.0f);
		this.Shape5.setTextureSize(128, 128);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, -0.1745329f, 0.0f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 0, 79)).addBox(3.0f, -9.5f, 3.0f, 2, 3, 2);
		this.Shape6.setRotationPoint(-4.0f, 14.5f, -4.0f);
		this.Shape6.setTextureSize(128, 128);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, -0.2094395f, 0.0f, 0.0f);
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
