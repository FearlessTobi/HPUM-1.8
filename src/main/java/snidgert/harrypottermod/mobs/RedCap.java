package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class RedCap extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer ArmR;
	ModelRenderer ArmL;
	ModelRenderer LegR;
	ModelRenderer LegL;
	ModelRenderer Nose1;
	ModelRenderer EarL;
	ModelRenderer EarR;
	ModelRenderer Cap;

	public RedCap() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -6.0f, -3.0f, 6, 6, 6);
		this.Head.setRotationPoint(0.0f, 8.0f, 0.0f);
		this.Head.setTextureSize(64, 32);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 12, 14)).addBox(-3.5f, 0.0f, -2.0f, 7, 10, 4);
		this.Body.setRotationPoint(0.0f, 8.0f, 0.0f);
		this.Body.setTextureSize(64, 32);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.ArmR = new ModelRenderer(this, 38, 14)).addBox(-3.0f, -2.0f, -1.5f, 3, 10, 3);
		this.ArmR.setRotationPoint(-3.5f, 10.0f, 0.0f);
		this.ArmR.setTextureSize(64, 32);
		this.ArmR.mirror = true;
		this.setRotation(this.ArmR, 0.0f, 0.0f, 0.0f);
		(this.ArmL = new ModelRenderer(this, 38, 14)).addBox(0.0f, -2.0f, -1.5f, 3, 10, 3);
		this.ArmL.setRotationPoint(3.5f, 10.0f, 0.0f);
		this.ArmL.setTextureSize(64, 32);
		this.ArmL.mirror = true;
		this.setRotation(this.ArmL, 0.0f, 0.0f, 0.0f);
		(this.LegR = new ModelRenderer(this, 0, 14)).addBox(-1.5f, 0.0f, -1.5f, 3, 6, 3);
		this.LegR.setRotationPoint(-2.0f, 18.0f, 0.0f);
		this.LegR.setTextureSize(64, 32);
		this.LegR.mirror = true;
		this.setRotation(this.LegR, 0.0f, 0.0f, 0.0f);
		(this.LegL = new ModelRenderer(this, 0, 14)).addBox(-1.5f, 0.0f, -1.5f, 3, 6, 3);
		this.LegL.setRotationPoint(2.0f, 18.0f, 0.0f);
		this.LegL.setTextureSize(64, 32);
		this.LegL.mirror = true;
		this.setRotation(this.LegL, 0.0f, 0.0f, 0.0f);
		(this.Nose1 = new ModelRenderer(this, 55, 0)).addBox(-1.0f, 0.0f, -2.0f, 2, 3, 2);
		this.Nose1.setRotationPoint(0.0f, 5.5f, -1.0f);
		this.Nose1.setTextureSize(64, 32);
		this.Nose1.mirror = true;
		this.setRotation(this.Nose1, -1.134464f, 0.0f, 0.0f);
		(this.EarL = new ModelRenderer(this, 54, 7)).addBox(0.0f, -1.0f, -1.0f, 3, 2, 2);
		this.EarL.setRotationPoint(2.5f, 5.0f, 0.5f);
		this.EarL.setTextureSize(64, 32);
		this.EarL.mirror = true;
		this.setRotation(this.EarL, 0.0f, -0.0872665f, 0.2617994f);
		(this.EarR = new ModelRenderer(this, 54, 7)).addBox(-3.0f, -1.0f, -1.0f, 3, 2, 2);
		this.EarR.setRotationPoint(-2.5f, 5.0f, 0.5f);
		this.EarR.setTextureSize(64, 32);
		this.EarR.mirror = true;
		this.setRotation(this.EarR, 0.0f, 0.0872665f, -0.2617994f);
		(this.Cap = new ModelRenderer(this, 28, 0)).addBox(-3.5f, -2.5f, -3.0f, 7, 5, 6);
		this.Cap.setRotationPoint(0.0f, 4.2f, 0.5f);
		this.Cap.setTextureSize(64, 32);
		this.Cap.mirror = true;
		this.setRotation(this.Cap, 0.0349066f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.Body.render(par7);
		this.ArmR.render(par7);
		this.ArmL.render(par7);
		this.LegR.render(par7);
		this.LegL.render(par7);
		this.Nose1.render(par7);
		this.EarL.render(par7);
		this.EarR.render(par7);
		this.Cap.render(par7);
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
