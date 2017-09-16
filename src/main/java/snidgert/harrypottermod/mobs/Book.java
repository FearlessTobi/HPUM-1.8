package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Book extends ModelBase {

	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape1;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;

	public Book() {
		super.textureWidth = 512;
		super.textureHeight = 512;
		(this.Shape2 = new ModelRenderer(this, 24, 14)).addBox(0.0f, 0.0f, 0.0f, 4, 5, 1);
		this.Shape2.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.Shape2.setTextureSize(512, 512);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.2617994f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 27, 31)).addBox(-4.0f, 0.0f, 0.0f, 4, 5, 1);
		this.Shape3.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.Shape3.setTextureSize(512, 512);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, -0.2617994f, 0.0f);
		(this.Shape1 = new ModelRenderer(this, 0, 24)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 0);
		this.Shape1.setRotationPoint(-1.0f, -0.5f, 1.0f);
		this.Shape1.setTextureSize(512, 512);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 40, 17)).addBox(0.0f, 0.0f, 0.0f, 4, 6, 0);
		this.Shape4.setRotationPoint(1.0f, -0.5f, 1.0f);
		this.Shape4.setTextureSize(512, 512);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.2617994f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, 0.0f, 0.0f, 4, 6, 0);
		this.Shape5.setRotationPoint(-1.0f, -0.5f, 1.0f);
		this.Shape5.setTextureSize(512, 512);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, -0.2617994f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 24, 49)).addBox(0.0f, 0.0f, 0.0f, 4, 5, 0);
		this.Shape6.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.Shape6.setTextureSize(512, 512);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 0.0f, 2.641231f, 0.0f);
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
