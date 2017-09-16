package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class HouseElf extends ModelBase {

	ModelRenderer eyeleft;
	ModelRenderer eyeright;
	ModelRenderer head;
	ModelRenderer neck;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer nose;
	ModelRenderer ear2left;
	ModelRenderer ear1left;
	ModelRenderer ear2right;
	ModelRenderer ear1right;

	public HouseElf() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.eyeleft = new ModelRenderer(this, 0, 12)).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 1);
		this.eyeleft.setRotationPoint(1.2f, 6.0f, -1.1f);
		this.eyeleft.setTextureSize(64, 32);
		this.eyeleft.mirror = true;
		this.setRotation(this.eyeleft, 0.0f, 0.0f, 0.0f);
		(this.eyeright = new ModelRenderer(this, 7, 12)).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 1);
		this.eyeright.setRotationPoint(-1.2f, 6.0f, -1.1f);
		this.eyeright.setTextureSize(64, 32);
		this.eyeright.mirror = true;
		this.setRotation(this.eyeright, 0.0f, 0.0f, 0.0f);
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-2.5f, -5.0f, -2.0f, 5, 5, 4);
		this.head.setRotationPoint(0.0f, 9.5f, 0.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.neck = new ModelRenderer(this, 0, 9)).addBox(-1.5f, -0.5f, -1.0f, 3, 1, 2);
		this.neck.setRotationPoint(0.0f, 10.0f, 0.0f);
		this.neck.setTextureSize(64, 32);
		this.neck.mirror = true;
		this.setRotation(this.neck, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 16, 10)).addBox(-3.0f, 0.0f, -1.5f, 6, 9, 3);
		this.body.setRotationPoint(0.0f, 10.0f, 0.0f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0523599f, 0.0f, 0.0f);
		(this.rightarm = new ModelRenderer(this, 34, 0)).addBox(-2.0f, -1.0f, -1.0f, 2, 7, 2);
		this.rightarm.setRotationPoint(-3.0f, 11.5f, 0.0f);
		this.rightarm.setTextureSize(64, 32);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
		(this.leftarm = new ModelRenderer(this, 34, 0)).addBox(0.0f, -1.0f, -1.0f, 2, 7, 2);
		this.leftarm.setRotationPoint(3.0f, 11.5f, 0.0f);
		this.leftarm.setTextureSize(64, 32);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
		(this.rightleg = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -1.0f, 2, 6, 2);
		this.rightleg.setRotationPoint(-1.5f, 18.0f, 0.5f);
		this.rightleg.setTextureSize(64, 32);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
		(this.leftleg = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -1.0f, 2, 6, 2);
		this.leftleg.setRotationPoint(1.5f, 18.0f, 0.5f);
		this.leftleg.setTextureSize(64, 32);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
		(this.nose = new ModelRenderer(this, 19, 0)).addBox(-0.5f, -0.5f, -2.0f, 1, 1, 2);
		this.nose.setRotationPoint(0.0f, 7.5f, -1.5f);
		this.nose.setTextureSize(64, 32);
		this.nose.mirror = true;
		this.setRotation(this.nose, 0.0872665f, 0.0f, 0.0f);
		(this.ear2left = new ModelRenderer(this, 19, 5)).addBox(0.0f, -0.5f, -0.5f, 2, 1, 1);
		this.ear2left.setRotationPoint(2.5f, 7.5f, 0.0f);
		this.ear2left.setTextureSize(64, 32);
		this.ear2left.mirror = true;
		this.setRotation(this.ear2left, 0.0f, 0.0f, -0.0872665f);
		(this.ear1left = new ModelRenderer(this, 26, 5)).addBox(0.0f, -0.5f, -0.5f, 3, 1, 1);
		this.ear1left.setRotationPoint(2.5f, 6.5f, 0.0f);
		this.ear1left.setTextureSize(64, 32);
		this.ear1left.mirror = true;
		this.setRotation(this.ear1left, 0.0f, 0.0f, -0.0872665f);
		(this.ear2right = new ModelRenderer(this, 19, 5)).addBox(-2.0f, -0.5f, -0.5f, 2, 1, 1);
		this.ear2right.setRotationPoint(-2.5f, 7.5f, 0.0f);
		this.ear2right.setTextureSize(64, 32);
		this.ear2right.mirror = true;
		this.setRotation(this.ear2right, 0.0f, 0.0f, 0.0872665f);
		(this.ear1right = new ModelRenderer(this, 26, 5)).addBox(-3.0f, -0.5f, -0.5f, 3, 1, 1);
		this.ear1right.setRotationPoint(-2.5f, 6.5f, 0.0f);
		this.ear1right.setTextureSize(64, 32);
		this.ear1right.mirror = true;
		this.setRotation(this.ear1right, 0.0f, 0.0f, 0.0872665f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.eyeleft.render(par7);
		this.eyeright.render(par7);
		this.head.render(par7);
		this.neck.render(par7);
		this.body.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
		this.rightleg.render(par7);
		this.leftleg.render(par7);
		this.nose.render(par7);
		this.ear2left.render(par7);
		this.ear1left.render(par7);
		this.ear2right.render(par7);
		this.ear1right.render(par7);
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
