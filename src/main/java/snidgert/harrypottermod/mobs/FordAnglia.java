package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FordAnglia extends ModelBase {

	ModelRenderer Tier1;
	ModelRenderer Tier2;
	ModelRenderer Tier3;
	ModelRenderer Tier4;
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

	public FordAnglia() {
		super.textureWidth = 512;
		super.textureHeight = 512;
		(this.Tier1 = new ModelRenderer(this, 0, 0)).addBox(0.0f, -6.0f, -6.0f, 5, 12, 12);
		this.Tier1.setRotationPoint(-14.0f, 18.0f, -17.0f);
		this.Tier1.setTextureSize(512, 512);
		this.Tier1.mirror = true;
		this.setRotation(this.Tier1, 0.0f, 0.0f, 0.0f);
		(this.Tier2 = new ModelRenderer(this, 0, 0)).addBox(0.0f, -6.0f, -6.0f, 5, 12, 12);
		this.Tier2.setRotationPoint(-14.0f, 18.0f, 19.0f);
		this.Tier2.setTextureSize(512, 512);
		this.Tier2.mirror = true;
		this.setRotation(this.Tier2, 0.0f, 0.0f, 0.0f);
		(this.Tier3 = new ModelRenderer(this, 0, 0)).addBox(0.0f, -6.0f, -6.0f, 5, 12, 12);
		this.Tier3.setRotationPoint(13.0f, 18.0f, 19.0f);
		this.Tier3.setTextureSize(512, 512);
		this.Tier3.mirror = true;
		this.setRotation(this.Tier3, 0.0f, 0.0f, 0.0f);
		(this.Tier4 = new ModelRenderer(this, 0, 0)).addBox(0.0f, -6.0f, -6.0f, 5, 12, 12);
		this.Tier4.setRotationPoint(13.0f, 18.0f, -17.0f);
		this.Tier4.setTextureSize(512, 512);
		this.Tier4.mirror = true;
		this.setRotation(this.Tier4, 0.0f, 0.0f, 0.0f);
		(this.Shape1 = new ModelRenderer(this, 0, 120)).addBox(0.0f, 0.0f, 0.0f, 3, 20, 64);
		this.Shape1.setRotationPoint(-12.0f, 0.0f, -28.0f);
		this.Shape1.setTextureSize(512, 512);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 0, 120)).addBox(0.0f, 0.0f, 0.0f, 3, 20, 64);
		this.Shape2.setRotationPoint(13.0f, 0.0f, -28.0f);
		this.Shape2.setTextureSize(512, 512);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 230, 0)).addBox(0.0f, 0.0f, 0.0f, 22, 18, 18);
		this.Shape3.setRotationPoint(-9.0f, 2.0f, -29.0f);
		this.Shape3.setTextureSize(512, 512);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.111544f, 0.0f, 0.0f);
		(this.Shape4 = new ModelRenderer(this, 72, 0)).addBox(0.0f, 0.0f, 22.0f, 22, 17, 20);
		this.Shape4.setRotationPoint(-9.0f, -3.0f, -5.0f);
		this.Shape4.setTextureSize(512, 512);
		this.Shape4.mirror = true;
		this.setRotation(this.Shape4, -0.1745329f, 0.0f, 0.0f);
		(this.Shape5 = new ModelRenderer(this, 282, 100)).addBox(0.0f, 0.0f, 0.0f, 28, 3, 64);
		this.Shape5.setRotationPoint(-12.0f, 18.0f, -28.0f);
		this.Shape5.setTextureSize(512, 512);
		this.Shape5.mirror = true;
		this.setRotation(this.Shape5, 0.0f, 0.0f, 0.0f);
		(this.Shape6 = new ModelRenderer(this, 200, 0)).addBox(0.0f, 0.0f, -3.0f, 3, 12, 3);
		this.Shape6.setRotationPoint(-12.0f, 0.0f, -11.0f);
		this.Shape6.setTextureSize(512, 512);
		this.Shape6.mirror = true;
		this.setRotation(this.Shape6, 2.792527f, 0.0f, 0.0f);
		(this.Shape7 = new ModelRenderer(this, 200, 0)).addBox(0.0f, 0.0f, -3.0f, 3, 12, 3);
		this.Shape7.setRotationPoint(13.0f, 0.0f, -11.0f);
		this.Shape7.setTextureSize(512, 512);
		this.Shape7.mirror = true;
		this.setRotation(this.Shape7, 2.792527f, 0.0f, 0.0f);
		(this.Shape8 = new ModelRenderer(this, 300, 300)).addBox(0.0f, 0.0f, 0.0f, 28, 3, 24);
		this.Shape8.setRotationPoint(-12.0f, -12.0f, -7.0f);
		this.Shape8.setTextureSize(512, 512);
		this.Shape8.mirror = true;
		this.setRotation(this.Shape8, 0.0f, 0.0f, 0.0f);
		(this.Shape9 = new ModelRenderer(this, 0, 300)).addBox(0.0f, 0.0f, 0.0f, 3, 12, 3);
		this.Shape9.setRotationPoint(-12.0f, -10.0f, 14.0f);
		this.Shape9.setTextureSize(512, 512);
		this.Shape9.mirror = true;
		this.setRotation(this.Shape9, 0.0f, 0.0f, 0.0f);
		(this.Shape10 = new ModelRenderer(this, 0, 300)).addBox(0.0f, 0.0f, 0.0f, 3, 12, 3);
		this.Shape10.setRotationPoint(13.0f, -10.0f, 14.0f);
		this.Shape10.setTextureSize(512, 512);
		this.Shape10.mirror = true;
		this.setRotation(this.Shape10, 0.0f, 0.0f, 0.0f);
		(this.Shape11 = new ModelRenderer(this, 100, 400)).addBox(0.0f, -2.0f, 0.0f, 2, 9, 2);
		this.Shape11.setRotationPoint(-2.0f, -1.0f, -9.0f);
		this.Shape11.setTextureSize(512, 512);
		this.Shape11.mirror = true;
		this.setRotation(this.Shape11, -0.8551066f, 0.0f, 0.0f);
		(this.Shape12 = new ModelRenderer(this, 0, 400)).addBox(0.0f, 0.0f, 0.0f, 6, 6, 2);
		this.Shape12.setRotationPoint(-4.0f, -5.0f, -8.0f);
		this.Shape12.setTextureSize(512, 512);
		this.Shape12.mirror = true;
		this.setRotation(this.Shape12, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Tier1.render(f5);
		this.Tier2.render(f5);
		this.Tier3.render(f5);
		this.Tier4.render(f5);
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
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
