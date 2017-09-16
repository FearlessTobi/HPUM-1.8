package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class RavenForm extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Left_wing;
	ModelRenderer Shape8;

	public RavenForm() {
		super.textureWidth = 256;
		super.textureHeight = 256;
		(this.Shape1 = new ModelRenderer(this, 0, 42)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 6);
		this.Shape1.setRotationPoint(0.0f, 0.0f, 1.0f);
		this.Shape1.setTextureSize(64, 32);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, -0.2617994f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 51, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 3);
		this.Shape2.setRotationPoint(0.0f, -1.0f, -2.0f);
		this.Shape2.setTextureSize(64, 32);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 4, 1);
		this.Shape3.setRotationPoint(0.0f, 3.0f, 5.0f);
		this.Shape3.setTextureSize(64, 32);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 1.899228f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 0, 20)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
		this.Shape4.setRotationPoint(0.0f, 3.0f, 3.0f);
		this.Shape4.setTextureSize(64, 32);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 21, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
		this.Shape5.setRotationPoint(2.0f, 3.0f, 3.0f);
		this.Shape5.setTextureSize(64, 32);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, 0.0f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 200, 20)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
		this.Shape6.setRotationPoint(1.0f, 0.0f, -1.0f);
		this.Shape6.setTextureSize(64, 32);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, -1.48353f, 0.0f, 0.0f);
		(this.Shape7 = new ModelRenderer(this, 200, 20)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
		this.Shape7.setRotationPoint(1.0f, 1.0f, -1.0f);
		this.Shape7.setTextureSize(64, 32);
		this.Shape7.mirror = true;
		this.setRotation(this.Shape7, -1.658063f, 0.0f, 0.0f);
		(this.Left_wing = new ModelRenderer(this, 89, 0)).addBox(0.0f, 0.0f, 0.0f, 8, 4, 0);
		this.Left_wing.setRotationPoint(2.0f, 0.0f, 1.0f);
		this.Left_wing.setTextureSize(256, 256);
		this.Left_wing.mirror = true;
		this.setRotation(this.Left_wing, 1.308997f, 0.0f, 0.0f);
		(this.Shape8 = new ModelRenderer(this, 22, 20)).addBox(-8.0f, 0.0f, 0.0f, 8, 4, 0);
		this.Shape8.setRotationPoint(1.0f, 0.0f, 1.0f);
		this.Shape8.setTextureSize(256, 256);
		this.Shape8.mirror = true;
		this.setRotation(this.Shape8, 1.308997f, 0.0f, 0.0f);
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
		this.Left_wing.render(par7);
		this.Shape8.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.Left_wing.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Shape8.rotateAngleZ = MathHelper.cos(-par1 * -0.6222f) * -2.0f * -par2 * -0.5f;
	}
}
