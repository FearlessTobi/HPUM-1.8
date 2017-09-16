package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Kneazle extends ModelBase {

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

	public Kneazle() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-2.5f, -2.0f, -5.0f, 5, 4, 5);
		this.Head.setRotationPoint(0.0f, 15.0f, 0.0f);
		this.Head.setTextureSize(64, 32);
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Mouth = new ModelRenderer(this, 1, 25)).addBox(-1.5f, -1.0f, -1.0f, 3, 2, 1);
		this.Mouth.setRotationPoint(0.0f, 16.0f, -5.0f);
		this.Mouth.setTextureSize(64, 32);
		this.setRotation(this.Mouth, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 20, 0)).addBox(-2.5f, 0.0f, -3.0f, 5, 16, 6);
		this.Body.setRotationPoint(0.0f, 17.0f, 0.0f);
		this.Body.setTextureSize(64, 32);
		this.setRotation(this.Body, 1.570796f, 0.0f, 0.0f);
		(this.LegL = new ModelRenderer(this, 42, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 10, 2);
		this.LegL.setRotationPoint(2.0f, 16.0f, 3.0f);
		this.LegL.setTextureSize(64, 32);
		this.setRotation(this.LegL, 0.0f, 0.0f, 0.0f);
		(this.LegR = new ModelRenderer(this, 42, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 10, 2);
		this.LegR.setRotationPoint(-2.0f, 16.0f, 3.0f);
		this.LegR.setTextureSize(64, 32);
		this.setRotation(this.LegR, 0.0f, 0.0f, 0.0f);
		(this.BackLegL = new ModelRenderer(this, 8, 13)).addBox(-1.0f, 0.0f, -1.0f, 2, 6, 2);
		this.BackLegL.setRotationPoint(2.0f, 18.0f, 14.0f);
		this.BackLegL.setTextureSize(64, 32);
		this.setRotation(this.BackLegL, 0.0f, 0.0f, 0.0f);
		(this.BackLegR = new ModelRenderer(this, 8, 13)).addBox(-1.0f, 0.0f, -1.0f, 2, 6, 2);
		this.BackLegR.setRotationPoint(-2.0f, 18.0f, 14.0f);
		this.BackLegR.setTextureSize(64, 32);
		this.setRotation(this.BackLegR, 0.0f, 0.0f, 0.0f);
		(this.Tail1 = new ModelRenderer(this, 0, 15)).addBox(-0.5f, 0.0f, -0.5f, 1, 8, 1);
		this.Tail1.setRotationPoint(0.0f, 14.8f, 15.5f);
		this.Tail1.setTextureSize(64, 32);
		this.setRotation(this.Tail1, 0.9599311f, 0.0f, 0.0f);
		(this.Tail2 = new ModelRenderer(this, 4, 15)).addBox(-0.5f, 0.0f, -0.5f, 1, 8, 1);
		this.Tail2.setRotationPoint(0.0f, 19.5f, 21.8f);
		this.Tail2.setTextureSize(64, 32);
		this.setRotation(this.Tail2, 1.570796f, 0.0f, 0.0f);
		(this.HearL = new ModelRenderer(this, 9, 21)).addBox(-0.5f, -3.0f, -1.0f, 1, 3, 2);
		this.HearL.setRotationPoint(1.5f, 14.0f, -1.0f);
		this.HearL.setTextureSize(64, 32);
		this.setRotation(this.HearL, 0.0f, 1.570796f, 0.0f);
		(this.HearR = new ModelRenderer(this, 9, 21)).addBox(-0.5f, -3.0f, -1.0f, 1, 3, 2);
		this.HearR.setRotationPoint(-1.5f, 14.0f, -1.0f);
		this.HearR.setTextureSize(64, 32);
		this.setRotation(this.HearR, 0.0f, -1.570796f, 0.0f);
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
