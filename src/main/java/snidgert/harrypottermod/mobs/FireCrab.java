package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FireCrab extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Neck;
	ModelRenderer Shell;
	ModelRenderer ShellTop;
	ModelRenderer ShellBase;
	ModelRenderer LegL;
	ModelRenderer LegL2;
	ModelRenderer LegL3;
	ModelRenderer LegR;
	ModelRenderer LegR2;
	ModelRenderer LegR3;
	ModelRenderer Tail;
	ModelRenderer gem1;
	ModelRenderer gem2;
	ModelRenderer gem3;
	ModelRenderer gem4;

	public FireCrab() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -1.0f, -3.0f, 3, 2, 3);
		this.Head.setRotationPoint(0.0f, 20.5f, -7.0f);
		this.Head.setTextureSize(128, 64);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Neck = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, -2.0f, 2, 2, 2);
		this.Neck.setRotationPoint(0.0f, 20.5f, -5.0f);
		this.Neck.setTextureSize(128, 64);
		this.Neck.mirror = true;
		this.setRotation(this.Neck, 0.0f, 0.0f, 0.0f);
		(this.Shell = new ModelRenderer(this, 42, 0)).addBox(-6.0f, -1.5f, -6.0f, 12, 3, 12);
		this.Shell.setRotationPoint(0.0f, 18.5f, 0.0f);
		this.Shell.setTextureSize(128, 64);
		this.Shell.mirror = true;
		this.setRotation(this.Shell, 0.0f, 0.0f, 0.0f);
		(this.ShellTop = new ModelRenderer(this, 42, 15)).addBox(-5.0f, -1.5f, -5.0f, 10, 3, 10);
		this.ShellTop.setRotationPoint(0.0f, 16.5f, 0.0f);
		this.ShellTop.setTextureSize(128, 64);
		this.ShellTop.mirror = true;
		this.setRotation(this.ShellTop, 0.0f, 0.0f, 0.0f);
		(this.ShellBase = new ModelRenderer(this, 42, 28)).addBox(-4.5f, -1.0f, -5.0f, 9, 2, 10);
		this.ShellBase.setRotationPoint(0.0f, 20.5f, 0.0f);
		this.ShellBase.setTextureSize(128, 64);
		this.ShellBase.mirror = true;
		this.setRotation(this.ShellBase, 0.0f, 0.0f, 0.0f);
		(this.LegL = new ModelRenderer(this, 0, 20)).addBox(0.0f, 0.0f, -1.0f, 2, 4, 2);
		this.LegL.setRotationPoint(3.5f, 20.0f, -3.5f);
		this.LegL.setTextureSize(128, 64);
		this.LegL.mirror = true;
		this.setRotation(this.LegL, 0.0f, 0.0f, 0.0f);
		(this.LegL2 = new ModelRenderer(this, 0, 20)).addBox(0.0f, 0.0f, -1.0f, 2, 4, 2);
		this.LegL2.setRotationPoint(3.5f, 20.0f, 0.0f);
		this.LegL2.setTextureSize(128, 64);
		this.LegL2.mirror = true;
		this.setRotation(this.LegL2, 0.0f, 0.0f, 0.0f);
		(this.LegL3 = new ModelRenderer(this, 0, 20)).addBox(0.0f, 0.0f, -1.0f, 2, 4, 2);
		this.LegL3.setRotationPoint(3.5f, 20.0f, 3.5f);
		this.LegL3.setTextureSize(128, 64);
		this.LegL3.mirror = true;
		this.setRotation(this.LegL3, 0.0f, 0.0f, 0.0f);
		(this.LegR = new ModelRenderer(this, 0, 20)).addBox(-2.0f, 0.0f, -1.0f, 2, 4, 2);
		this.LegR.setRotationPoint(-3.5f, 20.0f, -3.5f);
		this.LegR.setTextureSize(128, 64);
		this.LegR.mirror = true;
		this.setRotation(this.LegR, 0.0f, 0.0f, 0.0f);
		(this.LegR2 = new ModelRenderer(this, 0, 20)).addBox(-2.0f, 0.0f, -1.0f, 2, 4, 2);
		this.LegR2.setRotationPoint(-3.5f, 20.0f, 0.0f);
		this.LegR2.setTextureSize(128, 64);
		this.LegR2.mirror = true;
		this.setRotation(this.LegR2, 0.0f, 0.0f, 0.0f);
		(this.LegR3 = new ModelRenderer(this, 0, 20)).addBox(-2.0f, 0.0f, -1.0f, 2, 4, 2);
		this.LegR3.setRotationPoint(-3.5f, 20.0f, 3.5f);
		this.LegR3.setTextureSize(128, 64);
		this.LegR3.mirror = true;
		this.setRotation(this.LegR3, 0.0f, 0.0f, 0.0f);
		(this.Tail = new ModelRenderer(this, 13, 0)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 2);
		this.Tail.setRotationPoint(0.0f, 20.5f, 5.0f);
		this.Tail.setTextureSize(128, 64);
		this.Tail.mirror = true;
		this.setRotation(this.Tail, 0.0f, 0.0f, 0.0f);
		(this.gem1 = new ModelRenderer(this, 0, 14)).addBox(-1.5f, -3.0f, 0.0f, 3, 3, 3);
		this.gem1.setRotationPoint(-2.0f, 17.0f, -2.0f);
		this.gem1.setTextureSize(128, 64);
		this.gem1.mirror = true;
		this.setRotation(this.gem1, 0.6108652f, 0.0f, 0.0f);
		(this.gem2 = new ModelRenderer(this, 13, 14)).addBox(-1.5f, -3.0f, -1.5f, 3, 3, 3);
		this.gem2.setRotationPoint(3.0f, 16.0f, 3.0f);
		this.gem2.setTextureSize(128, 64);
		this.gem2.mirror = true;
		this.setRotation(this.gem2, 0.6108652f, 1.07818f, 0.669215f);
		(this.gem3 = new ModelRenderer(this, 26, 14)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 3);
		this.gem3.setRotationPoint(4.0f, 16.5f, -3.5f);
		this.gem3.setTextureSize(128, 64);
		this.gem3.mirror = true;
		this.setRotation(this.gem3, 0.6108652f, -1.561502f, -1.041001f);
		(this.gem4 = new ModelRenderer(this, 13, 21)).addBox(0.0f, 0.0f, 0.0f, 3, 3, 3);
		this.gem4.setRotationPoint(0.0f, 16.0f, 1.0f);
		this.gem4.setTextureSize(128, 64);
		this.gem4.mirror = true;
		this.setRotation(this.gem4, 0.6108652f, -0.3346075f, 3.141593f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Head.render(f5);
		this.Neck.render(f5);
		this.Shell.render(f5);
		this.ShellTop.render(f5);
		this.ShellBase.render(f5);
		this.LegL.render(f5);
		this.LegL2.render(f5);
		this.LegL3.render(f5);
		this.LegR.render(f5);
		this.LegR2.render(f5);
		this.LegR3.render(f5);
		this.Tail.render(f5);
		this.gem1.render(f5);
		this.gem2.render(f5);
		this.gem3.render(f5);
		this.gem4.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
