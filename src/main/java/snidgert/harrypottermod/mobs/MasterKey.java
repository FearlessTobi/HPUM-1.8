package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class MasterKey extends ModelBase {

	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape1;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer left_wing;
	ModelRenderer right_wing;

	public MasterKey() {
		super.textureWidth = 64;
		super.textureHeight = 64;
		(this.Shape2 = new ModelRenderer(this, 0, 16)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 1);
		this.Shape2.setRotationPoint(-0.5f, 21.5f, -2.5f);
		this.Shape2.setTextureSize(64, 64);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 0, 13)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1);
		this.Shape3.setRotationPoint(-0.5f, 22.0f, -0.5f);
		this.Shape3.setTextureSize(64, 64);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
		(this.Shape1 = new ModelRenderer(this, 3, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3);
		this.Shape1.setRotationPoint(-0.5f, 22.0f, 3.0f);
		this.Shape1.setTextureSize(64, 64);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 0, 19)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 6);
		this.Shape4.setRotationPoint(-0.5f, 21.0f, -3.0f);
		this.Shape4.setTextureSize(64, 64);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 0, 8)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
		this.Shape5.setRotationPoint(-0.5f, 20.0f, 3.0f);
		this.Shape5.setTextureSize(64, 64);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, 0.0f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 8, 9)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
		this.Shape6.setRotationPoint(-0.5f, 20.0f, 5.0f);
		this.Shape6.setTextureSize(64, 64);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 0.0f, 0.0f, 0.0f);
		(this.Shape7 = new ModelRenderer(this, 20, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3);
		this.Shape7.setRotationPoint(-0.5f, 20.0f, 3.0f);
		this.Shape7.setTextureSize(64, 64);
		this.Shape7.mirror = true;
		this.setRotation(this.Shape7, 0.0f, 0.0f, 0.0f);
		(this.left_wing = new ModelRenderer(this, 0, 28)).addBox(0.0f, -2.0f, 0.0f, 4, 2, 1);
		this.left_wing.setRotationPoint(0.5f, 21.5f, 1.5f);
		this.left_wing.setTextureSize(64, 64);
		this.left_wing.mirror = true;
		this.setRotation(this.left_wing, 0.0f, 0.0f, 0.0f);
		(this.right_wing = new ModelRenderer(this, 0, 32)).addBox(-4.0f, -2.0f, 0.0f, 4, 2, 1);
		this.right_wing.setRotationPoint(-0.5f, 21.5f, 1.5f);
		this.right_wing.setTextureSize(64, 64);
		this.right_wing.mirror = true;
		this.setRotation(this.right_wing, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Shape2.render(par7);
		this.Shape3.render(par7);
		this.Shape1.render(par7);
		this.Shape4.render(par7);
		this.Shape5.render(par7);
		this.Shape6.render(par7);
		this.Shape7.render(par7);
		this.left_wing.render(par7);
		this.right_wing.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
	}
}
