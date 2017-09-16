package snidgert.harrypottermod.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityFiendfyreDragon extends EntityMob { //DONE: Refactoring

	private float heightOffset;
	private int heightOffsetUpdateTime;
	private int field_70846_g;
	private BlockPos currentFlightTarget;

	public EntityFiendfyreDragon(final World par1World) {
		super(par1World);
		this.isImmuneToFire = true;
		this.heightOffset = 0.5f;
		this.setSize(4.0f, 4.0f);
		this.experienceValue = 10;
		this.tasks.addTask(4, new AIFireballAttack(this));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}

	public EntityFiendfyreDragon(final World par1World, final double par2, final double par4, final double par6) {
		this(par1World);
		this.setPosition(par2, par4 + this.getYOffset(), par6);
		this.motionX = 0.0;
		this.motionY = 0.0;
		this.motionZ = 0.0;
		this.prevPosX = par2;
		this.prevPosY = par4;
		this.prevPosZ = par6;
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(16, new Byte((byte) 0));
	}

	@Override
	public boolean isBurning() {
		return true;
	}

	public void setOnFire(boolean onFire) {
		byte b0 = this.dataWatcher.getWatchableObjectByte(16);

		if (onFire) {
			b0 = (byte) (b0 | 1);
		} else {
			b0 = (byte) (b0 & -2);
		}

		this.dataWatcher.updateObject(16, Byte.valueOf(b0));
	}

	public boolean func_70845_n() {
		return (this.dataWatcher.getWatchableObjectByte(16) & 0x1) != 0x0;
	}

	@Override
	public boolean canBePushed() {
		return false;
	}

	@Override
	protected void collideWithNearbyEntities() {
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(6.0);
	}

	public boolean getIsBatHanging() {
		return false;
	}

	public void setIsBatHanging(final boolean par1) {
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (this.getIsBatHanging()) {
			final double motionX = 0.0;
			this.motionZ = motionX;
			this.motionY = motionX;
			this.motionX = motionX;
			this.posY = MathHelper.floor_double(this.posY) + 1.0 - this.height;
		} else {
			this.motionY *= 0.6000000238418579;
		}
		final EntityPlayer player = this.worldObj.getClosestPlayer(this.posX, this.posY, this.posZ, 9.9999999999E10);
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

	protected String getAngrySoundName() {
		return null;
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
	}

	@Override
	protected void updateAITasks() {
		super.updateAITasks();
		if (this.getIsBatHanging()) {
			if (this.rand.nextInt(200) == 0) {
				this.rotationYawHead = this.rand.nextInt(360);
			}
			if (this.worldObj.getClosestPlayerToEntity(this, 4.0) != null) {
				this.setIsBatHanging(false);
				this.worldObj.playAuxSFXAtEntity((EntityPlayer) null, 1015, new BlockPos((int) this.posX, (int) this.posY, (int) this.posZ), 0);
			}
		} else {
			if (this.currentFlightTarget != null && (!this.worldObj.isAirBlock(new BlockPos(this.currentFlightTarget.getX(), this.currentFlightTarget.getY(), this.currentFlightTarget.getZ())) || this.currentFlightTarget.getY() < 1)) {
				this.currentFlightTarget = null;
			}
			if (this.currentFlightTarget == null || this.rand.nextInt(30) == 0 || this.getDistanceSq(this.currentFlightTarget) < 4.0f) {
				this.currentFlightTarget = new BlockPos((int) this.posX + this.rand.nextInt(7) - this.rand.nextInt(7), (int) this.posY + this.rand.nextInt(6) - 2, (int) this.posZ + this.rand.nextInt(7) - this.rand.nextInt(7));
			}
			final double d0 = this.currentFlightTarget.getX() + 0.5 - this.posX;
			final double d2 = this.currentFlightTarget.getY() + 0.1 - this.posY;
			final double d3 = this.currentFlightTarget.getZ() + 0.5 - this.posZ;
			this.motionX += (Math.signum(d0) * 0.5 - this.motionX) * 0.10000000149011612;
			this.motionY += (Math.signum(d2) * 0.699999988079071 - this.motionY) * 0.10000000149011612;
			this.motionY += 0.05 / 2; //Added to get more height
			this.motionZ += (Math.signum(d3) * 0.5 - this.motionZ) * 0.10000000149011612;
			final float f = (float) (Math.atan2(this.motionZ, this.motionX) * 180.0 / 3.141592653589793) - 90.0f;
			final float f2 = MathHelper.wrapAngleTo180_float(f - this.rotationYaw);
			this.moveForward = 0.5f;
			this.rotationYaw += f2;
		}
	}

	@Override
	protected boolean canTriggerWalking() {
		return false;
	}

	@Override
	public void fall(float distance, float damageMultiplier) {
	}

	@Override
	protected void updateFallState(double y, boolean onGroundIn, Block blockIn, BlockPos pos) {
	}

	@Override
	public boolean doesEntityNotTriggerPressurePlate() {
		return true;
	}

	@Override
	public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
		if (this.isEntityInvulnerable(par1DamageSource)) {
			return false;
		}
		if (!this.worldObj.isRemote && this.getIsBatHanging()) {
			this.setIsBatHanging(false);
		}
		return super.attackEntityFrom(par1DamageSource, par2);
	}

	@Override
	public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
		super.readEntityFromNBT(par1NBTTagCompound);
		this.dataWatcher.updateObject(16, par1NBTTagCompound.getByte("BatFlags"));
	}

	@Override
	public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setByte("BatFlags", this.dataWatcher.getWatchableObjectByte(16));
	}

	static class AIFireballAttack extends EntityAIBase {

		private EntityFiendfyreDragon fiendfyredragon;
		private int field_179467_b;
		private int attackTime;

		public AIFireballAttack(EntityFiendfyreDragon p_i45846_1_) {
			this.fiendfyredragon = p_i45846_1_;
			this.setMutexBits(3);
		}

		/**
		 * Returns whether the EntityAIBase should begin execution.
		 */
		@Override
		public boolean shouldExecute() {
			EntityLivingBase entitylivingbase = this.fiendfyredragon.getAttackTarget();
			return entitylivingbase != null && entitylivingbase.isEntityAlive();
		}

		/**
		 * Execute a one shot task or start executing a continuous task
		 */
		@Override
		public void startExecuting() {
			this.field_179467_b = 0;
		}

		/**
		 * Resets the task
		 */
		@Override
		public void resetTask() {
			this.fiendfyredragon.setOnFire(false);
		}

		/**
		 * Updates the task
		 */
		@Override
		public void updateTask() {
			--this.attackTime;
			EntityLivingBase entitylivingbase = this.fiendfyredragon.getAttackTarget();
			double distanceSquaredToPlayer = this.fiendfyredragon.getDistanceSqToEntity(entitylivingbase);

			if (distanceSquaredToPlayer < 256.0D) {
				double d1 = entitylivingbase.posX - this.fiendfyredragon.posX;
				double d2 = entitylivingbase.getEntityBoundingBox().minY + entitylivingbase.height / 2.0F - (this.fiendfyredragon.posY + this.fiendfyredragon.height / 2.0F);
				double d3 = entitylivingbase.posZ - this.fiendfyredragon.posZ;

				if (this.attackTime <= 0) {
					++this.field_179467_b;

					if (this.field_179467_b == 1) {
						this.attackTime = 60 / 2;
						this.fiendfyredragon.setOnFire(true);
					} else if (this.field_179467_b <= 4) {
						this.attackTime = 6;
					} else {
						this.attackTime = 100 / 2;
						this.field_179467_b = 0;
						this.fiendfyredragon.setOnFire(false);
					}

					if (this.field_179467_b > 1) {
						float f = MathHelper.sqrt_float(MathHelper.sqrt_double(distanceSquaredToPlayer)) * 0.5F;
						this.fiendfyredragon.worldObj.playAuxSFXAtEntity((EntityPlayer) null, 1009, new BlockPos((int) this.fiendfyredragon.posX, (int) this.fiendfyredragon.posY, (int) this.fiendfyredragon.posZ), 0);

						for (int i = 0; i < 1; ++i) {
							EntitySmallFireball entitysmallfireball = new EntitySmallFireball(this.fiendfyredragon.worldObj, this.fiendfyredragon, d1 + this.fiendfyredragon.getRNG().nextGaussian() * f, d2, d3 + this.fiendfyredragon.getRNG().nextGaussian() * f);
							entitysmallfireball.posY = this.fiendfyredragon.posY + this.fiendfyredragon.height / 2.0F + 0.5D;
							this.fiendfyredragon.worldObj.spawnEntityInWorld(entitysmallfireball);
						}
					}
				}

				this.fiendfyredragon.getLookHelper().setLookPositionWithEntity(entitylivingbase, 10.0F, 10.0F);
			} else {
				this.fiendfyredragon.getNavigator().clearPathEntity();
				this.fiendfyredragon.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
			}

			super.updateTask();
		}
	}

}
