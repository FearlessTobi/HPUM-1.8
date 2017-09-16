package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Bird extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightwing;
	ModelRenderer leftwing;
	ModelRenderer tail;
	ModelRenderer leftleg;
	ModelRenderer rightleg;
	ModelRenderer peak;

	public Bird() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -4.0f, -2.0f, 4, 4, 4);
		this.head.setRotationPoint(0.0f, 20.0f, -3.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 0, 8)).addBox(-2.5f, 0.0f, -2.0f, 5, 6, 4);
		this.body.setRotationPoint(0.0f, 20.0f, -3.0f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 1.396263f, 0.0f, 0.0f);
		(this.rightwing = new ModelRenderer(this, 0, 18)).addBox(-1.0f, 0.0f, 0.0f, 1, 3, 5);
		this.rightwing.setRotationPoint(-2.5f, 18.5f, -2.5f);
		this.rightwing.setTextureSize(64, 32);
		this.rightwing.mirror = true;
		this.setRotation(this.rightwing, -0.1745329f, 0.0f, 0.0f);
		(this.leftwing = new ModelRenderer(this, 0, 18)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 5);
		this.leftwing.setRotationPoint(2.5f, 18.5f, -2.5f);
		this.leftwing.setTextureSize(64, 32);
		this.leftwing.mirror = true;
		this.setRotation(this.leftwing, -0.0872665f, 0.0f, 0.0f);
		(this.tail = new ModelRenderer(this, 16, 0)).addBox(-1.5f, 0.0f, 0.0f, 3, 0, 5);
		this.tail.setRotationPoint(0.0f, 21.0f, 2.5f);
		this.tail.setTextureSize(64, 32);
		this.tail.mirror = true;
		this.setRotation(this.tail, 0.2617994f, 0.0f, 0.0f);
		(this.leftleg = new ModelRenderer(this, 32, 0)).addBox(-0.5f, 0.0f, -2.0f, 1, 2, 2);
		this.leftleg.setRotationPoint(1.0f, 22.0f, 1.0f);
		this.leftleg.setTextureSize(64, 32);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
		(this.rightleg = new ModelRenderer(this, 32, 0)).addBox(-0.5f, 0.0f, -2.0f, 1, 2, 2);
		this.rightleg.setRotationPoint(-1.0f, 22.0f, 1.0f);
		this.rightleg.setTextureSize(64, 32);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
		(this.peak = new ModelRenderer(this, 18, 6)).addBox(-1.0f, -1.0f, -2.0f, 2, 2, 2);
		this.peak.setRotationPoint(0.0f, 17.8f, -4.1f);
		this.peak.setTextureSize(64, 32);
		this.peak.mirror = true;
		this.setRotation(this.peak, 0.9075712f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.head.render(par7);
		this.body.render(par7);
		this.rightwing.render(par7);
		this.leftwing.render(par7);
		this.tail.render(par7);
		this.leftleg.render(par7);
		this.rightleg.render(par7);
		this.peak.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.leftwing.rotateAngleY = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightwing.rotateAngleY = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
