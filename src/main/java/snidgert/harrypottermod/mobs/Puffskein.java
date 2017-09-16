package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Puffskein extends ModelBase {

	ModelRenderer Body;
	ModelRenderer Head;

	public Puffskein() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.Body = new ModelRenderer(this, 12, 0)).addBox(-4.0f, -4.0f, -4.0f, 8, 8, 8);
		this.Body.setRotationPoint(0.0f, 20.0f, 0.0f);
		this.Body.setTextureSize(64, 32);
		this.Body.mirror = true;
		this.setRotation(this.Body, 0.0f, 0.0f, 0.0f);
		(this.Head = new ModelRenderer(this, 0, 0)).addBox(-1.5f, -1.5f, -3.0f, 3, 3, 3);
		this.Head.setRotationPoint(0.0f, 22.0f, -2.0f);
		this.Head.setTextureSize(64, 32);
		this.Head.mirror = true;
		this.setRotation(this.Head, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Body.render(f5);
		this.Head.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
