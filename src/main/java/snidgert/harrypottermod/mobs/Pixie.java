package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Pixie extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer ArmL;
	ModelRenderer ArmR;
	ModelRenderer LegR;
	ModelRenderer LegL;
	ModelRenderer EarL;
	ModelRenderer EarR;
	ModelRenderer Wing1;
	ModelRenderer Wing2;
	ModelRenderer Wing3;
	ModelRenderer Wing4;
	ModelRenderer AntennaR;
	ModelRenderer AntennaL;

	public Pixie() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -3.0f, -1.5f, 3, 3, 3);
		this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.Head.setTextureSize(64, 32);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 7)).addBox(-1.5f, 0.0f, -1.0f, 3, 5, 2);
		this.Body.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.Body.setTextureSize(64, 32);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.ArmL = new ModelRenderer(this, 15, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1);
		this.ArmL.setRotationPoint(1.5f, 0.0f, 0.0f);
		this.ArmL.setTextureSize(64, 32);
		this.ArmL.mirror = true;
		this.setRotation(this.ArmL, 0.0f, 0.0f, -0.3490659f);
		(this.ArmR = new ModelRenderer(this, 15, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1);
		this.ArmR.setRotationPoint(-1.5f, 0.0f, 0.0f);
		this.ArmR.setTextureSize(64, 32);
		this.ArmR.mirror = true;
		this.setRotation(this.ArmR, 0.0f, 0.0f, 0.3490659f);
		(this.LegR = new ModelRenderer(this, 15, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1);
		this.LegR.setRotationPoint(-0.8f, 4.5f, 0.0f);
		this.LegR.setTextureSize(64, 32);
		this.LegR.mirror = true;
		this.setRotation(this.LegR, 0.0f, 0.0f, 0.0523599f);
		(this.LegL = new ModelRenderer(this, 15, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 4, 1);
		this.LegL.setRotationPoint(0.8f, 4.5f, 0.0f);
		this.LegL.setTextureSize(64, 32);
		this.LegL.mirror = true;
		this.setRotation(this.LegL, 0.0f, 0.0f, -0.0523599f);
		(this.EarL = new ModelRenderer(this, 21, 0)).addBox(-0.5f, -1.0f, -0.5f, 3, 2, 1);
		this.EarL.setRotationPoint(1.5f, -1.5f, 0.0f);
		this.EarL.setTextureSize(64, 32);
		this.EarL.mirror = true;
		this.setRotation(this.EarL, 0.0f, -0.0349066f, -0.1745329f);
		(this.EarR = new ModelRenderer(this, 21, 0)).addBox(-2.5f, -1.0f, -0.5f, 3, 2, 1);
		this.EarR.setRotationPoint(-1.5f, -1.5f, 0.0f);
		this.EarR.setTextureSize(64, 32);
		this.EarR.mirror = true;
		this.setRotation(this.EarR, 0.0f, -0.0349066f, 0.1745329f);
		(this.Wing1 = new ModelRenderer(this, 0, 16)).addBox(0.0f, -1.0f, 0.0f, 6, 2, 0);
		this.Wing1.setRotationPoint(0.0f, 2.0f, 1.0f);
		this.Wing1.setTextureSize(64, 32);
		this.Wing1.mirror = true;
		this.setRotation(this.Wing1, 0.0f, -0.0872665f, -0.4363323f);
		(this.Wing2 = new ModelRenderer(this, 0, 19)).addBox(0.0f, -1.0f, 0.0f, 5, 2, 0);
		this.Wing2.setRotationPoint(0.0f, 3.0f, 1.0f);
		this.Wing2.setTextureSize(64, 32);
		this.Wing2.mirror = true;
		this.setRotation(this.Wing2, 0.0f, -0.0872665f, 0.3490659f);
		(this.Wing3 = new ModelRenderer(this, 0, 16)).addBox(-6.0f, -1.0f, 0.0f, 6, 2, 0);
		this.Wing3.setRotationPoint(0.0f, 2.0f, 1.0f);
		this.Wing3.setTextureSize(64, 32);
		this.Wing3.mirror = true;
		this.setRotation(this.Wing3, 0.0f, 0.0872665f, 0.4363323f);
		(this.Wing4 = new ModelRenderer(this, 0, 19)).addBox(-5.0f, -1.0f, 0.0f, 5, 2, 0);
		this.Wing4.setRotationPoint(0.0f, 3.0f, 1.0f);
		this.Wing4.setTextureSize(64, 32);
		this.Wing4.mirror = true;
		this.setRotation(this.Wing4, 0.0f, 0.0872665f, -0.3490659f);
		(this.AntennaR = new ModelRenderer(this, 15, 10)).addBox(-0.5f, -2.0f, -0.5f, 1, 2, 1);
		this.AntennaR.setRotationPoint(-0.9f, -2.5f, 0.0f);
		this.AntennaR.setTextureSize(64, 32);
		this.AntennaR.mirror = true;
		this.setRotation(this.AntennaR, -0.8726646f, 0.0f, 0.0f);
		(this.AntennaL = new ModelRenderer(this, 15, 10)).addBox(-0.5f, -2.0f, -0.5f, 1, 2, 1);
		this.AntennaL.setRotationPoint(0.9f, -2.5f, 0.0f);
		this.AntennaL.setTextureSize(64, 32);
		this.AntennaL.mirror = true;
		this.setRotation(this.AntennaL, -0.8726646f, 0.0f, 0.0f);
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
		this.Wing1.render(par7);
		this.Wing2.render(par7);
		this.Wing3.render(par7);
		this.Wing4.render(par7);
		this.AntennaR.render(par7);
		this.AntennaL.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.Wing1.rotateAngleY = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Wing3.rotateAngleY = -MathHelper.cos(-par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Wing2.rotateAngleY = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Wing4.rotateAngleY = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
