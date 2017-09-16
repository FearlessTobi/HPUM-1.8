package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Mirror extends ModelBase {

	ModelRenderer Main;
	ModelRenderer Side1;
	ModelRenderer side2;
	ModelRenderer main5;
	ModelRenderer Main4;
	ModelRenderer main3;
	ModelRenderer Main2;
	ModelRenderer side3;
	ModelRenderer side4;
	ModelRenderer side5;
	ModelRenderer side6;
	ModelRenderer side7;
	ModelRenderer side9;
	ModelRenderer side_8;
	ModelRenderer side10;
	ModelRenderer top;

	public Mirror() {
		super.textureWidth = 128;
		super.textureHeight = 128;
		(this.Main = new ModelRenderer(this, 30, 88)).addBox(-4.0f, 0.0f, -2.0f, 18, 34, 2);
		this.Main.setRotationPoint(-5.0f, -10.0f, 1.0f);
		this.Main.setTextureSize(128, 128);
		this.Main.mirror = true;
		this.setRotation(this.Main, 0.0f, 0.0f, 0.0f);
		(this.Side1 = new ModelRenderer(this, 10, 88)).addBox(0.0f, 0.0f, 0.0f, 4, 34, 4);
		this.Side1.setRotationPoint(-13.0f, -10.0f, -2.0f);
		this.Side1.setTextureSize(128, 128);
		this.Side1.mirror = true;
		this.setRotation(this.Side1, 0.0f, 0.0f, 0.0f);
		(this.side2 = new ModelRenderer(this, 75, 88)).addBox(0.0f, 0.0f, 0.0f, 4, 34, 4);
		this.side2.setRotationPoint(9.0f, -10.0f, -2.0f);
		this.side2.setTextureSize(128, 128);
		this.side2.mirror = true;
		this.setRotation(this.side2, 0.0f, 0.0f, 0.0f);
		(this.main5 = new ModelRenderer(this, 40, 55)).addBox(-4.0f, 0.0f, -2.0f, 9, 5, 2);
		this.main5.setRotationPoint(-0.5f, -23.0f, 1.0f);
		this.main5.setTextureSize(128, 128);
		this.main5.mirror = true;
		this.setRotation(this.main5, 0.0f, 0.0f, 0.0f);
		(this.Main4 = new ModelRenderer(this, 37, 65)).addBox(-4.0f, 0.0f, -2.0f, 12, 3, 2);
		this.Main4.setRotationPoint(-2.0f, -18.0f, 1.0f);
		this.Main4.setTextureSize(128, 128);
		this.Main4.mirror = true;
		this.setRotation(this.Main4, 0.0f, 0.0f, 0.0f);
		(this.main3 = new ModelRenderer(this, 35, 72)).addBox(-4.0f, 0.0f, -2.0f, 14, 3, 2);
		this.main3.setRotationPoint(-3.0f, -15.0f, 1.0f);
		this.main3.setTextureSize(128, 128);
		this.main3.mirror = true;
		this.setRotation(this.main3, 0.0f, 0.0f, 0.0f);
		(this.Main2 = new ModelRenderer(this, 33, 80)).addBox(-4.0f, 0.0f, -2.0f, 16, 2, 2);
		this.Main2.setRotationPoint(-4.0f, -12.0f, 1.0f);
		this.Main2.setTextureSize(128, 128);
		this.Main2.mirror = true;
		this.setRotation(this.Main2, 0.0f, 0.0f, 0.0f);
		(this.side3 = new ModelRenderer(this, 15, 80)).addBox(0.0f, 0.0f, 0.0f, 4, 2, 4);
		this.side3.setRotationPoint(-12.0f, -12.0f, -2.0f);
		this.side3.setTextureSize(128, 128);
		this.side3.mirror = true;
		this.setRotation(this.side3, 0.0f, 0.0f, 0.0f);
		(this.side4 = new ModelRenderer(this, 72, 80)).addBox(0.0f, 0.0f, 0.0f, 4, 2, 4);
		this.side4.setRotationPoint(8.0f, -12.0f, -2.0f);
		this.side4.setTextureSize(128, 128);
		this.side4.mirror = true;
		this.setRotation(this.side4, 0.0f, 0.0f, 0.0f);
		(this.side5 = new ModelRenderer(this, 17, 71)).addBox(0.0f, 0.0f, 0.0f, 4, 3, 4);
		this.side5.setRotationPoint(-11.0f, -15.0f, -2.0f);
		this.side5.setTextureSize(128, 128);
		this.side5.mirror = true;
		this.setRotation(this.side5, 0.0f, 0.0f, 0.0f);
		(this.side6 = new ModelRenderer(this, 69, 71)).addBox(0.0f, 0.0f, 0.0f, 4, 3, 4);
		this.side6.setRotationPoint(7.0f, -15.0f, -2.0f);
		this.side6.setTextureSize(128, 128);
		this.side6.mirror = true;
		this.setRotation(this.side6, 0.0f, 0.0f, 0.0f);
		(this.side7 = new ModelRenderer(this, 19, 62)).addBox(0.0f, 0.0f, 0.0f, 4, 3, 4);
		this.side7.setRotationPoint(-10.0f, -18.0f, -2.0f);
		this.side7.setTextureSize(128, 128);
		this.side7.mirror = true;
		this.setRotation(this.side7, 0.0f, 0.0f, 0.0f);
		(this.side9 = new ModelRenderer(this, 67, 62)).addBox(0.0f, 0.0f, 0.0f, 4, 3, 4);
		this.side9.setRotationPoint(6.0f, -18.0f, -2.0f);
		this.side9.setTextureSize(128, 128);
		this.side9.mirror = true;
		this.setRotation(this.side9, 0.0f, 0.0f, 0.0f);
		(this.side_8 = new ModelRenderer(this, 65, 50)).addBox(0.0f, 0.0f, 0.0f, 4, 5, 4);
		this.side_8.setRotationPoint(4.5f, -23.0f, -2.0f);
		this.side_8.setTextureSize(128, 128);
		this.side_8.mirror = true;
		this.setRotation(this.side_8, 0.0f, 0.0f, 0.0f);
		(this.side10 = new ModelRenderer(this, 22, 51)).addBox(0.0f, 0.0f, 0.0f, 4, 5, 4);
		this.side10.setRotationPoint(-8.5f, -23.0f, -2.0f);
		this.side10.setTextureSize(128, 128);
		this.side10.mirror = true;
		this.setRotation(this.side10, 0.0f, 0.0f, 0.0f);
		(this.top = new ModelRenderer(this, 35, 42)).addBox(0.0f, 0.0f, 0.0f, 10, 2, 4);
		this.top.setRotationPoint(-5.0f, -25.0f, -2.0f);
		this.top.setTextureSize(128, 128);
		this.top.mirror = true;
		this.setRotation(this.top, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Main.render(f5);
		this.Side1.render(f5);
		this.side2.render(f5);
		this.main5.render(f5);
		this.Main4.render(f5);
		this.main3.render(f5);
		this.Main2.render(f5);
		this.side3.render(f5);
		this.side4.render(f5);
		this.side5.render(f5);
		this.side6.render(f5);
		this.side7.render(f5);
		this.side9.render(f5);
		this.side_8.render(f5);
		this.side10.render(f5);
		this.top.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void renderModel(final float f) {
		this.Main.render(f);
		this.Side1.render(f);
		this.side2.render(f);
		this.main5.render(f);
		this.Main4.render(f);
		this.main3.render(f);
		this.Main2.render(f);
		this.side3.render(f);
		this.side4.render(f);
		this.side5.render(f);
		this.side6.render(f);
		this.side7.render(f);
		this.side9.render(f);
		this.side_8.render(f);
		this.side10.render(f);
		this.top.render(f);
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
