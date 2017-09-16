package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Mermaid extends ModelBiped {

	public ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer Nose;
	ModelRenderer Boobs;
	public ModelRenderer ArmR;
	ModelRenderer ArmL;
	ModelRenderer FinR;
	ModelRenderer FinL;
	ModelRenderer Tail1;
	ModelRenderer Tail2;
	ModelRenderer Tail3;
	ModelRenderer Tail4;
	ModelRenderer Tail5;
	ModelRenderer TailBase;
	ModelRenderer Hair1;
	ModelRenderer Hair2;

	public Mermaid() {
		((ModelBase) this).textureWidth = 128;
		((ModelBase) this).textureHeight = 64;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		this.Head.setRotationPoint(0.0f, -6.0f, 0.0f);
		this.Head.setTextureSize(128, 64);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 17)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		this.Body.setRotationPoint(0.0f, -6.0f, 0.0f);
		this.Body.setTextureSize(128, 64);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.Nose = new ModelRenderer(this, 34, 6)).addBox(-1.0f, 0.0f, -1.0f, 2, 4, 1);
		this.Nose.setRotationPoint(0.0f, -13.0f, -3.0f);
		this.Nose.setTextureSize(128, 64);
		this.Nose.mirror = true;
		this.setRotation(this.Nose, -0.2094395f, 0.0f, 0.0f);
		(this.Boobs = new ModelRenderer(this, 34, 0)).addBox(-3.0f, -1.5f, -2.0f, 6, 3, 2);
		this.Boobs.setRotationPoint(0.0f, -3.0f, -0.5f);
		this.Boobs.setTextureSize(128, 64);
		this.Boobs.mirror = true;
		this.setRotation(this.Boobs, 0.0872665f, 0.0f, 0.0f);
		(this.ArmR = new ModelRenderer(this, 25, 17)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		this.ArmR.setRotationPoint(-5.0f, -4.0f, 0.0f);
		this.ArmR.setTextureSize(128, 64);
		this.ArmR.mirror = true;
		this.setRotation(this.ArmR, -1.570796f, 0.0f, 0.0f);
		(this.ArmL = new ModelRenderer(this, 25, 17)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		this.ArmL.setRotationPoint(5.0f, -4.0f, 0.0f);
		this.ArmL.setTextureSize(128, 64);
		this.ArmL.mirror = true;
		this.setRotation(this.ArmL, 0.0f, 0.0f, 0.0f);
		(this.FinR = new ModelRenderer(this, 53, 54)).addBox(-4.0f, -1.0f, 0.0f, 4, 7, 0);
		this.FinR.setRotationPoint(-1.0f, 9.0f, 0.0f);
		this.FinR.setTextureSize(128, 64);
		this.FinR.mirror = true;
		this.setRotation(this.FinR, 0.0872665f, 0.0f, 0.6108652f);
		(this.FinL = new ModelRenderer(this, 53, 54)).addBox(-4.0f, -1.0f, 0.0f, 4, 7, 0);
		this.FinL.setRotationPoint(1.0f, 9.0f, 0.0f);
		this.FinL.setTextureSize(128, 64);
		this.FinL.mirror = true;
		this.setRotation(this.FinL, -0.0872665f, 3.141593f, 0.6108652f);
		(this.Tail1 = new ModelRenderer(this, 0, 35)).addBox(-3.5f, 0.0f, -2.0f, 7, 9, 4);
		this.Tail1.setRotationPoint(0.0f, 5.8f, 0.0f);
		this.Tail1.setTextureSize(128, 64);
		this.Tail1.mirror = true;
		this.setRotation(this.Tail1, 0.0872665f, 0.0f, 0.0f);
		(this.Tail2 = new ModelRenderer(this, 0, 50)).addBox(-3.0f, 0.0f, -2.0f, 6, 5, 4);
		this.Tail2.setRotationPoint(0.0f, 14.0f, 0.7f);
		this.Tail2.setTextureSize(128, 64);
		this.Tail2.mirror = true;
		this.setRotation(this.Tail2, 0.4363323f, 0.0f, 0.0f);
		(this.Tail3 = new ModelRenderer(this, 23, 35)).addBox(-2.5f, 0.0f, -1.5f, 5, 4, 3);
		this.Tail3.setRotationPoint(0.0f, 18.0f, 3.0f);
		this.Tail3.setTextureSize(128, 64);
		this.Tail3.mirror = true;
		this.setRotation(this.Tail3, 0.6981317f, 0.0f, 0.0f);
		(this.Tail4 = new ModelRenderer(this, 23, 45)).addBox(-2.0f, 0.0f, -1.5f, 4, 4, 3);
		this.Tail4.setRotationPoint(0.0f, 20.0f, 4.4f);
		this.Tail4.setTextureSize(128, 64);
		this.Tail4.mirror = true;
		this.setRotation(this.Tail4, 1.134464f, 0.0f, 0.0f);
		(this.Tail5 = new ModelRenderer(this, 39, 46)).addBox(-1.5f, 0.0f, -1.0f, 3, 3, 2);
		this.Tail5.setRotationPoint(0.0f, 21.5f, 7.9f);
		this.Tail5.setTextureSize(128, 64);
		this.Tail5.mirror = true;
		this.setRotation(this.Tail5, 1.256637f, 0.0f, 0.0f);
		(this.TailBase = new ModelRenderer(this, 23, 54)).addBox(-4.5f, 0.0f, 0.0f, 9, 0, 10);
		this.TailBase.setRotationPoint(0.0f, 22.0f, 10.0f);
		this.TailBase.setTextureSize(128, 64);
		this.TailBase.mirror = true;
		this.setRotation(this.TailBase, -0.1396263f, 0.0f, 0.0f);
		(this.Hair1 = new ModelRenderer(this, 50, 0)).addBox(-4.5f, -4.5f, -4.5f, 9, 9, 11);
		this.Hair1.setRotationPoint(0.0f, -10.6f, 1.0f);
		this.Hair1.setTextureSize(128, 64);
		this.Hair1.mirror = true;
		this.setRotation(this.Hair1, 0.0f, 0.0f, 0.0f);
		(this.Hair2 = new ModelRenderer(this, 90, 0)).addBox(-4.0f, -4.0f, -4.0f, 8, 8, 8);
		this.Hair2.setRotationPoint(0.0f, -10.5f, 8.0f);
		this.Hair2.setTextureSize(128, 64);
		this.Hair2.mirror = true;
		this.setRotation(this.Hair2, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.Head.render(par7);
		this.Body.render(par7);
		this.Nose.render(par7);
		this.Boobs.render(par7);
		this.ArmR.render(par7);
		this.ArmL.render(par7);
		this.FinR.render(par7);
		this.FinL.render(par7);
		this.Tail1.render(par7);
		this.Tail2.render(par7);
		this.Tail3.render(par7);
		this.Tail4.render(par7);
		this.Tail5.render(par7);
		this.TailBase.render(par7);
		this.Hair1.render(par7);
		this.Hair2.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
	}
}
