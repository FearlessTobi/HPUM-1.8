package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WandCrafter extends ModelBase {

	ModelRenderer tabletop;
	ModelRenderer powderbottle1;
	ModelRenderer powderbottle2;
	ModelRenderer powderbottle3;
	ModelRenderer powderbottle4;
	ModelRenderer powerpowderfull;
	ModelRenderer wandstand1;
	ModelRenderer wandstand2;
	ModelRenderer wand;
	ModelRenderer tableleg1;
	ModelRenderer tableleg2;
	ModelRenderer tableleg3;
	ModelRenderer tableleg4;
	ModelRenderer plate;

	public WandCrafter() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.tabletop = new ModelRenderer(this, 0, 0)).addBox(-8.0f, 0.0f, -8.0f, 16, 7, 16);
		this.tabletop.setRotationPoint(0.0f, 14.0f, 0.0f);
		this.tabletop.setTextureSize(128, 64);
		this.tabletop.mirror = true;
		this.setRotation(this.tabletop, 0.0f, 0.0f, 0.0f);
		(this.powderbottle1 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -1.0f, 0.0f, 4, 2, 1);
		this.powderbottle1.setRotationPoint(-4.0f, 13.0f, 5.0f);
		this.powderbottle1.setTextureSize(128, 64);
		this.powderbottle1.mirror = true;
		this.setRotation(this.powderbottle1, 0.0f, 0.0f, 0.0f);
		(this.powderbottle2 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -1.0f, -1.0f, 4, 2, 1);
		this.powderbottle2.setRotationPoint(-4.0f, 13.0f, 1.0f);
		this.powderbottle2.setTextureSize(128, 64);
		this.powderbottle2.mirror = true;
		this.setRotation(this.powderbottle2, 0.0f, 0.0f, 0.0f);
		(this.powderbottle3 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -1.0f, 0.0f, 4, 2, 1);
		this.powderbottle3.setRotationPoint(-5.0f, 13.0f, 3.0f);
		this.powderbottle3.setTextureSize(128, 64);
		this.powderbottle3.mirror = true;
		this.setRotation(this.powderbottle3, 0.0f, -1.570796f, 0.0f);
		(this.powderbottle4 = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -1.0f, 0.0f, 4, 2, 1);
		this.powderbottle4.setRotationPoint(-3.0f, 13.0f, 3.0f);
		this.powderbottle4.setTextureSize(128, 64);
		this.powderbottle4.mirror = true;
		this.setRotation(this.powderbottle4, 0.0f, 1.570796f, 0.0f);
		(this.powerpowderfull = new ModelRenderer(this, 0, 3)).addBox(-1.0f, -1.0f, -2.0f, 2, 2, 4);
		this.powerpowderfull.setRotationPoint(-4.0f, 13.3f, 3.0f);
		this.powerpowderfull.setTextureSize(128, 64);
		this.powerpowderfull.mirror = true;
		this.setRotation(this.powerpowderfull, 0.0f, 0.0f, 0.0f);
		(this.wandstand1 = new ModelRenderer(this, 0, 10)).addBox(-0.5f, -2.0f, -1.0f, 1, 2, 2);
		this.wandstand1.setRotationPoint(0.0f, 14.0f, -4.0f);
		this.wandstand1.setTextureSize(128, 64);
		this.wandstand1.mirror = true;
		this.setRotation(this.wandstand1, 0.0f, 0.0f, 0.0f);
		(this.wandstand2 = new ModelRenderer(this, 0, 10)).addBox(-0.5f, -2.0f, -1.0f, 1, 2, 2);
		this.wandstand2.setRotationPoint(4.0f, 14.0f, -4.0f);
		this.wandstand2.setTextureSize(128, 64);
		this.wandstand2.mirror = true;
		this.setRotation(this.wandstand2, 0.0f, 0.0f, 0.0f);
		(this.wand = new ModelRenderer(this, 51, 0)).addBox(-4.0f, -0.5f, -0.5f, 8, 1, 1);
		this.wand.setRotationPoint(2.0f, 12.0f, -4.0f);
		this.wand.setTextureSize(128, 64);
		this.wand.mirror = true;
		this.setRotation(this.wand, 0.0f, 0.0f, 0.0f);
		(this.tableleg1 = new ModelRenderer(this, 0, 23)).addBox(-1.0f, 0.0f, -1.0f, 2, 9, 2);
		this.tableleg1.setRotationPoint(-6.0f, 15.0f, -6.0f);
		this.tableleg1.setTextureSize(128, 64);
		this.tableleg1.mirror = true;
		this.setRotation(this.tableleg1, 0.0f, 0.0f, 0.0f);
		(this.tableleg2 = new ModelRenderer(this, 0, 23)).addBox(-1.0f, 0.0f, -1.0f, 2, 9, 2);
		this.tableleg2.setRotationPoint(6.0f, 15.0f, -6.0f);
		this.tableleg2.setTextureSize(128, 64);
		this.tableleg2.mirror = true;
		this.setRotation(this.tableleg2, 0.0f, 0.0f, 0.0f);
		(this.tableleg3 = new ModelRenderer(this, 0, 23)).addBox(-1.0f, 0.0f, -1.0f, 2, 9, 2);
		this.tableleg3.setRotationPoint(6.0f, 16.0f, 6.0f);
		this.tableleg3.setTextureSize(128, 64);
		this.tableleg3.mirror = true;
		this.setRotation(this.tableleg3, 0.0f, 0.0f, 0.0f);
		(this.tableleg4 = new ModelRenderer(this, 0, 23)).addBox(-1.0f, 0.0f, -1.0f, 2, 9, 2);
		this.tableleg4.setRotationPoint(-6.0f, 15.0f, 6.0f);
		this.tableleg4.setTextureSize(128, 64);
		this.tableleg4.mirror = true;
		this.setRotation(this.tableleg4, 0.0f, 0.0f, 0.0f);
		(this.plate = new ModelRenderer(this, 50, 3)).addBox(-3.0f, 0.0f, -3.0f, 6, 1, 6);
		this.plate.setRotationPoint(3.0f, 13.0f, 3.0f);
		this.plate.setTextureSize(128, 64);
		this.plate.mirror = true;
		this.setRotation(this.plate, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5);
		this.tabletop.render(f5);
		this.powderbottle1.render(f5);
		this.powderbottle2.render(f5);
		this.powderbottle3.render(f5);
		this.powderbottle4.render(f5);
		this.powerpowderfull.render(f5);
		this.wandstand1.render(f5);
		this.wandstand2.render(f5);
		this.wand.render(f5);
		this.tableleg1.render(f5);
		this.tableleg2.render(f5);
		this.tableleg3.render(f5);
		this.tableleg4.render(f5);
		this.plate.render(f5);
	}

	public void renderModel(final float f) {
		this.tabletop.render(f);
		this.powderbottle1.render(f);
		this.powderbottle2.render(f);
		this.powderbottle3.render(f);
		this.powderbottle4.render(f);
		this.powerpowderfull.render(f);
		this.wandstand1.render(f);
		this.wandstand2.render(f);
		this.wand.render(f);
		this.tableleg1.render(f);
		this.tableleg2.render(f);
		this.tableleg3.render(f);
		this.tableleg4.render(f);
		this.plate.render(f);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
