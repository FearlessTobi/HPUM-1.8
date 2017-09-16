package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Horklump extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer tophead;
	ModelRenderer picks;
	ModelRenderer picks2;
	ModelRenderer root1;
	ModelRenderer root2;
	ModelRenderer root3;
	ModelRenderer root4;

	public Horklump() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-6.0f, -2.0f, -6.0f, 12, 4, 12);
		this.head.setRotationPoint(0.0f, 14.0f, 0.0f);
		this.head.setTextureSize(128, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 0, 16)).addBox(-2.5f, 0.0f, -2.5f, 5, 8, 5);
		this.body.setRotationPoint(0.0f, 16.0f, 0.0f);
		this.body.setTextureSize(128, 64);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.tophead = new ModelRenderer(this, 20, 16)).addBox(-4.0f, -1.0f, -4.0f, 8, 2, 8);
		this.tophead.setRotationPoint(0.0f, 11.0f, 0.0f);
		this.tophead.setTextureSize(128, 64);
		this.tophead.mirror = true;
		this.setRotation(this.tophead, 0.0f, 0.0f, 0.0f);
		(this.picks = new ModelRenderer(this, 9, 29)).addBox(-5.5f, -2.0f, -5.5f, 11, 2, 11);
		this.picks.setRotationPoint(0.0f, 12.0f, 0.0f);
		this.picks.setTextureSize(128, 64);
		this.picks.mirror = true;
		this.setRotation(this.picks, 0.0f, 0.0f, 0.0f);
		(this.picks2 = new ModelRenderer(this, 17, 42)).addBox(-3.5f, -1.0f, -3.5f, 7, 2, 7);
		this.picks2.setRotationPoint(0.0f, 9.0f, 0.0f);
		this.picks2.setTextureSize(128, 64);
		this.picks2.mirror = true;
		this.setRotation(this.picks2, 0.0f, 0.0f, 0.0f);
		(this.root1 = new ModelRenderer(this, 65, 0)).addBox(-1.0f, 0.0f, 0.0f, 2, 1, 6);
		this.root1.setRotationPoint(0.0f, 23.0f, 2.0f);
		this.root1.setTextureSize(128, 64);
		this.root1.mirror = true;
		this.setRotation(this.root1, 0.0f, 0.0f, 0.0f);
		(this.root2 = new ModelRenderer(this, 65, 0)).addBox(-1.0f, 0.0f, -6.0f, 2, 1, 6);
		this.root2.setRotationPoint(0.0f, 23.0f, -2.0f);
		this.root2.setTextureSize(128, 64);
		this.root2.mirror = true;
		this.setRotation(this.root2, 0.0f, 0.0f, 0.0f);
		(this.root3 = new ModelRenderer(this, 65, 0)).addBox(-1.0f, 0.0f, 0.0f, 2, 1, 6);
		this.root3.setRotationPoint(2.0f, 23.0f, 0.0f);
		this.root3.setTextureSize(128, 64);
		this.root3.mirror = true;
		this.setRotation(this.root3, 0.0f, 1.570796f, 0.0f);
		(this.root4 = new ModelRenderer(this, 65, 0)).addBox(-1.0f, 0.0f, 0.0f, 2, 1, 6);
		this.root4.setRotationPoint(-2.0f, 23.0f, 0.0f);
		this.root4.setTextureSize(128, 64);
		this.root4.mirror = true;
		this.setRotation(this.root4, 0.0f, -1.570796f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.head.render(f5);
		this.body.render(f5);
		this.tophead.render(f5);
		this.picks.render(f5);
		this.picks2.render(f5);
		this.root1.render(f5);
		this.root2.render(f5);
		this.root3.render(f5);
		this.root4.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
