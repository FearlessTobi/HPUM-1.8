package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Motorbike2 extends ModelBase {

	ModelRenderer tier1;
	ModelRenderer tier2;
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;
	ModelRenderer Shape18;
	ModelRenderer Shape19;
	ModelRenderer Shape20;
	ModelRenderer Shape21;
	ModelRenderer Shape22;
	ModelRenderer Shape23;
	ModelRenderer Shape24;
	ModelRenderer Shape25;
	ModelRenderer tier3;
	ModelRenderer Shape26;
	ModelRenderer Shape27;
	ModelRenderer Shape28;

	public Motorbike2() {
		super.textureWidth = 512;
		super.textureHeight = 512;
		(this.tier1 = new ModelRenderer(this, 0, 0)).addBox(0.0f, -5.0f, -5.0f, 3, 10, 10);
		this.tier1.setRotationPoint(-1.5f, 19.0f, -25.0f);
		this.tier1.setTextureSize(512, 512);
		this.tier1.mirror = true;
		this.setRotation(this.tier1, 0.0f, 0.0f, 0.0f);
		(this.tier2 = new ModelRenderer(this, 0, 0)).addBox(0.0f, -5.0f, -5.0f, 3, 10, 10);
		this.tier2.setRotationPoint(-1.5f, 19.0f, 11.0f);
		this.tier2.setTextureSize(512, 512);
		this.tier2.mirror = true;
		this.setRotation(this.tier2, 0.0f, 0.0f, 0.0f);
		(this.Shape1 = new ModelRenderer(this, 40, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 19, 2);
		this.Shape1.setRotationPoint(-2.5f, 19.0f, -25.0f);
		this.Shape1.setTextureSize(512, 512);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 2.530727f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 40, 0)).addBox(-1.0f, 0.0f, -1.0f, 2, 19, 2);
		this.Shape2.setRotationPoint(2.5f, 19.0f, -25.0f);
		this.Shape2.setTextureSize(512, 512);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 2.530727f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 60, 0)).addBox(0.0f, 0.0f, 0.0f, 7, 5, 3);
		this.Shape3.setRotationPoint(-3.5f, 3.0f, -16.0f);
		this.Shape3.setTextureSize(512, 512);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 91, 0)).addBox(0.0f, 0.0f, 0.0f, 5, 5, 2);
		this.Shape4.setRotationPoint(-2.5f, 2.0f, -18.0f);
		this.Shape4.setTextureSize(512, 512);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, 0.0f, 0.0f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 0, 34)).addBox(0.0f, 0.0f, 0.0f, 8, 2, 2);
		this.Shape5.setRotationPoint(2.5f, 3.0f, -15.5f);
		this.Shape5.setTextureSize(512, 512);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, -0.4363323f, -0.1745329f);
		(this.Shape6 = new ModelRenderer(this, 0, 34)).addBox(-8.0f, 0.0f, 0.0f, 8, 2, 2);
		this.Shape6.setRotationPoint(-2.5f, 3.0f, -15.5f);
		this.Shape6.setTextureSize(512, 512);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 0.0f, 0.4363323f, 0.1745329f);
		(this.Shape7 = new ModelRenderer(this, 0, 55)).addBox(0.0f, 0.0f, 0.0f, 7, 7, 11);
		this.Shape7.setRotationPoint(-3.5f, 3.0f, -13.0f);
		this.Shape7.setTextureSize(512, 512);
		this.Shape7.mirror = true;
		this.setRotation(this.Shape7, -0.0872665f, 0.0f, 0.0f);
		(this.Shape8 = new ModelRenderer(this, 0, 86)).addBox(0.0f, 0.0f, 0.0f, 5, 3, 6);
		this.Shape8.setRotationPoint(-2.5f, 4.0f, -3.0f);
		this.Shape8.setTextureSize(512, 512);
		this.Shape8.mirror = true;
		this.setRotation(this.Shape8, 0.0f, 0.0f, 0.0f);
		(this.Shape9 = new ModelRenderer(this, 50, 50)).addBox(0.0f, 0.0f, 0.0f, 7, 3, 8);
		this.Shape9.setRotationPoint(-3.5f, 4.0f, 2.0f);
		this.Shape9.setTextureSize(512, 512);
		this.Shape9.mirror = true;
		this.setRotation(this.Shape9, 0.1115358f, 0.0f, 0.0f);
		(this.Shape10 = new ModelRenderer(this, 100, 100)).addBox(0.0f, 0.0f, 0.0f, 6, 12, 12);
		this.Shape10.setRotationPoint(-3.0f, 6.0f, -3.0f);
		this.Shape10.setTextureSize(512, 512);
		this.Shape10.mirror = true;
		this.setRotation(this.Shape10, 0.0f, 0.0f, 0.0f);
		(this.Shape11 = new ModelRenderer(this, 200, 200)).addBox(0.0f, 0.0f, 0.0f, 6, 9, 10);
		this.Shape11.setRotationPoint(-3.0f, 9.0f, -12.0f);
		this.Shape11.setTextureSize(512, 512);
		this.Shape11.mirror = true;
		this.setRotation(this.Shape11, 0.0f, 0.0f, 0.0f);
		(this.Shape12 = new ModelRenderer(this, 300, 300)).addBox(0.0f, 0.0f, 0.0f, 3, 6, 1);
		this.Shape12.setRotationPoint(-1.5f, 14.0f, -20.0f);
		this.Shape12.setTextureSize(512, 512);
		this.Shape12.mirror = true;
		this.setRotation(this.Shape12, 0.0f, 0.0f, 0.0f);
		(this.Shape13 = new ModelRenderer(this, 300, 300)).addBox(0.0f, 0.0f, 0.0f, 3, 8, 1);
		this.Shape13.setRotationPoint(-1.5f, 14.0f, -27.0f);
		this.Shape13.setTextureSize(512, 512);
		this.Shape13.mirror = true;
		this.setRotation(this.Shape13, 1.570796f, 0.0f, 0.0f);
		(this.Shape14 = new ModelRenderer(this, 300, 300)).addBox(0.0f, 0.0f, 0.0f, 3, 6, 1);
		this.Shape14.setRotationPoint(-1.5f, 14.0f, 5.0f);
		this.Shape14.setTextureSize(512, 512);
		this.Shape14.mirror = true;
		this.setRotation(this.Shape14, 0.0f, 0.0f, 0.0f);
		(this.Shape15 = new ModelRenderer(this, 300, 300)).addBox(0.0f, 0.0f, 0.0f, 3, 8, 1);
		this.Shape15.setRotationPoint(-1.5f, 14.0f, 5.0f);
		this.Shape15.setTextureSize(512, 512);
		this.Shape15.mirror = true;
		this.setRotation(this.Shape15, 1.570796f, 0.0f, 0.0f);
		(this.Shape16 = new ModelRenderer(this, 400, 400)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
		this.Shape16.setRotationPoint(3.0f, 11.0f, -11.0f);
		this.Shape16.setTextureSize(512, 512);
		this.Shape16.mirror = true;
		this.setRotation(this.Shape16, 0.1745329f, 0.0f, 0.0f);
		(this.Shape17 = new ModelRenderer(this, 400, 400)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 1);
		this.Shape17.setRotationPoint(-4.0f, 11.0f, -11.0f);
		this.Shape17.setTextureSize(512, 512);
		this.Shape17.mirror = true;
		this.setRotation(this.Shape17, 0.1745329f, 0.0f, 0.0f);
		(this.Shape18 = new ModelRenderer(this, 400, 418)).addBox(0.0f, 0.0f, 0.0f, 1, 11, 1);
		this.Shape18.setRotationPoint(3.0f, 14.0f, -10.5f);
		this.Shape18.setTextureSize(512, 512);
		this.Shape18.mirror = true;
		this.setRotation(this.Shape18, 1.252713f, 0.0f, 0.0f);
		(this.Shape19 = new ModelRenderer(this, 400, 418)).addBox(0.0f, 0.0f, 0.0f, 1, 11, 1);
		this.Shape19.setRotationPoint(-4.0f, 14.0f, -10.5f);
		this.Shape19.setTextureSize(512, 512);
		this.Shape19.mirror = true;
		this.setRotation(this.Shape19, 1.252713f, 0.0f, 0.0f);
		(this.Shape20 = new ModelRenderer(this, 116, 0)).addBox(0.0f, 0.0f, 0.0f, 7, 5, 5);
		this.Shape20.setRotationPoint(2.5f, 8.0f, -1.0f);
		this.Shape20.setTextureSize(512, 512);
		this.Shape20.mirror = true;
		this.setRotation(this.Shape20, 0.0f, 0.0f, 0.0f);
		(this.Shape21 = new ModelRenderer(this, 161, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 14, 16);
		this.Shape21.setRotationPoint(9.5f, 7.0f, -6.0f);
		this.Shape21.setTextureSize(512, 512);
		this.Shape21.mirror = true;
		this.setRotation(this.Shape21, 0.0f, 0.0f, 0.0f);
		(this.Shape22 = new ModelRenderer(this, 161, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 14, 16);
		this.Shape22.setRotationPoint(23.5f, 7.0f, -6.0f);
		this.Shape22.setTextureSize(512, 512);
		this.Shape22.mirror = true;
		this.setRotation(this.Shape22, 0.0f, 0.0f, 0.0f);
		(this.Shape23 = new ModelRenderer(this, 0, 164)).addBox(0.0f, 0.0f, 0.0f, 16, 14, 6);
		this.Shape23.setRotationPoint(9.5f, 7.0f, 9.0f);
		this.Shape23.setTextureSize(512, 512);
		this.Shape23.mirror = true;
		this.setRotation(this.Shape23, 0.0f, 0.0f, 0.0f);
		(this.Shape24 = new ModelRenderer(this, 0, 200)).addBox(0.0f, 0.0f, 0.0f, 16, 1, 35);
		this.Shape24.setRotationPoint(9.5f, 21.0f, -20.0f);
		this.Shape24.setTextureSize(512, 512);
		this.Shape24.mirror = true;
		this.setRotation(this.Shape24, 0.0f, 0.0f, 0.0f);
		(this.Shape25 = new ModelRenderer(this, 0, 123)).addBox(0.0f, 0.0f, 0.0f, 16, 14, 14);
		this.Shape25.setRotationPoint(9.5f, 7.0f, -20.0f);
		this.Shape25.setTextureSize(512, 512);
		this.Shape25.mirror = true;
		this.setRotation(this.Shape25, 0.0f, 0.0f, 0.0f);
		(this.tier3 = new ModelRenderer(this, 0, 0)).addBox(0.0f, -5.0f, -5.0f, 3, 10, 10);
		this.tier3.setRotationPoint(25.5f, 19.0f, 4.0f);
		this.tier3.setTextureSize(512, 512);
		this.tier3.mirror = true;
		this.setRotation(this.tier3, 0.0f, 0.0f, 0.0f);
		(this.Shape26 = new ModelRenderer(this, 200, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 5);
		this.Shape26.setRotationPoint(25.5f, 19.0f, -2.0f);
		this.Shape26.setTextureSize(512, 512);
		this.Shape26.mirror = true;
		this.setRotation(this.Shape26, 1.570796f, 0.0f, 0.0f);
		(this.Shape27 = new ModelRenderer(this, 300, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 10);
		this.Shape27.setRotationPoint(25.5f, 13.0f, -1.0f);
		this.Shape27.setTextureSize(512, 512);
		this.Shape27.mirror = true;
		this.setRotation(this.Shape27, 0.0f, 0.0f, 0.0f);
		(this.Shape28 = new ModelRenderer(this, 200, 0)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 5);
		this.Shape28.setRotationPoint(25.5f, 19.0f, 9.0f);
		this.Shape28.setTextureSize(512, 512);
		this.Shape28.mirror = true;
		this.setRotation(this.Shape28, 1.570796f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.tier1.render(f5);
		this.tier2.render(f5);
		this.Shape1.render(f5);
		this.Shape2.render(f5);
		this.Shape3.render(f5);
		this.Shape4.render(f5);
		this.Shape5.render(f5);
		this.Shape6.render(f5);
		this.Shape7.render(f5);
		this.Shape8.render(f5);
		this.Shape9.render(f5);
		this.Shape10.render(f5);
		this.Shape11.render(f5);
		this.Shape12.render(f5);
		this.Shape13.render(f5);
		this.Shape14.render(f5);
		this.Shape15.render(f5);
		this.Shape16.render(f5);
		this.Shape17.render(f5);
		this.Shape18.render(f5);
		this.Shape19.render(f5);
		this.Shape20.render(f5);
		this.Shape21.render(f5);
		this.Shape22.render(f5);
		this.Shape23.render(f5);
		this.Shape24.render(f5);
		this.Shape25.render(f5);
		this.tier3.render(f5);
		this.Shape26.render(f5);
		this.Shape27.render(f5);
		this.Shape28.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
