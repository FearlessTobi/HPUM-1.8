package snidgert.harrypottermod.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.potion.Potion;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityRatForm extends EntityHorse {

	public boolean FlyUp;
	private boolean field_110294_bI;
	private int field_110285_bP;

	public EntityRatForm(final World par1World) {
		super(par1World);
		this.setSize(1.0f, 0.5f);
		this.setHorseTamed(true);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (this.riddenByEntity != null) {
			if (this.FlyUp && this.onGround) {
				this.addVelocity(0.0, 0.5, 0.0);
				this.FlyUp = false;
			}
			if (this.riddenByEntity.isSneaking()) {
				this.setDead();
				this.riddenByEntity.noClip = false;
				this.riddenByEntity.setInvisible(false);
			}
		} else {
			this.setDead();
		}
	}

	@Override
	protected String getHurtSound() {
		return null;
	}

	@Override
	protected String getDeathSound() {
		return null;
	}

	@Override
	protected String getLivingSound() {
		return null;
	}

	@Override
	protected String getAngrySoundName() {
		return null;
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
	}

	@Override
	public void moveEntityWithHeading(float par1, float par2) {
		if (this.riddenByEntity != null) {
			final float rotationYaw = this.riddenByEntity.rotationYaw;
			this.rotationYaw = rotationYaw;
			this.prevRotationYaw = rotationYaw;
			this.rotationPitch = this.riddenByEntity.rotationPitch * 0.5f;
			this.setRotation(this.rotationYaw, this.rotationPitch);
			final float rotationYaw2 = this.rotationYaw;
			this.renderYawOffset = rotationYaw2;
			this.rotationYawHead = rotationYaw2;
			par1 = ((EntityLivingBase) this.riddenByEntity).moveStrafing * 0.5f;
			par2 = ((EntityLivingBase) this.riddenByEntity).moveForward;
			if (par2 <= 0.0f) {
				par2 *= 0.25f;
				this.field_110285_bP = 0;
			}
			if (this.onGround && super.jumpPower == 0.0f && this.isRearing() && !this.field_110294_bI) {
				par1 = 0.0f;
				par2 = 0.0f;
			}
			if (super.jumpPower > 0.0f && !this.isHorseJumping() && this.onGround) {
				this.motionY = this.getHorseJumpStrength() * super.jumpPower;
				if (this.isPotionActive(Potion.jump)) {
					this.motionY += (this.getActivePotionEffect(Potion.jump).getAmplifier() + 1) * 0.1f;
				}
				this.setHorseJumping(true);
				this.isAirBorne = true;
				if (par2 > 0.0f) {
					final float f2 = MathHelper.sin(this.rotationYaw * 3.1415927f / 180.0f);
					final float f3 = MathHelper.cos(this.rotationYaw * 3.1415927f / 180.0f);
					this.motionX += -0.4f * f2 * super.jumpPower;
					this.motionZ += 0.4f * f3 * super.jumpPower;
					this.playSound("mob.horse.jump", 0.4f, 1.0f);
				}
				super.jumpPower = 0.0f;
			}
			this.stepHeight = 1.0f;
			this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1f;
			if (!this.worldObj.isRemote) {
				this.setAIMoveSpeed((float) this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue());
				super.moveEntityWithHeading(par1, par2);
			}
			if (this.onGround) {
				super.jumpPower = 0.0f;
				this.setHorseJumping(false);
			}
			this.prevLimbSwingAmount = this.limbSwingAmount;
			final double d0 = this.posX - this.prevPosX;
			final double d2 = this.posZ - this.prevPosZ;
			float f4 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 4.0f;
			if (f4 > 1.0f) {
				f4 = 1.0f;
			}
			this.limbSwingAmount += (f4 - this.limbSwingAmount) * 0.4f;
			this.limbSwing += this.limbSwingAmount;
		} else {
			this.stepHeight = 0.5f;
			this.jumpMovementFactor = 0.02f;
			super.moveEntityWithHeading(par1, par2);
		}
	}

	@Override
	public EntityAgeable createChild(final EntityAgeable var1) {
		return null;
	}
}
