package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BoggartChestOpen extends ModelBase {

	ModelRenderer Bottum;
	ModelRenderer Top;
	ModelRenderer Lock;

	public BoggartChestOpen() {
		super.textureWidth = 128;
		super.textureHeight = 128;
		(this.Bottum = new ModelRenderer(this, 0, 0)).addBox(-8.0f, -4.0f, -16.0f, 16, 4, 16);
		this.Bottum.setRotationPoint(0.0f, 12.0f, 8.0f);
		this.Bottum.setTextureSize(128, 128);
		this.Bottum.mirror = true;
		this.setRotation(this.Bottum, -1.570796f, 0.0f, 0.0f);
		(this.Top = new ModelRenderer(this, 0, 29)).addBox(0.0f, 0.0f, 0.0f, 16, 12, 16);
		this.Top.setRotationPoint(-8.0f, 12.0f, -8.0f);
		this.Top.setTextureSize(128, 128);
		this.Top.mirror = true;
		this.setRotation(this.Top, 0.0f, 0.0f, 0.0f);
		(this.Lock = new ModelRenderer(this, 5, 63)).addBox(-1.0f, -2.0f, -18.0f, 2, 4, 2);
		this.Lock.setRotationPoint(0.0f, 12.0f, 8.0f);
		this.Lock.setTextureSize(128, 128);
		this.Lock.mirror = true;
		this.setRotation(this.Lock, -1.570796f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.Bottum.render(f5);
		this.Top.render(f5);
		this.Lock.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void renderModel(final float f) {
		this.Bottum.render(f);
		this.Top.render(f);
		this.Lock.render(f);
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
