package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Billywig extends ModelBase {

	ModelRenderer body;
	ModelRenderer back;
	ModelRenderer head;
	ModelRenderer lefteye;
	ModelRenderer righteye;
	ModelRenderer leftwing;
	ModelRenderer rightwing;

	public Billywig() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.body = new ModelRenderer(this, 0, 5)).addBox(-2.0f, -2.0f, -2.0f, 4, 4, 4);
		this.body.setRotationPoint(0.0f, 7.0f, 0.0f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.back = new ModelRenderer(this, 17, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 5, 1);
		this.back.setRotationPoint(0.0f, 9.0f, 0.0f);
		this.back.setTextureSize(64, 32);
		this.back.mirror = true;
		this.setRotation(this.back, 0.0f, 0.0f, 0.0f);
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -1.0f, -1.5f, 3, 1, 3);
		this.head.setRotationPoint(0.0f, 5.0f, 0.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.lefteye = new ModelRenderer(this, 30, 0)).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 2);
		this.lefteye.setRotationPoint(0.5f, 4.8f, 0.0f);
		this.lefteye.setTextureSize(64, 32);
		this.lefteye.mirror = true;
		this.setRotation(this.lefteye, -0.1745329f, -0.2268928f, 0.0f);
		(this.righteye = new ModelRenderer(this, 30, 0)).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 2);
		this.righteye.setRotationPoint(-0.5f, 4.8f, 0.0f);
		this.righteye.setTextureSize(64, 32);
		this.righteye.mirror = true;
		this.setRotation(this.righteye, -0.1745329f, 0.2268928f, 0.0f);
		(this.leftwing = new ModelRenderer(this, 0, 15)).addBox(-1.0f, 0.0f, 0.0f, 2, 0, 7);
		this.leftwing.setRotationPoint(0.0f, 4.1f, 0.0f);
		this.leftwing.setTextureSize(64, 32);
		this.leftwing.mirror = true;
		this.setRotation(this.leftwing, 0.0872665f, 1.047198f, 0.0f);
		(this.rightwing = new ModelRenderer(this, 0, 15)).addBox(-1.0f, 0.0f, 0.0f, 2, 0, 7);
		this.rightwing.setRotationPoint(0.0f, 4.1f, 0.0f);
		this.rightwing.setTextureSize(64, 32);
		this.rightwing.mirror = true;
		this.setRotation(this.rightwing, 0.0872665f, -1.047198f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.body.render(par7);
		this.back.render(par7);
		this.head.render(par7);
		this.lefteye.render(par7);
		this.righteye.render(par7);
		this.leftwing.render(par7);
		this.rightwing.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		final ModelRenderer rightwing = this.rightwing;
		rightwing.rotateAngleY += 0.1f;
		final ModelRenderer leftwing = this.leftwing;
		leftwing.rotateAngleY += 0.1f;
	}
}
