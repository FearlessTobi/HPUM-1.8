package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Phoenix extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Mouth;
	ModelRenderer righteyebrow;
	ModelRenderer lefteyebrow;
	ModelRenderer neck;
	ModelRenderer neckbase;
	ModelRenderer body;
	ModelRenderer bodyback;
	ModelRenderer rightfeet;
	ModelRenderer leftfeet;
	ModelRenderer leftleg;
	ModelRenderer rightleg;
	ModelRenderer rightthigh;
	ModelRenderer leftthigh;
	ModelRenderer upperTail;
	ModelRenderer lowerTail;
	ModelRenderer leftwing;
	ModelRenderer rightwing;
	ModelRenderer upperpeak;
	ModelRenderer lowerpeak;
	ModelRenderer upperfeathers;
	ModelRenderer lowerfeathers;

	public Phoenix() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -3.0f, -8.0f, 4, 3, 9);
		this.Head.setRotationPoint(0.0f, 3.0f, -1.0f);
		this.Head.setTextureSize(128, 64);
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Mouth = new ModelRenderer(this, 0, 15)).addBox(-2.0f, -0.5f, -4.0f, 4, 1, 4);
		this.Mouth.setRotationPoint(0.0f, 3.5f, -4.5f);
		this.Mouth.setTextureSize(128, 64);
		this.setRotation(this.Mouth, 0.0f, 0.0f, 0.0f);
		(this.righteyebrow = new ModelRenderer(this, 19, 0)).addBox(-1.0f, -1.0f, -2.0f, 1, 1, 4);
		this.righteyebrow.setRotationPoint(-1.5f, 0.8f, -4.0f);
		this.righteyebrow.setTextureSize(128, 64);
		this.setRotation(this.righteyebrow, 0.0349066f, 0.0f, 0.0f);
		(this.lefteyebrow = new ModelRenderer(this, 19, 0)).addBox(0.0f, -1.0f, -2.0f, 1, 1, 4);
		this.lefteyebrow.setRotationPoint(1.5f, 0.8f, -4.0f);
		this.lefteyebrow.setTextureSize(128, 64);
		this.setRotation(this.lefteyebrow, 0.0349066f, 0.0f, 0.0f);
		(this.neck = new ModelRenderer(this, 35, 0)).addBox(-2.0f, 0.0f, -2.0f, 4, 4, 4);
		this.neck.setRotationPoint(0.0f, 2.8f, -2.5f);
		this.neck.setTextureSize(128, 64);
		this.setRotation(this.neck, 0.0523599f, 0.0f, 0.0f);
		(this.neckbase = new ModelRenderer(this, 35, 10)).addBox(-2.5f, 0.0f, -2.0f, 5, 5, 4);
		this.neckbase.setRotationPoint(0.0f, 5.5f, -2.8f);
		this.neckbase.setTextureSize(128, 64);
		this.setRotation(this.neckbase, 0.5235988f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 0, 22)).addBox(-4.0f, 0.0f, -4.0f, 8, 10, 8);
		this.body.setRotationPoint(0.0f, 8.0f, -2.0f);
		this.body.setTextureSize(128, 64);
		this.setRotation(this.body, 0.9599311f, 0.0f, 0.0f);
		(this.bodyback = new ModelRenderer(this, 0, 40)).addBox(-3.0f, 0.0f, -3.0f, 6, 6, 6);
		this.bodyback.setRotationPoint(0.0f, 14.0f, 6.0f);
		this.bodyback.setTextureSize(128, 64);
		this.setRotation(this.bodyback, 0.9599311f, 0.0f, 0.0f);
		(this.rightfeet = new ModelRenderer(this, 60, 24)).addBox(-1.5f, -1.0f, -4.0f, 3, 2, 4);
		this.rightfeet.setRotationPoint(-2.0f, 23.0f, 3.0f);
		this.rightfeet.setTextureSize(128, 64);
		this.setRotation(this.rightfeet, 0.0f, 0.0f, 0.0f);
		(this.leftfeet = new ModelRenderer(this, 60, 24)).addBox(-1.5f, -1.0f, -4.0f, 3, 2, 4);
		this.leftfeet.setRotationPoint(2.0f, 23.0f, 3.0f);
		this.leftfeet.setTextureSize(128, 64);
		this.setRotation(this.leftfeet, 0.0f, 0.0f, 0.0f);
		(this.leftleg = new ModelRenderer(this, 60, 14)).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2);
		this.leftleg.setRotationPoint(2.0f, 18.0f, 3.0f);
		this.leftleg.setTextureSize(128, 64);
		this.setRotation(this.leftleg, -0.1745329f, 0.0f, 0.0f);
		(this.rightleg = new ModelRenderer(this, 60, 14)).addBox(-1.0f, 0.0f, -1.0f, 2, 5, 2);
		this.rightleg.setRotationPoint(-2.0f, 18.0f, 3.0f);
		this.rightleg.setTextureSize(128, 64);
		this.setRotation(this.rightleg, -0.1745329f, 0.0f, 0.0f);
		(this.rightthigh = new ModelRenderer(this, 60, 0)).addBox(-3.0f, 0.0f, -2.0f, 3, 7, 4);
		this.rightthigh.setRotationPoint(-0.5f, 12.0f, 3.0f);
		this.rightthigh.setTextureSize(128, 64);
		this.setRotation(this.rightthigh, 0.0f, 0.0f, 0.0f);
		(this.leftthigh = new ModelRenderer(this, 60, 0)).addBox(0.0f, 0.0f, -2.0f, 3, 7, 4);
		this.leftthigh.setRotationPoint(0.5f, 12.0f, 3.0f);
		this.leftthigh.setTextureSize(128, 64);
		this.setRotation(this.leftthigh, 0.0f, 0.0f, 0.0f);
		(this.upperTail = new ModelRenderer(this, 33, 33)).addBox(-2.5f, -1.0f, 0.0f, 5, 2, 8);
		this.upperTail.setRotationPoint(0.0f, 16.5f, 11.0f);
		this.upperTail.setTextureSize(128, 64);
		this.setRotation(this.upperTail, -0.4363323f, 0.0f, 0.0f);
		(this.lowerTail = new ModelRenderer(this, 60, 33)).addBox(-2.0f, -1.0f, 0.0f, 4, 2, 7);
		this.lowerTail.setRotationPoint(0.0f, 18.0f, 9.0f);
		this.lowerTail.setTextureSize(128, 64);
		this.setRotation(this.lowerTail, -0.4363323f, 0.0f, 0.0f);
		(this.leftwing = new ModelRenderer(this, 25, 44)).addBox(0.0f, -1.0f, -1.0f, 2, 9, 11);
		this.leftwing.setRotationPoint(4.0f, 8.0f, 0.0f);
		this.leftwing.setTextureSize(128, 64);
		this.setRotation(this.leftwing, -0.1919862f, 0.0f, 0.0f);
		(this.rightwing = new ModelRenderer(this, 25, 44)).addBox(-2.0f, -1.0f, -1.0f, 2, 9, 11);
		this.rightwing.setRotationPoint(-4.0f, 8.0f, 0.0f);
		this.rightwing.setTextureSize(128, 64);
		this.setRotation(this.rightwing, -0.1919862f, 0.0f, 0.0f);
		(this.upperpeak = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -1.0f, -1.0f, 3, 2, 1);
		this.upperpeak.setRotationPoint(0.0f, 2.0f, -9.0f);
		this.upperpeak.setTextureSize(128, 64);
		this.setRotation(this.upperpeak, 0.0f, 0.0f, 0.0f);
		(this.lowerpeak = new ModelRenderer(this, 0, 5)).addBox(-1.0f, 0.0f, -1.0f, 2, 1, 1);
		this.lowerpeak.setRotationPoint(0.0f, 3.0f, -8.8f);
		this.lowerpeak.setTextureSize(128, 64);
		this.setRotation(this.lowerpeak, -0.0174533f, 0.0f, 0.0f);
		(this.upperfeathers = new ModelRenderer(this, 0, 56)).addBox(-2.0f, 0.0f, 0.0f, 4, 0, 6);
		this.upperfeathers.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.upperfeathers.setTextureSize(128, 64);
		this.setRotation(this.upperfeathers, 0.2617994f, 0.0f, 0.0f);
		(this.lowerfeathers = new ModelRenderer(this, 0, 56)).addBox(-2.0f, 0.0f, 0.0f, 4, 0, 6);
		this.lowerfeathers.setRotationPoint(0.0f, 2.0f, -1.0f);
		this.lowerfeathers.setTextureSize(128, 64);
		this.setRotation(this.lowerfeathers, 0.1745329f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.Mouth.render(par7);
		this.righteyebrow.render(par7);
		this.lefteyebrow.render(par7);
		this.neck.render(par7);
		this.neckbase.render(par7);
		this.body.render(par7);
		this.bodyback.render(par7);
		this.rightfeet.render(par7);
		this.leftfeet.render(par7);
		this.leftleg.render(par7);
		this.rightleg.render(par7);
		this.rightthigh.render(par7);
		this.leftthigh.render(par7);
		this.upperTail.render(par7);
		this.lowerTail.render(par7);
		this.leftwing.render(par7);
		this.rightwing.render(par7);
		this.upperpeak.render(par7);
		this.lowerpeak.render(par7);
		this.upperfeathers.render(par7);
		this.lowerfeathers.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.leftwing.rotateAngleY = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightwing.rotateAngleY = MathHelper.cos(-par1 * -0.6222f) * -2.0f * -par2 * -0.5f;
	}
}
