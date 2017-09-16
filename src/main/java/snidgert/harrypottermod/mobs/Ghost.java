package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Ghost extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;

	public Ghost() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		this.head.setRotationPoint(0.0f, -4.0f, 0.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		this.body.setRotationPoint(0.0f, -4.0f, 0.0f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.rightarm = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		this.rightarm.setRotationPoint(-5.0f, -2.0f, 0.0f);
		this.rightarm.setTextureSize(64, 32);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
		(this.leftarm = new ModelRenderer(this, 40, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		this.leftarm.setRotationPoint(5.0f, -2.0f, 0.0f);
		this.leftarm.setTextureSize(64, 32);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
		(this.rightleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, 0.0f, 4, 12, 4);
		this.rightleg.setRotationPoint(-2.0f, 8.0f, -2.0f);
		this.rightleg.setTextureSize(64, 32);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.1745329f, 0.0f, 0.0f);
		(this.leftleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, 0.0f, 4, 12, 4);
		this.leftleg.setRotationPoint(2.0f, 8.0f, -2.0f);
		this.leftleg.setTextureSize(64, 32);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.1745329f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.head.render(f5);
		this.body.render(f5);
		this.rightarm.render(f5);
		this.leftarm.render(f5);
		this.rightleg.render(f5);
		this.leftleg.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
