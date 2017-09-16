package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Bundimun extends ModelBase {

	ModelRenderer body;
	ModelRenderer headtop;
	ModelRenderer head;
	ModelRenderer eye1;
	ModelRenderer eye2;
	ModelRenderer eye3;
	ModelRenderer eye4;
	ModelRenderer eye5;
	ModelRenderer eye6;
	ModelRenderer feet1;
	ModelRenderer feet2;
	ModelRenderer feet3;
	ModelRenderer feet4;
	ModelRenderer feet5;
	ModelRenderer feet6;
	ModelRenderer feet7;
	ModelRenderer feet8;

	public Bundimun() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.body = new ModelRenderer(this, 0, 9)).addBox(-6.0f, -1.0f, -6.0f, 12, 2, 12);
		this.body.setRotationPoint(0.0f, 22.0f, 0.0f);
		this.body.setTextureSize(128, 64);
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.headtop = new ModelRenderer(this, 0, 23)).addBox(-3.0f, 0.0f, -3.0f, 6, 2, 6);
		this.headtop.setRotationPoint(0.0f, 19.0f, 0.0f);
		this.headtop.setTextureSize(128, 64);
		this.setRotation(this.headtop, 0.0f, 0.0f, 0.0f);
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, 0.0f, -4.0f, 8, 1, 8);
		this.head.setRotationPoint(0.0f, 20.0f, 0.0f);
		this.head.setTextureSize(128, 64);
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.eye1 = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2);
		this.eye1.setRotationPoint(-2.9f, 22.0f, -4.0f);
		this.eye1.setTextureSize(128, 64);
		this.setRotation(this.eye1, 0.5235988f, 0.0f, 0.0f);
		(this.eye2 = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2);
		this.eye2.setRotationPoint(2.9f, 22.0f, -4.0f);
		this.eye2.setTextureSize(128, 64);
		this.setRotation(this.eye2, 0.5235988f, 0.0f, 0.0f);
		(this.eye3 = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2);
		this.eye3.setRotationPoint(3.0f, 21.5f, 0.0f);
		this.eye3.setTextureSize(128, 64);
		this.setRotation(this.eye3, 0.0f, 0.0f, 0.6981317f);
		(this.eye4 = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2);
		this.eye4.setRotationPoint(-3.0f, 21.5f, 0.0f);
		this.eye4.setTextureSize(128, 64);
		this.setRotation(this.eye4, 0.0f, 0.0f, -0.6981317f);
		(this.eye5 = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2);
		this.eye5.setRotationPoint(-2.9f, 22.0f, 4.0f);
		this.eye5.setTextureSize(128, 64);
		this.setRotation(this.eye5, -0.5235988f, 0.0f, 0.0f);
		(this.eye6 = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -2.0f, -1.0f, 2, 2, 2);
		this.eye6.setRotationPoint(2.9f, 22.0f, 4.0f);
		this.eye6.setTextureSize(128, 64);
		this.setRotation(this.eye6, -0.5235988f, 0.0f, 0.0f);
		(this.feet1 = new ModelRenderer(this, 0, 11)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.feet1.setRotationPoint(-4.5f, 22.0f, -5.0f);
		this.feet1.setTextureSize(128, 64);
		this.setRotation(this.feet1, 0.0f, 0.0f, 0.0f);
		(this.feet2 = new ModelRenderer(this, 0, 11)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.feet2.setRotationPoint(-1.5f, 22.0f, -5.0f);
		this.feet2.setTextureSize(128, 64);
		this.setRotation(this.feet2, 0.0f, 0.0f, 0.0f);
		(this.feet3 = new ModelRenderer(this, 0, 11)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.feet3.setRotationPoint(1.5f, 22.0f, -5.0f);
		this.feet3.setTextureSize(128, 64);
		this.setRotation(this.feet3, 0.0f, 0.0f, 0.0f);
		(this.feet4 = new ModelRenderer(this, 0, 11)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.feet4.setRotationPoint(4.5f, 22.0f, -5.0f);
		this.feet4.setTextureSize(128, 64);
		this.setRotation(this.feet4, 0.0f, 0.0f, 0.0f);
		(this.feet5 = new ModelRenderer(this, 0, 11)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.feet5.setRotationPoint(-4.5f, 22.0f, 5.0f);
		this.feet5.setTextureSize(128, 64);
		this.setRotation(this.feet5, 0.0f, 0.0f, 0.0f);
		(this.feet6 = new ModelRenderer(this, 0, 11)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.feet6.setRotationPoint(-1.5f, 22.0f, 5.0f);
		this.feet6.setTextureSize(128, 64);
		this.setRotation(this.feet6, 0.0f, 0.0f, 0.0f);
		(this.feet7 = new ModelRenderer(this, 0, 11)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.feet7.setRotationPoint(1.5f, 22.0f, 5.0f);
		this.feet7.setTextureSize(128, 64);
		this.setRotation(this.feet7, 0.0f, 0.0f, 0.0f);
		(this.feet8 = new ModelRenderer(this, 0, 11)).addBox(-0.5f, 0.0f, -0.5f, 1, 2, 1);
		this.feet8.setRotationPoint(4.5f, 22.0f, 5.0f);
		this.feet8.setTextureSize(128, 64);
		this.setRotation(this.feet8, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.body.render(f5);
		this.headtop.render(f5);
		this.head.render(f5);
		this.eye1.render(f5);
		this.eye2.render(f5);
		this.eye3.render(f5);
		this.eye4.render(f5);
		this.eye5.render(f5);
		this.eye6.render(f5);
		this.feet1.render(f5);
		this.feet2.render(f5);
		this.feet3.render(f5);
		this.feet4.render(f5);
		this.feet5.render(f5);
		this.feet6.render(f5);
		this.feet7.render(f5);
		this.feet8.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
