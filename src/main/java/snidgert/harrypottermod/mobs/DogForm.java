package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class DogForm extends ModelBase {

	ModelRenderer WolfHead;
	ModelRenderer Body;
	ModelRenderer Mane;
	ModelRenderer Leg1;
	ModelRenderer Leg2;
	ModelRenderer Leg3;
	ModelRenderer Leg4;
	ModelRenderer Tail;
	ModelRenderer Ear1;
	ModelRenderer Ear2;
	ModelRenderer Nose;

	public DogForm() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.WolfHead = new ModelRenderer(this, 21, 0)).addBox(-3.0f, -3.0f, -2.0f, 6, 6, 4);
		this.WolfHead.setRotationPoint(-1.0f, 13.5f, -7.0f);
		this.WolfHead.setTextureSize(128, 64);
		this.WolfHead.mirror = true;
		this.setRotation(this.WolfHead, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 51, 17)).addBox(-4.0f, -2.0f, -3.0f, 6, 9, 6);
		this.Body.setRotationPoint(0.0f, 14.0f, 2.0f);
		this.Body.setTextureSize(128, 64);
		this.Body.mirror = true;
		this.setRotation(this.Body, 1.570796f, 0.0f, 0.0f);
		(this.Mane = new ModelRenderer(this, 81, 1)).addBox(-4.0f, -3.0f, -3.0f, 8, 6, 7);
		this.Mane.setRotationPoint(-1.0f, 14.0f, -3.0f);
		this.Mane.setTextureSize(128, 64);
		this.Mane.mirror = true;
		this.setRotation(this.Mane, 1.570796f, 0.0f, 0.0f);
		(this.Leg1 = new ModelRenderer(this, 0, 18)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		this.Leg1.setRotationPoint(-2.5f, 16.0f, 7.0f);
		this.Leg1.setTextureSize(128, 64);
		this.Leg1.mirror = true;
		this.setRotation(this.Leg1, 0.0f, 0.0f, 0.0f);
		(this.Leg2 = new ModelRenderer(this, 0, 18)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		this.Leg2.setRotationPoint(0.5f, 16.0f, 7.0f);
		this.Leg2.setTextureSize(128, 64);
		this.Leg2.mirror = true;
		this.setRotation(this.Leg2, 0.0f, 0.0f, 0.0f);
		(this.Leg3 = new ModelRenderer(this, 0, 18)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		this.Leg3.setRotationPoint(-2.5f, 16.0f, -4.0f);
		this.Leg3.setTextureSize(128, 64);
		this.Leg3.mirror = true;
		this.setRotation(this.Leg3, 0.0f, 0.0f, 0.0f);
		(this.Leg4 = new ModelRenderer(this, 0, 18)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		this.Leg4.setRotationPoint(0.5f, 16.0f, -4.0f);
		this.Leg4.setTextureSize(128, 64);
		this.Leg4.mirror = true;
		this.setRotation(this.Leg4, 0.0f, 0.0f, 0.0f);
		(this.Tail = new ModelRenderer(this, 9, 18)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		this.Tail.setRotationPoint(-1.0f, 12.0f, 8.0f);
		this.Tail.setTextureSize(128, 64);
		this.Tail.mirror = true;
		this.setRotation(this.Tail, 1.130069f, 0.0f, 0.0f);
		(this.Ear1 = new ModelRenderer(this, 16, 14)).addBox(-3.0f, -5.0f, 0.0f, 2, 2, 1);
		this.Ear1.setRotationPoint(-1.0f, 13.5f, -7.0f);
		this.Ear1.setTextureSize(128, 64);
		this.Ear1.mirror = true;
		this.setRotation(this.Ear1, 0.0f, 0.0f, 0.0f);
		(this.Ear2 = new ModelRenderer(this, 16, 14)).addBox(1.0f, -5.0f, 0.0f, 2, 2, 1);
		this.Ear2.setRotationPoint(-1.0f, 13.5f, -7.0f);
		this.Ear2.setTextureSize(128, 64);
		this.Ear2.mirror = true;
		this.setRotation(this.Ear2, 0.0f, 0.0f, 0.0f);
		(this.Nose = new ModelRenderer(this, 0, 10)).addBox(-2.0f, 0.0f, -5.0f, 3, 3, 4);
		this.Nose.setRotationPoint(-0.5f, 13.5f, -7.0f);
		this.Nose.setTextureSize(128, 64);
		this.Nose.mirror = true;
		this.setRotation(this.Nose, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.WolfHead.render(par7);
		this.Body.render(par7);
		this.Mane.render(par7);
		this.Leg1.render(par7);
		this.Leg2.render(par7);
		this.Leg3.render(par7);
		this.Leg4.render(par7);
		this.Tail.render(par7);
		this.Ear1.render(par7);
		this.Ear2.render(par7);
		this.Nose.render(par7);
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
