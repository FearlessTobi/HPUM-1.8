package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Fluffy extends ModelBase {

	ModelRenderer Shape3;
	ModelRenderer Shape2;
	ModelRenderer Shape1;
	ModelRenderer WolfHead;
	ModelRenderer Body;
	ModelRenderer Leg1;
	ModelRenderer Leg2;
	ModelRenderer Leg3;
	ModelRenderer Leg4;
	ModelRenderer Tail;
	ModelRenderer Ear23;
	ModelRenderer Ear32;
	ModelRenderer Nose;
	ModelRenderer WolfHead2;
	ModelRenderer WolfHead3;
	ModelRenderer Nose3;
	ModelRenderer Nose2;
	ModelRenderer Ear21;
	ModelRenderer Ear22;
	ModelRenderer Ear13;
	ModelRenderer Ear12;

	public Fluffy() {
		super.textureWidth = 512;
		super.textureHeight = 512;
		(this.Shape3 = new ModelRenderer(this, 115, 50)).addBox(0.0f, 0.0f, 0.0f, 9, 9, 6);
		this.Shape3.setRotationPoint(-4.5f, -7.0f, -12.0f);
		this.Shape3.setTextureSize(512, 512);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, -0.1745329f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 115, 50)).addBox(-2.0f, -2.0f, -4.0f, 9, 9, 12);
		this.Shape2.setRotationPoint(10.0f, -5.0f, -7.0f);
		this.Shape2.setTextureSize(512, 512);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, -0.1745329f, -1.047198f, 0.0f);
		(this.Shape1 = new ModelRenderer(this, 115, 50)).addBox(-7.0f, -2.0f, -4.0f, 9, 9, 12);
		this.Shape1.setRotationPoint(-10.0f, -5.0f, -7.0f);
		this.Shape1.setTextureSize(512, 512);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, -0.1745329f, 1.047198f, 0.0f);
		(this.WolfHead = new ModelRenderer(this, 100, 0)).addBox(-3.0f, -3.0f, -2.0f, 15, 15, 9);
		this.WolfHead.setRotationPoint(-4.5f, -9.0f, -18.0f);
		this.WolfHead.setTextureSize(512, 512);
		this.WolfHead.mirror = true;
		this.setRotation(this.WolfHead, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 200, 200)).addBox(0.0f, 0.0f, 0.0f, 18, 27, 18);
		this.Body.setRotationPoint(-9.0f, 12.0f, -8.0f);
		this.Body.setTextureSize(512, 512);
		this.Body.mirror = true;
		this.setRotation(this.Body, 1.570796f, 0.0f, 0.0f);
		(this.Leg1 = new ModelRenderer(this, 5, 50)).addBox(-1.0f, 0.0f, -1.0f, 6, 12, 6);
		this.Leg1.setRotationPoint(-8.0f, 12.0f, 14.0f);
		this.Leg1.setTextureSize(512, 512);
		this.Leg1.mirror = true;
		this.setRotation(this.Leg1, 0.0f, 0.0f, 0.0f);
		(this.Leg2 = new ModelRenderer(this, 5, 50)).addBox(-1.0f, 0.0f, -1.0f, 6, 12, 6);
		this.Leg2.setRotationPoint(4.0f, 12.0f, 14.0f);
		this.Leg2.setTextureSize(512, 512);
		this.Leg2.mirror = true;
		this.setRotation(this.Leg2, 0.0f, 0.0f, 0.0f);
		(this.Leg3 = new ModelRenderer(this, 5, 50)).addBox(-1.0f, 0.0f, -1.0f, 6, 12, 6);
		this.Leg3.setRotationPoint(-8.0f, 12.0f, -7.0f);
		this.Leg3.setTextureSize(512, 512);
		this.Leg3.mirror = true;
		this.setRotation(this.Leg3, 0.0f, 0.0f, 0.0f);
		(this.Leg4 = new ModelRenderer(this, 5, 50)).addBox(-1.0f, 0.0f, -1.0f, 6, 12, 6);
		this.Leg4.setRotationPoint(4.0f, 12.0f, -7.0f);
		this.Leg4.setTextureSize(512, 512);
		this.Leg4.mirror = true;
		this.setRotation(this.Leg4, 0.0f, 0.0f, 0.0f);
		(this.Tail = new ModelRenderer(this, 50, 50)).addBox(-1.0f, 0.0f, -1.0f, 6, 15, 6);
		this.Tail.setRotationPoint(-0.5f, 0.0f, 16.0f);
		this.Tail.setTextureSize(512, 512);
		this.Tail.mirror = true;
		this.setRotation(this.Tail, 1.130069f, 0.0f, 0.0f);
		(this.Ear23 = new ModelRenderer(this, 10, 10)).addBox(-5.0f, 0.0f, -2.0f, 5, 5, 2);
		this.Ear23.setRotationPoint(-7.0f, -17.0f, -14.0f);
		this.Ear23.setTextureSize(512, 512);
		this.Ear23.mirror = true;
		this.setRotation(this.Ear23, 0.0f, 3.141593f, 0.0f);
		(this.Ear32 = new ModelRenderer(this, 10, 10)).addBox(-5.0f, 0.0f, -2.0f, 5, 5, 2);
		this.Ear32.setRotationPoint(2.0f, -17.0f, -14.0f);
		this.Ear32.setTextureSize(512, 512);
		this.Ear32.mirror = true;
		this.setRotation(this.Ear32, 0.0f, -3.141593f, 0.0f);
		(this.Nose = new ModelRenderer(this, 100, 100)).addBox(-9.0f, 0.0f, -3.0f, 9, 9, 3);
		this.Nose.setRotationPoint(-4.5f, -7.0f, -23.0f);
		this.Nose.setTextureSize(512, 512);
		this.Nose.mirror = true;
		this.setRotation(this.Nose, 0.0f, 3.141593f, 0.0f);
		(this.WolfHead2 = new ModelRenderer(this, 100, 0)).addBox(0.0f, 0.0f, -9.0f, 15, 15, 9);
		this.WolfHead2.setRotationPoint(-16.0f, -12.0f, 2.0f);
		this.WolfHead2.setTextureSize(512, 512);
		this.WolfHead2.mirror = true;
		this.setRotation(this.WolfHead2, 0.0f, 1.047198f, 0.0f);
		(this.WolfHead3 = new ModelRenderer(this, 100, 0)).addBox(-15.0f, 0.0f, -9.0f, 15, 15, 9);
		this.WolfHead3.setRotationPoint(16.0f, -12.0f, 2.0f);
		this.WolfHead3.setTextureSize(512, 512);
		this.WolfHead3.mirror = true;
		this.setRotation(this.WolfHead3, 0.0f, -1.047198f, 0.0f);
		(this.Nose3 = new ModelRenderer(this, 100, 100)).addBox(0.0f, 0.0f, 0.0f, 9, 9, 3);
		this.Nose3.setRotationPoint(22.0f, -7.0f, -4.5f);
		this.Nose3.setTextureSize(512, 512);
		this.Nose3.mirror = true;
		this.setRotation(this.Nose3, 0.0f, 2.094395f, 0.0f);
		(this.Nose2 = new ModelRenderer(this, 100, 100)).addBox(-9.0f, 0.0f, 0.0f, 9, 9, 3);
		this.Nose2.setRotationPoint(-22.0f, -7.0f, -4.5f);
		this.Nose2.setTextureSize(512, 512);
		this.Nose2.mirror = true;
		this.setRotation(this.Nose2, 0.0f, -2.094395f, 0.0f);
		(this.Ear21 = new ModelRenderer(this, 10, 10)).addBox(0.0f, 0.0f, 0.0f, 5, 5, 2);
		this.Ear21.setRotationPoint(12.0f, -17.0f, -6.0f);
		this.Ear21.setTextureSize(512, 512);
		this.Ear21.mirror = true;
		this.setRotation(this.Ear21, 0.0f, 2.094395f, 0.0f);
		(this.Ear22 = new ModelRenderer(this, 10, 10)).addBox(0.0f, 0.0f, 0.0f, 5, 5, 2);
		this.Ear22.setRotationPoint(16.0f, -17.0f, 1.0f);
		this.Ear22.setTextureSize(512, 512);
		this.Ear22.mirror = true;
		this.setRotation(this.Ear22, 0.0f, 2.094395f, 0.0f);
		(this.Ear13 = new ModelRenderer(this, 10, 10)).addBox(-5.0f, 0.0f, 0.0f, 5, 5, 2);
		this.Ear13.setRotationPoint(-16.0f, -17.0f, 1.0f);
		this.Ear13.setTextureSize(512, 512);
		this.Ear13.mirror = true;
		this.setRotation(this.Ear13, 0.0f, -2.094395f, 0.0f);
		(this.Ear12 = new ModelRenderer(this, 10, 10)).addBox(-5.0f, 0.0f, 0.0f, 5, 5, 2);
		this.Ear12.setRotationPoint(-12.0f, -17.0f, -6.0f);
		this.Ear12.setTextureSize(512, 512);
		this.Ear12.mirror = true;
		this.setRotation(this.Ear12, 0.0f, -2.094395f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Shape3.render(par7);
		this.Shape2.render(par7);
		this.Shape1.render(par7);
		this.WolfHead.render(par7);
		this.Body.render(par7);
		this.Leg1.render(par7);
		this.Leg2.render(par7);
		this.Leg3.render(par7);
		this.Leg4.render(par7);
		this.Tail.render(par7);
		this.Ear23.render(par7);
		this.Ear32.render(par7);
		this.Nose.render(par7);
		this.WolfHead2.render(par7);
		this.WolfHead3.render(par7);
		this.Nose3.render(par7);
		this.Nose2.render(par7);
		this.Ear21.render(par7);
		this.Ear22.render(par7);
		this.Ear13.render(par7);
		this.Ear12.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.Leg1.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg2.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg3.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg4.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
