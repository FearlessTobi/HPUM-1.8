package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class StoneSoldierBlock extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer helmet;
	ModelRenderer chestmateleftarm;
	ModelRenderer chestmaterightarm;
	ModelRenderer chestplate;
	ModelRenderer leggingleftleg;
	ModelRenderer leggingrightleg;
	ModelRenderer bootleftleg;
	ModelRenderer bootrightleg;
	ModelRenderer weapon;
	ModelRenderer weapon1;
	ModelRenderer weapon2;
	ModelRenderer shield;

	public StoneSoldierBlock() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		this.head.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.head.setTextureSize(128, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		this.body.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.body.setTextureSize(128, 64);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.rightarm = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		this.rightarm.setRotationPoint(-5.0f, 2.0f, 0.0f);
		this.rightarm.setTextureSize(128, 64);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, -1.570796f, 0.0f, 0.0f);
		(this.leftarm = new ModelRenderer(this, 40, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		this.leftarm.setRotationPoint(5.0f, 2.0f, 0.0f);
		this.leftarm.setTextureSize(128, 64);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
		(this.rightleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		this.rightleg.setRotationPoint(-2.0f, 12.0f, 0.0f);
		this.rightleg.setTextureSize(128, 64);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
		(this.leftleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		this.leftleg.setRotationPoint(2.0f, 12.0f, 0.0f);
		this.leftleg.setTextureSize(128, 64);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
		(this.helmet = new ModelRenderer(this, 92, 0)).addBox(-4.5f, -9.0f, -4.5f, 9, 9, 9);
		this.helmet.setRotationPoint(0.0f, 0.1f, 0.0f);
		this.helmet.setTextureSize(128, 64);
		this.helmet.mirror = true;
		this.setRotation(this.helmet, 0.0f, 0.0f, 0.0f);
		(this.chestmateleftarm = new ModelRenderer(this, 56, 18)).addBox(-2.5f, -2.5f, -2.5f, 5, 5, 5);
		this.chestmateleftarm.setRotationPoint(6.0f, 2.0f, 0.0f);
		this.chestmateleftarm.setTextureSize(128, 64);
		this.chestmateleftarm.mirror = true;
		this.setRotation(this.chestmateleftarm, -0.0174533f, 0.0f, 0.0f);
		(this.chestmaterightarm = new ModelRenderer(this, 56, 18)).addBox(-2.5f, -2.5f, -2.5f, 5, 5, 5);
		this.chestmaterightarm.setRotationPoint(-6.0f, 2.0f, 0.0f);
		this.chestmaterightarm.setTextureSize(128, 64);
		this.chestmaterightarm.mirror = true;
		this.setRotation(this.chestmaterightarm, -1.58825f, 0.0f, 0.0f);
		(this.chestplate = new ModelRenderer(this, 76, 18)).addBox(-4.5f, 0.0f, -2.5f, 9, 12, 5);
		this.chestplate.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.chestplate.setTextureSize(128, 64);
		this.chestplate.mirror = true;
		this.setRotation(this.chestplate, 0.0f, 0.0f, 0.0f);
		(this.leggingleftleg = new ModelRenderer(this, 108, 18)).addBox(-2.5f, 0.0f, -2.5f, 5, 6, 5);
		this.leggingleftleg.setRotationPoint(2.0f, 12.0f, 0.0f);
		this.leggingleftleg.setTextureSize(128, 64);
		this.leggingleftleg.mirror = true;
		this.setRotation(this.leggingleftleg, 0.0f, 0.0f, 0.0f);
		(this.leggingrightleg = new ModelRenderer(this, 108, 18)).addBox(-2.5f, 0.0f, -2.5f, 5, 6, 5);
		this.leggingrightleg.setRotationPoint(-2.0f, 12.0f, 0.0f);
		this.leggingrightleg.setTextureSize(128, 64);
		this.leggingrightleg.mirror = true;
		this.setRotation(this.leggingrightleg, 0.0f, 0.0f, 0.0f);
		(this.bootleftleg = new ModelRenderer(this, 108, 30)).addBox(-2.5f, -2.5f, -2.5f, 5, 5, 5);
		this.bootleftleg.setRotationPoint(2.0f, 21.5f, 0.0f);
		this.bootleftleg.setTextureSize(128, 64);
		this.bootleftleg.mirror = true;
		this.setRotation(this.bootleftleg, 0.0f, 0.0f, 0.0f);
		(this.bootrightleg = new ModelRenderer(this, 108, 30)).addBox(-2.5f, -2.5f, -2.5f, 5, 5, 5);
		this.bootrightleg.setRotationPoint(-2.0f, 21.5f, 0.0f);
		this.bootrightleg.setTextureSize(128, 64);
		this.bootrightleg.mirror = true;
		this.setRotation(this.bootrightleg, 0.0f, 0.0f, 0.0f);
		(this.weapon = new ModelRenderer(this, 0, 32)).addBox(-0.5f, -0.5f, -12.5f, 1, 1, 25);
		this.weapon.setRotationPoint(-6.0f, 0.0f, -9.0f);
		this.weapon.setTextureSize(128, 64);
		this.weapon.mirror = true;
		this.setRotation(this.weapon, -1.570796f, 0.0f, 0.0f);
		(this.weapon1 = new ModelRenderer(this, 0, 47)).addBox(-0.5f, 0.0f, -3.0f, 1, 3, 6);
		this.weapon1.setRotationPoint(-6.0f, -8.0f, -9.5f);
		this.weapon1.setTextureSize(128, 64);
		this.weapon1.mirror = true;
		this.setRotation(this.weapon1, -1.570796f, 0.0f, 0.0f);
		(this.weapon2 = new ModelRenderer(this, 0, 38)).addBox(-0.5f, -2.0f, -2.0f, 1, 2, 4);
		this.weapon2.setRotationPoint(-6.0f, -8.0f, -8.6f);
		this.weapon2.setTextureSize(128, 64);
		this.weapon2.mirror = true;
		this.setRotation(this.weapon2, -1.570796f, 0.0f, 0.0f);
		(this.shield = new ModelRenderer(this, 31, 34)).addBox(-5.0f, -6.0f, -1.0f, 10, 12, 1);
		this.shield.setRotationPoint(6.0f, 11.0f, -2.0f);
		this.shield.setTextureSize(128, 64);
		this.shield.mirror = true;
		this.setRotation(this.shield, 0.0872665f, -0.1047198f, 0.0f);
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
		this.helmet.render(f5);
		this.chestmateleftarm.render(f5);
		this.chestmaterightarm.render(f5);
		this.chestplate.render(f5);
		this.leggingleftleg.render(f5);
		this.leggingrightleg.render(f5);
		this.bootleftleg.render(f5);
		this.bootrightleg.render(f5);
		this.weapon.render(f5);
		this.weapon1.render(f5);
		this.weapon2.render(f5);
		this.shield.render(f5);
	}

	public void renderModel(final float f) {
		this.head.render(f);
		this.body.render(f);
		this.rightarm.render(f);
		this.leftarm.render(f);
		this.rightleg.render(f);
		this.leftleg.render(f);
		this.helmet.render(f);
		this.chestmateleftarm.render(f);
		this.chestmaterightarm.render(f);
		this.chestplate.render(f);
		this.leggingleftleg.render(f);
		this.leggingrightleg.render(f);
		this.bootleftleg.render(f);
		this.bootrightleg.render(f);
		this.weapon.render(f);
		this.weapon1.render(f);
		this.weapon2.render(f);
		this.shield.render(f);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
	}
}
