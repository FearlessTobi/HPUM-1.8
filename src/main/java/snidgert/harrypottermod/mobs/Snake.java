package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Snake extends ModelBase {

	ModelRenderer Head;
	ModelRenderer Tongue;
	ModelRenderer part1;
	ModelRenderer part2;
	ModelRenderer part3;
	ModelRenderer part4;
	ModelRenderer part5;
	ModelRenderer part6;
	ModelRenderer part7;
	ModelRenderer part8;
	ModelRenderer part9;
	ModelRenderer part10;
	ModelRenderer part11;

	public Snake() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -1.0f, -4.0f, 3, 2, 4);
		this.Head.setRotationPoint(0.0f, 23.0f, -17.0f);
		this.Head.setTextureSize(128, 64);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
		(this.Tongue = new ModelRenderer(this, 0, 14)).addBox(-0.5f, 0.0f, -2.0f, 1, 0, 2);
		this.Tongue.setRotationPoint(0.0f, 23.0f, -20.5f);
		this.Tongue.setTextureSize(128, 64);
		this.Tongue.mirror = true;
		this.setRotation(this.Tongue, 0.0f, 0.0f, 0.0f);
		(this.part1 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part1.setRotationPoint(0.0f, 23.0f, -17.0f);
		this.part1.setTextureSize(128, 64);
		this.part1.mirror = true;
		this.setRotation(this.part1, 0.0f, 0.0523599f, 0.0f);
		(this.part2 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part2.setRotationPoint(0.0f, 23.0f, -14.0f);
		this.part2.setTextureSize(128, 64);
		this.part2.mirror = true;
		this.setRotation(this.part2, 0.0f, -0.0523599f, 0.0f);
		(this.part3 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part3.setRotationPoint(0.0f, 23.0f, -11.0f);
		this.part3.setTextureSize(128, 64);
		this.part3.mirror = true;
		this.setRotation(this.part3, 0.0f, 0.0523599f, 0.0f);
		(this.part4 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part4.setRotationPoint(0.0f, 23.0f, -8.0f);
		this.part4.setTextureSize(128, 64);
		this.part4.mirror = true;
		this.setRotation(this.part4, 0.0f, -0.0523599f, 0.0f);
		(this.part5 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part5.setRotationPoint(0.0f, 23.0f, -5.0f);
		this.part5.setTextureSize(128, 64);
		this.part5.mirror = true;
		this.setRotation(this.part5, 0.0f, 0.0523599f, 0.0f);
		(this.part6 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part6.setRotationPoint(0.0f, 23.0f, -2.0f);
		this.part6.setTextureSize(128, 64);
		this.part6.mirror = true;
		this.setRotation(this.part6, 0.0f, -0.0523599f, 0.0f);
		(this.part7 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part7.setRotationPoint(0.0f, 23.0f, 1.0f);
		this.part7.setTextureSize(128, 64);
		this.part7.mirror = true;
		this.setRotation(this.part7, 0.0f, 0.0523599f, 0.0f);
		(this.part8 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part8.setRotationPoint(0.0f, 23.0f, 4.0f);
		this.part8.setTextureSize(128, 64);
		this.part8.mirror = true;
		this.setRotation(this.part8, 0.0f, -0.0523599f, 0.0f);
		(this.part9 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part9.setRotationPoint(0.0f, 23.0f, 7.0f);
		this.part9.setTextureSize(128, 64);
		this.part9.mirror = true;
		this.setRotation(this.part9, 0.0f, 0.0523599f, 0.0f);
		(this.part10 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part10.setRotationPoint(0.0f, 23.0f, 10.0f);
		this.part10.setTextureSize(128, 64);
		this.part10.mirror = true;
		this.setRotation(this.part10, 0.0f, -0.0523599f, 0.0f);
		(this.part11 = new ModelRenderer(this, 0, 8)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 3);
		this.part11.setRotationPoint(0.0f, 23.0f, 13.0f);
		this.part11.setTextureSize(128, 64);
		this.part11.mirror = true;
		this.setRotation(this.part11, 0.0f, 0.0523599f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Head.render(f5);
		this.Tongue.render(f5);
		this.part1.render(f5);
		this.part2.render(f5);
		this.part3.render(f5);
		this.part4.render(f5);
		this.part5.render(f5);
		this.part6.render(f5);
		this.part7.render(f5);
		this.part8.render(f5);
		this.part9.render(f5);
		this.part10.render(f5);
		this.part11.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
