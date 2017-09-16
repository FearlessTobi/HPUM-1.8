package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DarkMark extends ModelBase {

	ModelRenderer head;
	ModelRenderer snakebody;
	ModelRenderer snakehead;

	public DarkMark() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -4.0f, 8, 8, 8);
		this.head.setRotationPoint(0.0f, 13.0f, 3.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.snakebody = new ModelRenderer(this, 32, 0)).addBox(-1.0f, -1.0f, -5.0f, 2, 2, 5);
		this.snakebody.setRotationPoint(0.0f, 16.0f, 0.0f);
		this.snakebody.setTextureSize(64, 32);
		this.snakebody.mirror = true;
		this.setRotation(this.snakebody, 0.5235988f, 0.0f, 0.0f);
		(this.snakehead = new ModelRenderer(this, 46, 0)).addBox(-1.5f, -1.0f, -3.0f, 3, 2, 3);
		this.snakehead.setRotationPoint(0.0f, 18.5f, -3.8f);
		this.snakehead.setTextureSize(64, 32);
		this.snakehead.mirror = true;
		this.setRotation(this.snakehead, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.head.render(f5);
		this.snakebody.render(f5);
		this.snakehead.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void renderModel(final float f) {
		this.head.render(f);
		this.snakebody.render(f);
		this.snakehead.render(f);
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
