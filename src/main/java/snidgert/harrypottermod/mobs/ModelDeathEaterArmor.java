package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDeathEaterArmor extends ModelBiped {

	ModelRenderer head;
	ModelRenderer Chest;
	ModelRenderer upperleftrobe;
	ModelRenderer lowerleftrobe;
	ModelRenderer upperrightrobe;
	ModelRenderer lowerrightrobe;
	ModelRenderer belt;
	ModelRenderer leftshoulder;
	ModelRenderer rightshoulder;
	ModelRenderer leftgauntlet;
	ModelRenderer rightgauntlet;

	public ModelDeathEaterArmor(final float scale) {
		super(scale, 0.0f, 128, 128);
		((ModelBase) this).textureWidth = 128;
		((ModelBase) this).textureHeight = 128;
		(this.head = new ModelRenderer(this, 0, 100)).addBox(-4.5f, -8.5f, -4.5f, 9, 9, 9, scale / 2.0f);
		this.head.setTextureSize(64, 32);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		super.bipedHead.addChild(this.head);
		(this.Chest = new ModelRenderer(this, 60, 50)).addBox(-4.0f, 0.0f, -2.5f, 8, 12, 5, scale / 2.0f);
		this.Chest.setTextureSize(128, 128);
		this.Chest.mirror = true;
		this.setRotation(this.Chest, 0.0f, 0.0f, 0.0f);
		super.bipedBody.addChild(this.Chest);
		(this.upperleftrobe = new ModelRenderer(this, 75, 85)).addBox(-2.0f, 0.0f, -2.5f, 4, 4, 5, scale / 2.0f);
		this.upperleftrobe.setTextureSize(128, 128);
		this.upperleftrobe.mirror = true;
		this.setRotation(this.upperleftrobe, 0.0f, 0.0f, 0.0f);
		super.bipedLeftLeg.addChild(this.upperleftrobe);
		(this.lowerleftrobe = new ModelRenderer(this, 75, 100)).addBox(-2.0f, 4.0f, -3.0f, 5, 8, 6, scale / 2.0f);
		this.lowerleftrobe.setTextureSize(128, 128);
		this.lowerleftrobe.mirror = true;
		this.setRotation(this.lowerleftrobe, 0.0f, 0.0f, 0.0f);
		super.bipedLeftLeg.addChild(this.lowerleftrobe);
		(this.upperrightrobe = new ModelRenderer(this, 50, 85)).addBox(-2.0f, 0.0f, -2.5f, 4, 4, 5, scale / 2.0f);
		this.upperrightrobe.setTextureSize(128, 128);
		this.upperrightrobe.mirror = true;
		this.setRotation(this.upperrightrobe, 0.0f, 0.0f, 0.0f);
		super.bipedRightLeg.addChild(this.upperrightrobe);
		(this.lowerrightrobe = new ModelRenderer(this, 50, 100)).addBox(-3.0f, 4.0f, -3.0f, 5, 8, 6, scale / 2.0f);
		this.lowerrightrobe.setTextureSize(128, 128);
		this.lowerrightrobe.mirror = true;
		this.setRotation(this.lowerrightrobe, 0.0f, 0.0f, 0.0f);
		super.bipedRightLeg.addChild(this.lowerrightrobe);
		(this.belt = new ModelRenderer(this, 57, 70)).addBox(-4.5f, 11.0f, -3.0f, 9, 1, 6, scale / 2.0f);
		this.belt.setTextureSize(128, 128);
		this.belt.mirror = true;
		this.setRotation(this.belt, 0.0f, 0.0f, 0.0f);
		super.bipedBody.addChild(this.belt);
		(this.leftshoulder = new ModelRenderer(this, 90, 40)).addBox(-1.0f, -2.5f, -3.0f, 5, 5, 6, scale / 2.0f);
		this.leftshoulder.setTextureSize(128, 128);
		this.leftshoulder.mirror = true;
		this.setRotation(this.leftshoulder, 0.0f, 0.0f, 0.0f);
		super.bipedLeftArm.addChild(this.leftshoulder);
		(this.rightshoulder = new ModelRenderer(this, 30, 40)).addBox(-4.0f, -2.5f, -3.0f, 5, 5, 6, scale / 2.0f);
		this.rightshoulder.setTextureSize(128, 128);
		this.rightshoulder.mirror = true;
		this.setRotation(this.rightshoulder, 0.0f, 0.0f, 0.0f);
		super.bipedRightArm.addChild(this.rightshoulder);
		(this.leftgauntlet = new ModelRenderer(this, 100, 60)).addBox(3.0f, 4.0f, -1.5f, 1, 5, 3, scale / 2.0f);
		this.leftgauntlet.setTextureSize(128, 128);
		this.leftgauntlet.mirror = true;
		this.setRotation(this.leftgauntlet, 0.0f, 0.0f, 0.0f);
		super.bipedLeftArm.addChild(this.leftgauntlet);
		(this.rightgauntlet = new ModelRenderer(this, 40, 57)).addBox(-4.0f, 4.0f, -1.5f, 1, 5, 3, scale / 2.0f);
		this.rightgauntlet.setTextureSize(128, 128);
		this.rightgauntlet.mirror = true;
		this.setRotation(this.rightgauntlet, 0.0f, 0.0f, 0.0f);
		super.bipedRightArm.addChild(this.rightgauntlet);
	}

	@Override
	public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
