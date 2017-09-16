package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Moke extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer BackBody;
	ModelRenderer Tail1;
	ModelRenderer Tail2;
	ModelRenderer Thigh1L;
	ModelRenderer Leg1L;
	ModelRenderer Thigh1R;
	ModelRenderer Leg1R;
	ModelRenderer Thigh2L;
	ModelRenderer Leg2L;
	ModelRenderer Thigh2R;
	ModelRenderer Leg2R;
	ModelRenderer Crest;
	ModelRenderer TailCrest;

	public Moke() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -1.0f, -2.0f, 2, 2, 2);
		this.Head.setRotationPoint(0.0f, 22.0f, -4.0f);
		this.Head.setTextureSize(64, 32);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 5)).addBox(-1.5f, -1.0f, -2.5f, 3, 2, 5);
		this.Body.setRotationPoint(0.0f, 22.5f, -1.7f);
		this.Body.setTextureSize(64, 32);
		this.Body.mirror = true;
		this.setRotation(this.Body, -0.0872665f, 0.0f, 0.0f);
		(this.BackBody = new ModelRenderer(this, 0, 13)).addBox(-1.5f, -1.0f, -1.0f, 3, 2, 2);
		this.BackBody.setRotationPoint(0.0f, 22.7f, 1.7f);
		this.BackBody.setTextureSize(64, 32);
		this.BackBody.mirror = true;
		this.setRotation(this.BackBody, 0.0f, 0.0f, 0.0f);
		(this.Tail1 = new ModelRenderer(this, 0, 18)).addBox(-1.0f, -0.5f, 0.0f, 2, 1, 3);
		this.Tail1.setRotationPoint(0.0f, 22.7f, 2.5f);
		this.Tail1.setTextureSize(64, 32);
		this.Tail1.mirror = true;
		this.setRotation(this.Tail1, -0.0698132f, 0.0f, 0.0f);
		(this.Tail2 = new ModelRenderer(this, 0, 23)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 6);
		this.Tail2.setRotationPoint(0.0f, 22.9f, 5.0f);
		this.Tail2.setTextureSize(64, 32);
		this.Tail2.mirror = true;
		this.setRotation(this.Tail2, -0.0349066f, 0.0f, 0.0f);
		(this.Thigh1L = new ModelRenderer(this, 10, 0)).addBox(0.0f, -0.5f, -0.5f, 2, 1, 1);
		this.Thigh1L.setRotationPoint(1.0f, 22.5f, -2.5f);
		this.Thigh1L.setTextureSize(64, 32);
		this.Thigh1L.mirror = true;
		this.setRotation(this.Thigh1L, 0.0f, 0.0f, 0.1745329f);
		(this.Leg1L = new ModelRenderer(this, 17, 0)).addBox(0.5f, -0.5f, 1.0f, 2, 1, 1);
		this.Leg1L.setRotationPoint(1.0f, 22.5f, -2.5f);
		this.Leg1L.setTextureSize(64, 32);
		this.Leg1L.mirror = true;
		this.setRotation(this.Leg1L, 0.0f, 1.22173f, 0.6108652f);
		(this.Thigh1R = new ModelRenderer(this, 10, 0)).addBox(-2.0f, -0.5f, -0.5f, 2, 1, 1);
		this.Thigh1R.setRotationPoint(-1.0f, 22.5f, -2.5f);
		this.Thigh1R.setTextureSize(64, 32);
		this.Thigh1R.mirror = true;
		this.setRotation(this.Thigh1R, 0.0f, 0.0f, -0.1745329f);
		(this.Leg1R = new ModelRenderer(this, 17, 0)).addBox(-2.5f, -0.5f, 1.0f, 2, 1, 1);
		this.Leg1R.setRotationPoint(-1.0f, 22.5f, -2.5f);
		this.Leg1R.setTextureSize(64, 32);
		this.Leg1R.mirror = true;
		this.setRotation(this.Leg1R, 0.0f, -1.22173f, -0.6108652f);
		(this.Thigh2L = new ModelRenderer(this, 10, 0)).addBox(0.0f, -0.5f, -0.5f, 2, 1, 1);
		this.Thigh2L.setRotationPoint(1.0f, 23.0f, 1.5f);
		this.Thigh2L.setTextureSize(64, 32);
		this.Thigh2L.mirror = true;
		this.setRotation(this.Thigh2L, 0.0f, 0.1745329f, -0.3490659f);
		(this.Leg2L = new ModelRenderer(this, 17, 0)).addBox(0.0f, -2.5f, -0.5f, 2, 1, 1);
		this.Leg2L.setRotationPoint(1.0f, 23.0f, 1.5f);
		this.Leg2L.setTextureSize(64, 32);
		this.Leg2L.mirror = true;
		this.setRotation(this.Leg2L, 0.0f, 0.1745329f, 1.047198f);
		(this.Thigh2R = new ModelRenderer(this, 10, 0)).addBox(-2.0f, -0.5f, -0.5f, 2, 1, 1);
		this.Thigh2R.setRotationPoint(-1.0f, 23.0f, 1.5f);
		this.Thigh2R.setTextureSize(64, 32);
		this.Thigh2R.mirror = true;
		this.setRotation(this.Thigh2R, 0.0f, -0.1745329f, 0.3490659f);
		(this.Leg2R = new ModelRenderer(this, 17, 0)).addBox(-2.0f, -2.5f, -0.5f, 2, 1, 1);
		this.Leg2R.setRotationPoint(-1.0f, 23.0f, 1.5f);
		this.Leg2R.setTextureSize(64, 32);
		this.Leg2R.mirror = true;
		this.setRotation(this.Leg2R, 0.0f, -0.1745329f, -1.047198f);
		(this.Crest = new ModelRenderer(this, 18, 0)).addBox(0.0f, -2.0f, -4.0f, 0, 2, 8);
		this.Crest.setRotationPoint(0.0f, 22.0f, -1.5f);
		this.Crest.setTextureSize(64, 32);
		this.Crest.mirror = true;
		this.setRotation(this.Crest, -0.0872665f, 0.0f, 0.0f);
		(this.TailCrest = new ModelRenderer(this, 18, 0)).addBox(0.0f, -2.0f, -4.0f, 0, 2, 8);
		this.TailCrest.setRotationPoint(0.0f, 23.0f, 6.5f);
		this.TailCrest.setTextureSize(64, 32);
		this.TailCrest.mirror = true;
		this.setRotation(this.TailCrest, -0.0523599f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.Body.render(par7);
		this.BackBody.render(par7);
		this.Tail1.render(par7);
		this.Tail2.render(par7);
		this.Thigh1L.render(par7);
		this.Leg1L.render(par7);
		this.Thigh1R.render(par7);
		this.Leg1R.render(par7);
		this.Thigh2L.render(par7);
		this.Leg2L.render(par7);
		this.Thigh2R.render(par7);
		this.Leg2R.render(par7);
		this.Crest.render(par7);
		this.TailCrest.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.Thigh1R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg1R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Thigh2R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg2R.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Thigh1L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg1L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Thigh2L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Leg2L.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
