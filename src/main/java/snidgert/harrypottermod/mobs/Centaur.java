package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Centaur extends ModelBiped {

	ModelRenderer HorseBody;
	ModelRenderer Thigh1R;
	ModelRenderer Thigh1L;
	ModelRenderer Thigh2R;
	ModelRenderer Thigh2L;
	ModelRenderer Leg1L;
	ModelRenderer Leg1R;
	ModelRenderer Leg2R;
	ModelRenderer Leg2L;
	ModelRenderer Feet1R;
	ModelRenderer Feet1L;
	ModelRenderer Feet2R;
	ModelRenderer Feet2L;
	ModelRenderer TailTop;
	ModelRenderer TailMiddle;
	ModelRenderer TailBottom;
	ModelRenderer Body;
	public ModelRenderer Head;
	public ModelRenderer ArmR;
	ModelRenderer ArmL;
	ModelRenderer Hair;

	public Centaur() {
		((ModelBase) this).textureWidth = 128;
		((ModelBase) this).textureHeight = 64;
		(this.HorseBody = new ModelRenderer(this, 0, 30)).addBox(-5.0f, -5.0f, -12.0f, 10, 10, 24);
		this.HorseBody.setRotationPoint(0.0f, 8.0f, 0.0f);
		this.HorseBody.setTextureSize(128, 64);
		this.setRotation(this.HorseBody, 0.0f, 0.0f, 0.0f);
		(this.Thigh1R = new ModelRenderer(this, 75, 0)).addBox(-1.5f, 0.0f, -2.0f, 3, 8, 4);
		this.Thigh1R.setRotationPoint(-3.5f, 8.0f, -10.0f);
		this.Thigh1R.setTextureSize(128, 64);
		this.setRotation(this.Thigh1R, 0.0f, 0.0f, 0.0f);
		(this.Thigh1L = new ModelRenderer(this, 75, 0)).addBox(-1.5f, 0.0f, -2.0f, 3, 8, 4);
		this.Thigh1L.setRotationPoint(3.6f, 8.0f, -10.0f);
		this.Thigh1L.setTextureSize(128, 64);
		this.setRotation(this.Thigh1L, 0.0f, 0.0f, 0.0f);
		(this.Thigh2R = new ModelRenderer(this, 90, 0)).addBox(-2.0f, 0.0f, -2.5f, 4, 9, 5);
		this.Thigh2R.setRotationPoint(-3.5f, 7.0f, 9.0f);
		this.Thigh2R.setTextureSize(128, 64);
		this.setRotation(this.Thigh2R, 0.0f, 0.0f, 0.0f);
		(this.Thigh2L = new ModelRenderer(this, 90, 0)).addBox(-2.0f, 0.0f, -2.5f, 4, 9, 5);
		this.Thigh2L.setRotationPoint(3.5f, 7.0f, 9.0f);
		this.Thigh2L.setTextureSize(128, 64);
		this.setRotation(this.Thigh2L, 0.0f, 0.0f, 0.0f);
		(this.Leg1L = new ModelRenderer(this, 75, 15)).addBox(-1.5f, 8.0f, -1.5f, 3, 5, 3);
		this.Leg1L.setRotationPoint(3.5f, 8.0f, -10.0f);
		this.Leg1L.setTextureSize(128, 64);
		this.setRotation(this.Leg1L, 0.0f, 0.0f, 0.0f);
		(this.Leg1R = new ModelRenderer(this, 75, 15)).addBox(-1.5f, 8.0f, -1.5f, 3, 5, 3);
		this.Leg1R.setRotationPoint(-3.5f, 8.0f, -10.0f);
		this.Leg1R.setTextureSize(128, 64);
		this.setRotation(this.Leg1R, 0.0f, 0.0f, 0.0f);
		(this.Leg2R = new ModelRenderer(this, 90, 15)).addBox(-1.5f, 9.0f, -1.5f, 3, 5, 3);
		this.Leg2R.setRotationPoint(-3.5f, 7.0f, 9.0f);
		this.Leg2R.setTextureSize(128, 64);
		this.setRotation(this.Leg2R, 0.0f, 0.0f, 0.0f);
		(this.Leg2L = new ModelRenderer(this, 90, 15)).addBox(-1.5f, 9.0f, -1.5f, 3, 5, 3);
		this.Leg2L.setRotationPoint(3.5f, 7.0f, 9.0f);
		this.Leg2L.setTextureSize(128, 64);
		this.setRotation(this.Leg2L, 0.0f, 0.0f, 0.0f);
		(this.Feet1R = new ModelRenderer(this, 90, 25)).addBox(-2.0f, 13.0f, -2.0f, 4, 3, 4);
		this.Feet1R.setRotationPoint(-3.5f, 8.0f, -10.0f);
		this.Feet1R.setTextureSize(128, 64);
		this.setRotation(this.Feet1R, 0.0f, 0.0f, 0.0f);
		(this.Feet1L = new ModelRenderer(this, 90, 25)).addBox(-2.0f, 13.0f, -2.0f, 4, 3, 4);
		this.Feet1L.setRotationPoint(3.5f, 8.0f, -10.0f);
		this.Feet1L.setTextureSize(128, 64);
		this.setRotation(this.Feet1L, 0.0f, 0.0f, 0.0f);
		(this.Feet2R = new ModelRenderer(this, 90, 25)).addBox(-2.0f, 14.0f, -2.0f, 4, 3, 4);
		this.Feet2R.setRotationPoint(-3.5f, 7.0f, 9.0f);
		this.Feet2R.setTextureSize(128, 64);
		this.setRotation(this.Feet2R, 0.0f, 0.0f, 0.0f);
		(this.Feet2L = new ModelRenderer(this, 90, 25)).addBox(-2.0f, 14.0f, -2.0f, 4, 3, 4);
		this.Feet2L.setRotationPoint(3.5f, 7.0f, 9.0f);
		this.Feet2L.setTextureSize(128, 64);
		this.setRotation(this.Feet2L, 0.0f, 0.0f, 0.0f);
		(this.TailTop = new ModelRenderer(this, 75, 45)).addBox(-1.0f, -1.5f, 0.0f, 2, 2, 3);
		this.TailTop.setRotationPoint(0.0f, 3.5f, 11.5f);
		this.TailTop.setTextureSize(128, 64);
		this.setRotation(this.TailTop, -1.134464f, 0.0f, 0.0f);
		(this.TailMiddle = new ModelRenderer(this, 75, 51)).addBox(-1.5f, -2.0f, 0.0f, 3, 4, 7);
		this.TailMiddle.setRotationPoint(0.0f, 6.0f, 13.0f);
		this.TailMiddle.setTextureSize(128, 64);
		this.setRotation(this.TailMiddle, -1.134464f, 0.0f, 0.0f);
		(this.TailBottom = new ModelRenderer(this, 96, 51)).addBox(-1.5f, -2.0f, 0.0f, 3, 4, 7);
		this.TailBottom.setRotationPoint(0.0f, 12.3f, 16.0f);
		this.TailBottom.setTextureSize(128, 64);
		this.setRotation(this.TailBottom, -1.134464f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 19)).addBox(-4.0f, -12.0f, -2.0f, 8, 12, 4);
		this.Body.setRotationPoint(0.0f, 3.0f, -10.0f);
		this.Body.setTextureSize(128, 64);
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		this.Head.setRotationPoint(0.0f, -9.0f, -10.0f);
		this.Head.setTextureSize(128, 64);
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.ArmR = new ModelRenderer(this, 46, 28)).addBox(-4.0f, -2.0f, -2.0f, 4, 12, 4);
		this.ArmR.setRotationPoint(-4.0f, -7.0f, -10.0f);
		this.ArmR.setTextureSize(128, 64);
		this.setRotation(this.ArmR, -1.570796f, 0.0f, 0.0f);
		(this.ArmL = new ModelRenderer(this, 46, 28)).addBox(0.0f, -2.0f, -2.0f, 4, 12, 4);
		this.ArmL.setRotationPoint(4.0f, -7.0f, -10.0f);
		this.ArmL.setTextureSize(128, 64);
		this.setRotation(this.ArmL, -1.570796f, 0.0f, 0.0f);
		(this.Hair = new ModelRenderer(this, 33, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		this.Hair.setRotationPoint(0.0f, -9.0f, -10.0f);
		this.Hair.setTextureSize(128, 64);
		this.setRotation(this.Hair, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.HorseBody.render(par7);
		this.Thigh1R.render(par7);
		this.Thigh1L.render(par7);
		this.Thigh2R.render(par7);
		this.Thigh2L.render(par7);
		this.Leg1L.render(par7);
		this.Leg1R.render(par7);
		this.Leg2R.render(par7);
		this.Leg2L.render(par7);
		this.Feet1R.render(par7);
		this.Feet1L.render(par7);
		this.Feet2R.render(par7);
		this.Feet2L.render(par7);
		this.TailTop.render(par7);
		this.TailMiddle.render(par7);
		this.TailBottom.render(par7);
		this.Body.render(par7);
		this.Head.render(par7);
		this.ArmR.render(par7);
		this.ArmL.render(par7);
		this.Hair.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.Thigh1R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg1R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Feet1R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Thigh2R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg2R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Feet2R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Thigh1L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg1L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Feet1L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Thigh2L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg2L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Feet2L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
