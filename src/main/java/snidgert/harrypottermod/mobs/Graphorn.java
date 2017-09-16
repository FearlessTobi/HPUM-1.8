package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Graphorn extends ModelBase {

	ModelRenderer head;
	ModelRenderer leftear;
	ModelRenderer rightear;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer horn1;
	ModelRenderer horn2;
	ModelRenderer udders;
	ModelRenderer hump;
	ModelRenderer snout;

	public Graphorn() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-4.5f, -4.5f, -8.0f, 9, 9, 8);
		this.head.setRotationPoint(0.0f, 4.0f, -7.0f);
		this.head.setTextureSize(128, 64);
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.leftear = new ModelRenderer(this, 0, 0)).addBox(-1.0f, 0.0f, -1.0f, 1, 3, 2);
		this.leftear.setRotationPoint(4.0f, 0.0f, -11.0f);
		this.leftear.setTextureSize(128, 64);
		this.setRotation(this.leftear, 0.0f, 3.141593f, 0.1745329f);
		(this.rightear = new ModelRenderer(this, 0, 0)).addBox(-1.0f, 0.0f, -1.0f, 1, 3, 2);
		this.rightear.setRotationPoint(-4.0f, 0.0f, -11.0f);
		this.rightear.setTextureSize(128, 64);
		this.setRotation(this.rightear, 0.0f, 0.0f, 0.1745329f);
		(this.body = new ModelRenderer(this, 20, 17)).addBox(-7.0f, -11.0f, -9.0f, 14, 20, 14);
		this.body.setRotationPoint(0.0f, 4.0f, 3.0f);
		this.body.setTextureSize(128, 64);
		this.setRotation(this.body, 1.570796f, 0.0f, 0.0f);
		(this.leg1 = new ModelRenderer(this, 0, 17)).addBox(-2.5f, 0.0f, -2.5f, 5, 12, 5);
		this.leg1.setRotationPoint(-4.0f, 12.0f, 9.0f);
		this.leg1.setTextureSize(128, 64);
		this.setRotation(this.leg1, 0.0f, 0.0f, 0.0f);
		(this.leg2 = new ModelRenderer(this, 0, 17)).addBox(-2.5f, 0.0f, -2.5f, 5, 12, 5);
		this.leg2.setRotationPoint(4.0f, 12.0f, 9.0f);
		this.leg2.setTextureSize(128, 64);
		this.setRotation(this.leg2, 0.0f, 0.0f, 0.0f);
		(this.leg3 = new ModelRenderer(this, 0, 17)).addBox(-2.5f, 0.0f, -2.5f, 5, 12, 5);
		this.leg3.setRotationPoint(-4.0f, 12.0f, -5.0f);
		this.leg3.setTextureSize(128, 64);
		this.setRotation(this.leg3, 0.0f, 0.0f, 0.0f);
		(this.leg4 = new ModelRenderer(this, 0, 17)).addBox(-2.5f, 0.0f, -2.5f, 5, 12, 5);
		this.leg4.setRotationPoint(4.0f, 12.0f, -5.0f);
		this.leg4.setTextureSize(128, 64);
		this.setRotation(this.leg4, 0.0f, 0.0f, 0.0f);
		(this.horn1 = new ModelRenderer(this, 34, 0)).addBox(-1.0f, -7.0f, -1.0f, 2, 7, 2);
		this.horn1.setRotationPoint(-3.0f, 0.0f, -11.0f);
		this.horn1.setTextureSize(128, 64);
		this.setRotation(this.horn1, 0.0872665f, 0.0f, -0.8726646f);
		(this.horn2 = new ModelRenderer(this, 34, 0)).addBox(-1.0f, -7.0f, -1.0f, 2, 7, 2);
		this.horn2.setRotationPoint(3.0f, 0.0f, -11.0f);
		this.horn2.setTextureSize(128, 64);
		this.setRotation(this.horn2, 0.0872665f, 0.0f, 0.8726646f);
		(this.udders = new ModelRenderer(this, 52, 0)).addBox(-2.0f, -3.0f, 0.0f, 4, 6, 2);
		this.udders.setRotationPoint(0.0f, 14.0f, 6.0f);
		this.udders.setTextureSize(128, 64);
		this.setRotation(this.udders, 1.570796f, 0.0f, 0.0f);
		(this.hump = new ModelRenderer(this, 63, 3)).addBox(-6.0f, -2.0f, -9.0f, 12, 4, 18);
		this.hump.setRotationPoint(0.0f, -3.0f, 2.0f);
		this.hump.setTextureSize(128, 64);
		this.setRotation(this.hump, 0.0f, 0.0f, 0.0f);
		(this.snout = new ModelRenderer(this, 0, 37)).addBox(-3.5f, -2.0f, -3.0f, 7, 4, 3);
		this.snout.setRotationPoint(0.0f, 6.5f, -14.0f);
		this.snout.setTextureSize(128, 64);
		this.setRotation(this.snout, 0.0174533f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.head.render(par7);
		this.leftear.render(par7);
		this.rightear.render(par7);
		this.body.render(par7);
		this.leg1.render(par7);
		this.leg2.render(par7);
		this.leg3.render(par7);
		this.leg4.render(par7);
		this.horn1.render(par7);
		this.horn2.render(par7);
		this.udders.render(par7);
		this.hump.render(par7);
		this.snout.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leg3.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leg2.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leg4.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
