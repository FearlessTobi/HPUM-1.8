package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Fwooper extends ModelBase {

	ModelRenderer body;
	ModelRenderer head;
	ModelRenderer leftfeet;
	ModelRenderer rightfeet;
	ModelRenderer Tail;
	ModelRenderer rightwing;
	ModelRenderer leftwing;
	ModelRenderer feathers;
	ModelRenderer peak;

	public Fwooper() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.body = new ModelRenderer(this, 0, 7)).addBox(-2.0f, -3.0f, -2.5f, 4, 6, 5);
		this.body.setRotationPoint(0.0f, 20.0f, 0.0f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-2.5f, -3.0f, -2.0f, 5, 3, 4);
		this.head.setRotationPoint(0.0f, 17.0f, 0.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.leftfeet = new ModelRenderer(this, 16, 0)).addBox(-0.5f, 0.0f, -1.5f, 1, 1, 3);
		this.leftfeet.setRotationPoint(1.0f, 23.0f, 0.0f);
		this.leftfeet.setTextureSize(64, 32);
		this.leftfeet.mirror = true;
		this.setRotation(this.leftfeet, 0.0f, 0.0f, 0.0f);
		(this.rightfeet = new ModelRenderer(this, 16, 0)).addBox(-0.5f, 0.0f, -1.5f, 1, 1, 3);
		this.rightfeet.setRotationPoint(-1.0f, 23.0f, 0.0f);
		this.rightfeet.setTextureSize(64, 32);
		this.rightfeet.mirror = true;
		this.setRotation(this.rightfeet, 0.0f, 0.0f, 0.0f);
		(this.Tail = new ModelRenderer(this, 25, 0)).addBox(-2.0f, 0.0f, 0.0f, 4, 0, 7);
		this.Tail.setRotationPoint(0.0f, 22.0f, 2.0f);
		this.Tail.setTextureSize(64, 32);
		this.Tail.mirror = true;
		this.setRotation(this.Tail, 0.5759587f, 0.0f, 0.0f);
		(this.rightwing = new ModelRenderer(this, 18, 7)).addBox(-1.0f, 0.0f, -2.5f, 1, 5, 5);
		this.rightwing.setRotationPoint(-2.0f, 17.0f, 0.0f);
		this.rightwing.setTextureSize(64, 32);
		this.rightwing.mirror = true;
		this.setRotation(this.rightwing, 0.0f, 0.0f, 0.0f);
		(this.leftwing = new ModelRenderer(this, 18, 7)).addBox(0.0f, 0.0f, -2.5f, 1, 5, 5);
		this.leftwing.setRotationPoint(2.0f, 17.0f, 0.0f);
		this.leftwing.setTextureSize(64, 32);
		this.leftwing.mirror = true;
		this.setRotation(this.leftwing, 0.0f, 0.0f, 0.0f);
		(this.feathers = new ModelRenderer(this, 24, 0)).addBox(-2.0f, -5.0f, 0.0f, 4, 5, 0);
		this.feathers.setRotationPoint(0.0f, 15.0f, 0.0f);
		this.feathers.setTextureSize(64, 32);
		this.feathers.mirror = true;
		this.setRotation(this.feathers, -0.2974289f, 0.0f, 0.0f);
		(this.peak = new ModelRenderer(this, 0, 0)).addBox(-0.5f, 0.0f, -1.0f, 1, 2, 1);
		this.peak.setRotationPoint(0.0f, 15.5f, -2.0f);
		this.peak.setTextureSize(64, 32);
		this.peak.mirror = true;
		this.setRotation(this.peak, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.body.render(par7);
		this.head.render(par7);
		this.leftfeet.render(par7);
		this.rightfeet.render(par7);
		this.Tail.render(par7);
		this.rightwing.render(par7);
		this.leftwing.render(par7);
		this.feathers.render(par7);
		this.peak.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.leftwing.rotateAngleZ = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightwing.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
