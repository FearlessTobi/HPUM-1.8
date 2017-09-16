package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Imp extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer ArmL;
	ModelRenderer ArmR;
	ModelRenderer LegR;
	ModelRenderer LegL;
	ModelRenderer EarL;
	ModelRenderer EarR;
	ModelRenderer HornR;
	ModelRenderer HornL;

	public Imp() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -3.0f, -1.5f, 3, 3, 3);
		this.Head.setRotationPoint(0.0f, 15.5f, 0.0f);
		this.Head.setTextureSize(64, 32);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 7)).addBox(-1.5f, 0.0f, -1.0f, 3, 5, 2);
		this.Body.setRotationPoint(0.0f, 15.5f, 0.0f);
		this.Body.setTextureSize(64, 32);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.ArmL = new ModelRenderer(this, 15, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1);
		this.ArmL.setRotationPoint(1.5f, 15.5f, 0.0f);
		this.ArmL.setTextureSize(64, 32);
		this.ArmL.mirror = true;
		this.setRotation(this.ArmL, 0.0f, 0.0f, -0.3490659f);
		(this.ArmR = new ModelRenderer(this, 15, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1);
		this.ArmR.setRotationPoint(-1.5f, 15.5f, 0.0f);
		this.ArmR.setTextureSize(64, 32);
		this.ArmR.mirror = true;
		this.setRotation(this.ArmR, 0.0f, 0.0f, 0.3490659f);
		(this.LegR = new ModelRenderer(this, 15, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1);
		this.LegR.setRotationPoint(-0.8f, 20.0f, 0.0f);
		this.LegR.setTextureSize(64, 32);
		this.LegR.mirror = true;
		this.setRotation(this.LegR, 0.0f, 0.0f, 0.0f);
		(this.LegL = new ModelRenderer(this, 15, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1);
		this.LegL.setRotationPoint(0.8f, 20.0f, 0.0f);
		this.LegL.setTextureSize(64, 32);
		this.LegL.mirror = true;
		this.setRotation(this.LegL, 0.0f, 0.0f, 0.0f);
		(this.EarL = new ModelRenderer(this, 21, 0)).addBox(-0.5f, -1.0f, -0.5f, 3, 2, 1);
		this.EarL.setRotationPoint(1.5f, 14.0f, 0.0f);
		this.EarL.setTextureSize(64, 32);
		this.EarL.mirror = true;
		this.setRotation(this.EarL, 0.0f, -0.0349066f, -0.1745329f);
		(this.EarR = new ModelRenderer(this, 21, 0)).addBox(-2.5f, -1.0f, -0.5f, 3, 2, 1);
		this.EarR.setRotationPoint(-1.5f, 14.0f, 0.0f);
		this.EarR.setTextureSize(64, 32);
		this.EarR.mirror = true;
		this.setRotation(this.EarR, 0.0f, -0.0349066f, 0.1745329f);
		(this.HornR = new ModelRenderer(this, 15, 10)).addBox(-0.5f, -1.0f, -0.5f, 1, 1, 1);
		this.HornR.setRotationPoint(-0.9f, 13.0f, 0.0f);
		this.HornR.setTextureSize(64, 32);
		this.HornR.mirror = true;
		this.setRotation(this.HornR, -0.4363323f, 0.0f, 0.0f);
		(this.HornL = new ModelRenderer(this, 15, 10)).addBox(-0.5f, -1.0f, -0.5f, 1, 1, 1);
		this.HornL.setRotationPoint(0.9f, 13.0f, 0.0f);
		this.HornL.setTextureSize(64, 32);
		this.HornL.mirror = true;
		this.setRotation(this.HornL, -0.4363323f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.Body.render(par7);
		this.ArmL.render(par7);
		this.ArmR.render(par7);
		this.LegR.render(par7);
		this.LegL.render(par7);
		this.EarL.render(par7);
		this.EarR.render(par7);
		this.HornR.render(par7);
		this.HornL.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.LegL.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.LegR.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.ArmL.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.ArmR.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
