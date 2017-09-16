package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Ramora extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer tail1;
	ModelRenderer tail2;
	ModelRenderer tail3;
	ModelRenderer finL;
	ModelRenderer finR;
	ModelRenderer upperfin;

	public Ramora() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -2.0f, -2.0f, 4, 4, 4);
		this.head.setRotationPoint(0.0f, 19.0f, -4.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.7853982f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 0, 10)).addBox(-1.5f, -2.5f, 0.0f, 3, 5, 7);
		this.body.setRotationPoint(0.0f, 19.0f, -4.0f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.tail1 = new ModelRenderer(this, 21, 0)).addBox(-1.0f, -2.0f, 0.0f, 2, 4, 3);
		this.tail1.setRotationPoint(0.0f, 19.0f, 2.5f);
		this.tail1.setTextureSize(64, 32);
		this.tail1.mirror = true;
		this.setRotation(this.tail1, 0.0f, 0.0f, 0.0f);
		(this.tail2 = new ModelRenderer(this, 32, 0)).addBox(-0.5f, -1.5f, 0.0f, 1, 3, 3);
		this.tail2.setRotationPoint(0.0f, 19.0f, 4.5f);
		this.tail2.setTextureSize(64, 32);
		this.tail2.mirror = true;
		this.setRotation(this.tail2, 0.0f, 0.0f, 0.0f);
		(this.tail3 = new ModelRenderer(this, 41, 0)).addBox(0.0f, 0.0f, 0.0f, 0, 4, 4);
		this.tail3.setRotationPoint(0.0f, 19.0f, 6.5f);
		this.tail3.setTextureSize(64, 32);
		this.tail3.mirror = true;
		this.setRotation(this.tail3, 0.7853982f, 0.0f, 0.0f);
		(this.finL = new ModelRenderer(this, 0, 23)).addBox(0.0f, -1.0f, 0.0f, 0, 2, 3);
		this.finL.setRotationPoint(1.5f, 19.0f, -1.0f);
		this.finL.setTextureSize(64, 32);
		this.finL.mirror = true;
		this.setRotation(this.finL, 0.0f, 0.4363323f, 0.0f);
		(this.finR = new ModelRenderer(this, 0, 23)).addBox(0.0f, -1.0f, 0.0f, 0, 2, 3);
		this.finR.setRotationPoint(-1.5f, 19.0f, -1.0f);
		this.finR.setTextureSize(64, 32);
		this.finR.mirror = true;
		this.setRotation(this.finR, 0.0f, -0.4363323f, 0.0f);
		(this.upperfin = new ModelRenderer(this, 22, 0)).addBox(0.0f, -2.0f, -5.5f, 0, 2, 11);
		this.upperfin.setRotationPoint(0.0f, 17.5f, 1.5f);
		this.upperfin.setTextureSize(64, 32);
		this.upperfin.mirror = true;
		this.setRotation(this.upperfin, -0.0698132f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.head.render(f5);
		this.body.render(f5);
		this.tail1.render(f5);
		this.tail2.render(f5);
		this.tail3.render(f5);
		this.finL.render(f5);
		this.finR.render(f5);
		this.upperfin.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
