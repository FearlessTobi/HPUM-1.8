package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TriCup extends ModelBase {

	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
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

	public TriCup() {
		super.textureWidth = 256;
		super.textureHeight = 256;
		(this.Shape1 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 2, 10);
		this.Shape1.setRotationPoint(-5.0f, 22.0f, -5.0f);
		this.Shape1.setTextureSize(256, 256);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
		(this.Shape2 = new ModelRenderer(this, 47, 50)).addBox(0.0f, 0.0f, 0.0f, 6, 1, 6);
		this.Shape2.setRotationPoint(-3.0f, 21.0f, -3.0f);
		this.Shape2.setTextureSize(256, 256);
		this.Shape2.mirror = true;
		this.setRotation(this.Shape2, 0.0f, 0.0f, 0.0f);
		(this.Shape3 = new ModelRenderer(this, 47, 32)).addBox(0.0f, 0.0f, 0.0f, 3, 5, 3);
		this.Shape3.setRotationPoint(-1.5f, 16.0f, -1.5f);
		this.Shape3.setTextureSize(256, 256);
		this.Shape3.mirror = true;
		this.setRotation(this.Shape3, 0.0f, 0.0f, 0.0f);
		(this.Shape12 = new ModelRenderer(this, 47, 62)).addBox(0.0f, 0.0f, 0.0f, 6, 1, 6);
		this.Shape12.setRotationPoint(-3.0f, 15.0f, -3.0f);
		this.Shape12.setTextureSize(256, 256);
		this.Shape12.mirror = true;
		this.setRotation(this.Shape12, 0.0f, 0.0f, 0.0f);
		(this.Shape13 = new ModelRenderer(this, 47, 24)).addBox(0.0f, 0.0f, 0.0f, 6, 7, 1);
		this.Shape13.setRotationPoint(-3.0f, 8.0f, -4.0f);
		this.Shape13.setTextureSize(256, 256);
		this.Shape13.mirror = true;
		this.setRotation(this.Shape13, 0.0f, 0.0f, 0.0f);
		(this.Shape14 = new ModelRenderer(this, 47, 14)).addBox(0.0f, 0.0f, 0.0f, 6, 7, 1);
		this.Shape14.setRotationPoint(-3.0f, 8.0f, 3.0f);
		this.Shape14.setTextureSize(256, 256);
		this.Shape14.mirror = true;
		this.setRotation(this.Shape14, 0.0f, 0.0f, 0.0f);
		(this.Shape15 = new ModelRenderer(this, 47, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 7, 6);
		this.Shape15.setRotationPoint(-4.0f, 8.0f, -3.0f);
		this.Shape15.setTextureSize(256, 256);
		this.Shape15.mirror = true;
		this.setRotation(this.Shape15, 0.0f, 0.0f, 0.0f);
		(this.Shape16 = new ModelRenderer(this, 47, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 7, 6);
		this.Shape16.setRotationPoint(3.0f, 8.0f, -3.0f);
		this.Shape16.setTextureSize(256, 256);
		this.Shape16.mirror = true;
		this.setRotation(this.Shape16, 0.0f, 0.0f, 0.0f);
		(this.Shape17 = new ModelRenderer(this, 77, 13)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3);
		this.Shape17.setRotationPoint(-0.5f, 8.0f, 4.0f);
		this.Shape17.setTextureSize(256, 256);
		this.Shape17.mirror = true;
		this.setRotation(this.Shape17, 0.0f, 0.0f, 0.0f);
		(this.Shape18 = new ModelRenderer(this, 77, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 4, 1);
		this.Shape18.setRotationPoint(-0.5f, 9.0f, 6.5f);
		this.Shape18.setTextureSize(256, 256);
		this.Shape18.mirror = true;
		this.setRotation(this.Shape18, 0.0f, 0.0f, 0.0f);
		(this.Shape19 = new ModelRenderer(this, 77, 24)).addBox(0.0f, 0.0f, 0.0f, 1, 4, 1);
		this.Shape19.setRotationPoint(-0.5f, 12.0f, 7.0f);
		this.Shape19.setTextureSize(256, 256);
		this.Shape19.mirror = true;
		this.setRotation(this.Shape19, -1.047198f, 0.0f, 0.0f);
		(this.Shape20 = new ModelRenderer(this, 77, 13)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 3);
		this.Shape20.setRotationPoint(-4.0f, 8.0f, -0.5f);
		this.Shape20.setTextureSize(256, 256);
		this.Shape20.mirror = true;
		this.setRotation(this.Shape20, 0.0f, -1.919862f, 0.0f);
		(this.Shape21 = new ModelRenderer(this, 77, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 4, 1);
		this.Shape21.setRotationPoint(-6.0f, 9.0f, -1.5f);
		this.Shape21.setTextureSize(256, 256);
		this.Shape21.mirror = true;
		this.setRotation(this.Shape21, 0.0f, -1.919862f, 0.0f);
		(this.Shape22 = new ModelRenderer(this, 77, 24)).addBox(0.0f, 0.0f, 0.0f, 1, 4, 1);
		this.Shape22.setRotationPoint(-6.5f, 12.0f, -1.5f);
		this.Shape22.setTextureSize(256, 256);
		this.Shape22.mirror = true;
		this.setRotation(this.Shape22, -1.047198f, -1.919862f, 0.0f);
		(this.Shape23 = new ModelRenderer(this, 77, 13)).addBox(-1.0f, 0.0f, 0.0f, 1, 1, 3);
		this.Shape23.setRotationPoint(4.0f, 8.0f, -0.5f);
		this.Shape23.setTextureSize(256, 256);
		this.Shape23.mirror = true;
		this.setRotation(this.Shape23, 0.0f, 1.919862f, 0.0f);
		(this.Shape24 = new ModelRenderer(this, 77, 0)).addBox(-1.0f, 0.0f, 0.0f, 1, 4, 1);
		this.Shape24.setRotationPoint(6.0f, 9.0f, -1.5f);
		this.Shape24.setTextureSize(256, 256);
		this.Shape24.mirror = true;
		this.setRotation(this.Shape24, 0.0f, 1.919862f, 0.0f);
		(this.Shape25 = new ModelRenderer(this, 77, 24)).addBox(-1.0f, 0.0f, 0.0f, 1, 4, 1);
		this.Shape25.setRotationPoint(6.5f, 12.0f, -1.5f);
		this.Shape25.setTextureSize(256, 256);
		this.Shape25.mirror = true;
		this.setRotation(this.Shape25, -1.047198f, 1.919862f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Shape1.render(f5);
		this.Shape2.render(f5);
		this.Shape3.render(f5);
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
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void renderModel(final float f) {
		this.Shape1.render(f);
		this.Shape2.render(f);
		this.Shape3.render(f);
		this.Shape12.render(f);
		this.Shape13.render(f);
		this.Shape14.render(f);
		this.Shape15.render(f);
		this.Shape16.render(f);
		this.Shape17.render(f);
		this.Shape18.render(f);
		this.Shape19.render(f);
		this.Shape20.render(f);
		this.Shape21.render(f);
		this.Shape22.render(f);
		this.Shape23.render(f);
		this.Shape24.render(f);
		this.Shape25.render(f);
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
