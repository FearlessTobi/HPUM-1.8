package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Hand extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;

	public Hand() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Shape1 = new ModelRenderer(this, 14, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 3);
		this.Shape1.setRotationPoint(-1.5f, 19.0f, -1.5f);
		this.Shape1.setTextureSize(64, 32);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 0, 19)).addBox(0.0f, 0.0f, 0.0f, 2, 2, 2);
		this.Shape2.setRotationPoint(-1.0f, 22.0f, -1.0f);
		this.Shape2.setTextureSize(64, 32);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 0, 10)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 3);
		this.Shape3.setRotationPoint(-1.5f, 17.0f, -1.5f);
		this.Shape3.setTextureSize(64, 32);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
		this.Shape4.setRotationPoint(0.5f, 17.0f, 0.5f);
		this.Shape4.setTextureSize(64, 32);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Shape1.render(f5);
		this.Shape2.render(f5);
		this.Shape3.render(f5);
		this.Shape4.render(f5);
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
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
