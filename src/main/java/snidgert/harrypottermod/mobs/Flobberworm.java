package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Flobberworm extends ModelBase {

	ModelRenderer body2;
	ModelRenderer body1;
	ModelRenderer body3;

	public Flobberworm() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.body2 = new ModelRenderer(this, 0, 13)).addBox(-1.0f, -1.0f, -5.0f, 2, 2, 10);
		this.body2.setRotationPoint(0.0f, 23.0f, 0.0f);
		this.body2.setTextureSize(64, 32);
		this.body2.mirror = true;
		this.setRotation(this.body2, 0.0f, 0.0f, 0.0f);
		(this.body1 = new ModelRenderer(this, 0, 0)).addBox(-0.5f, -0.5f, -6.0f, 1, 1, 12);
		this.body1.setRotationPoint(0.0f, 23.5f, 0.0f);
		this.body1.setTextureSize(64, 32);
		this.body1.mirror = true;
		this.setRotation(this.body1, 0.0f, 0.0f, 0.0f);
		(this.body3 = new ModelRenderer(this, 26, 0)).addBox(-1.5f, -1.5f, -4.0f, 3, 3, 8);
		this.body3.setRotationPoint(0.0f, 22.5f, 0.0f);
		this.body3.setTextureSize(64, 32);
		this.body3.mirror = true;
		this.setRotation(this.body3, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.body2.render(f5);
		this.body1.render(f5);
		this.body3.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
