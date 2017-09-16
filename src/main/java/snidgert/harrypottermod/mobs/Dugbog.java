package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Dugbog extends ModelBase {

	ModelRenderer body;
	ModelRenderer branch1;
	ModelRenderer branch2;
	ModelRenderer leg1L;
	ModelRenderer leg1R;
	ModelRenderer leg2R;
	ModelRenderer leg2L;

	public Dugbog() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.body = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -3.0f, -7.0f, 6, 6, 14);
		this.body.setRotationPoint(0.0f, 19.0f, 0.0f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.branch1 = new ModelRenderer(this, 0, 0)).addBox(-0.5f, -6.0f, -0.5f, 1, 6, 1);
		this.branch1.setRotationPoint(-1.0f, 17.0f, -4.0f);
		this.branch1.setTextureSize(64, 32);
		this.branch1.mirror = true;
		this.setRotation(this.branch1, -1.047198f, -0.1745329f, 0.0f);
		(this.branch2 = new ModelRenderer(this, 0, 0)).addBox(-0.5f, -6.0f, -0.5f, 1, 6, 1);
		this.branch2.setRotationPoint(1.0f, 18.0f, -1.0f);
		this.branch2.setTextureSize(64, 32);
		this.branch2.mirror = true;
		this.setRotation(this.branch2, -1.745329f, 0.6108652f, 0.0f);
		(this.leg1L = new ModelRenderer(this, 0, 10)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.leg1L.setRotationPoint(1.5f, 21.0f, -5.0f);
		this.leg1L.setTextureSize(64, 32);
		this.leg1L.mirror = true;
		this.setRotation(this.leg1L, 0.4363323f, 0.0f, 0.0f);
		(this.leg1R = new ModelRenderer(this, 0, 10)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.leg1R.setRotationPoint(-1.5f, 21.0f, -5.0f);
		this.leg1R.setTextureSize(64, 32);
		this.leg1R.mirror = true;
		this.setRotation(this.leg1R, 0.4363323f, 0.0f, 0.0f);
		(this.leg2R = new ModelRenderer(this, 0, 10)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.leg2R.setRotationPoint(-1.5f, 21.0f, 4.0f);
		this.leg2R.setTextureSize(64, 32);
		this.leg2R.mirror = true;
		this.setRotation(this.leg2R, 0.4363323f, 0.0f, 0.0f);
		(this.leg2L = new ModelRenderer(this, 0, 10)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.leg2L.setRotationPoint(1.5f, 21.0f, 4.0f);
		this.leg2L.setTextureSize(64, 32);
		this.leg2L.mirror = true;
		this.setRotation(this.leg2L, 0.4363323f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.body.render(par7);
		this.branch1.render(par7);
		this.branch2.render(par7);
		this.leg1L.render(par7);
		this.leg1R.render(par7);
		this.leg2R.render(par7);
		this.leg2L.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.leg1L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leg1R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leg2L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leg2R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
