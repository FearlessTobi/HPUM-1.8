package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GoldenSnitch extends ModelBase {

	ModelRenderer Body;
	ModelRenderer wing_1;
	ModelRenderer wing_2;

	public GoldenSnitch() {
		super.textureWidth = 64;
		super.textureHeight = 64;
		(this.Body = new ModelRenderer(this, 0, 0)).addBox(-0.5f, -2.5f, -0.5f, 3, 3, 4);
		this.Body.setRotationPoint(0.0f, 22.5f, 0.0f);
		this.Body.setTextureSize(64, 64);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.wing_1 = new ModelRenderer(this, 17, 0)).addBox(-3.0f, -1.0f, -3.0f, 3, 1, 3);
		this.wing_1.setRotationPoint(0.0f, 21.5f, 2.0f);
		this.wing_1.setTextureSize(64, 64);
		this.wing_1.mirror = true;
		this.setRotation(this.wing_1, 1.570796f, 0.0f, 0.7853982f);
		(this.wing_2 = new ModelRenderer(this, 10, 10)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 3);
		this.wing_2.setRotationPoint(2.0f, 21.5f, 1.0f);
		this.wing_2.setTextureSize(64, 64);
		this.wing_2.mirror = true;
		this.setRotation(this.wing_2, 1.570796f, 0.0f, 0.7853982f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Body.render(par7);
		this.wing_1.render(par7);
		this.wing_2.render(par7);
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
