package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Hippocampus extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Body;
	ModelRenderer Neck;
	ModelRenderer Thigh1R;
	ModelRenderer Thigh1L;
	ModelRenderer Leg1R;
	ModelRenderer Leg1L;
	ModelRenderer Feet1L;
	ModelRenderer Feet1R;
	ModelRenderer EarR;
	ModelRenderer EarL;
	ModelRenderer PeakTop;
	ModelRenderer PeakBase;
	ModelRenderer Hair;
	ModelRenderer Tail1;
	ModelRenderer Tail2;
	ModelRenderer Tail3;
	ModelRenderer Tail4;

	public Hippocampus() {
		super.textureWidth = 128;
		super.textureHeight = 128;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-2.5f, -2.5f, -7.0f, 5, 5, 7);
		this.Head.setRotationPoint(0.0f, -6.0f, -11.5f);
		this.Head.setTextureSize(128, 128);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.5235988f, 0.0f, 0.0f);
		(this.Body = new ModelRenderer(this, 0, 34)).addBox(-5.0f, -5.0f, -12.0f, 10, 10, 24);
		this.Body.setRotationPoint(0.0f, 8.0f, 0.0f);
		this.Body.setTextureSize(128, 128);
		this.Body.mirror = true;
		this.setRotation(this.Body, -0.0523599f, 0.0f, 0.0f);
		(this.Neck = new ModelRenderer(this, 0, 12)).addBox(-2.0f, -14.0f, -4.0f, 4, 14, 8);
		this.Neck.setRotationPoint(0.0f, 6.0f, -8.5f);
		this.Neck.setTextureSize(128, 128);
		this.Neck.mirror = true;
		this.setRotation(this.Neck, 0.5235988f, 0.0f, 0.0f);
		(this.Thigh1R = new ModelRenderer(this, 44, 29)).addBox(-1.5f, 0.0f, -2.0f, 3, 8, 4);
		this.Thigh1R.setRotationPoint(-4.0f, 9.0f, -8.0f);
		this.Thigh1R.setTextureSize(128, 128);
		this.Thigh1R.mirror = true;
		this.setRotation(this.Thigh1R, -0.6981317f, 0.0f, 0.0f);
		(this.Thigh1L = new ModelRenderer(this, 60, 29)).addBox(-1.5f, 0.0f, -2.0f, 3, 8, 4);
		this.Thigh1L.setRotationPoint(4.0f, 9.0f, -8.033334f);
		this.Thigh1L.setTextureSize(128, 128);
		this.Thigh1L.mirror = true;
		this.setRotation(this.Thigh1L, -0.6981317f, 0.0f, 0.0f);
		(this.Leg1R = new ModelRenderer(this, 44, 41)).addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3);
		this.Leg1R.setRotationPoint(-4.0f, 14.0f, -13.0f);
		this.Leg1R.setTextureSize(128, 128);
		this.Leg1R.mirror = true;
		this.setRotation(this.Leg1R, -0.0872665f, 0.0f, 0.0f);
		(this.Leg1L = new ModelRenderer(this, 60, 41)).addBox(-1.5f, 0.0f, -1.5f, 3, 5, 3);
		this.Leg1L.setRotationPoint(4.0f, 14.0f, -13.1f);
		this.Leg1L.setTextureSize(128, 128);
		this.Leg1L.mirror = true;
		this.setRotation(this.Leg1L, -0.0872665f, 0.0f, 0.0f);
		(this.Feet1L = new ModelRenderer(this, 60, 51)).addBox(-2.0f, 0.0f, -2.0f, 4, 3, 4);
		this.Feet1L.setRotationPoint(4.0f, 18.5f, -13.5f);
		this.Feet1L.setTextureSize(128, 128);
		this.Feet1L.mirror = true;
		this.setRotation(this.Feet1L, 0.0f, 0.0f, 0.0f);
		(this.Feet1R = new ModelRenderer(this, 44, 51)).addBox(-2.0f, 0.0f, -2.0f, 4, 3, 4);
		this.Feet1R.setRotationPoint(-4.0f, 18.5f, -13.5f);
		this.Feet1R.setTextureSize(128, 128);
		this.Feet1R.mirror = true;
		this.setRotation(this.Feet1R, 0.0f, 0.0f, 0.0f);
		(this.EarR = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -3.0f, -0.5f, 2, 3, 1);
		this.EarR.setRotationPoint(-1.4f, -7.0f, -13.0f);
		this.EarR.setTextureSize(128, 128);
		this.EarR.mirror = true;
		this.setRotation(this.EarR, 0.3490659f, 0.0f, 0.0f);
		(this.EarL = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -3.0f, -0.5f, 2, 3, 1);
		this.EarL.setRotationPoint(1.4f, -7.0f, -13.0f);
		this.EarL.setTextureSize(128, 128);
		this.EarL.mirror = true;
		this.setRotation(this.EarL, 0.3490659f, 0.0f, 0.0f);
		(this.PeakTop = new ModelRenderer(this, 24, 18)).addBox(-2.0f, -1.5f, -6.0f, 4, 3, 6);
		this.PeakTop.setRotationPoint(0.0f, -3.6f, -17.5f);
		this.PeakTop.setTextureSize(128, 128);
		this.PeakTop.mirror = true;
		this.setRotation(this.PeakTop, 0.5235988f, 0.0f, 0.0f);
		(this.PeakBase = new ModelRenderer(this, 24, 27)).addBox(-2.0f, -1.0f, -5.0f, 4, 2, 5);
		this.PeakBase.setRotationPoint(0.0f, -1.0f, -17.0f);
		this.PeakBase.setTextureSize(128, 128);
		this.PeakBase.mirror = true;
		this.setRotation(this.PeakBase, 0.5235988f, 0.0f, 0.0f);
		(this.Hair = new ModelRenderer(this, 54, 0)).addBox(-1.0f, -9.0f, 0.0f, 2, 18, 8);
		this.Hair.setRotationPoint(0.0f, -1.0f, -8.0f);
		this.Hair.setTextureSize(128, 128);
		this.Hair.mirror = true;
		this.setRotation(this.Hair, 0.5235988f, 0.0f, 0.0f);
		(this.Tail1 = new ModelRenderer(this, 75, 0)).addBox(-4.5f, -4.5f, 0.0f, 9, 9, 10);
		this.Tail1.setRotationPoint(0.0f, 8.5f, 11.5f);
		this.Tail1.setTextureSize(128, 128);
		this.Tail1.mirror = true;
		this.setRotation(this.Tail1, -0.0698132f, 0.0f, 0.0f);
		(this.Tail2 = new ModelRenderer(this, 83, 19)).addBox(-3.5f, -3.5f, 0.0f, 7, 7, 8);
		this.Tail2.setRotationPoint(0.0f, 9.0f, 20.0f);
		this.Tail2.setTextureSize(128, 128);
		this.Tail2.mirror = true;
		this.setRotation(this.Tail2, -0.1047198f, 0.0f, 0.0f);
		(this.Tail3 = new ModelRenderer(this, 93, 34)).addBox(-2.5f, -2.5f, 0.0f, 5, 5, 5);
		this.Tail3.setRotationPoint(0.0f, 10.0f, 27.8f);
		this.Tail3.setTextureSize(128, 128);
		this.Tail3.mirror = true;
		this.setRotation(this.Tail3, -0.1396263f, 0.0f, 0.0f);
		(this.Tail4 = new ModelRenderer(this, 80, 46)).addBox(-7.0f, -1.0f, 0.0f, 14, 2, 10);
		this.Tail4.setRotationPoint(0.0f, 11.0f, 32.0f);
		this.Tail4.setTextureSize(128, 128);
		this.Tail4.mirror = true;
		this.setRotation(this.Tail4, -0.1745329f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Head.render(f5);
		this.Body.render(f5);
		this.Neck.render(f5);
		this.Thigh1R.render(f5);
		this.Thigh1L.render(f5);
		this.Leg1R.render(f5);
		this.Leg1L.render(f5);
		this.Feet1L.render(f5);
		this.Feet1R.render(f5);
		this.EarR.render(f5);
		this.EarL.render(f5);
		this.PeakTop.render(f5);
		this.PeakBase.render(f5);
		this.Hair.render(f5);
		this.Tail1.render(f5);
		this.Tail2.render(f5);
		this.Tail3.render(f5);
		this.Tail4.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
