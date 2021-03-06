package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Kelpie extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer Neck;
	ModelRenderer Thigh1R;
	ModelRenderer Thigh1L;
	ModelRenderer Thigh2R;
	ModelRenderer Thigh2L;
	ModelRenderer Leg1R;
	ModelRenderer Leg1L;
	ModelRenderer Leg2R;
	ModelRenderer Leg2L;
	ModelRenderer FeetR;
	ModelRenderer FeetL;
	ModelRenderer TailTop;
	ModelRenderer TailMiddle;
	ModelRenderer TailBottom;
	ModelRenderer Feet1L;
	ModelRenderer Feet1R;
	ModelRenderer EarR;
	ModelRenderer EarL;
	ModelRenderer PeakTop;
	ModelRenderer PeakBase;
	ModelRenderer Hair;

	public Kelpie() {
		super.textureWidth = 128;
		super.textureHeight = 128;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-2.5f, -2.5f, -7.0f, 5, 5, 7);
		this.Head.setRotationPoint(0.0f, -6.0f, -11.5f);
		this.Head.setTextureSize(128, 128);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.5235988f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 34)).addBox(-5.0f, -5.0f, -12.0f, 10, 10, 24);
		this.Body.setRotationPoint(0.0f, 8.0f, 0.0f);
		this.Body.setTextureSize(128, 128);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.Neck = new ModelRenderer(this, 0, 12)).addBox(-2.0f, -14.0f, -4.0f, 4, 14, 8);
		this.Neck.setRotationPoint(0.0f, 6.0f, -8.5f);
		this.Neck.setTextureSize(128, 128);
		this.Neck.mirror = true;
		this.setRotation(this.Neck, 0.5235988f, 0.0f, 0.0f);
		(this.Thigh1R = new ModelRenderer(this, 44, 29)).addBox(-1.5f, 0.0f, -2.0f, 3, 8, 4);
		this.Thigh1R.setRotationPoint(-4.0f, 8.0f, -10.1f);
		this.Thigh1R.setTextureSize(128, 128);
		this.Thigh1R.mirror = true;
		this.setRotation(this.Thigh1R, 0.0f, 0.0f, 0.0f);
		(this.Thigh1L = new ModelRenderer(this, 60, 29)).addBox(-1.5f, 0.0f, -2.0f, 3, 8, 4);
		this.Thigh1L.setRotationPoint(4.0f, 8.0f, -10.1f);
		this.Thigh1L.setTextureSize(128, 128);
		this.Thigh1L.mirror = true;
		this.setRotation(this.Thigh1L, 0.0f, 0.0f, 0.0f);
		(this.Thigh2R = new ModelRenderer(this, 96, 29)).addBox(-2.0f, 0.0f, -2.5f, 4, 9, 5);
		this.Thigh2R.setRotationPoint(-3.5f, 7.0f, 9.0f);
		this.Thigh2R.setTextureSize(128, 128);
		this.Thigh2R.mirror = true;
		this.setRotation(this.Thigh2R, 0.0f, 0.0f, 0.0f);
		(this.Thigh2L = new ModelRenderer(this, 78, 29)).addBox(-2.0f, 0.0f, -2.5f, 4, 9, 5);
		this.Thigh2L.setRotationPoint(3.5f, 7.0f, 9.0f);
		this.Thigh2L.setTextureSize(128, 128);
		this.Thigh2L.mirror = true;
		this.setRotation(this.Thigh2L, 0.0f, 0.0f, 0.0f);
		(this.Leg1R = new ModelRenderer(this, 44, 41)).addBox(-1.5f, 9.0f, -1.5f, 3, 5, 3);
		this.Leg1R.setRotationPoint(-4.0f, 7.0f, -10.1f);
		this.Leg1R.setTextureSize(128, 128);
		this.Leg1R.mirror = true;
		this.setRotation(this.Leg1R, 0.0f, 0.0f, 0.0f);
		(this.Leg1L = new ModelRenderer(this, 60, 41)).addBox(-1.5f, 9.0f, -1.5f, 3, 5, 3);
		this.Leg1L.setRotationPoint(4.0f, 7.0f, -10.1f);
		this.Leg1L.setTextureSize(128, 128);
		this.Leg1L.mirror = true;
		this.setRotation(this.Leg1L, 0.0f, 0.0f, 0.0f);
		(this.Leg2R = new ModelRenderer(this, 96, 43)).addBox(-1.5f, 9.0f, -1.5f, 3, 5, 3);
		this.Leg2R.setRotationPoint(-3.5f, 7.0f, 9.0f);
		this.Leg2R.setTextureSize(128, 128);
		this.Leg2R.mirror = true;
		this.setRotation(this.Leg2R, 0.0f, 0.0f, 0.0f);
		(this.Leg2L = new ModelRenderer(this, 78, 43)).addBox(-1.5f, 9.0f, -1.5f, 3, 5, 3);
		this.Leg2L.setRotationPoint(3.5f, 7.0f, 9.0f);
		this.Leg2L.setTextureSize(128, 128);
		this.Leg2L.mirror = true;
		this.setRotation(this.Leg2L, 0.0f, 0.0f, 0.0f);
		(this.FeetR = new ModelRenderer(this, 96, 51)).addBox(-2.0f, 14.0f, -2.0f, 4, 3, 4);
		this.FeetR.setRotationPoint(-3.5f, 7.0f, 9.0f);
		this.FeetR.setTextureSize(128, 128);
		this.FeetR.mirror = true;
		this.setRotation(this.FeetR, 0.0f, 0.0f, 0.0f);
		(this.FeetL = new ModelRenderer(this, 78, 51)).addBox(-2.0f, 14.0f, -2.0f, 4, 3, 4);
		this.FeetL.setRotationPoint(3.5f, 7.0f, 9.0f);
		this.FeetL.setTextureSize(128, 128);
		this.FeetL.mirror = true;
		this.setRotation(this.FeetL, 0.0f, 0.0f, 0.0f);
		(this.TailTop = new ModelRenderer(this, 44, 0)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.TailTop.setRotationPoint(0.0f, 3.0f, 12.0f);
		this.TailTop.setTextureSize(128, 128);
		this.TailTop.mirror = true;
		this.setRotation(this.TailTop, -0.8726646f, 0.0f, 0.0f);
		(this.TailMiddle = new ModelRenderer(this, 38, 7)).addBox(-1.5f, -2.0f, 0.0f, 3, 4, 7);
		this.TailMiddle.setRotationPoint(0.0f, 4.8f, 13.5f);
		this.TailMiddle.setTextureSize(128, 128);
		this.TailMiddle.mirror = true;
		this.setRotation(this.TailMiddle, -0.9599311f, 0.0f, 0.0f);
		(this.TailBottom = new ModelRenderer(this, 24, 3)).addBox(-1.5f, -2.0f, 0.0f, 3, 4, 7);
		this.TailBottom.setRotationPoint(0.0f, 10.2f, 17.4f);
		this.TailBottom.setTextureSize(128, 128);
		this.TailBottom.mirror = true;
		this.setRotation(this.TailBottom, -1.134464f, 0.0f, 0.0f);
		(this.Feet1L = new ModelRenderer(this, 60, 51)).addBox(-2.0f, 14.0f, -2.0f, 4, 3, 4);
		this.Feet1L.setRotationPoint(4.0f, 7.0f, -10.1f);
		this.Feet1L.setTextureSize(128, 128);
		this.Feet1L.mirror = true;
		this.setRotation(this.Feet1L, 0.0f, 0.0f, 0.0f);
		(this.Feet1R = new ModelRenderer(this, 44, 51)).addBox(-2.0f, 14.0f, -2.0f, 4, 3, 4);
		this.Feet1R.setRotationPoint(-4.0f, 7.0f, -10.1f);
		this.Feet1R.setTextureSize(128, 128);
		this.Feet1R.mirror = true;
		this.setRotation(this.Feet1R, 0.0f, 0.0f, 0.0f);
		(this.EarR = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -3.0f, -0.5f, 2, 3, 1);
		this.EarR.setRotationPoint(-1.4f, -7.0f, -13.0f);
		this.EarR.setTextureSize(128, 128);
		this.EarR.mirror = true;
		this.setRotation(this.EarR, 0.3490659f, 0.0f, 0.0f);
		(this.EarL = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -3.0f, -0.5f, 2, 3, 1);
		this.EarL.setRotationPoint(1.4f, -7.0f, -13.0f);
		this.EarL.setTextureSize(128, 128);
		this.EarL.mirror = true;
		this.setRotation(this.EarL, 0.3490659f, 0.0f, 0.0f);
		(this.PeakTop = new ModelRenderer(this, 24, 18)).addBox(-2.0f, -1.5f, -6.0f, 4, 3, 6);
		this.PeakTop.setRotationPoint(0.0f, -3.6f, -17.5f);
		this.PeakTop.setTextureSize(128, 128);
		this.PeakTop.mirror = true;
		this.setRotation(this.PeakTop, 0.5235988f, 0.0f, 0.0f);
		(this.PeakBase = new ModelRenderer(this, 24, 27)).addBox(-2.0f, -1.0f, -5.0f, 4, 2, 5);
		this.PeakBase.setRotationPoint(0.0f, -1.0f, -17.0f);
		this.PeakBase.setTextureSize(128, 128);
		this.PeakBase.mirror = true;
		this.setRotation(this.PeakBase, 0.5235988f, 0.0f, 0.0f);
		(this.Hair = new ModelRenderer(this, 58, 0)).addBox(-1.0f, -8.0f, 0.0f, 2, 16, 7);
		this.Hair.setRotationPoint(0.0f, -2.0f, -9.0f);
		this.Hair.setTextureSize(128, 128);
		this.Hair.mirror = true;
		this.setRotation(this.Hair, 0.5235988f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.Body.render(par7);
		this.Neck.render(par7);
		this.Thigh1R.render(par7);
		this.Thigh1L.render(par7);
		this.Thigh2R.render(par7);
		this.Thigh2L.render(par7);
		this.Leg1R.render(par7);
		this.Leg1L.render(par7);
		this.Leg2R.render(par7);
		this.Leg2L.render(par7);
		this.FeetR.render(par7);
		this.FeetL.render(par7);
		this.TailTop.render(par7);
		this.TailMiddle.render(par7);
		this.TailBottom.render(par7);
		this.Feet1L.render(par7);
		this.Feet1R.render(par7);
		this.EarR.render(par7);
		this.EarL.render(par7);
		this.PeakTop.render(par7);
		this.PeakBase.render(par7);
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
		this.FeetR.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Thigh1L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg1L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Feet1L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Thigh2L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg2L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.FeetL.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
