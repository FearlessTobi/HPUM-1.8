package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import snidgert.harrypottermod.projectiles.StupefyProjectile;

public class EntityBook extends EntityMob { //DONE: Refactoring

	private float heightOffset;
	private int heightOffsetUpdateTime;
	private int field_70846_g;

	public EntityBook(final World par1World) {
		super(par1World);
		this.heightOffset = 0.5f;
		this.experienceValue = 10;
		this.tasks.addTask(4, new AIStupefyAttack(this));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));

	}

	public EntityBook(final World par1World, final double par2, final double par4, final double par6) {
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
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(48.0D);
	}

	@Override
	protected void updateAITasks() {

		if (this.isWet()) {
			this.attackEntityFrom(DamageSource.drown, 1.0F);
		}

		--this.heightOffsetUpdateTime;

		if (this.heightOffsetUpdateTime <= 0) {
			this.heightOffsetUpdateTime = 100;
			this.heightOffset = 0.5F + (float) this.rand.nextGaussian() * 3.0F;
		}

		EntityLivingBase entitylivingbase = this.getAttackTarget();

		if (entitylivingbase != null && entitylivingbase.posY + entitylivingbase.getEyeHeight() > this.posY + this.getEyeHeight() + this.heightOffset) {
			this.motionY += (0.30000001192092896D - this.motionY) * 0.30000001192092896D;
			this.isAirBorne = true;
		}

		super.updateAITasks();
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(16, new Byte((byte) 0));
	}

	@Override
	public int getBrightnessForRender(final float par1) {
		return 15728880;
	}

	@Override
	public float getBrightness(final float par1) {
		return 1.0f;
	}

	@Override
	public void onLivingUpdate() {

		if (!this.onGround && this.motionY < 0.0D) {
			this.motionY *= 0.6D;
		}

		super.onLivingUpdate();
	}

	@Override
	public void fall(float distance, float damageMultiplier) {
	}

	public boolean func_70845_n() {
		return (this.dataWatcher.getWatchableObjectByte(16) & 0x1) != 0x0;
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

	@Override
	protected boolean isValidLightLevel() {
		return true;
	}

	static class AIStupefyAttack extends EntityAIBase {

		private EntityBook book;
		private int field_179467_b;
		private int attackTime;

		public AIStupefyAttack(EntityBook entityBookIn) {
			this.book = entityBookIn;
			this.setMutexBits(3);
		}

		/**
		 * Returns whether the EntityAIBase should begin execution.
		 */
		@Override
		public boolean shouldExecute() {
			EntityLivingBase entitylivingbase = this.book.getAttackTarget();
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
			this.book.setOnFire(false);
		}

		/**
		 * Updates the task
		 */
		@Override
		public void updateTask() {
			--this.attackTime;
			EntityLivingBase entitylivingbase = this.book.getAttackTarget();
			double distanceSquaredToPlayer = this.book.getDistanceSqToEntity(entitylivingbase);

			if (distanceSquaredToPlayer < 256.0D) {
				double d1 = entitylivingbase.posX - this.book.posX;
				double d2 = entitylivingbase.getEntityBoundingBox().minY + entitylivingbase.height / 2.0F - (this.book.posY + this.book.height / 2.0F);
				double d3 = entitylivingbase.posZ - this.book.posZ;

				if (this.attackTime <= 0) {
					++this.field_179467_b;

					if (this.field_179467_b == 1) {
						this.attackTime = 60 / 2;
					} else if (this.field_179467_b <= 4) {
						this.attackTime = 6;
					} else {
						this.attackTime = 100 / 2;
						this.field_179467_b = 0;
						this.book.setOnFire(false);
					}

					if (this.field_179467_b > 1) {
						float f = MathHelper.sqrt_float(MathHelper.sqrt_double(distanceSquaredToPlayer)) * 0.5F;
						this.book.worldObj.playAuxSFXAtEntity((EntityPlayer) null, 1009, new BlockPos((int) this.book.posX, (int) this.book.posY, (int) this.book.posZ), 0);

						for (int i = 0; i < 1; ++i) {
							StupefyProjectile stupefyprojectile = new StupefyProjectile(this.book.worldObj, this.book, d1 + this.book.getRNG().nextGaussian() * f, d2, d3 + this.book.getRNG().nextGaussian() * f);
							stupefyprojectile.posY = this.book.posY + this.book.height / 2.0F + 0.5D;
							this.book.worldObj.spawnEntityInWorld(stupefyprojectile);
						}
					}
				}

				this.book.getLookHelper().setLookPositionWithEntity(entitylivingbase, 10.0F, 10.0F);
			} else {
				this.book.getNavigator().clearPathEntity();
				this.book.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
			}

			super.updateTask();
		}
	}

}
