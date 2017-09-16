package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Troll extends ModelBase {

	ModelRenderer righthear;
	ModelRenderer lethear;
	ModelRenderer mouth;
	ModelRenderer rightteth;
	ModelRenderer leftteth;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer eyebrows;
	ModelRenderer nose;

	public Troll() {
		super.textureWidth = 128;
		super.textureHeight = 64;
		(this.righthear = new ModelRenderer(this, 0, 0)).addBox(-2.0f, -1.5f, -1.0f, 2, 3, 2);
		this.righthear.setRotationPoint(-5.0f, -17.0f, 0.0f);
		this.righthear.setTextureSize(128, 64);
		this.righthear.mirror = true;
		this.setRotation(this.righthear, 0.0f, 0.0f, 0.0f);
		(this.lethear = new ModelRenderer(this, 0, 0)).addBox(0.0f, -1.5f, -1.0f, 2, 3, 2);
		this.lethear.setRotationPoint(5.0f, -17.0f, 0.0f);
		this.lethear.setTextureSize(128, 64);
		this.lethear.mirror = true;
		this.setRotation(this.lethear, 0.0f, 0.0f, 0.0f);
		(this.mouth = new ModelRenderer(this, 40, 4)).addBox(-3.0f, 0.0f, -1.0f, 6, 1, 1);
		this.mouth.setRotationPoint(0.0f, -14.0f, -5.0f);
		this.mouth.setTextureSize(128, 64);
		this.mouth.mirror = true;
		this.setRotation(this.mouth, 0.0f, 0.0f, 0.0f);
		(this.rightteth = new ModelRenderer(this, 30, 0)).addBox(-0.5f, -1.0f, -1.0f, 1, 1, 1);
		this.rightteth.setRotationPoint(-1.5f, -14.0f, -4.5f);
		this.rightteth.setTextureSize(128, 64);
		this.rightteth.mirror = true;
		this.setRotation(this.rightteth, 0.0f, 0.0f, 0.0f);
		(this.leftteth = new ModelRenderer(this, 30, 0)).addBox(-0.5f, -1.0f, -1.0f, 1, 1, 1);
		this.leftteth.setRotationPoint(1.5f, -14.0f, -4.5f);
		this.leftteth.setTextureSize(128, 64);
		this.leftteth.mirror = true;
		this.setRotation(this.leftteth, 0.0f, 0.0f, 0.0f);
		(this.head = new ModelRenderer(this, 0, 0)).addBox(-5.0f, -10.0f, -5.0f, 10, 10, 10);
		this.head.setRotationPoint(0.0f, -12.0f, 0.0f);
		this.head.setTextureSize(128, 64);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.body = new ModelRenderer(this, 32, 20)).addBox(-8.0f, 0.0f, -6.0f, 16, 18, 12);
		this.body.setRotationPoint(0.0f, -12.0f, 0.0f);
		this.body.setTextureSize(128, 64);
		this.body.mirror = true;
		this.setRotation(this.body, 0.0f, 0.0f, 0.0f);
		(this.rightarm = new ModelRenderer(this, 88, 20)).addBox(-6.0f, -2.0f, -3.0f, 6, 19, 6);
		this.rightarm.setRotationPoint(-8.0f, -10.0f, 0.0f);
		this.rightarm.setTextureSize(128, 64);
		this.rightarm.mirror = true;
		this.setRotation(this.rightarm, 0.0f, 0.0f, 0.0f);
		(this.leftarm = new ModelRenderer(this, 88, 20)).addBox(0.0f, -2.0f, -4.0f, 6, 19, 6);
		this.leftarm.setRotationPoint(8.0f, -10.0f, 0.0f);
		this.leftarm.setTextureSize(128, 64);
		this.leftarm.mirror = true;
		this.setRotation(this.leftarm, 0.0f, 0.0f, 0.0f);
		(this.rightleg = new ModelRenderer(this, 0, 20)).addBox(-4.0f, 0.0f, -4.0f, 8, 18, 8);
		this.rightleg.setRotationPoint(-4.0f, 6.0f, 0.0f);
		this.rightleg.setTextureSize(128, 64);
		this.rightleg.mirror = true;
		this.setRotation(this.rightleg, 0.0f, 0.0f, 0.0f);
		(this.leftleg = new ModelRenderer(this, 0, 20)).addBox(-4.0f, 0.0f, -4.0f, 8, 18, 8);
		this.leftleg.setRotationPoint(4.0f, 6.0f, 0.0f);
		this.leftleg.setTextureSize(128, 64);
		this.leftleg.mirror = true;
		this.setRotation(this.leftleg, 0.0f, 0.0f, 0.0f);
		(this.eyebrows = new ModelRenderer(this, 40, 0)).addBox(-5.0f, -1.0f, 0.0f, 10, 2, 1);
		this.eyebrows.setRotationPoint(0.0f, -19.0f, -6.0f);
		this.eyebrows.setTextureSize(128, 64);
		this.eyebrows.mirror = true;
		this.setRotation(this.eyebrows, 0.0f, 0.0f, 0.0f);
		(this.nose = new ModelRenderer(this, 0, 6)).addBox(-1.0f, 0.0f, 0.0f, 2, 3, 1);
		this.nose.setRotationPoint(0.0f, -18.0f, -5.7f);
		this.nose.setTextureSize(128, 64);
		this.nose.mirror = true;
		this.setRotation(this.nose, -0.0523599f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.righthear.render(par7);
		this.lethear.render(par7);
		this.mouth.render(par7);
		this.rightteth.render(par7);
		this.leftteth.render(par7);
		this.head.render(par7);
		this.body.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
		this.rightleg.render(par7);
		this.leftleg.render(par7);
		this.eyebrows.render(par7);
		this.nose.render(par7);
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
		this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}
