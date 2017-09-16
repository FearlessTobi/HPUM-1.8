package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Bowtruckle extends ModelBase {

	ModelRenderer body;
	ModelRenderer head;
	ModelRenderer leftarm1;
	ModelRenderer rightarm1;
	ModelRenderer leftleg;
	ModelRenderer rightleg;
	ModelRenderer rightfeet;
	ModelRenderer leftfeet;
	ModelRenderer rightfingers;
	ModelRenderer leftfingers;
	ModelRenderer nose;

	public Bowtruckle() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.body = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -6.0f, -3.0f, 6, 12, 6);
		this.body.setRotationPoint(0.0f, 13.0f, 0.0f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.head = new ModelRenderer(this, 24, 0)).addBox(-2.5f, -4.5f, -1.0f, 5, 7, 2);
		this.head.setRotationPoint(0.0f, 13.0f, -2.5f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, -0.0872665f, 0.0f, 0.0f);
		(this.leftarm1 = new ModelRenderer(this, 0, 27)).addBox(0.0f, -1.0f, -1.0f, 7, 2, 2);
		this.leftarm1.setRotationPoint(3.0f, 11.0f, 0.0f);
		this.leftarm1.setTextureSize(64, 32);
		this.leftarm1.mirror = true;
		this.setRotation(this.leftarm1, 0.0f, 0.0f, 1.308997f);
		(this.rightarm1 = new ModelRenderer(this, 0, 27)).addBox(-7.0f, -1.0f, -1.0f, 7, 2, 2);
		this.rightarm1.setRotationPoint(-3.0f, 11.0f, 0.0f);
		this.rightarm1.setTextureSize(64, 32);
		this.rightarm1.mirror = true;
		this.setRotation(this.rightarm1, 0.0f, 0.0f, -1.308997f);
		(this.leftleg = new ModelRenderer(this, 26, 18)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		this.leftleg.setRotationPoint(1.7f, 15.5f, 0.0f);
		this.leftleg.setTextureSize(64, 32);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
		(this.rightleg = new ModelRenderer(this, 26, 18)).addBox(-1.0f, 0.0f, -1.0f, 2, 8, 2);
		this.rightleg.setRotationPoint(-1.7f, 15.5f, 0.0f);
		this.rightleg.setTextureSize(64, 32);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
		(this.rightfeet = new ModelRenderer(this, 0, 20)).addBox(-1.5f, 7.5f, -2.5f, 3, 1, 4);
		this.rightfeet.setRotationPoint(-1.7f, 15.5f, 0.0f);
		this.rightfeet.setTextureSize(64, 32);
		this.rightfeet.mirror = true;
		this.setRotation(this.rightfeet, 0.0f, 0.0f, 0.0f);
		(this.leftfeet = new ModelRenderer(this, 0, 20)).addBox(-1.5f, 7.5f, -2.5f, 3, 1, 4);
		this.leftfeet.setRotationPoint(1.7f, 15.5f, 0.0f);
		this.leftfeet.setTextureSize(64, 32);
		this.leftfeet.mirror = true;
		this.setRotation(this.leftfeet, 0.0f, 0.0f, 0.0f);
		(this.rightfingers = new ModelRenderer(this, 15, 20)).addBox(-1.5f, 7.5f, -3.5f, 3, 1, 2);
		this.rightfingers.setRotationPoint(-1.7f, 15.5f, 0.0f);
		this.rightfingers.setTextureSize(64, 32);
		this.rightfingers.mirror = true;
		this.setRotation(this.rightfingers, 0.0f, 0.0f, 0.0f);
		(this.leftfingers = new ModelRenderer(this, 15, 20)).addBox(-1.5f, 7.5f, -3.5f, 3, 1, 2);
		this.leftfingers.setRotationPoint(1.7f, 15.5f, 0.0f);
		this.leftfingers.setTextureSize(64, 32);
		this.leftfingers.mirror = true;
		this.setRotation(this.leftfingers, 0.0f, 0.0f, 0.0f);
		(this.nose = new ModelRenderer(this, 25, 10)).addBox(-0.5f, -0.5f, -3.0f, 1, 1, 3);
		this.nose.setRotationPoint(0.0f, 12.0f, -2.0f);
		this.nose.setTextureSize(64, 32);
		this.nose.mirror = true;
		this.setRotation(this.nose, 0.4363323f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.body.render(par7);
		this.head.render(par7);
		this.leftarm1.render(par7);
		this.rightarm1.render(par7);
		this.leftleg.render(par7);
		this.rightleg.render(par7);
		this.rightfeet.render(par7);
		this.leftfeet.render(par7);
		this.rightfingers.render(par7);
		this.leftfingers.render(par7);
		this.nose.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.leftleg.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leftfeet.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightfeet.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leftfingers.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightfingers.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leftarm1.rotateAngleY = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightarm1.rotateAngleY = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
