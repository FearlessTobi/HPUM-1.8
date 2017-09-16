package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Gnome extends ModelBase {

	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leftarm;
	ModelRenderer rightarm;
	ModelRenderer rigthleg;
	ModelRenderer leftleg;
	ModelRenderer leftear;
	ModelRenderer rightear;
	ModelRenderer Shape1;

	public Gnome() {
		super.textureWidth = 64;
		super.textureHeight = 32;
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -6.0f, -3.0f, 6, 6, 6);
		this.head.setRotationPoint(0.0f, 15.0f, 0.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 0, 12)).addBox(-3.0f, 0.0f, -2.0f, 6, 6, 4);
		this.body.setRotationPoint(0.0f, 15.0f, 0.0f);
		this.body.setTextureSize(64, 32);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.leftarm = new ModelRenderer(this, 0, 22)).addBox(0.0f, -1.0f, -1.0f, 2, 6, 2);
		this.leftarm.setRotationPoint(3.0f, 16.0f, 0.0f);
		this.leftarm.setTextureSize(64, 32);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
		(this.rightarm = new ModelRenderer(this, 0, 22)).addBox(-2.0f, -1.0f, -1.0f, 2, 6, 2);
		this.rightarm.setRotationPoint(-3.0f, 16.0f, 0.0f);
		this.rightarm.setTextureSize(64, 32);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
		(this.rigthleg = new ModelRenderer(this, 25, 0)).addBox(-1.5f, 0.0f, -1.5f, 3, 3, 3);
		this.rigthleg.setRotationPoint(-1.5f, 21.0f, 0.0f);
		this.rigthleg.setTextureSize(64, 32);
		this.rigthleg.mirror = true;
		this.setRotation(this.rigthleg, 0.0f, 0.0f, 0.0f);
		(this.leftleg = new ModelRenderer(this, 25, 0)).addBox(-1.5f, 0.0f, -1.5f, 3, 3, 3);
		this.leftleg.setRotationPoint(1.5f, 21.0f, 0.0f);
		this.leftleg.setTextureSize(64, 32);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
		(this.leftear = new ModelRenderer(this, 0, 0)).addBox(0.0f, -1.0f, -0.5f, 1, 2, 1);
		this.leftear.setRotationPoint(3.0f, 12.0f, 0.0f);
		this.leftear.setTextureSize(64, 32);
		this.leftear.mirror = true;
		this.setRotation(this.leftear, 0.0f, 0.0f, 0.0f);
		(this.rightear = new ModelRenderer(this, 0, 0)).addBox(-1.0f, -1.0f, -0.5f, 1, 2, 1);
		this.rightear.setRotationPoint(-3.0f, 12.0f, 0.0f);
		this.rightear.setTextureSize(64, 32);
		this.rightear.mirror = true;
		this.setRotation(this.rightear, 0.0f, 0.0f, 0.0f);
		(this.Shape1 = new ModelRenderer(this, 25, 12)).addBox(-1.0f, 0.0f, -1.0f, 2, 2, 1);
		this.Shape1.setRotationPoint(0.0f, 12.0f, -3.0f);
		this.Shape1.setTextureSize(64, 32);
		this.Shape1.mirror = true;
		this.setRotation(this.Shape1, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.head.render(par7);
		this.body.render(par7);
		this.leftarm.render(par7);
		this.rightarm.render(par7);
		this.rigthleg.render(par7);
		this.leftleg.render(par7);
		this.leftear.render(par7);
		this.rightear.render(par7);
		this.Shape1.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.leftleg.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rigthleg.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.leftarm.rotateAngleX = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
