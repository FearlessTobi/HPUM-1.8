package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Leprechaun extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer hatbase;
	ModelRenderer hattop;

	public Leprechaun() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-3.5f, -7.0f, -3.5f, 7, 7, 7);
		this.head.setRotationPoint(0.0f, 6.0f, 0.0f);
		this.head.setTextureSize(128, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 10, 4);
		this.body.setRotationPoint(0.0f, 6.0f, 0.0f);
		this.body.setTextureSize(128, 64);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.rightarm = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 10, 4);
		this.rightarm.setRotationPoint(-5.0f, 8.0f, 0.0f);
		this.rightarm.setTextureSize(128, 64);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
		(this.leftarm = new ModelRenderer(this, 40, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 10, 4);
		this.leftarm.setRotationPoint(5.0f, 8.0f, 0.0f);
		this.leftarm.setTextureSize(128, 64);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
		(this.rightleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4);
		this.rightleg.setRotationPoint(-2.0f, 16.0f, 0.0f);
		this.rightleg.setTextureSize(128, 64);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
		(this.leftleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 8, 4);
		this.leftleg.setRotationPoint(2.0f, 16.0f, 0.0f);
		this.leftleg.setTextureSize(128, 64);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
		(this.hatbase = new ModelRenderer(this, 58, 0)).addBox(-4.5f, -1.0f, -4.5f, 9, 2, 9);
		this.hatbase.setRotationPoint(0.0f, -1.0f, 0.0f);
		this.hatbase.setTextureSize(128, 64);
		this.hatbase.mirror = true;
		this.setRotation(this.hatbase, 0.0f, 0.0f, 0.0f);
		(this.hattop = new ModelRenderer(this, 29, 0)).addBox(-3.5f, -6.0f, -3.5f, 7, 6, 7);
		this.hattop.setRotationPoint(0.0f, -2.0f, 0.0f);
		this.hattop.setTextureSize(128, 64);
		this.hattop.mirror = true;
		this.setRotation(this.hattop, 0.0f, 0.0f, 0.0f);
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
		this.hatbase.render(par7);
		this.hattop.render(par7);
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
		this.leftarm.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
