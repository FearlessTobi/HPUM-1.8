package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class SnidgetForm extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Right_arm;
	ModelRenderer Left_arm;

	public SnidgetForm() {
		super.textureWidth = 256;
		super.textureHeight = 256;
		(this.Shape1 = new ModelRenderer(this, 0, 42)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 4);
		this.Shape1.setRotationPoint(0.0f, 0.0f, 1.0f);
		this.Shape1.setTextureSize(256, 256);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, -0.2617994f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 51, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 3);
		this.Shape2.setRotationPoint(0.0f, -1.0f, -2.0f);
		this.Shape2.setTextureSize(256, 256);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 1);
		this.Shape3.setRotationPoint(0.0f, 2.0f, 4.0f);
		this.Shape3.setTextureSize(256, 256);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 1.899228f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 0, 20)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
		this.Shape4.setRotationPoint(0.0f, 3.0f, 2.0f);
		this.Shape4.setTextureSize(256, 256);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 21, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
		this.Shape5.setRotationPoint(2.0f, 3.0f, 2.0f);
		this.Shape5.setTextureSize(256, 256);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, 0.0f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 200, 20)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2);
		this.Shape6.setRotationPoint(1.0f, 0.0f, -3.58f);
		this.Shape6.setTextureSize(256, 256);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 0.0f, 0.0f, 0.0f);
		(this.Shape7 = new ModelRenderer(this, 200, 20)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3);
		this.Shape7.setRotationPoint(1.0f, 0.5f, -3.0f);
		this.Shape7.setTextureSize(256, 256);
		this.Shape7.mirror = true;
		this.setRotation(this.Shape7, 0.0f, 0.0f, 0.0f);
		(this.Right_arm = new ModelRenderer(this, 0, 33)).addBox(-5.0f, 0.0f, 0.0f, 5, 1, 4);
		this.Right_arm.setRotationPoint(0.0f, 0.0f, 1.0f);
		this.Right_arm.setTextureSize(256, 256);
		this.Right_arm.mirror = true;
		this.setRotation(this.Right_arm, -0.2617994f, 0.0f, 0.0f);
		(this.Left_arm = new ModelRenderer(this, 71, 0)).addBox(0.0f, 0.0f, 0.0f, 5, 1, 4);
		this.Left_arm.setRotationPoint(3.0f, 0.0f, 1.0f);
		this.Left_arm.setTextureSize(256, 256);
		this.Left_arm.mirror = true;
		this.setRotation(this.Left_arm, -0.2617994f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Shape1.render(par7);
		this.Shape2.render(par7);
		this.Shape3.render(par7);
		this.Shape4.render(par7);
		this.Shape5.render(par7);
		this.Shape6.render(par7);
		this.Shape7.render(par7);
		this.Right_arm.render(par7);
		this.Left_arm.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.Left_arm.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Right_arm.rotateAngleZ = MathHelper.cos(-par1 * -0.6222f) * -2.0f * -par2 * -0.5f;
	}
}
