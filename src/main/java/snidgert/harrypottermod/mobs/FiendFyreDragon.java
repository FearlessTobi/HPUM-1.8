package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class FiendFyreDragon extends ModelBase {

	ModelRenderer right_foot;
	ModelRenderer right_foot_nail_1;
	ModelRenderer right_foot_nail_2;
	ModelRenderer right_foot_nail_3;
	ModelRenderer lower_right_leg;
	ModelRenderer right_back_nail;
	ModelRenderer upper_right_leg;
	ModelRenderer left_foot;
	ModelRenderer left_foot_nail_1;
	ModelRenderer left_foot_nail_2;
	ModelRenderer left_foot_nail_3;
	ModelRenderer lower_left_leg;
	ModelRenderer left_back_nail;
	ModelRenderer upper_left_leg;
	ModelRenderer lower_body;
	ModelRenderer upper_body;
	ModelRenderer neck_1;
	ModelRenderer neck_2;
	ModelRenderer head;
	ModelRenderer lower_nose;
	ModelRenderer upper_nose;
	ModelRenderer inner_right_arm;
	ModelRenderer middle_right_arm;
	ModelRenderer outer_right_arm;
	ModelRenderer right_wing;
	ModelRenderer inner_left_arm;
	ModelRenderer middle_left_arm;
	ModelRenderer outer_left_arm;
	ModelRenderer left_wing;
	ModelRenderer tail_1;
	ModelRenderer tail_2;
	ModelRenderer tail3;
	ModelRenderer tail5;
	ModelRenderer tail6;
	ModelRenderer left_hand;
	ModelRenderer right_hand;
	ModelRenderer yooyh1;
	ModelRenderer yooyh2;
	ModelRenderer yooyh3;
	ModelRenderer yooyh4;
	ModelRenderer yooyh5;
	ModelRenderer yooyh6;
	ModelRenderer yooyh7;
	ModelRenderer yooyh8;

	public FiendFyreDragon() {
		super.textureWidth = 512;
		super.textureHeight = 512;
		(this.right_foot = new ModelRenderer(this, 0, 0)).addBox(-0.5f, 16.0f, -11.0f, 7, 3, 7);
		this.right_foot.setRotationPoint(-10.5f, 5.0f, 28.0f);
		this.right_foot.setTextureSize(512, 512);
		this.right_foot.mirror = true;
		this.setRotation(this.right_foot, 0.0f, 0.0f, 0.0f);
		(this.right_foot_nail_1 = new ModelRenderer(this, 35, 0)).addBox(0.5f, 17.0f, -16.0f, 2, 2, 5);
		this.right_foot_nail_1.setRotationPoint(-10.5f, 5.0f, 28.0f);
		this.right_foot_nail_1.setTextureSize(512, 512);
		this.right_foot_nail_1.mirror = true;
		this.setRotation(this.right_foot_nail_1, 0.0f, -0.3490659f, 0.0f);
		(this.right_foot_nail_2 = new ModelRenderer(this, 35, 0)).addBox(2.0f, 17.0f, -16.0f, 2, 2, 6);
		this.right_foot_nail_2.setRotationPoint(-10.5f, 5.0f, 28.0f);
		this.right_foot_nail_2.setTextureSize(512, 512);
		this.right_foot_nail_2.mirror = true;
		this.setRotation(this.right_foot_nail_2, 0.0f, 0.0f, 0.0f);
		(this.right_foot_nail_3 = new ModelRenderer(this, 35, 0)).addBox(3.0f, 17.0f, -14.0f, 2, 2, 5);
		this.right_foot_nail_3.setRotationPoint(-10.5f, 5.0f, 28.0f);
		this.right_foot_nail_3.setTextureSize(512, 512);
		this.right_foot_nail_3.mirror = true;
		this.setRotation(this.right_foot_nail_3, 0.0f, 0.3490659f, 0.0f);
		(this.lower_right_leg = new ModelRenderer(this, 5, 25)).addBox(0.5f, -3.0f, -17.0f, 5, 15, 5);
		this.lower_right_leg.setRotationPoint(-10.5f, 5.0f, 28.0f);
		this.lower_right_leg.setTextureSize(512, 512);
		this.lower_right_leg.mirror = true;
		this.setRotation(this.lower_right_leg, 0.5189514f, 0.0f, 0.0f);
		(this.right_back_nail = new ModelRenderer(this, 35, 0)).addBox(2.0f, 13.0f, -5.0f, 2, 2, 6);
		this.right_back_nail.setRotationPoint(-10.5f, 5.0f, 28.0f);
		this.right_back_nail.setTextureSize(512, 512);
		this.right_back_nail.mirror = true;
		this.setRotation(this.right_back_nail, -0.1745329f, 0.0f, 0.0f);
		(this.upper_right_leg = new ModelRenderer(this, 58, 0)).addBox(0.0f, -14.0f, 0.0f, 6, 14, 6);
		this.upper_right_leg.setRotationPoint(-10.5f, 5.0f, 28.0f);
		this.upper_right_leg.setTextureSize(512, 512);
		this.upper_right_leg.mirror = true;
		this.setRotation(this.upper_right_leg, 2.181662f, 0.0f, 0.0f);
		(this.left_foot = new ModelRenderer(this, 0, 0)).addBox(-6.5f, 16.0f, -11.0f, 7, 3, 7);
		this.left_foot.setRotationPoint(10.5f, 5.0f, 28.0f);
		this.left_foot.setTextureSize(512, 512);
		this.left_foot.mirror = true;
		this.setRotation(this.left_foot, 0.0f, 0.0f, 0.0f);
		(this.left_foot_nail_1 = new ModelRenderer(this, 35, 0)).addBox(-5.0f, 17.0f, -14.0f, 2, 2, 5);
		this.left_foot_nail_1.setRotationPoint(10.5f, 5.0f, 28.0f);
		this.left_foot_nail_1.setTextureSize(512, 512);
		this.left_foot_nail_1.mirror = true;
		this.setRotation(this.left_foot_nail_1, 0.0f, -0.3490659f, 0.0f);
		(this.left_foot_nail_2 = new ModelRenderer(this, 35, 0)).addBox(-4.0f, 17.0f, -16.0f, 2, 2, 6);
		this.left_foot_nail_2.setRotationPoint(10.5f, 5.0f, 28.0f);
		this.left_foot_nail_2.setTextureSize(512, 512);
		this.left_foot_nail_2.mirror = true;
		this.setRotation(this.left_foot_nail_2, 0.0f, 0.0f, 0.0f);
		(this.left_foot_nail_3 = new ModelRenderer(this, 35, 0)).addBox(-2.5f, 17.0f, -16.0f, 2, 2, 5);
		this.left_foot_nail_3.setRotationPoint(10.5f, 5.0f, 28.0f);
		this.left_foot_nail_3.setTextureSize(512, 512);
		this.left_foot_nail_3.mirror = true;
		this.setRotation(this.left_foot_nail_3, 0.0f, 0.3490659f, 0.0f);
		(this.lower_left_leg = new ModelRenderer(this, 5, 25)).addBox(-5.5f, -3.0f, -17.0f, 5, 15, 5);
		this.lower_left_leg.setRotationPoint(10.5f, 5.0f, 28.0f);
		this.lower_left_leg.setTextureSize(512, 512);
		this.lower_left_leg.mirror = true;
		this.setRotation(this.lower_left_leg, 0.5189514f, 0.0f, 0.0f);
		(this.left_back_nail = new ModelRenderer(this, 35, 0)).addBox(-4.0f, 13.0f, -5.0f, 2, 2, 6);
		this.left_back_nail.setRotationPoint(10.5f, 5.0f, 28.0f);
		this.left_back_nail.setTextureSize(512, 512);
		this.left_back_nail.mirror = true;
		this.setRotation(this.left_back_nail, -0.1745329f, 0.0f, 0.0f);
		(this.upper_left_leg = new ModelRenderer(this, 58, 0)).addBox(-6.0f, -14.0f, 0.0f, 6, 14, 6);
		this.upper_left_leg.setRotationPoint(10.5f, 5.0f, 28.0f);
		this.upper_left_leg.setTextureSize(512, 512);
		this.upper_left_leg.mirror = true;
		this.setRotation(this.upper_left_leg, 2.181662f, 0.0f, 0.0f);
		(this.lower_body = new ModelRenderer(this, 300, 0)).addBox(0.0f, 0.0f, 0.0f, 14, 12, 23);
		this.lower_body.setRotationPoint(-7.0f, -7.0f, 9.0f);
		this.lower_body.setTextureSize(512, 512);
		this.lower_body.mirror = true;
		this.setRotation(this.lower_body, -0.2617994f, 0.0f, 0.0f);
		(this.upper_body = new ModelRenderer(this, 0, 300)).addBox(0.0f, 0.0f, 0.0f, 16, 14, 24);
		this.upper_body.setRotationPoint(-8.0f, -10.0f, -14.0f);
		this.upper_body.setTextureSize(512, 512);
		this.upper_body.mirror = true;
		this.setRotation(this.upper_body, -0.0872665f, 0.0f, 0.0f);
		(this.neck_1 = new ModelRenderer(this, 400, 0)).addBox(0.0f, 0.0f, -10.0f, 9, 9, 10);
		this.neck_1.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.neck_1.setTextureSize(512, 512);
		this.neck_1.mirror = true;
		this.setRotation(this.neck_1, 0.0f, 0.0f, 0.0f);
		(this.neck_2 = new ModelRenderer(this, 400, 400)).addBox(0.0f, -1.0f, -20.0f, 9, 9, 10);
		this.neck_2.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.neck_2.setTextureSize(512, 512);
		this.neck_2.mirror = true;
		this.setRotation(this.neck_2, 0.0872665f, 0.0f, 0.0f);
		(this.head = new ModelRenderer(this, 300, 300)).addBox(-2.0f, -2.0f, -33.0f, 13, 13, 14);
		this.head.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.head.setTextureSize(512, 512);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.lower_nose = new ModelRenderer(this, 175, 175)).addBox(0.0f, -1.0f, -40.5f, 9, 4, 15);
		this.lower_nose.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.lower_nose.setTextureSize(512, 512);
		this.lower_nose.mirror = true;
		this.setRotation(this.lower_nose, 0.2230717f, 0.0f, 0.0f);
		(this.upper_nose = new ModelRenderer(this, 200, 200)).addBox(0.0f, 6.0f, -39.0f, 9, 4, 15);
		this.upper_nose.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.upper_nose.setTextureSize(512, 512);
		this.upper_nose.mirror = true;
		this.setRotation(this.upper_nose, -0.1115358f, 0.0f, 0.0f);
		(this.inner_right_arm = new ModelRenderer(this, 0, 200)).addBox(0.0f, 0.0f, 0.0f, 20, 5, 5);
		this.inner_right_arm.setRotationPoint(7.0f, -7.0f, -14.0f);
		this.inner_right_arm.setTextureSize(512, 512);
		this.inner_right_arm.mirror = true;
		this.setRotation(this.inner_right_arm, 0.0f, 0.1745329f, 0.0f);
		(this.middle_right_arm = new ModelRenderer(this, 200, 0)).addBox(13.0f, 0.0f, 10.0f, 35, 5, 5);
		this.middle_right_arm.setRotationPoint(7.0f, -7.0f, -14.0f);
		this.middle_right_arm.setTextureSize(512, 512);
		this.middle_right_arm.mirror = true;
		this.setRotation(this.middle_right_arm, 0.0f, 0.7853982f, 0.0f);
		(this.outer_right_arm = new ModelRenderer(this, 150, 150)).addBox(23.0f, 0.0f, -44.0f, 50, 5, 5);
		this.outer_right_arm.setRotationPoint(7.0f, -7.0f, -14.0f);
		this.outer_right_arm.setTextureSize(512, 512);
		this.outer_right_arm.mirror = true;
		this.setRotation(this.outer_right_arm, 0.0f, -0.5235988f, 0.0f);
		(this.right_wing = new ModelRenderer(this, 215, 226)).addBox(0.0f, 0.0f, -22.0f, 83, 1, 61);
		this.right_wing.setRotationPoint(7.0f, -5.0f, -15.0f);
		this.right_wing.setTextureSize(512, 512);
		this.right_wing.mirror = true;
		this.setRotation(this.right_wing, 0.0f, 0.0f, 0.0f);
		(this.inner_left_arm = new ModelRenderer(this, 0, 200)).addBox(-20.0f, 0.0f, 0.0f, 20, 5, 5);
		this.inner_left_arm.setRotationPoint(-7.0f, -7.0f, -14.0f);
		this.inner_left_arm.setTextureSize(512, 512);
		this.inner_left_arm.mirror = true;
		this.setRotation(this.inner_left_arm, 0.0f, -0.1745329f, 0.0f);
		(this.middle_left_arm = new ModelRenderer(this, 200, 0)).addBox(-48.0f, 0.0f, 10.0f, 35, 5, 5);
		this.middle_left_arm.setRotationPoint(-7.0f, -7.0f, -14.0f);
		this.middle_left_arm.setTextureSize(512, 512);
		this.middle_left_arm.mirror = true;
		this.setRotation(this.middle_left_arm, 0.0f, -0.7853982f, 0.0f);
		(this.outer_left_arm = new ModelRenderer(this, 150, 150)).addBox(-73.0f, 0.0f, -44.0f, 50, 5, 5);
		this.outer_left_arm.setRotationPoint(-7.0f, -7.0f, -14.0f);
		this.outer_left_arm.setTextureSize(512, 512);
		this.outer_left_arm.mirror = true;
		this.setRotation(this.outer_left_arm, 0.0f, 0.5235988f, 0.0f);
		(this.left_wing = new ModelRenderer(this, 260, 158)).addBox(-83.0f, 0.0f, -22.0f, 83, 1, 61);
		this.left_wing.setRotationPoint(-7.0f, -5.0f, -14.0f);
		this.left_wing.setTextureSize(512, 512);
		this.left_wing.mirror = true;
		this.setRotation(this.left_wing, 0.0f, 0.0f, 0.0f);
		(this.tail_1 = new ModelRenderer(this, 91, 40)).addBox(0.0f, 0.0f, 0.0f, 8, 8, 25);
		this.tail_1.setRotationPoint(-4.0f, 1.0f, 27.0f);
		this.tail_1.setTextureSize(512, 512);
		this.tail_1.mirror = true;
		this.setRotation(this.tail_1, 0.1745329f, 0.0f, 0.0f);
		(this.tail_2 = new ModelRenderer(this, 97, 0)).addBox(0.0f, -0.5f, 0.0f, 7, 7, 18);
		this.tail_2.setRotationPoint(-3.5f, -2.5f, 52.0f);
		this.tail_2.setTextureSize(512, 512);
		this.tail_2.mirror = true;
		this.setRotation(this.tail_2, 0.0f, 0.0f, 0.0f);
		(this.tail3 = new ModelRenderer(this, 0, 71)).addBox(0.0f, 0.0f, 0.0f, 6, 6, 20);
		this.tail3.setRotationPoint(-3.0f, -2.0f, 68.0f);
		this.tail3.setTextureSize(512, 512);
		this.tail3.mirror = true;
		this.setRotation(this.tail3, 0.1115358f, 0.0f, 0.0f);
		(this.tail5 = new ModelRenderer(this, 0, 144)).addBox(0.0f, 0.0f, 0.0f, 5, 5, 8);
		this.tail5.setRotationPoint(-2.5f, -3.5f, 88.0f);
		this.tail5.setTextureSize(512, 512);
		this.tail5.mirror = true;
		this.setRotation(this.tail5, 0.0f, 0.0f, 0.0f);
		(this.tail6 = new ModelRenderer(this, 39, 21)).addBox(0.0f, 0.0f, 0.0f, 2, 2, 4);
		this.tail6.setRotationPoint(-1.0f, -2.0f, 96.0f);
		this.tail6.setTextureSize(512, 512);
		this.tail6.mirror = true;
		this.setRotation(this.tail6, 0.0f, 0.0f, 0.0f);
		(this.left_hand = new ModelRenderer(this, 400, 100)).addBox(39.5f, -10.0f, -37.0f, 5, 5, 15);
		this.left_hand.setRotationPoint(7.0f, -7.0f, -14.0f);
		this.left_hand.setTextureSize(512, 512);
		this.left_hand.mirror = true;
		this.setRotation(this.left_hand, 0.4298222f, 0.0f, 0.0f);
		(this.right_hand = new ModelRenderer(this, 400, 100)).addBox(-44.5f, -10.0f, -37.0f, 5, 5, 13);
		this.right_hand.setRotationPoint(-7.0f, -7.0f, -14.0f);
		this.right_hand.setTextureSize(512, 512);
		this.right_hand.mirror = true;
		this.setRotation(this.right_hand, 0.4298222f, 0.0f, 0.0f);
		(this.yooyh1 = new ModelRenderer(this, 53, 437)).addBox(6.5f, 4.5f, -37.0f, 1, 2, 1);
		this.yooyh1.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.yooyh1.setTextureSize(512, 512);
		this.yooyh1.mirror = true;
		this.setRotation(this.yooyh1, 0.0f, 0.0f, 0.0f);
		(this.yooyh2 = new ModelRenderer(this, 53, 437)).addBox(1.5f, 4.5f, -37.0f, 1, 2, 1);
		this.yooyh2.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.yooyh2.setTextureSize(512, 512);
		this.yooyh2.mirror = true;
		this.setRotation(this.yooyh2, 0.0f, 0.0f, 0.0f);
		(this.yooyh3 = new ModelRenderer(this, 53, 437)).addBox(5.0f, 4.5f, -39.0f, 1, 2, 1);
		this.yooyh3.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.yooyh3.setTextureSize(512, 512);
		this.yooyh3.mirror = true;
		this.setRotation(this.yooyh3, 0.0f, 0.0f, 0.0f);
		(this.yooyh4 = new ModelRenderer(this, 53, 437)).addBox(3.0f, 4.5f, -39.0f, 1, 2, 1);
		this.yooyh4.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.yooyh4.setTextureSize(512, 512);
		this.yooyh4.mirror = true;
		this.setRotation(this.yooyh4, 0.0f, 0.0f, 0.0f);
		(this.yooyh5 = new ModelRenderer(this, 53, 437)).addBox(1.5f, 7.0f, -37.0f, 1, 1, 1);
		this.yooyh5.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.yooyh5.setTextureSize(512, 512);
		this.yooyh5.mirror = true;
		this.setRotation(this.yooyh5, 0.0f, 0.0f, 0.0f);
		(this.yooyh6 = new ModelRenderer(this, 53, 437)).addBox(3.0f, 7.0f, -39.0f, 1, 1, 1);
		this.yooyh6.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.yooyh6.setTextureSize(512, 512);
		this.yooyh6.mirror = true;
		this.setRotation(this.yooyh6, 0.0f, 0.0f, 0.0f);
		(this.yooyh7 = new ModelRenderer(this, 53, 437)).addBox(5.0f, 7.0f, -39.0f, 1, 1, 1);
		this.yooyh7.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.yooyh7.setTextureSize(512, 512);
		this.yooyh7.mirror = true;
		this.setRotation(this.yooyh7, 0.0f, 0.0f, 0.0f);
		(this.yooyh8 = new ModelRenderer(this, 53, 437)).addBox(6.5f, 7.0f, -37.0f, 1, 1, 1);
		this.yooyh8.setRotationPoint(-4.5f, -8.0f, -14.0f);
		this.yooyh8.setTextureSize(512, 512);
		this.yooyh8.mirror = true;
		this.setRotation(this.yooyh8, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		this.right_foot.render(par7);
		this.right_foot_nail_1.render(par7);
		this.right_foot_nail_2.render(par7);
		this.right_foot_nail_3.render(par7);
		this.lower_right_leg.render(par7);
		this.right_back_nail.render(par7);
		this.upper_right_leg.render(par7);
		this.left_foot.render(par7);
		this.left_foot_nail_1.render(par7);
		this.left_foot_nail_2.render(par7);
		this.left_foot_nail_3.render(par7);
		this.lower_left_leg.render(par7);
		this.left_back_nail.render(par7);
		this.upper_left_leg.render(par7);
		this.lower_body.render(par7);
		this.upper_body.render(par7);
		this.neck_1.render(par7);
		this.neck_2.render(par7);
		this.head.render(par7);
		this.lower_nose.render(par7);
		this.upper_nose.render(par7);
		this.inner_right_arm.render(par7);
		this.middle_right_arm.render(par7);
		this.outer_right_arm.render(par7);
		this.right_wing.render(par7);
		this.inner_left_arm.render(par7);
		this.middle_left_arm.render(par7);
		this.outer_left_arm.render(par7);
		this.left_wing.render(par7);
		this.tail_1.render(par7);
		this.tail_2.render(par7);
		this.tail3.render(par7);
		this.tail5.render(par7);
		this.tail6.render(par7);
		this.left_hand.render(par7);
		this.right_hand.render(par7);
		this.yooyh1.render(par7);
		this.yooyh2.render(par7);
		this.yooyh3.render(par7);
		this.yooyh4.render(par7);
		this.yooyh5.render(par7);
		this.yooyh6.render(par7);
		this.yooyh7.render(par7);
		this.yooyh8.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		this.inner_left_arm.rotateAngleZ = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.inner_right_arm.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.outer_left_arm.rotateAngleZ = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.outer_right_arm.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.middle_left_arm.rotateAngleZ = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.middle_right_arm.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.left_hand.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.right_hand.rotateAngleZ = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.left_wing.rotateAngleZ = -MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
		this.right_wing.rotateAngleZ = MathHelper.cos(par1 * 0.6222f) * 2.0f * par2 * 0.5f;
	}
}