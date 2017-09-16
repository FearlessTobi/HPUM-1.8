package snidgert.harrypottermod.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Horntail extends ModelBase {

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
	ModelRenderer tail4;
	ModelRenderer tail5;
	ModelRenderer tail6;
	ModelRenderer left_hand;
	ModelRenderer right_hand;
	ModelRenderer tail_spike_1;
	ModelRenderer talespike_3;
	ModelRenderer tailspike_4;
	ModelRenderer tailspike_2;
	ModelRenderer nose;
	ModelRenderer mouth;
	ModelRenderer left_eyebrow;
	ModelRenderer right_eyebrow;
	ModelRenderer lower_teeth;
	ModelRenderer upper_teeth;
	ModelRenderer Horns1;
	ModelRenderer Horns2;
	ModelRenderer Horns3;
	ModelRenderer Horns4;
	ModelRenderer Horns5;
	ModelRenderer Horns6;
	ModelRenderer Horns7;
	ModelRenderer Horns8;
	ModelRenderer Horns9;
	ModelRenderer Horns10;
	ModelRenderer Horns11;
	ModelRenderer Horns12;
	ModelRenderer Horns13;
	ModelRenderer Horns14;
	ModelRenderer Horns15;
	ModelRenderer Horns16;
	ModelRenderer BigHorn1;
	ModelRenderer BigHorn2;
	ModelRenderer BigHorn3;
	ModelRenderer BigHorn4;
	ModelRenderer BigHorn5;
	ModelRenderer BigHorn6;
	ModelRenderer BigHorn7;
	ModelRenderer BigHorn8;
	ModelRenderer BigHorn9;

	public Horntail() {
		super.textureWidth = 512;
		super.textureHeight = 512;
		(this.right_foot = new ModelRenderer(this, 0, 0)).addBox(-3.5f, 0.0f, -3.5f, 7, 3, 7);
		this.right_foot.setRotationPoint(-7.5f, 21.0f, 20.0f);
		this.right_foot.setTextureSize(512, 512);
		this.right_foot.mirror = true;
		this.setRotation(this.right_foot, 0.0f, 0.0f, 0.0f);
		(this.right_foot_nail_1 = new ModelRenderer(this, 35, 0)).addBox(-1.0f, -1.0f, -5.0f, 2, 2, 5);
		this.right_foot_nail_1.setRotationPoint(-5.5f, 23.0f, 17.0f);
		this.right_foot_nail_1.setTextureSize(512, 512);
		this.right_foot_nail_1.mirror = true;
		this.setRotation(this.right_foot_nail_1, 0.0f, -0.3490659f, 0.0f);
		(this.right_foot_nail_2 = new ModelRenderer(this, 35, 10)).addBox(-1.0f, -1.0f, -6.0f, 2, 2, 6);
		this.right_foot_nail_2.setRotationPoint(-7.5f, 23.0f, 17.0f);
		this.right_foot_nail_2.setTextureSize(512, 512);
		this.right_foot_nail_2.mirror = true;
		this.setRotation(this.right_foot_nail_2, 0.0f, 0.0f, 0.0f);
		(this.right_foot_nail_3 = new ModelRenderer(this, 35, 0)).addBox(-1.0f, -1.0f, -5.0f, 2, 2, 5);
		this.right_foot_nail_3.setRotationPoint(-9.5f, 23.0f, 17.0f);
		this.right_foot_nail_3.setTextureSize(512, 512);
		this.right_foot_nail_3.mirror = true;
		this.setRotation(this.right_foot_nail_3, 0.0f, 0.3490659f, 0.0f);
		(this.lower_right_leg = new ModelRenderer(this, 5, 25)).addBox(-2.5f, 0.0f, -2.5f, 5, 15, 5);
		this.lower_right_leg.setRotationPoint(-7.5f, 9.5f, 13.5f);
		this.lower_right_leg.setTextureSize(512, 512);
		this.lower_right_leg.mirror = true;
		this.setRotation(this.lower_right_leg, 0.5189514f, 0.0f, 0.0f);
		(this.right_back_nail = new ModelRenderer(this, 35, 30)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 6);
		this.right_back_nail.setRotationPoint(-7.5f, 19.0f, 20.0f);
		this.right_back_nail.setTextureSize(512, 512);
		this.right_back_nail.mirror = true;
		this.setRotation(this.right_back_nail, -0.1745329f, 0.0f, 0.0f);
		(this.upper_right_leg = new ModelRenderer(this, 58, 0)).addBox(-6.0f, -10.0f, -5.0f, 6, 14, 10);
		this.upper_right_leg.setRotationPoint(-4.5f, 7.0f, 21.0f);
		this.upper_right_leg.setTextureSize(512, 512);
		this.upper_right_leg.mirror = true;
		this.setRotation(this.upper_right_leg, 2.181662f, 0.0f, 0.0f);
		(this.left_foot = new ModelRenderer(this, 0, 0)).addBox(-3.5f, 0.0f, -3.5f, 7, 3, 7);
		this.left_foot.setRotationPoint(7.5f, 21.0f, 20.0f);
		this.left_foot.setTextureSize(512, 512);
		this.left_foot.mirror = true;
		this.setRotation(this.left_foot, 0.0f, 0.0f, 0.0f);
		(this.left_foot_nail_1 = new ModelRenderer(this, 35, 0)).addBox(-1.0f, -1.0f, -5.0f, 2, 2, 5);
		this.left_foot_nail_1.setRotationPoint(9.5f, 23.0f, 17.0f);
		this.left_foot_nail_1.setTextureSize(512, 512);
		this.left_foot_nail_1.mirror = true;
		this.setRotation(this.left_foot_nail_1, 0.0f, -0.3490659f, 0.0f);
		(this.left_foot_nail_2 = new ModelRenderer(this, 35, 10)).addBox(-1.0f, -1.0f, -6.0f, 2, 2, 6);
		this.left_foot_nail_2.setRotationPoint(7.5f, 23.0f, 17.0f);
		this.left_foot_nail_2.setTextureSize(512, 512);
		this.left_foot_nail_2.mirror = true;
		this.setRotation(this.left_foot_nail_2, 0.0f, 0.0f, 0.0f);
		(this.left_foot_nail_3 = new ModelRenderer(this, 35, 0)).addBox(-1.0f, -1.0f, -5.0f, 2, 2, 5);
		this.left_foot_nail_3.setRotationPoint(5.5f, 23.0f, 17.0f);
		this.left_foot_nail_3.setTextureSize(512, 512);
		this.left_foot_nail_3.mirror = true;
		this.setRotation(this.left_foot_nail_3, 0.0f, 0.3490659f, 0.0f);
		(this.lower_left_leg = new ModelRenderer(this, 5, 25)).addBox(-2.5f, 0.0f, -2.5f, 5, 15, 5);
		this.lower_left_leg.setRotationPoint(7.5f, 9.5f, 13.5f);
		this.lower_left_leg.setTextureSize(512, 512);
		this.lower_left_leg.mirror = true;
		this.setRotation(this.lower_left_leg, 0.5189514f, 0.0f, 0.0f);
		(this.left_back_nail = new ModelRenderer(this, 35, 30)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 6);
		this.left_back_nail.setRotationPoint(7.5f, 19.0f, 20.0f);
		this.left_back_nail.setTextureSize(512, 512);
		this.left_back_nail.mirror = true;
		this.setRotation(this.left_back_nail, -0.1745329f, 0.0f, 0.0f);
		(this.upper_left_leg = new ModelRenderer(this, 58, 0)).addBox(0.0f, -10.0f, -5.0f, 6, 14, 10);
		this.upper_left_leg.setRotationPoint(4.5f, 6.0f, 21.0f);
		this.upper_left_leg.setTextureSize(512, 512);
		this.upper_left_leg.mirror = true;
		this.setRotation(this.upper_left_leg, 2.181662f, 0.0f, 0.0f);
		(this.lower_body = new ModelRenderer(this, 300, 0)).addBox(-7.0f, -6.0f, -11.5f, 14, 12, 23);
		this.lower_body.setRotationPoint(0.0f, 2.0f, 19.0f);
		this.lower_body.setTextureSize(512, 512);
		this.lower_body.mirror = true;
		this.setRotation(this.lower_body, -0.2617994f, 0.0f, 0.0f);
		(this.upper_body = new ModelRenderer(this, 0, 300)).addBox(-8.0f, -7.0f, -12.0f, 16, 14, 24);
		this.upper_body.setRotationPoint(0.0f, -3.0f, -2.0f);
		this.upper_body.setTextureSize(512, 512);
		this.upper_body.mirror = true;
		this.setRotation(this.upper_body, -0.0872665f, 0.0f, 0.0f);
		(this.neck_1 = new ModelRenderer(this, 400, 0)).addBox(-4.5f, -4.5f, -10.0f, 9, 9, 10);
		this.neck_1.setRotationPoint(0.0f, -3.5f, -13.0f);
		this.neck_1.setTextureSize(512, 512);
		this.neck_1.mirror = true;
		this.setRotation(this.neck_1, 0.0f, 0.0f, 0.0f);
		(this.neck_2 = new ModelRenderer(this, 400, 400)).addBox(-4.5f, -4.5f, -10.0f, 9, 9, 10);
		this.neck_2.setRotationPoint(0.0f, -3.5f, -22.5f);
		this.neck_2.setTextureSize(512, 512);
		this.neck_2.mirror = true;
		this.setRotation(this.neck_2, 0.0872665f, 0.0f, 0.0f);
		(this.head = new ModelRenderer(this, 300, 300)).addBox(-6.5f, -6.5f, -14.0f, 13, 13, 14);
		this.head.setRotationPoint(0.0f, -3.5f, -31.0f);
		this.head.setTextureSize(512, 512);
		this.head.mirror = true;
		this.setRotation(this.head, 0.0f, 0.0f, 0.0f);
		(this.lower_nose = new ModelRenderer(this, 175, 175)).addBox(-5.0f, -2.0f, -10.0f, 10, 4, 10);
		this.lower_nose.setRotationPoint(0.0f, 1.0f, -44.0f);
		this.lower_nose.setTextureSize(512, 512);
		this.lower_nose.mirror = true;
		this.setRotation(this.lower_nose, 0.0872665f, 0.0f, 0.0f);
		(this.upper_nose = new ModelRenderer(this, 200, 200)).addBox(-6.0f, -3.0f, -11.0f, 12, 6, 11);
		this.upper_nose.setRotationPoint(0.0f, -7.0f, -44.5f);
		this.upper_nose.setTextureSize(512, 512);
		this.upper_nose.mirror = true;
		this.setRotation(this.upper_nose, 0.0174533f, 0.0f, 0.0f);
		(this.inner_right_arm = new ModelRenderer(this, 0, 200)).addBox(0.0f, -2.0f, 0.0f, 20, 5, 5);
		this.inner_right_arm.setRotationPoint(7.0f, -5.0f, -15.0f);
		this.inner_right_arm.setTextureSize(512, 512);
		this.inner_right_arm.mirror = true;
		this.setRotation(this.inner_right_arm, 0.0f, 0.1745329f, 0.0f);
		(this.middle_right_arm = new ModelRenderer(this, 200, 0)).addBox(13.0f, -2.0f, 10.5f, 35, 5, 5);
		this.middle_right_arm.setRotationPoint(7.0f, -5.0f, -15.0f);
		this.middle_right_arm.setTextureSize(512, 512);
		this.middle_right_arm.mirror = true;
		this.setRotation(this.middle_right_arm, 0.0f, 0.7853982f, 0.0f);
		(this.outer_right_arm = new ModelRenderer(this, 150, 150)).addBox(26.0f, -2.0f, -42.5f, 50, 5, 5);
		this.outer_right_arm.setRotationPoint(7.0f, -5.0f, -15.0f);
		this.outer_right_arm.setTextureSize(512, 512);
		this.outer_right_arm.mirror = true;
		this.setRotation(this.outer_right_arm, 0.0f, -0.5235988f, 0.0f);
		(this.right_wing = new ModelRenderer(this, 215, 226)).addBox(0.0f, 0.0f, -22.0f, 83, 1, 61);
		this.right_wing.setRotationPoint(7.0f, -5.0f, -15.0f);
		this.right_wing.setTextureSize(512, 512);
		this.right_wing.mirror = true;
		this.setRotation(this.right_wing, 0.0f, 0.0f, 0.0f);
		(this.inner_left_arm = new ModelRenderer(this, 0, 200)).addBox(-20.0f, -2.0f, 0.0f, 20, 5, 5);
		this.inner_left_arm.setRotationPoint(-7.0f, -5.0f, -15.0f);
		this.inner_left_arm.setTextureSize(512, 512);
		this.inner_left_arm.mirror = true;
		this.setRotation(this.inner_left_arm, 0.0f, -0.1745329f, 0.0f);
		(this.middle_left_arm = new ModelRenderer(this, 200, 0)).addBox(-48.0f, -2.0f, 10.5f, 35, 5, 5);
		this.middle_left_arm.setRotationPoint(-7.0f, -5.0f, -15.0f);
		this.middle_left_arm.setTextureSize(512, 512);
		this.middle_left_arm.mirror = true;
		this.setRotation(this.middle_left_arm, 0.0f, -0.7853982f, 0.0f);
		(this.outer_left_arm = new ModelRenderer(this, 150, 150)).addBox(-73.0f, -2.0f, -43.0f, 50, 5, 5);
		this.outer_left_arm.setRotationPoint(-7.0f, -5.0f, -15.0f);
		this.outer_left_arm.setTextureSize(512, 512);
		this.outer_left_arm.mirror = true;
		this.setRotation(this.outer_left_arm, 0.0f, 0.5235988f, 0.0f);
		(this.left_wing = new ModelRenderer(this, 260, 158)).addBox(-83.0f, 0.0f, -22.0f, 83, 1, 61);
		this.left_wing.setRotationPoint(-7.0f, -5.0f, -15.0f);
		this.left_wing.setTextureSize(512, 512);
		this.left_wing.mirror = true;
		this.setRotation(this.left_wing, 0.0f, 0.0f, 0.0f);
		(this.tail_1 = new ModelRenderer(this, 91, 40)).addBox(-4.0f, -4.0f, 0.0f, 8, 8, 25);
		this.tail_1.setRotationPoint(0.0f, 5.0f, 28.0f);
		this.tail_1.setTextureSize(512, 512);
		this.tail_1.mirror = true;
		this.setRotation(this.tail_1, 0.1745329f, 0.0f, 0.0f);
		(this.tail_2 = new ModelRenderer(this, 97, 0)).addBox(-3.5f, -3.5f, 0.0f, 7, 7, 18);
		this.tail_2.setRotationPoint(0.0f, 1.0f, 51.0f);
		this.tail_2.setTextureSize(512, 512);
		this.tail_2.mirror = true;
		this.setRotation(this.tail_2, 0.0f, 0.0f, 0.0f);
		(this.tail3 = new ModelRenderer(this, 0, 71)).addBox(-3.0f, -3.0f, 0.0f, 6, 6, 20);
		this.tail3.setRotationPoint(0.0f, 1.0f, 68.0f);
		this.tail3.setTextureSize(512, 512);
		this.tail3.mirror = true;
		this.setRotation(this.tail3, 0.1047198f, 0.0f, 0.0f);
		(this.tail4 = new ModelRenderer(this, 0, 114)).addBox(-3.5f, -3.5f, 0.0f, 7, 7, 8);
		this.tail4.setRotationPoint(0.0f, -1.0f, 87.0f);
		this.tail4.setTextureSize(512, 512);
		this.tail4.mirror = true;
		this.setRotation(this.tail4, 0.1047198f, 0.0f, 0.0f);
		(this.tail5 = new ModelRenderer(this, 0, 144)).addBox(-2.5f, -2.5f, 0.0f, 5, 5, 8);
		this.tail5.setRotationPoint(0.0f, -1.5f, 94.0f);
		this.tail5.setTextureSize(512, 512);
		this.tail5.mirror = true;
		this.setRotation(this.tail5, 0.1047198f, 0.0f, 0.0f);
		(this.tail6 = new ModelRenderer(this, 39, 21)).addBox(-1.5f, -1.5f, 0.0f, 3, 3, 4);
		this.tail6.setRotationPoint(0.0f, -2.5f, 102.0f);
		this.tail6.setTextureSize(512, 512);
		this.tail6.mirror = true;
		this.setRotation(this.tail6, 0.1047198f, 0.0f, 0.0f);
		(this.left_hand = new ModelRenderer(this, 400, 100)).addBox(39.0f, -6.0f, -37.5f, 5, 5, 15);
		this.left_hand.setRotationPoint(7.0f, -5.0f, -15.0f);
		this.left_hand.setTextureSize(512, 512);
		this.left_hand.mirror = true;
		this.setRotation(this.left_hand, 0.1745329f, 0.0f, 0.0f);
		(this.right_hand = new ModelRenderer(this, 400, 100)).addBox(-43.5f, -6.0f, -37.5f, 5, 5, 15);
		this.right_hand.setRotationPoint(-7.0f, -5.0f, -15.0f);
		this.right_hand.setTextureSize(512, 512);
		this.right_hand.mirror = true;
		this.setRotation(this.right_hand, 0.1745329f, 0.0f, 0.0f);
		(this.tail_spike_1 = new ModelRenderer(this, 400, 380)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 6);
		this.tail_spike_1.setRotationPoint(2.0f, -3.0f, 88.0f);
		this.tail_spike_1.setTextureSize(512, 512);
		this.tail_spike_1.mirror = true;
		this.setRotation(this.tail_spike_1, 0.3490659f, 0.3490659f, 0.0f);
		(this.talespike_3 = new ModelRenderer(this, 400, 380)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 6);
		this.talespike_3.setRotationPoint(-2.0f, 0.0f, 88.0f);
		this.talespike_3.setTextureSize(512, 512);
		this.talespike_3.mirror = true;
		this.setRotation(this.talespike_3, -0.3490659f, -0.3490659f, 0.0f);
		(this.tailspike_4 = new ModelRenderer(this, 400, 380)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 6);
		this.tailspike_4.setRotationPoint(-2.0f, -3.0f, 88.0f);
		this.tailspike_4.setTextureSize(512, 512);
		this.tailspike_4.mirror = true;
		this.setRotation(this.tailspike_4, 0.3490659f, -0.3490659f, 0.0f);
		(this.tailspike_2 = new ModelRenderer(this, 400, 380)).addBox(-1.0f, -1.0f, 0.0f, 2, 2, 6);
		this.tailspike_2.setRotationPoint(2.0f, 0.0f, 88.0f);
		this.tailspike_2.setTextureSize(512, 512);
		this.tailspike_2.mirror = true;
		this.setRotation(this.tailspike_2, -0.3490659f, 0.3490659f, 0.0f);
		(this.nose = new ModelRenderer(this, 0, 51)).addBox(-5.5f, -3.0f, -4.0f, 11, 6, 4);
		this.nose.setRotationPoint(0.0f, -5.0f, -54.0f);
		this.nose.setTextureSize(512, 512);
		this.nose.mirror = true;
		this.setRotation(this.nose, -0.6108652f, 0.0f, 0.0f);
		(this.mouth = new ModelRenderer(this, 0, 172)).addBox(-5.0f, -2.0f, -2.0f, 10, 5, 5);
		this.mouth.setRotationPoint(0.0f, -3.6f, -47.0f);
		this.mouth.setTextureSize(512, 512);
		this.mouth.mirror = true;
		this.setRotation(this.mouth, 0.0872665f, 0.0f, 0.0f);
		(this.left_eyebrow = new ModelRenderer(this, 72, 90)).addBox(0.0f, -0.5f, -10.0f, 1, 1, 20);
		this.left_eyebrow.setRotationPoint(5.8f, -8.5f, -45.5f);
		this.left_eyebrow.setTextureSize(512, 512);
		this.left_eyebrow.mirror = true;
		this.setRotation(this.left_eyebrow, 0.0f, 0.0523599f, 0.0f);
		(this.right_eyebrow = new ModelRenderer(this, 72, 90)).addBox(-1.0f, -0.5f, -10.0f, 1, 1, 20);
		this.right_eyebrow.setRotationPoint(-5.8f, -8.5f, -45.5f);
		this.right_eyebrow.setTextureSize(512, 512);
		this.right_eyebrow.mirror = true;
		this.setRotation(this.right_eyebrow, 0.0f, -0.0523599f, 0.0f);
		(this.lower_teeth = new ModelRenderer(this, 41, 43)).addBox(-4.5f, -2.0f, -3.0f, 9, 2, 6);
		this.lower_teeth.setRotationPoint(0.0f, 0.1f, -51.0f);
		this.lower_teeth.setTextureSize(512, 512);
		this.lower_teeth.mirror = true;
		this.setRotation(this.lower_teeth, 0.0872665f, 0.0f, 0.0f);
		(this.upper_teeth = new ModelRenderer(this, 41, 51)).addBox(-4.5f, 0.0f, -3.0f, 9, 2, 6);
		this.upper_teeth.setRotationPoint(0.0f, -4.5f, -52.0f);
		this.upper_teeth.setTextureSize(512, 512);
		this.upper_teeth.mirror = true;
		this.setRotation(this.upper_teeth, 0.0872665f, 0.0f, 0.0f);
		(this.Horns1 = new ModelRenderer(this, 150, 0)).addBox(-1.0f, -2.0f, -10.0f, 2, 2, 20);
		this.Horns1.setRotationPoint(4.5f, -10.0f, -41.0f);
		this.Horns1.setTextureSize(512, 512);
		this.Horns1.mirror = true;
		this.setRotation(this.Horns1, 0.0f, 0.0f, 0.0f);
		(this.Horns2 = new ModelRenderer(this, 150, 0)).addBox(-1.0f, -2.0f, -10.0f, 2, 2, 20);
		this.Horns2.setRotationPoint(-4.5f, -10.0f, -41.0f);
		this.Horns2.setTextureSize(512, 512);
		this.Horns2.mirror = true;
		this.setRotation(this.Horns2, 0.0f, 0.0f, 0.0f);
		(this.Horns3 = new ModelRenderer(this, 150, 0)).addBox(-0.5f, -1.0f, -10.0f, 2, 2, 20);
		this.Horns3.setRotationPoint(-2.0f, -8.5f, -23.0f);
		this.Horns3.setTextureSize(512, 512);
		this.Horns3.mirror = true;
		this.setRotation(this.Horns3, 0.0523599f, 0.0f, 0.0f);
		(this.Horns4 = new ModelRenderer(this, 150, 0)).addBox(-0.5f, -1.0f, -10.0f, 2, 2, 20);
		this.Horns4.setRotationPoint(2.0f, -8.5f, -23.0f);
		this.Horns4.setTextureSize(512, 512);
		this.Horns4.mirror = true;
		this.setRotation(this.Horns4, 0.0523599f, 0.0f, 0.0f);
		(this.Horns5 = new ModelRenderer(this, 150, 23)).addBox(-1.0f, -1.0f, -11.5f, 2, 2, 23);
		this.Horns5.setRotationPoint(0.0f, -11.0f, -1.0f);
		this.Horns5.setTextureSize(512, 512);
		this.Horns5.mirror = true;
		this.setRotation(this.Horns5, -0.0872665f, 0.0f, 0.0f);
		(this.Horns6 = new ModelRenderer(this, 150, 23)).addBox(-1.0f, -1.0f, -11.5f, 2, 2, 23);
		this.Horns6.setRotationPoint(5.5f, -11.0f, -1.0f);
		this.Horns6.setTextureSize(512, 512);
		this.Horns6.mirror = true;
		this.setRotation(this.Horns6, -0.0872665f, 0.0f, 0.0f);
		(this.Horns7 = new ModelRenderer(this, 150, 23)).addBox(-1.0f, -1.0f, -11.5f, 2, 2, 23);
		this.Horns7.setRotationPoint(-5.5f, -11.0f, -1.0f);
		this.Horns7.setTextureSize(512, 512);
		this.Horns7.mirror = true;
		this.setRotation(this.Horns7, -0.0872665f, 0.0f, 0.0f);
		(this.Horns8 = new ModelRenderer(this, 150, 23)).addBox(-1.0f, -1.0f, -11.5f, 2, 2, 23);
		this.Horns8.setRotationPoint(0.0f, -5.0f, 20.0f);
		this.Horns8.setTextureSize(512, 512);
		this.Horns8.mirror = true;
		this.setRotation(this.Horns8, -0.2617994f, 0.0f, 0.0f);
		(this.Horns9 = new ModelRenderer(this, 150, 23)).addBox(-1.0f, -1.0f, -11.5f, 2, 2, 23);
		this.Horns9.setRotationPoint(-4.5f, -5.0f, 20.0f);
		this.Horns9.setTextureSize(512, 512);
		this.Horns9.mirror = true;
		this.setRotation(this.Horns9, -0.2617994f, 0.0f, 0.0f);
		(this.Horns10 = new ModelRenderer(this, 150, 23)).addBox(-1.0f, -1.0f, -11.5f, 2, 2, 23);
		this.Horns10.setRotationPoint(4.5f, -5.0f, 20.0f);
		this.Horns10.setTextureSize(512, 512);
		this.Horns10.mirror = true;
		this.setRotation(this.Horns10, -0.2617994f, 0.0f, 0.0f);
		(this.Horns11 = new ModelRenderer(this, 150, 23)).addBox(-1.0f, -1.0f, -11.5f, 2, 2, 23);
		this.Horns11.setRotationPoint(2.0f, -2.0f, 40.0f);
		this.Horns11.setTextureSize(512, 512);
		this.Horns11.mirror = true;
		this.setRotation(this.Horns11, 0.1745329f, 0.0f, 0.0f);
		(this.Horns12 = new ModelRenderer(this, 150, 23)).addBox(-1.0f, -1.0f, -11.5f, 2, 2, 23);
		this.Horns12.setRotationPoint(-2.0f, -2.0f, 40.0f);
		this.Horns12.setTextureSize(512, 512);
		this.Horns12.mirror = true;
		this.setRotation(this.Horns12, 0.1745329f, 0.0f, 0.0f);
		(this.Horns13 = new ModelRenderer(this, 150, 0)).addBox(-1.0f, -1.0f, -10.0f, 2, 2, 20);
		this.Horns13.setRotationPoint(2.0f, -3.5f, 59.0f);
		this.Horns13.setTextureSize(512, 512);
		this.Horns13.mirror = true;
		this.setRotation(this.Horns13, 0.0f, 0.0f, 0.0f);
		(this.Horns14 = new ModelRenderer(this, 150, 0)).addBox(-1.0f, -1.0f, -10.0f, 2, 2, 20);
		this.Horns14.setRotationPoint(-2.0f, -3.5f, 59.0f);
		this.Horns14.setTextureSize(512, 512);
		this.Horns14.mirror = true;
		this.setRotation(this.Horns14, 0.0f, 0.0f, 0.0f);
		(this.Horns15 = new ModelRenderer(this, 150, 0)).addBox(-1.0f, -1.0f, -10.0f, 2, 2, 20);
		this.Horns15.setRotationPoint(-1.5f, -4.0f, 78.0f);
		this.Horns15.setTextureSize(512, 512);
		this.Horns15.mirror = true;
		this.setRotation(this.Horns15, 0.1047198f, 0.0f, 0.0f);
		(this.Horns16 = new ModelRenderer(this, 150, 0)).addBox(-1.0f, -1.0f, -10.0f, 2, 2, 20);
		this.Horns16.setRotationPoint(1.5f, -4.0f, 78.0f);
		this.Horns16.setTextureSize(512, 512);
		this.Horns16.mirror = true;
		this.setRotation(this.Horns16, 0.1047198f, 0.0f, 0.0f);
		(this.BigHorn1 = new ModelRenderer(this, 0, 228)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 15);
		this.BigHorn1.setRotationPoint(0.0f, -9.0f, -42.0f);
		this.BigHorn1.setTextureSize(512, 512);
		this.BigHorn1.mirror = true;
		this.setRotation(this.BigHorn1, 0.5235988f, 0.0f, 0.0f);
		(this.BigHorn2 = new ModelRenderer(this, 0, 228)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 15);
		this.BigHorn2.setRotationPoint(2.0f, -9.0f, -42.0f);
		this.BigHorn2.setTextureSize(512, 512);
		this.BigHorn2.mirror = true;
		this.setRotation(this.BigHorn2, 0.4363323f, 0.1745329f, 0.0f);
		(this.BigHorn3 = new ModelRenderer(this, 0, 228)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 15);
		this.BigHorn3.setRotationPoint(-2.0f, -9.0f, -42.0f);
		this.BigHorn3.setTextureSize(512, 512);
		this.BigHorn3.mirror = true;
		this.setRotation(this.BigHorn3, 0.4363323f, -0.1745329f, 0.0f);
		(this.BigHorn4 = new ModelRenderer(this, 0, 228)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 15);
		this.BigHorn4.setRotationPoint(-3.0f, -5.0f, -42.0f);
		this.BigHorn4.setTextureSize(512, 512);
		this.BigHorn4.mirror = true;
		this.setRotation(this.BigHorn4, 0.2617994f, -0.4363323f, 0.0f);
		(this.BigHorn5 = new ModelRenderer(this, 0, 228)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 15);
		this.BigHorn5.setRotationPoint(-3.0f, -4.0f, -42.0f);
		this.BigHorn5.setTextureSize(512, 512);
		this.BigHorn5.mirror = true;
		this.setRotation(this.BigHorn5, 0.0f, -0.4363323f, 0.0f);
		(this.BigHorn6 = new ModelRenderer(this, 0, 228)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 15);
		this.BigHorn6.setRotationPoint(-3.0f, -3.0f, -42.0f);
		this.BigHorn6.setTextureSize(512, 512);
		this.BigHorn6.mirror = true;
		this.setRotation(this.BigHorn6, -0.2617994f, -0.4363323f, 0.0f);
		(this.BigHorn7 = new ModelRenderer(this, 0, 228)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 15);
		this.BigHorn7.setRotationPoint(3.0f, -5.0f, -42.0f);
		this.BigHorn7.setTextureSize(512, 512);
		this.BigHorn7.mirror = true;
		this.setRotation(this.BigHorn7, 0.2617994f, 0.4363323f, 0.0f);
		(this.BigHorn8 = new ModelRenderer(this, 0, 228)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 15);
		this.BigHorn8.setRotationPoint(3.0f, -4.0f, -42.0f);
		this.BigHorn8.setTextureSize(512, 512);
		this.BigHorn8.mirror = true;
		this.setRotation(this.BigHorn8, 0.0f, 0.4363323f, 0.0f);
		(this.BigHorn9 = new ModelRenderer(this, 0, 228)).addBox(-0.5f, -0.5f, 0.0f, 1, 1, 15);
		this.BigHorn9.setRotationPoint(3.0f, -3.0f, -42.0f);
		this.BigHorn9.setTextureSize(512, 512);
		this.BigHorn9.mirror = true;
		this.setRotation(this.BigHorn9, -0.2617994f, 0.4363323f, 0.0f);
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
		this.tail4.render(par7);
		this.tail5.render(par7);
		this.tail6.render(par7);
		this.left_hand.render(par7);
		this.right_hand.render(par7);
		this.tail_spike_1.render(par7);
		this.talespike_3.render(par7);
		this.tailspike_4.render(par7);
		this.tailspike_2.render(par7);
		this.nose.render(par7);
		this.mouth.render(par7);
		this.left_eyebrow.render(par7);
		this.right_eyebrow.render(par7);
		this.lower_teeth.render(par7);
		this.upper_teeth.render(par7);
		this.Horns1.render(par7);
		this.Horns2.render(par7);
		this.Horns3.render(par7);
		this.Horns4.render(par7);
		this.Horns5.render(par7);
		this.Horns6.render(par7);
		this.Horns7.render(par7);
		this.Horns8.render(par7);
		this.Horns9.render(par7);
		this.Horns10.render(par7);
		this.Horns11.render(par7);
		this.Horns12.render(par7);
		this.Horns13.render(par7);
		this.Horns14.render(par7);
		this.Horns15.render(par7);
		this.Horns16.render(par7);
		this.BigHorn1.render(par7);
		this.BigHorn2.render(par7);
		this.BigHorn3.render(par7);
		this.BigHorn4.render(par7);
		this.BigHorn5.render(par7);
		this.BigHorn6.render(par7);
		this.BigHorn7.render(par7);
		this.BigHorn8.render(par7);
		this.BigHorn9.render(par7);
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