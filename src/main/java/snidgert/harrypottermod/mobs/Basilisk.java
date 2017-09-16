package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Basilisk extends ModelBase {

	ModelRenderer head;
	ModelRenderer mouth;
	ModelRenderer neck;
	ModelRenderer body;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer body7;
	ModelRenderer body8;
	ModelRenderer body9;
	ModelRenderer body10;
	ModelRenderer tooth;
	ModelRenderer Shape1;

	public Basilisk() {
		super.textureWidth = 128;
		super.textureHeight = 128;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-7.0f, -5.0f, -17.0f, 14, 10, 17);
		this.head.setRotationPoint(0.0f, -52.0f, -48.0f);
		this.head.setTextureSize(128, 128);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.mouth = new ModelRenderer(this, 0, 27)).addBox(-7.0f, 0.0f, -15.0f, 14, 4, 15);
		this.mouth.setRotationPoint(0.0f, -47.0f, -48.0f);
		this.mouth.setTextureSize(128, 128);
		this.mouth.mirror = true;
		this.setRotation(this.mouth, 0.1745329f, 0.0f, 0.0f);
		(this.neck = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.neck.setRotationPoint(0.0f, -39.5f, -41.5f);
		this.neck.setTextureSize(128, 128);
		this.neck.mirror = true;
		this.setRotation(this.neck, -1.48353f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.body.setRotationPoint(0.0f, -23.0f, -42.5f);
		this.body.setTextureSize(128, 128);
		this.body.mirror = true;
		this.setRotation(this.body, -1.64061f, 0.0f, 0.0f);
		(this.body2 = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.body2.setRotationPoint(0.0f, -5.5f, -43.5f);
		this.body2.setTextureSize(128, 128);
		this.body2.mirror = true;
		this.setRotation(this.body2, -1.64061f, 0.0f, 0.0f);
		(this.body3 = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.body3.setRotationPoint(0.0f, 9.0f, -38.5f);
		this.body3.setTextureSize(128, 128);
		this.body3.mirror = true;
		this.setRotation(this.body3, -1.27409f, 0.0f, 0.0f);
		(this.body4 = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.body4.setRotationPoint(0.0f, 18.0f, -26.5f);
		this.body4.setTextureSize(128, 128);
		this.body4.mirror = true;
		this.setRotation(this.body4, -0.715585f, 0.0f, 0.0f);
		(this.body5 = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.body5.setRotationPoint(0.0f, 18.0f, -11.5f);
		this.body5.setTextureSize(128, 128);
		this.body5.mirror = true;
		this.setRotation(this.body5, -0.0872665f, 0.0f, 0.0f);
		(this.body6 = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.body6.setRotationPoint(0.0f, 18.0f, 6.0f);
		this.body6.setTextureSize(128, 128);
		this.body6.mirror = true;
		this.setRotation(this.body6, 0.0f, 0.0f, 0.0f);
		(this.body7 = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.body7.setRotationPoint(0.0f, 18.0f, 24.0f);
		this.body7.setTextureSize(128, 128);
		this.body7.mirror = true;
		this.setRotation(this.body7, 0.0f, 0.0f, 0.0f);
		(this.body8 = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.body8.setRotationPoint(0.0f, 18.0f, 42.0f);
		this.body8.setTextureSize(128, 128);
		this.body8.mirror = true;
		this.setRotation(this.body8, 0.0f, 0.0f, 0.0f);
		(this.body9 = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.body9.setRotationPoint(0.0f, 18.0f, 60.0f);
		this.body9.setTextureSize(128, 128);
		this.body9.mirror = true;
		this.setRotation(this.body9, 0.0f, 0.0f, 0.0f);
		(this.body10 = new ModelRenderer(this, 0, 46)).addBox(-8.0f, -6.0f, -18.0f, 16, 12, 18);
		this.body10.setRotationPoint(0.0f, 18.0f, 78.0f);
		this.body10.setTextureSize(128, 128);
		this.body10.mirror = true;
		this.setRotation(this.body10, 0.0f, 0.0f, 0.0f);
		(this.tooth = new ModelRenderer(this, 62, 0)).addBox(-6.0f, 0.0f, -15.0f, 12, 3, 15);
		this.tooth.setRotationPoint(0.0f, -48.0f, -49.0f);
		this.tooth.setTextureSize(128, 128);
		this.tooth.mirror = true;
		this.setRotation(this.tooth, 0.0349066f, 0.0f, 0.0f);
		(this.Shape1 = new ModelRenderer(this, 0, 76)).addBox(-7.5f, -1.0f, 0.0f, 15, 2, 5);
		this.Shape1.setRotationPoint(0.0f, -56.5f, -38.0f);
		this.Shape1.setTextureSize(128, 128);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.4363323f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.head.render(f5);
		this.mouth.render(f5);
		this.neck.render(f5);
		this.body.render(f5);
		this.body2.render(f5);
		this.body3.render(f5);
		this.body4.render(f5);
		this.body5.render(f5);
		this.body6.render(f5);
		this.body7.render(f5);
		this.body8.render(f5);
		this.body9.render(f5);
		this.body10.render(f5);
		this.tooth.render(f5);
		this.Shape1.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
