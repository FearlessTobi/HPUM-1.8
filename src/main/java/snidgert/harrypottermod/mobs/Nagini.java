package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Nagini extends ModelBase {

	ModelRenderer body1;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer tail;
	ModelRenderer neck1;
	ModelRenderer neck2;
	ModelRenderer head;
	ModelRenderer mouth;
	ModelRenderer lefttooth;
	ModelRenderer righttooth;
	ModelRenderer tongue;
	ModelRenderer teeth;

	public Nagini() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.body1 = new ModelRenderer(this, 0, 15)).addBox(-2.0f, -1.5f, 0.0f, 4, 3, 8);
		this.body1.setRotationPoint(0.0f, 15.5f, -4.5f);
		this.body1.setTextureSize(64, 32);
		this.setRotation(this.body1, -0.715585f, 0.0f, 0.0f);
		(this.body2 = new ModelRenderer(this, 0, 15)).addBox(-2.0f, -1.5f, 0.0f, 4, 3, 8);
		this.body2.setRotationPoint(0.0f, 20.5f, 1.0f);
		this.body2.setTextureSize(64, 32);
		this.setRotation(this.body2, -0.2617994f, 0.0f, 0.0f);
		(this.body3 = new ModelRenderer(this, 0, 15)).addBox(-2.0f, -1.5f, 0.0f, 4, 3, 8);
		this.body3.setRotationPoint(0.0f, 22.5f, 8.0f);
		this.body3.setTextureSize(64, 32);
		this.setRotation(this.body3, 0.0f, 0.0f, 0.0f);
		(this.body4 = new ModelRenderer(this, 0, 15)).addBox(-2.0f, -1.5f, 0.0f, 4, 3, 8);
		this.body4.setRotationPoint(0.0f, 22.5f, 16.0f);
		this.body4.setTextureSize(64, 32);
		this.setRotation(this.body4, 0.0f, 0.0f, 0.0f);
		(this.body5 = new ModelRenderer(this, 24, 15)).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 10);
		this.body5.setRotationPoint(0.0f, 22.5f, 24.0f);
		this.body5.setTextureSize(64, 32);
		this.setRotation(this.body5, 0.0f, 0.0f, 0.0f);
		(this.body6 = new ModelRenderer(this, 24, 15)).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 10);
		this.body6.setRotationPoint(0.0f, 22.5f, 34.0f);
		this.body6.setTextureSize(64, 32);
		this.setRotation(this.body6, 0.0f, 0.0f, 0.0f);
		(this.tail = new ModelRenderer(this, 42, 20)).addBox(-1.0f, -1.5f, 0.0f, 2, 3, 9);
		this.tail.setRotationPoint(0.0f, 22.5f, 44.0f);
		this.tail.setTextureSize(64, 32);
		this.setRotation(this.tail, 0.0f, 0.0f, 0.0f);
		(this.neck1 = new ModelRenderer(this, 36, 0)).addBox(-2.0f, -1.5f, 0.0f, 4, 3, 10);
		this.neck1.setRotationPoint(0.0f, -2.5f, -7.0f);
		this.neck1.setTextureSize(64, 32);
		this.setRotation(this.neck1, -1.61443f, 0.0f, 0.0f);
		(this.neck2 = new ModelRenderer(this, 36, 0)).addBox(-2.0f, -1.5f, 0.0f, 4, 3, 10);
		this.neck2.setRotationPoint(0.0f, 6.8f, -7.5f);
		this.neck2.setTextureSize(64, 32);
		this.setRotation(this.neck2, -1.22173f, 0.0f, 0.0f);
		(this.head = new ModelRenderer(this, 0, 1)).addBox(-2.5f, -1.5f, -8.0f, 5, 3, 8);
		this.head.setRotationPoint(0.0f, -1.0f, -7.0f);
		this.head.setTextureSize(64, 32);
		this.setRotation(this.head, -0.0872665f, 0.0f, 0.0f);
		(this.mouth = new ModelRenderer(this, 22, 0)).addBox(-2.5f, -1.0f, -7.0f, 5, 2, 7);
		this.mouth.setRotationPoint(0.0f, 0.0f, -7.0f);
		this.mouth.setTextureSize(64, 32);
		this.setRotation(this.mouth, 0.6108652f, 0.0f, 0.0f);
		(this.lefttooth = new ModelRenderer(this, 0, 0)).addBox(-0.5f, -0.5f, -1.0f, 1, 2, 1);
		this.lefttooth.setRotationPoint(1.5f, 0.0f, -13.5f);
		this.lefttooth.setTextureSize(64, 32);
		this.setRotation(this.lefttooth, 0.0f, 0.0f, 0.0f);
		(this.righttooth = new ModelRenderer(this, 0, 0)).addBox(-0.5f, -0.5f, -1.0f, 1, 2, 1);
		this.righttooth.setRotationPoint(-1.5f, 0.0f, -13.5f);
		this.righttooth.setTextureSize(64, 32);
		this.setRotation(this.righttooth, 0.0f, 0.0f, 0.0f);
		(this.tongue = new ModelRenderer(this, 0, 15)).addBox(-0.5f, 0.0f, -5.0f, 1, 0, 5);
		this.tongue.setRotationPoint(0.0f, 0.0f, -9.0f);
		this.tongue.setTextureSize(64, 32);
		this.setRotation(this.tongue, 0.418879f, 0.0f, 0.0f);
		(this.teeth = new ModelRenderer(this, 0, 12)).addBox(-2.0f, -0.5f, -0.5f, 4, 1, 1);
		this.teeth.setRotationPoint(0.0f, 2.8f, -12.5f);
		this.teeth.setTextureSize(64, 32);
		this.setRotation(this.teeth, 1.396263f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.body1.render(f5);
		this.body2.render(f5);
		this.body3.render(f5);
		this.body4.render(f5);
		this.body5.render(f5);
		this.body6.render(f5);
		this.tail.render(f5);
		this.neck1.render(f5);
		this.neck2.render(f5);
		this.head.render(f5);
		this.mouth.render(f5);
		this.lefttooth.render(f5);
		this.righttooth.render(f5);
		this.tongue.render(f5);
		this.teeth.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
