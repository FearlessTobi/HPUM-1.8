package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Clabbert extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer LegL;
	ModelRenderer LegR;
	ModelRenderer ArmL;
	ModelRenderer ArmR;
	ModelRenderer Arm2L;
	ModelRenderer Arm2R;
	ModelRenderer Snout;
	ModelRenderer EarL;
	ModelRenderer EarR;
	ModelRenderer Tail;
	ModelRenderer HornL;
	ModelRenderer HornR;
	ModelRenderer Pustule;

	public Clabbert() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-2.5f, -4.0f, -5.0f, 5, 5, 5);
		this.Head.setRotationPoint(0.0f, 14.5f, -0.5f);
		this.Head.setTextureSize(64, 32);
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 27, 0)).addBox(-3.0f, -4.5f, -2.5f, 6, 9, 5);
		this.Body.setRotationPoint(0.0f, 17.0f, 1.5f);
		this.Body.setTextureSize(64, 32);
		this.setRotation(this.Body, 1.22173f, 0.0f, 0.0f);
		(this.LegL = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 0.0f, -1.0f, 3, 6, 2);
		this.LegL.setRotationPoint(2.5f, 18.0f, 4.0f);
		this.LegL.setTextureSize(64, 32);
		this.setRotation(this.LegL, 0.0f, 0.0f, 0.0f);
		(this.LegR = new ModelRenderer(this, 0, 21)).addBox(-1.5f, 0.0f, -1.0f, 3, 6, 2);
		this.LegR.setRotationPoint(-2.5f, 18.0f, 4.0f);
		this.LegR.setTextureSize(64, 32);
		this.setRotation(this.LegR, 0.0f, 0.0f, 0.0f);
		(this.ArmL = new ModelRenderer(this, 14, 21)).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 2);
		this.ArmL.setRotationPoint(2.5f, 16.5f, -1.5f);
		this.ArmL.setTextureSize(64, 32);
		this.setRotation(this.ArmL, -0.0872665f, 0.0f, 0.0f);
		(this.ArmR = new ModelRenderer(this, 14, 21)).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 2);
		this.ArmR.setRotationPoint(-2.5f, 16.5f, -1.5f);
		this.ArmR.setTextureSize(64, 32);
		this.setRotation(this.ArmR, -0.0872665f, 0.0f, 0.0f);
		(this.Arm2L = new ModelRenderer(this, 26, 21)).addBox(-1.0f, 3.5f, -1.0f, 2, 4, 2);
		this.Arm2L.setRotationPoint(2.5f, 16.5f, -1.8f);
		this.Arm2L.setTextureSize(64, 32);
		this.setRotation(this.Arm2L, 0.0f, 0.0f, 0.0f);
		(this.Arm2R = new ModelRenderer(this, 26, 21)).addBox(-1.0f, 3.5f, -1.0f, 2, 4, 2);
		this.Arm2R.setRotationPoint(-2.5f, 16.5f, -1.8f);
		this.Arm2R.setTextureSize(64, 32);
		this.setRotation(this.Arm2R, 0.0f, 0.0f, 0.0f);
		(this.Snout = new ModelRenderer(this, 0, 12)).addBox(-2.0f, -1.0f, -2.0f, 4, 2, 2);
		this.Snout.setRotationPoint(0.0f, 14.0f, -4.3f);
		this.Snout.setTextureSize(64, 32);
		this.setRotation(this.Snout, 0.0f, 0.0f, 0.0f);
		(this.EarL = new ModelRenderer(this, 13, 12)).addBox(-0.5f, -1.0f, 0.0f, 1, 2, 2);
		this.EarL.setRotationPoint(2.0f, 13.0f, -3.0f);
		this.EarL.setTextureSize(64, 32);
		this.setRotation(this.EarL, 0.0f, 1.308997f, 0.0f);
		(this.EarR = new ModelRenderer(this, 13, 12)).addBox(-0.5f, -1.0f, 0.0f, 1, 2, 2);
		this.EarR.setRotationPoint(-2.0f, 13.0f, -3.0f);
		this.EarR.setTextureSize(64, 32);
		this.setRotation(this.EarR, 0.0f, -1.308997f, 0.0f);
		(this.Tail = new ModelRenderer(this, 36, 16)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 7);
		this.Tail.setRotationPoint(0.0f, 18.0f, 5.0f);
		this.Tail.setTextureSize(64, 32);
		this.setRotation(this.Tail, -0.2617994f, 0.0f, 0.0f);
		(this.HornL = new ModelRenderer(this, 0, 0)).addBox(-0.5f, -2.0f, -0.5f, 1, 2, 1);
		this.HornL.setRotationPoint(1.5f, 12.0f, -4.0f);
		this.HornL.setTextureSize(64, 32);
		this.setRotation(this.HornL, 0.0f, 0.0f, 0.0872665f);
		(this.HornR = new ModelRenderer(this, 0, 0)).addBox(-0.5f, -2.0f, -0.5f, 1, 2, 1);
		this.HornR.setRotationPoint(-1.5f, 12.0f, -4.0f);
		this.HornR.setTextureSize(64, 32);
		this.setRotation(this.HornR, 0.0f, 0.0f, -0.0872665f);
		(this.Pustule = new ModelRenderer(this, 15, 0)).addBox(-1.0f, -0.5f, -1.0f, 2, 1, 2);
		this.Pustule.setRotationPoint(0.0f, 10.9f, -4.6f);
		this.Pustule.setTextureSize(64, 32);
		this.setRotation(this.Pustule, -0.1570796f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.Body.render(par7);
		this.LegL.render(par7);
		this.LegR.render(par7);
		this.ArmL.render(par7);
		this.ArmR.render(par7);
		this.Arm2L.render(par7);
		this.Arm2R.render(par7);
		this.Snout.render(par7);
		this.EarL.render(par7);
		this.EarR.render(par7);
		this.Tail.render(par7);
		this.HornL.render(par7);
		this.HornR.render(par7);
		this.Pustule.render(par7);
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
		this.Arm2L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Arm2R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
