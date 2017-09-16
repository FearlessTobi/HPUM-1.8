package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Jarvey extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer tail;
	ModelRenderer neck;
	ModelRenderer ear1;
	ModelRenderer ear2;
	ModelRenderer leftleg1;
	ModelRenderer rightleg1;
	ModelRenderer leftleg2;
	ModelRenderer rightleg2;
	ModelRenderer nose;

	public Jarvey() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -1.5f, -4.0f, 4, 3, 4);
		this.head.setRotationPoint(0.0f, 20.2f, -3.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 0, 13)).addBox(-2.0f, -2.0f, -5.0f, 4, 4, 10);
		this.body.setRotationPoint(0.0f, 21.0f, 3.0f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.tail = new ModelRenderer(this, 28, 21)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 4);
		this.tail.setRotationPoint(0.0f, 20.0f, 7.0f);
		this.tail.setTextureSize(64, 32);
		this.tail.mirror = true;
		this.setRotation(this.tail, -0.5235988f, 0.0f, 0.0f);
		(this.neck = new ModelRenderer(this, 0, 8)).addBox(-1.5f, -1.0f, -1.5f, 3, 2, 3);
		this.neck.setRotationPoint(0.0f, 20.5f, -2.5f);
		this.neck.setTextureSize(64, 32);
		this.neck.mirror = true;
		this.setRotation(this.neck, 1.308997f, 0.0f, 0.0f);
		(this.ear1 = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -1.0f, -0.5f, 1, 2, 1);
		this.ear1.setRotationPoint(-2.0f, 20.0f, -4.0f);
		this.ear1.setTextureSize(64, 32);
		this.ear1.mirror = true;
		this.setRotation(this.ear1, 0.0f, 0.0f, 0.0f);
		(this.ear2 = new ModelRenderer(this, 0, 0)).addBox(0.0f, -1.0f, -0.5f, 1, 2, 1);
		this.ear2.setRotationPoint(2.0f, 20.0f, -4.0f);
		this.ear2.setTextureSize(64, 32);
		this.ear2.mirror = true;
		this.setRotation(this.ear2, 0.0f, 0.0f, 0.0f);
		(this.leftleg1 = new ModelRenderer(this, 22, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 2);
		this.leftleg1.setRotationPoint(1.5f, 20.0f, 0.0f);
		this.leftleg1.setTextureSize(64, 32);
		this.leftleg1.mirror = true;
		this.setRotation(this.leftleg1, 0.0f, 0.0f, 0.0f);
		(this.rightleg1 = new ModelRenderer(this, 22, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 2);
		this.rightleg1.setRotationPoint(-1.5f, 20.0f, 0.0f);
		this.rightleg1.setTextureSize(64, 32);
		this.rightleg1.mirror = true;
		this.setRotation(this.rightleg1, 0.0f, 0.0f, 0.0f);
		(this.leftleg2 = new ModelRenderer(this, 31, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 3, 2);
		this.leftleg2.setRotationPoint(1.5f, 21.0f, 6.0f);
		this.leftleg2.setTextureSize(64, 32);
		this.leftleg2.mirror = true;
		this.setRotation(this.leftleg2, 0.0f, 0.0f, 0.0f);
		(this.rightleg2 = new ModelRenderer(this, 31, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 3, 2);
		this.rightleg2.setRotationPoint(-1.5f, 21.0f, 6.0f);
		this.rightleg2.setTextureSize(64, 32);
		this.rightleg2.mirror = true;
		this.setRotation(this.rightleg2, 0.0f, 0.0f, 0.0f);
		(this.nose = new ModelRenderer(this, 12, 0)).addBox(-0.5f, -0.5f, -1.0f, 1, 1, 1);
		this.nose.setRotationPoint(0.0f, 20.5f, -6.5f);
		this.nose.setTextureSize(64, 32);
		this.nose.mirror = true;
		this.setRotation(this.nose, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.head.render(par7);
		this.body.render(par7);
		this.tail.render(par7);
		this.neck.render(par7);
		this.ear1.render(par7);
		this.ear2.render(par7);
		this.leftleg1.render(par7);
		this.rightleg1.render(par7);
		this.leftleg2.render(par7);
		this.rightleg2.render(par7);
		this.nose.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.rightleg1.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightleg2.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leftleg1.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leftleg2.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
