package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Hippogriff extends ModelBase {

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
	ModelRenderer Feet2L;
	ModelRenderer Claw1L;
	ModelRenderer Claw2L;
	ModelRenderer Claw3L;
	ModelRenderer Claw3R;
	ModelRenderer Claw2R;
	ModelRenderer Claw1R;
	ModelRenderer EarR;
	ModelRenderer EarL;
	ModelRenderer PeakTop;
	ModelRenderer PeakBase;
	ModelRenderer Wing1L;
	ModelRenderer Wing1R;
	ModelRenderer Wing2L;
	ModelRenderer Wing2R;

	public Hippogriff() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.Head = new ModelRenderer(this, 0, 5)).addBox(-2.5f, -2.5f, -7.0f, 5, 5, 7);
		this.Head.setRotationPoint(0.0f, -3.0f, -12.5f);
		this.Head.setTextureSize(128, 64);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.3490659f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 20)).addBox(-5.0f, -5.0f, -12.0f, 10, 10, 24);
		this.Body.setRotationPoint(0.0f, 8.0f, 0.0f);
		this.Body.setTextureSize(128, 64);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.Neck = new ModelRenderer(this, 50, 0)).addBox(-2.0f, -14.0f, -3.5f, 4, 14, 7);
		this.Neck.setRotationPoint(0.0f, 8.0f, -7.0f);
		this.Neck.setTextureSize(128, 64);
		this.Neck.mirror = true;
		this.setRotation(this.Neck, 0.6981317f, 0.0f, 0.0f);
		(this.Thigh1R = new ModelRenderer(this, 75, 0)).addBox(-1.5f, 0.0f, -2.0f, 3, 7, 4);
		this.Thigh1R.setRotationPoint(-3.6f, 8.0f, -9.2f);
		this.Thigh1R.setTextureSize(128, 64);
		this.Thigh1R.mirror = true;
		this.setRotation(this.Thigh1R, 0.0f, 0.0f, 0.0f);
		(this.Thigh1L = new ModelRenderer(this, 75, 0)).addBox(-1.5f, 0.0f, -2.0f, 3, 7, 4);
		this.Thigh1L.setRotationPoint(3.6f, 8.0f, -9.2f);
		this.Thigh1L.setTextureSize(128, 64);
		this.Thigh1L.mirror = true;
		this.setRotation(this.Thigh1L, 0.0f, 0.0f, 0.0f);
		(this.Thigh2R = new ModelRenderer(this, 90, 0)).addBox(-2.0f, 0.0f, -2.5f, 4, 9, 5);
		this.Thigh2R.setRotationPoint(-3.5f, 7.0f, 9.0f);
		this.Thigh2R.setTextureSize(128, 64);
		this.Thigh2R.mirror = true;
		this.setRotation(this.Thigh2R, 0.0f, 0.0f, 0.0f);
		(this.Thigh2L = new ModelRenderer(this, 90, 0)).addBox(-2.0f, 0.0f, -2.5f, 4, 9, 5);
		this.Thigh2L.setRotationPoint(3.5f, 7.0f, 9.0f);
		this.Thigh2L.setTextureSize(128, 64);
		this.Thigh2L.mirror = true;
		this.setRotation(this.Thigh2L, 0.0f, 0.0f, 0.0f);
		(this.Leg1R = new ModelRenderer(this, 75, 12)).addBox(-1.0f, 0.0f, -1.5f, 2, 8, 3);
		this.Leg1R.setRotationPoint(-3.5f, 15.0f, -9.5f);
		this.Leg1R.setTextureSize(128, 64);
		this.Leg1R.mirror = true;
		this.setRotation(this.Leg1R, 0.0f, 0.0f, 0.0f);
		(this.Leg1L = new ModelRenderer(this, 75, 12)).addBox(-1.0f, 0.0f, -1.5f, 2, 8, 3);
		this.Leg1L.setRotationPoint(3.5f, 15.0f, -9.5f);
		this.Leg1L.setTextureSize(128, 64);
		this.Leg1L.mirror = true;
		this.setRotation(this.Leg1L, 0.0f, 0.0f, 0.0f);
		(this.Leg2R = new ModelRenderer(this, 90, 15)).addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3);
		this.Leg2R.setRotationPoint(-3.5f, 16.0f, 9.0f);
		this.Leg2R.setTextureSize(128, 64);
		this.Leg2R.mirror = true;
		this.setRotation(this.Leg2R, 0.0f, 0.0f, 0.0f);
		(this.Leg2L = new ModelRenderer(this, 90, 15)).addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3);
		this.Leg2L.setRotationPoint(3.5f, 16.0f, 9.0f);
		this.Leg2L.setTextureSize(128, 64);
		this.Leg2L.mirror = true;
		this.setRotation(this.Leg2L, 0.0f, 0.0f, 0.0f);
		(this.FeetR = new ModelRenderer(this, 90, 25)).addBox(-2.0f, 0.0f, -2.0f, 4, 3, 4);
		this.FeetR.setRotationPoint(-3.5f, 21.0f, 9.0f);
		this.FeetR.setTextureSize(128, 64);
		this.FeetR.mirror = true;
		this.setRotation(this.FeetR, 0.0f, 0.0f, 0.0f);
		(this.FeetL = new ModelRenderer(this, 90, 25)).addBox(-2.0f, 0.0f, -2.0f, 4, 3, 4);
		this.FeetL.setRotationPoint(3.5f, 21.0f, 9.0f);
		this.FeetL.setTextureSize(128, 64);
		this.FeetL.mirror = true;
		this.setRotation(this.FeetL, 0.0f, 0.0f, 0.0f);
		(this.TailTop = new ModelRenderer(this, 0, 17)).addBox(-1.0f, -1.5f, 0.0f, 2, 2, 3);
		this.TailTop.setRotationPoint(0.0f, 3.5f, 11.5f);
		this.TailTop.setTextureSize(128, 64);
		this.TailTop.mirror = true;
		this.setRotation(this.TailTop, -1.134464f, 0.0f, 0.0f);
		(this.TailMiddle = new ModelRenderer(this, 0, 22)).addBox(-1.5f, -2.0f, 0.0f, 3, 4, 7);
		this.TailMiddle.setRotationPoint(0.0f, 6.0f, 13.0f);
		this.TailMiddle.setTextureSize(128, 64);
		this.TailMiddle.mirror = true;
		this.setRotation(this.TailMiddle, -1.134464f, 0.0f, 0.0f);
		(this.TailBottom = new ModelRenderer(this, 0, 33)).addBox(-1.5f, -2.0f, 0.0f, 3, 4, 7);
		this.TailBottom.setRotationPoint(0.0f, 12.3f, 16.0f);
		this.TailBottom.setTextureSize(128, 64);
		this.TailBottom.mirror = true;
		this.setRotation(this.TailBottom, -1.134464f, 0.0f, 0.0f);
		(this.Feet1L = new ModelRenderer(this, 75, 25)).addBox(-1.5f, 0.0f, -1.5f, 3, 1, 3);
		this.Feet1L.setRotationPoint(3.5f, 23.0f, -9.5f);
		this.Feet1L.setTextureSize(128, 64);
		this.Feet1L.mirror = true;
		this.setRotation(this.Feet1L, 0.0f, 0.0f, 0.0f);
		(this.Feet2L = new ModelRenderer(this, 75, 25)).addBox(-1.5f, 0.0f, -1.5f, 3, 1, 3);
		this.Feet2L.setRotationPoint(-3.5f, 23.0f, -9.5f);
		this.Feet2L.setTextureSize(128, 64);
		this.Feet2L.mirror = true;
		this.setRotation(this.Feet2L, 0.0f, 0.0f, 0.0f);
		(this.Claw1L = new ModelRenderer(this, 75, 30)).addBox(-0.5f, 0.0f, -2.0f, 1, 1, 2);
		this.Claw1L.setRotationPoint(2.5f, 23.0f, -10.8f);
		this.Claw1L.setTextureSize(128, 64);
		this.Claw1L.mirror = true;
		this.setRotation(this.Claw1L, 0.0f, 0.3490659f, 0.0f);
		(this.Claw2L = new ModelRenderer(this, 75, 30)).addBox(-0.5f, 0.0f, -2.0f, 1, 1, 2);
		this.Claw2L.setRotationPoint(3.5f, 23.0f, -11.0f);
		this.Claw2L.setTextureSize(128, 64);
		this.Claw2L.mirror = true;
		this.setRotation(this.Claw2L, 0.0f, 0.0f, 0.0f);
		(this.Claw3L = new ModelRenderer(this, 75, 30)).addBox(-0.5f, 0.0f, -2.0f, 1, 1, 2);
		this.Claw3L.setRotationPoint(4.5f, 23.0f, -10.8f);
		this.Claw3L.setTextureSize(128, 64);
		this.Claw3L.mirror = true;
		this.setRotation(this.Claw3L, 0.0f, -0.3490659f, 0.0f);
		(this.Claw3R = new ModelRenderer(this, 75, 30)).addBox(-0.5f, 0.0f, -2.0f, 1, 1, 2);
		this.Claw3R.setRotationPoint(-2.5f, 23.0f, -10.8f);
		this.Claw3R.setTextureSize(128, 64);
		this.Claw3R.mirror = true;
		this.setRotation(this.Claw3R, 0.0f, -0.3490659f, 0.0f);
		(this.Claw2R = new ModelRenderer(this, 75, 30)).addBox(-0.5f, 0.0f, -2.0f, 1, 1, 2);
		this.Claw2R.setRotationPoint(-3.5f, 23.0f, -11.0f);
		this.Claw2R.setTextureSize(128, 64);
		this.Claw2R.mirror = true;
		this.setRotation(this.Claw2R, 0.0f, 0.0f, 0.0f);
		(this.Claw1R = new ModelRenderer(this, 75, 30)).addBox(-0.5f, 0.0f, -2.0f, 1, 1, 2);
		this.Claw1R.setRotationPoint(-4.5f, 23.0f, -10.8f);
		this.Claw1R.setTextureSize(128, 64);
		this.Claw1R.mirror = true;
		this.setRotation(this.Claw1R, 0.0f, 0.3490659f, 0.0f);
		(this.EarR = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -0.5f, 0.0f, 2, 1, 3);
		this.EarR.setRotationPoint(-1.8f, -3.5f, -15.0f);
		this.EarR.setTextureSize(128, 64);
		this.EarR.mirror = true;
		this.setRotation(this.EarR, 0.1745329f, -0.7853982f, -0.5235988f);
		(this.EarL = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -0.5f, 0.0f, 2, 1, 3);
		this.EarL.setRotationPoint(1.8f, -3.5f, -15.0f);
		this.EarL.setTextureSize(128, 64);
		this.EarL.mirror = true;
		this.setRotation(this.EarL, 0.1745329f, 0.7853982f, 0.5235988f);
		(this.PeakTop = new ModelRenderer(this, 26, 0)).addBox(-1.0f, -1.0f, -3.0f, 2, 2, 3);
		this.PeakTop.setRotationPoint(0.0f, -1.0f, -18.5f);
		this.PeakTop.setTextureSize(128, 64);
		this.PeakTop.mirror = true;
		this.setRotation(this.PeakTop, 0.6981317f, 0.0f, 0.0f);
		(this.PeakBase = new ModelRenderer(this, 26, 6)).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3);
		this.PeakBase.setRotationPoint(0.0f, 0.0f, -17.0f);
		this.PeakBase.setTextureSize(128, 64);
		this.PeakBase.mirror = true;
		this.setRotation(this.PeakBase, 0.5235988f, 0.0f, 0.0f);
		(this.Wing1L = new ModelRenderer(this, 0, 54)).addBox(0.0f, -1.0f, -1.0f, 15, 2, 2);
		this.Wing1L.setRotationPoint(4.0f, 6.0f, -6.0f);
		this.Wing1L.setTextureSize(128, 64);
		this.Wing1L.mirror = true;
		this.setRotation(this.Wing1L, 0.0f, 0.0f, 0.4363323f);
		(this.Wing1R = new ModelRenderer(this, 0, 54)).addBox(-15.0f, -1.0f, -1.0f, 15, 2, 2);
		this.Wing1R.setRotationPoint(-4.0f, 6.0f, -6.0f);
		this.Wing1R.setTextureSize(128, 64);
		this.Wing1R.mirror = true;
		this.setRotation(this.Wing1R, 0.0f, 0.0f, -0.4363323f);
		(this.Wing2L = new ModelRenderer(this, 59, 53)).addBox(0.0f, -0.5f, -5.0f, 15, 1, 10);
		this.Wing2L.setRotationPoint(4.0f, 6.0f, 0.0f);
		this.Wing2L.setTextureSize(128, 64);
		this.Wing2L.mirror = true;
		this.setRotation(this.Wing2L, 0.0f, 0.0f, 0.4363323f);
		(this.Wing2R = new ModelRenderer(this, 59, 53)).addBox(-15.0f, -0.5f, -5.0f, 15, 1, 10);
		this.Wing2R.setRotationPoint(-4.0f, 6.0f, 0.0f);
		this.Wing2R.setTextureSize(128, 64);
		this.Wing2R.mirror = true;
		this.setRotation(this.Wing2R, 0.0f, 0.0f, -0.4363323f);
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
		this.Feet2L.render(par7);
		this.Claw1L.render(par7);
		this.Claw2L.render(par7);
		this.Claw3L.render(par7);
		this.Claw3R.render(par7);
		this.Claw2R.render(par7);
		this.Claw1R.render(par7);
		this.EarR.render(par7);
		this.EarL.render(par7);
		this.PeakTop.render(par7);
		this.PeakBase.render(par7);
		this.Wing1L.render(par7);
		this.Wing1R.render(par7);
		this.Wing2L.render(par7);
		this.Wing2R.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.Wing1L.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Wing1R.rotateAngleZ = MathHelper.cos(-par1 * -0.6222f) * -2.0f * -par2 * -0.5f;
		this.Wing2L.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Wing2R.rotateAngleZ = MathHelper.cos(-par1 * -0.6222f) * -2.0f * -par2 * -0.5f;
	}
}
