package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class OwlForm extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer Tail;
	ModelRenderer LegL;
	ModelRenderer LegR;
	ModelRenderer WingL;
	ModelRenderer WingR;
	ModelRenderer Peak;

	public OwlForm() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-2.5f, -4.0f, -2.0f, 5, 4, 4);
		this.Head.setRotationPoint(0.0f, 16.0f, 0.0f);
		this.Head.setTextureSize(128, 64);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 10)).addBox(-2.5f, 0.0f, -2.5f, 5, 5, 5);
		this.Body.setRotationPoint(0.0f, 16.0f, 0.0f);
		this.Body.setTextureSize(128, 64);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.1745329f, 0.0f, 0.0f);
		(this.Tail = new ModelRenderer(this, 0, 21)).addBox(-2.0f, 0.0f, -1.5f, 4, 3, 3);
		this.Tail.setRotationPoint(0.0f, 20.7f, 1.8f);
		this.Tail.setTextureSize(128, 64);
		this.Tail.mirror = true;
		this.setRotation(this.Tail, 0.1745329f, 0.0f, 0.0f);
		(this.LegL = new ModelRenderer(this, 20, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1);
		this.LegL.setRotationPoint(1.0f, 21.0f, -0.5f);
		this.LegL.setTextureSize(128, 64);
		this.LegL.mirror = true;
		this.setRotation(this.LegL, 0.0f, 0.0f, 0.0f);
		(this.LegR = new ModelRenderer(this, 20, 0)).addBox(-0.5f, 0.0f, -0.5f, 1, 3, 1);
		this.LegR.setRotationPoint(-1.0f, 21.0f, -0.5f);
		this.LegR.setTextureSize(128, 64);
		this.LegR.mirror = true;
		this.setRotation(this.LegR, 0.0f, 0.0f, 0.0f);
		(this.WingL = new ModelRenderer(this, 50, 0)).addBox(0.0f, -1.0f, -2.0f, 1, 6, 4);
		this.WingL.setRotationPoint(2.5f, 17.0f, 0.0f);
		this.WingL.setTextureSize(128, 64);
		this.WingL.mirror = true;
		this.setRotation(this.WingL, 0.1745329f, 0.0f, 0.0f);
		(this.WingR = new ModelRenderer(this, 50, 0)).addBox(-1.0f, -1.0f, -2.0f, 1, 6, 4);
		this.WingR.setRotationPoint(-2.5f, 17.0f, 0.0f);
		this.WingR.setTextureSize(128, 64);
		this.WingR.mirror = true;
		this.setRotation(this.WingR, 0.1745329f, 0.0f, 0.0f);
		(this.Peak = new ModelRenderer(this, 30, 0)).addBox(-0.5f, 0.0f, -1.0f, 1, 2, 1);
		this.Peak.setRotationPoint(0.0f, 14.0f, -2.0f);
		this.Peak.setTextureSize(128, 64);
		this.Peak.mirror = true;
		this.setRotation(this.Peak, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.Body.render(par7);
		this.Tail.render(par7);
		this.LegL.render(par7);
		this.LegR.render(par7);
		this.WingL.render(par7);
		this.WingR.render(par7);
		this.Peak.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.WingL.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.WingR.rotateAngleZ = MathHelper.cos(-par1 * -0.6222f) * -2.0f * -par2 * -0.5f;
	}
}
