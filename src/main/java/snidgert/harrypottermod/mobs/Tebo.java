package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Tebo extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer hornL;
	ModelRenderer hornR;
	ModelRenderer nose;
	ModelRenderer mouth;

	public Tebo() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -8.0f, 8, 8, 8);
		this.head.setRotationPoint(0.0f, 12.0f, -6.0f);
		this.head.setTextureSize(128, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 32, 0)).addBox(-5.0f, -10.0f, -7.0f, 10, 16, 8);
		this.body.setRotationPoint(0.0f, 11.0f, 3.0f);
		this.body.setTextureSize(128, 64);
		this.body.mirror = true;
		this.setRotation(this.body, 1.570796f, 0.0f, 0.0f);
		(this.leg1 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		this.leg1.setRotationPoint(-3.0f, 18.0f, 7.0f);
		this.leg1.setTextureSize(128, 64);
		this.leg1.mirror = true;
		this.setRotation(this.leg1, 0.0f, 0.0f, 0.0f);
		(this.leg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		this.leg2.setRotationPoint(3.0f, 18.0f, 7.0f);
		this.leg2.setTextureSize(128, 64);
		this.leg2.mirror = true;
		this.setRotation(this.leg2, 0.0f, 0.0f, 0.0f);
		(this.leg3 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 18.0f, -2.0f, 4, 6, 4);
		this.leg3.setRotationPoint(-3.0f, 0.0f, -5.0f);
		this.leg3.setTextureSize(128, 64);
		this.leg3.mirror = true;
		this.setRotation(this.leg3, 0.0f, 0.0f, 0.0f);
		(this.leg4 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		this.leg4.setRotationPoint(3.0f, 18.0f, -5.0f);
		this.leg4.setTextureSize(128, 64);
		this.leg4.mirror = true;
		this.setRotation(this.leg4, 0.0f, 0.0f, 0.0f);
		(this.hornL = new ModelRenderer(this, 0, 26)).addBox(-0.5f, -4.0f, -0.5f, 1, 4, 1);
		this.hornL.setRotationPoint(1.0f, 15.0f, -13.4f);
		this.hornL.setTextureSize(128, 64);
		this.hornL.mirror = true;
		this.setRotation(this.hornL, 1.22173f, -0.8726646f, 0.0f);
		(this.hornR = new ModelRenderer(this, 0, 26)).addBox(-0.5f, -4.0f, -0.5f, 1, 4, 1);
		this.hornR.setRotationPoint(-1.0f, 15.0f, -13.4f);
		this.hornR.setTextureSize(128, 64);
		this.hornR.mirror = true;
		this.setRotation(this.hornR, 1.22173f, 0.8726646f, 0.0f);
		(this.nose = new ModelRenderer(this, 16, 16)).addBox(-2.0f, -1.5f, -3.0f, 4, 3, 3);
		this.nose.setRotationPoint(0.0f, 13.0f, -14.0f);
		this.nose.setTextureSize(128, 64);
		this.nose.mirror = true;
		this.setRotation(this.nose, 0.0f, 0.0f, 0.0f);
		(this.mouth = new ModelRenderer(this, 16, 22)).addBox(-1.5f, -2.0f, -0.5f, 3, 2, 1);
		this.mouth.setRotationPoint(0.0f, 15.3f, -14.0f);
		this.mouth.setTextureSize(128, 64);
		this.mouth.mirror = true;
		this.setRotation(this.mouth, 1.48353f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.head.render(par7);
		this.body.render(par7);
		this.leg1.render(par7);
		this.leg2.render(par7);
		this.leg3.render(par7);
		this.leg4.render(par7);
		this.hornL.render(par7);
		this.hornR.render(par7);
		this.nose.render(par7);
		this.mouth.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.leg1.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leg3.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leg4.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
