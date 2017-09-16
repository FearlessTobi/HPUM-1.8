package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class FalconForm extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer right_wing;
	ModelRenderer left_wing;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;

	public FalconForm() {
		super.textureWidth = 256;
		super.textureHeight = 256;
		(this.Shape1 = new ModelRenderer(this, 0, 42)).addBox(0.0f, 0.0f, 0.0f, 5, 5, 10);
		this.Shape1.setRotationPoint(0.0f, 0.0f, 2.0f);
		this.Shape1.setTextureSize(256, 256);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, -0.5235988f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 51, 0)).addBox(0.0f, 0.0f, 0.0f, 5, 5, 5);
		this.Shape2.setRotationPoint(0.0f, -2.0f, -1.0f);
		this.Shape2.setTextureSize(256, 256);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.right_wing = new ModelRenderer(this, 85, 0)).addBox(0.0f, 0.0f, 0.0f, 7, 1, 12);
		this.right_wing.setRotationPoint(0.5f, 1.0f, 3.0f);
		this.right_wing.setTextureSize(256, 256);
		this.right_wing.mirror = true;
		this.setRotation(this.right_wing, 0.0f, -1.570796f, 0.5235988f);
		(this.left_wing = new ModelRenderer(this, 86, 19)).addBox(0.0f, 0.0f, -12.0f, 7, 1, 12);
		this.left_wing.setRotationPoint(4.5f, 1.0f, 3.0f);
		this.left_wing.setTextureSize(256, 256);
		this.left_wing.mirror = true;
		this.setRotation(this.left_wing, 0.0f, -1.570796f, 0.5235988f);
		(this.Shape3 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 5, 4, 1);
		this.Shape3.setRotationPoint(0.0f, 6.0f, 10.0f);
		this.Shape3.setTextureSize(256, 256);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 2.025098f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 0, 20)).addBox(0.0f, 0.0f, 0.0f, 1, 4, 1);
		this.Shape4.setRotationPoint(0.5f, 7.0f, 4.0f);
		this.Shape4.setTextureSize(256, 256);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 21, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 4, 1);
		this.Shape5.setRotationPoint(3.5f, 7.0f, 4.0f);
		this.Shape5.setTextureSize(256, 256);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, 0.0f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 200, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 1, 3);
		this.Shape6.setRotationPoint(1.5f, 0.0f, -3.0f);
		this.Shape6.setTextureSize(256, 256);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 0.0f, 0.0f, 0.0f);
		(this.Shape7 = new ModelRenderer(this, 200, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 1, 3);
		this.Shape7.setRotationPoint(1.5f, 1.0f, -3.0f);
		this.Shape7.setTextureSize(256, 256);
		this.Shape7.mirror = true;
		this.setRotation(this.Shape7, 0.0f, 0.0f, 0.0f);
		(this.Shape8 = new ModelRenderer(this, 223, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 2, 1);
		this.Shape8.setRotationPoint(1.5f, 0.0f, -3.0f);
		this.Shape8.setTextureSize(256, 256);
		this.Shape8.mirror = true;
		this.setRotation(this.Shape8, -0.6026643f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Shape1.render(par7);
		this.Shape2.render(par7);
		this.right_wing.render(par7);
		this.left_wing.render(par7);
		this.Shape3.render(par7);
		this.Shape4.render(par7);
		this.Shape5.render(par7);
		this.Shape6.render(par7);
		this.Shape7.render(par7);
		this.Shape8.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.left_wing.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.right_wing.rotateAngleZ = MathHelper.cos(-par1 * -0.6222f) * -2.0f * -par2 * -0.5f;
	}
}
