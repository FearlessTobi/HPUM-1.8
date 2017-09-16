package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Jobberknoll extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer tail;
	ModelRenderer leftwing;
	ModelRenderer rightwing;
	ModelRenderer peak;
	ModelRenderer leftfeet;
	ModelRenderer rightfeet;

	public Jobberknoll() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -2.0f, -2.0f, 3, 3, 3);
		this.head.setRotationPoint(0.0f, 20.0f, -1.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 0, 6)).addBox(-2.0f, 0.0f, -1.5f, 4, 4, 3);
		this.body.setRotationPoint(0.0f, 20.0f, -0.5f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 1.151917f, 0.0f, 0.0f);
		(this.tail = new ModelRenderer(this, 0, 13)).addBox(-1.5f, 0.0f, -1.0f, 3, 3, 2);
		this.tail.setRotationPoint(0.0f, 21.5f, 3.0f);
		this.tail.setTextureSize(64, 32);
		this.tail.mirror = true;
		this.setRotation(this.tail, 1.291544f, 0.0f, 0.0f);
		(this.leftwing = new ModelRenderer(this, 13, 0)).addBox(0.0f, -0.5f, -1.5f, 4, 1, 3);
		this.leftwing.setRotationPoint(1.5f, 20.5f, 1.5f);
		this.leftwing.setTextureSize(64, 32);
		this.leftwing.mirror = true;
		this.setRotation(this.leftwing, -0.1745329f, 0.0f, 0.6108652f);
		(this.rightwing = new ModelRenderer(this, 13, 0)).addBox(-4.0f, -0.5f, -1.5f, 4, 1, 3);
		this.rightwing.setRotationPoint(-1.5f, 20.5f, 1.5f);
		this.rightwing.setTextureSize(64, 32);
		this.rightwing.mirror = true;
		this.setRotation(this.rightwing, -0.1745329f, 0.0f, -0.6108652f);
		(this.peak = new ModelRenderer(this, 0, 25)).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 2);
		this.peak.setRotationPoint(0.0f, 20.0f, -2.0f);
		this.peak.setTextureSize(64, 32);
		this.peak.mirror = true;
		this.setRotation(this.peak, 0.0872665f, 0.0f, 0.0f);
		(this.leftfeet = new ModelRenderer(this, 0, 19)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.leftfeet.setRotationPoint(1.0f, 22.0f, 1.0f);
		this.leftfeet.setTextureSize(64, 32);
		this.leftfeet.mirror = true;
		this.setRotation(this.leftfeet, 0.0f, 0.0f, 0.0f);
		(this.rightfeet = new ModelRenderer(this, 0, 19)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.rightfeet.setRotationPoint(-1.0f, 22.0f, 1.0f);
		this.rightfeet.setTextureSize(64, 32);
		this.rightfeet.mirror = true;
		this.setRotation(this.rightfeet, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.head.render(par7);
		this.body.render(par7);
		this.tail.render(par7);
		this.leftwing.render(par7);
		this.rightwing.render(par7);
		this.peak.render(par7);
		this.leftfeet.render(par7);
		this.rightfeet.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.leftwing.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightwing.rotateAngleZ = MathHelper.cos(-par1 * -0.6222f) * -2.0f * -par2 * -0.5f;
	}
}
