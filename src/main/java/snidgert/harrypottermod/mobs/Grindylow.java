package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Grindylow extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer Belly;
	ModelRenderer ArmL;
	ModelRenderer ArmR;
	ModelRenderer Tentacle1;
	ModelRenderer Tentacle2;
	ModelRenderer Tentacle3;
	ModelRenderer Tentacle4;
	ModelRenderer Tentacle5;
	ModelRenderer Tentacle6;
	ModelRenderer Tent1;
	ModelRenderer Tent2;
	ModelRenderer Tent6;
	ModelRenderer Tent5;
	ModelRenderer Tent3;
	ModelRenderer Tent4;

	public Grindylow() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-2.5f, -4.0f, -3.0f, 5, 4, 6);
		this.Head.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.Head.setTextureSize(64, 32);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 11)).addBox(-2.0f, -1.0f, -2.0f, 4, 2, 4);
		this.Body.setRotationPoint(0.0f, 1.0f, -0.5f);
		this.Body.setTextureSize(64, 32);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.Belly = new ModelRenderer(this, 0, 18)).addBox(-2.5f, -2.0f, -2.5f, 5, 4, 5);
		this.Belly.setRotationPoint(0.0f, 4.0f, -0.5f);
		this.Belly.setTextureSize(64, 32);
		this.Belly.mirror = true;
		this.setRotation(this.Belly, 0.0f, 0.0f, 0.0f);
		(this.ArmL = new ModelRenderer(this, 22, 0)).addBox(0.0f, -0.5f, -0.5f, 5, 1, 1);
		this.ArmL.setRotationPoint(1.5f, 0.5f, -1.0f);
		this.ArmL.setTextureSize(64, 32);
		this.ArmL.mirror = true;
		this.setRotation(this.ArmL, 0.0f, 0.0f, 0.4363323f);
		(this.ArmR = new ModelRenderer(this, 22, 0)).addBox(-5.0f, -0.5f, -0.5f, 5, 1, 1);
		this.ArmR.setRotationPoint(-1.5f, 0.5f, -1.0f);
		this.ArmR.setTextureSize(64, 32);
		this.ArmR.mirror = true;
		this.setRotation(this.ArmR, 0.0f, 0.0f, -0.4363323f);
		(this.Tentacle1 = new ModelRenderer(this, 23, 3)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.Tentacle1.setRotationPoint(1.3f, 5.0f, -2.0f);
		this.Tentacle1.setTextureSize(64, 32);
		this.Tentacle1.mirror = true;
		this.setRotation(this.Tentacle1, -0.5235988f, 0.0f, 0.0f);
		(this.Tentacle2 = new ModelRenderer(this, 23, 3)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.Tentacle2.setRotationPoint(-1.3f, 5.0f, -2.0f);
		this.Tentacle2.setTextureSize(64, 32);
		this.Tentacle2.mirror = true;
		this.setRotation(this.Tentacle2, -0.5235988f, 0.0f, 0.0f);
		(this.Tentacle3 = new ModelRenderer(this, 23, 3)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.Tentacle3.setRotationPoint(-2.0f, 5.0f, -0.5f);
		this.Tentacle3.setTextureSize(64, 32);
		this.Tentacle3.mirror = true;
		this.setRotation(this.Tentacle3, -0.5235988f, 1.570796f, 0.0f);
		(this.Tentacle4 = new ModelRenderer(this, 23, 3)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.Tentacle4.setRotationPoint(2.0f, 5.0f, -0.5f);
		this.Tentacle4.setTextureSize(64, 32);
		this.Tentacle4.mirror = true;
		this.setRotation(this.Tentacle4, -0.5235988f, -1.570796f, 0.0f);
		(this.Tentacle5 = new ModelRenderer(this, 23, 3)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.Tentacle5.setRotationPoint(1.3f, 5.0f, 1.0f);
		this.Tentacle5.setTextureSize(64, 32);
		this.Tentacle5.mirror = true;
		this.setRotation(this.Tentacle5, -0.5235988f, 3.141593f, 0.0f);
		(this.Tentacle6 = new ModelRenderer(this, 23, 3)).addBox(-1.0f, 0.0f, -0.5f, 2, 3, 1);
		this.Tentacle6.setRotationPoint(-1.3f, 5.0f, 1.0f);
		this.Tentacle6.setTextureSize(64, 32);
		this.Tentacle6.mirror = true;
		this.setRotation(this.Tentacle6, -0.5235988f, 3.141593f, 0.0f);
		(this.Tent1 = new ModelRenderer(this, 23, 8)).addBox(-0.5f, 2.0f, -1.8f, 1, 5, 1);
		this.Tent1.setRotationPoint(1.3f, 5.0f, -2.0f);
		this.Tent1.setTextureSize(64, 32);
		this.Tent1.mirror = true;
		this.setRotation(this.Tent1, 0.0872665f, 0.0f, 0.0f);
		(this.Tent2 = new ModelRenderer(this, 23, 8)).addBox(-0.5f, 2.0f, -1.8f, 1, 5, 1);
		this.Tent2.setRotationPoint(-1.3f, 5.0f, -2.0f);
		this.Tent2.setTextureSize(64, 32);
		this.Tent2.mirror = true;
		this.setRotation(this.Tent2, 0.0872665f, 0.0f, 0.0f);
		(this.Tent6 = new ModelRenderer(this, 23, 8)).addBox(-0.5f, 2.0f, -1.8f, 1, 5, 1);
		this.Tent6.setRotationPoint(-1.3f, 5.0f, 1.0f);
		this.Tent6.setTextureSize(64, 32);
		this.Tent6.mirror = true;
		this.setRotation(this.Tent6, 0.0872665f, 3.141593f, 0.0f);
		(this.Tent5 = new ModelRenderer(this, 23, 8)).addBox(-0.5f, 2.0f, -1.8f, 1, 5, 1);
		this.Tent5.setRotationPoint(1.3f, 5.0f, 1.0f);
		this.Tent5.setTextureSize(64, 32);
		this.Tent5.mirror = true;
		this.setRotation(this.Tent5, 0.0872665f, 3.141593f, 0.0f);
		(this.Tent3 = new ModelRenderer(this, 23, 8)).addBox(-0.5f, 2.0f, -1.8f, 1, 5, 1);
		this.Tent3.setRotationPoint(-2.0f, 5.0f, -0.5f);
		this.Tent3.setTextureSize(64, 32);
		this.Tent3.mirror = true;
		this.setRotation(this.Tent3, 0.0872665f, 1.570796f, 0.0f);
		(this.Tent4 = new ModelRenderer(this, 23, 8)).addBox(-0.5f, 2.0f, -1.8f, 1, 5, 1);
		this.Tent4.setRotationPoint(2.0f, 5.0f, -0.5f);
		this.Tent4.setTextureSize(64, 32);
		this.Tent4.mirror = true;
		this.setRotation(this.Tent4, 0.0872665f, -1.570796f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.Body.render(par7);
		this.Belly.render(par7);
		this.ArmL.render(par7);
		this.ArmR.render(par7);
		this.Tentacle1.render(par7);
		this.Tentacle2.render(par7);
		this.Tentacle3.render(par7);
		this.Tentacle4.render(par7);
		this.Tentacle5.render(par7);
		this.Tentacle6.render(par7);
		this.Tent1.render(par7);
		this.Tent2.render(par7);
		this.Tent6.render(par7);
		this.Tent5.render(par7);
		this.Tent3.render(par7);
		this.Tent4.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.Tentacle1.rotateAngleX = -0.5235988f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tentacle2.rotateAngleX = -0.5235988f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tent1.rotateAngleX = 0.0872665f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tent2.rotateAngleX = 0.0872665f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tentacle5.rotateAngleX = -0.5235988f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tentacle6.rotateAngleX = -0.5235988f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tent5.rotateAngleX = 0.0872665f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tent6.rotateAngleX = 0.0872665f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tentacle3.rotateAngleX = -0.5235988f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tentacle4.rotateAngleX = -0.5235988f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tent3.rotateAngleX = 0.0872665f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.Tent4.rotateAngleX = 0.0872665f - MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
