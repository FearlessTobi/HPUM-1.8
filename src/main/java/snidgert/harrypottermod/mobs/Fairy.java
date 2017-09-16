package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Fairy extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer leftwing;
	ModelRenderer rightwing;
	ModelRenderer hair;

	public Fairy() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2);
		this.head.setRotationPoint(0.0f, 10.0f, 0.0f);
		this.head.setTextureSize(64, 32);
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 4, 4)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.body.setRotationPoint(0.0f, 10.0f, 0.0f);
		this.body.setTextureSize(64, 32);
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.rightarm = new ModelRenderer(this, 10, 4)).addBox(-1.0f, -1.0f, -0.5f, 1, 3, 1);
		this.rightarm.setRotationPoint(-1.0f, 11.0f, 0.0f);
		this.rightarm.setTextureSize(64, 32);
		this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
		(this.leftarm = new ModelRenderer(this, 10, 4)).addBox(0.0f, -1.0f, -0.5f, 1, 3, 1);
		this.leftarm.setRotationPoint(1.0f, 11.0f, 0.0f);
		this.leftarm.setTextureSize(64, 32);
		this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
		(this.rightleg = new ModelRenderer(this, 0, 4)).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1);
		this.rightleg.setRotationPoint(-0.5f, 13.0f, 0.0f);
		this.rightleg.setTextureSize(64, 32);
		this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
		(this.leftleg = new ModelRenderer(this, 0, 4)).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1);
		this.leftleg.setRotationPoint(0.5f, 13.0f, 0.0f);
		this.leftleg.setTextureSize(64, 32);
		this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
		(this.leftwing = new ModelRenderer(this, 0, 8)).addBox(0.0f, -2.5f, 0.0f, 0, 5, 4);
		this.leftwing.setRotationPoint(0.0f, 11.5f, 0.0f);
		this.leftwing.setTextureSize(64, 32);
		this.setRotation(this.leftwing, 0.0f, -0.6108652f, 0.0f);
		(this.rightwing = new ModelRenderer(this, 0, 8)).addBox(0.0f, -2.5f, 0.0f, 0, 5, 4);
		this.rightwing.setRotationPoint(0.0f, 11.5f, 0.0f);
		this.rightwing.setTextureSize(64, 32);
		this.setRotation(this.rightwing, 0.0f, 0.6108652f, 0.0f);
		(this.hair = new ModelRenderer(this, 8, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2);
		this.hair.setRotationPoint(0.0f, 10.0f, 0.0f);
		this.hair.setTextureSize(64, 32);
		this.setRotation(this.hair, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.head.render(par7);
		this.body.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
		this.rightleg.render(par7);
		this.leftleg.render(par7);
		this.leftwing.render(par7);
		this.rightwing.render(par7);
		this.hair.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.rightwing.rotateAngleY = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leftwing.rotateAngleY = -MathHelper.cos(-par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
