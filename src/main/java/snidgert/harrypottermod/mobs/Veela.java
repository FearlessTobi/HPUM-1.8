package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Veela extends ModelBase {

	public ModelRenderer head;
	ModelRenderer body;
	public ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer head2;
	ModelRenderer boobs;

	public Veela() {
		super.textureWidth = 64;
		super.textureHeight = 64;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		this.head.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.head.setTextureSize(64, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		this.body.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.body.setTextureSize(64, 64);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.rightarm = new ModelRenderer(this, 40, 16)).addBox(-2.0f, -2.0f, -2.0f, 3, 12, 4);
		this.rightarm.setRotationPoint(-5.0f, 2.0f, 0.0f);
		this.rightarm.setTextureSize(64, 64);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, -1.570796f, 0.0f, 0.0f);
		(this.leftarm = new ModelRenderer(this, 32, 48)).addBox(-1.0f, -2.0f, -2.0f, 3, 12, 4);
		this.leftarm.setRotationPoint(5.0f, 2.0f, 0.0f);
		this.leftarm.setTextureSize(64, 64);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
		(this.rightleg = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		this.rightleg.setRotationPoint(-2.0f, 12.0f, 0.0f);
		this.rightleg.setTextureSize(64, 64);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
		(this.leftleg = new ModelRenderer(this, 16, 48)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		this.leftleg.setRotationPoint(2.0f, 12.0f, 0.0f);
		this.leftleg.setTextureSize(64, 64);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
		(this.head2 = new ModelRenderer(this, 32, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		this.head2.setRotationPoint(0.0f, 0.0f, 0.0f);
		this.head2.setTextureSize(64, 64);
		this.head2.mirror = true;
		this.setRotation(this.head2, 0.0f, 0.0f, 0.0f);
		(this.boobs = new ModelRenderer(this, 0, 32)).addBox(-3.0f, -1.5f, -1.0f, 6, 3, 1);
		this.boobs.setRotationPoint(0.0f, 3.0f, -2.0f);
		this.boobs.setTextureSize(64, 64);
		this.boobs.mirror = true;
		this.setRotation(this.boobs, 0.0f, 0.0f, 0.0f);
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
		this.head2.render(par7);
		this.boobs.render(par7);
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
		this.leftarm.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
