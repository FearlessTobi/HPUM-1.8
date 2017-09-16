package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Nundu extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Mouth;
	ModelRenderer Body;
	ModelRenderer LegL;
	ModelRenderer LegR;
	ModelRenderer BackLegL;
	ModelRenderer BackLegR;
	ModelRenderer Tail1;
	ModelRenderer Tail2;
	ModelRenderer HearL;
	ModelRenderer HearR;

	public Nundu() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -3.5f, -7.0f, 8, 7, 8);
		this.Head.setRotationPoint(0.0f, 10.0f, -1.0f);
		this.Head.setTextureSize(128, 64);
		this.setRotation(this.Head, 0.0174533f, 0.0f, 0.0f);
		(this.Mouth = new ModelRenderer(this, 1, 15)).addBox(-3.0f, -2.0f, -4.0f, 6, 4, 4);
		this.Mouth.setRotationPoint(0.0f, 11.5f, -7.0f);
		this.Mouth.setTextureSize(128, 64);
		this.setRotation(this.Mouth, 0.0349066f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 24, 0)).addBox(-5.0f, -6.0f, -11.0f, 10, 12, 22);
		this.Body.setRotationPoint(0.0f, 12.5f, 9.0f);
		this.Body.setTextureSize(128, 64);
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.LegL = new ModelRenderer(this, 24, 34)).addBox(-2.5f, -6.0f, -2.5f, 5, 18, 5);
		this.LegL.setRotationPoint(3.0f, 12.0f, 3.0f);
		this.LegL.setTextureSize(128, 64);
		this.setRotation(this.LegL, 0.0f, 0.0f, 0.0f);
		(this.LegR = new ModelRenderer(this, 24, 34)).addBox(-2.5f, -6.0f, -2.5f, 5, 18, 5);
		this.LegR.setRotationPoint(-3.0f, 12.0f, 3.0f);
		this.LegR.setTextureSize(128, 64);
		this.setRotation(this.LegR, 0.0f, 0.0f, 0.0f);
		(this.BackLegL = new ModelRenderer(this, 48, 34)).addBox(-2.5f, 0.0f, -2.5f, 5, 12, 5);
		this.BackLegL.setRotationPoint(3.0f, 12.0f, 15.0f);
		this.BackLegL.setTextureSize(128, 64);
		this.setRotation(this.BackLegL, 0.0f, 0.0f, 0.0f);
		(this.BackLegR = new ModelRenderer(this, 48, 34)).addBox(-2.5f, 0.0f, -2.5f, 5, 12, 5);
		this.BackLegR.setRotationPoint(-3.0f, 12.0f, 15.0f);
		this.BackLegR.setTextureSize(128, 64);
		this.setRotation(this.BackLegR, 0.0f, 0.0f, 0.0f);
		(this.Tail1 = new ModelRenderer(this, 0, 36)).addBox(-1.5f, 0.0f, -1.5f, 3, 10, 3);
		this.Tail1.setRotationPoint(0.0f, 11.0f, 17.0f);
		this.Tail1.setTextureSize(128, 64);
		this.setRotation(this.Tail1, 0.8726646f, 0.0f, 0.0f);
		(this.Tail2 = new ModelRenderer(this, 12, 36)).addBox(-1.5f, 0.0f, -1.5f, 3, 10, 3);
		this.Tail2.setRotationPoint(0.0f, 17.0f, 23.0f);
		this.Tail2.setTextureSize(128, 64);
		this.setRotation(this.Tail2, 1.570796f, 0.0f, 0.0f);
		(this.HearL = new ModelRenderer(this, 25, 0)).addBox(-1.5f, -3.0f, -1.5f, 3, 3, 3);
		this.HearL.setRotationPoint(2.0f, 7.5f, -3.5f);
		this.HearL.setTextureSize(128, 64);
		this.setRotation(this.HearL, 0.0f, 0.0f, 0.0f);
		(this.HearR = new ModelRenderer(this, 25, 0)).addBox(-1.5f, -3.0f, -1.5f, 3, 3, 3);
		this.HearR.setRotationPoint(-2.0f, 7.5f, -3.5f);
		this.HearR.setTextureSize(128, 64);
		this.setRotation(this.HearR, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.Mouth.render(par7);
		this.Body.render(par7);
		this.LegL.render(par7);
		this.LegR.render(par7);
		this.BackLegL.render(par7);
		this.BackLegR.render(par7);
		this.Tail1.render(par7);
		this.Tail2.render(par7);
		this.HearL.render(par7);
		this.HearR.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.LegL.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.BackLegL.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.LegR.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.BackLegR.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
