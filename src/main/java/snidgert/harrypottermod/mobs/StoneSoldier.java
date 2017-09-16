package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class StoneSoldier extends ModelBase {

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

	public StoneSoldier() {
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
		(this.bootleftleg = new ModelRenderer(this, 108, 30)).addBox(-2.5f, 7.0f, -2.5f, 5, 5, 5);
		this.bootleftleg.setRotationPoint(2.0f, 12.0f, 0.0f);
		this.bootleftleg.setTextureSize(128, 64);
		this.bootleftleg.mirror = true;
		this.setRotation(this.bootleftleg, 0.0f, 0.0f, 0.0f);
		(this.bootrightleg = new ModelRenderer(this, 108, 30)).addBox(-2.5f, 7.0f, -2.5f, 5, 5, 5);
		this.bootrightleg.setRotationPoint(-2.0f, 12.0f, 0.0f);
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
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.head.render(par7);
		this.body.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
		this.rightleg.render(par7);
		this.leftleg.render(par7);
		this.helmet.render(par7);
		this.chestmateleftarm.render(par7);
		this.chestmaterightarm.render(par7);
		this.chestplate.render(par7);
		this.leggingleftleg.render(par7);
		this.leggingrightleg.render(par7);
		this.bootleftleg.render(par7);
		this.bootrightleg.render(par7);
		this.weapon.render(par7);
		this.weapon1.render(par7);
		this.weapon2.render(par7);
		this.shield.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.leftleg.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.bootleftleg.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.bootrightleg.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leggingleftleg.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leggingrightleg.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
