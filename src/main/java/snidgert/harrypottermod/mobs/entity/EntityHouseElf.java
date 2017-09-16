package snidgert.harrypottermod.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import snidgert.harrypottermod.MainClass;
import snidgert.harrypottermod.projectiles.StupefyProjectile;

public class EntityHouseElf extends EntityWolf implements IRangedAttackMob {

	private int field_70846_g;

	public EntityHouseElf(final World par1World) {
		super(par1World);
		this.setSize(1.0f, 1.0f);
		((PathNavigateGround) this.getNavigator()).setAvoidsWater(true);
		((PathNavigateGround) this.getNavigator()).setAvoidsWater(true);
		((PathNavigateGround) this.getNavigator()).setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAIArrowAttack(this, 1.25, 20, 10.0f));
		this.tasks.addTask(2, new EntityAIWander(this, 1.0));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
		this.tasks.addTask(4, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, true, false, CustomMobSelectors.mobSelectorWolf));
	}

	public EntityHouseElf(final World par1World, final double par2, final double par4, final double par6) {
		this(par1World);
		this.setPosition(par2, par4, par6);
		this.motionX = 0.0;
		this.motionY = 0.0;
		this.motionZ = 0.0;
		this.prevPosX = par2;
		this.prevPosY = par4;
		this.prevPosZ = par6;
	}

	protected boolean teleportRandomly() {
		final double d0 = this.posX + (this.rand.nextDouble() - 0.5) * 64.0;
		final double d2 = this.posY + (this.rand.nextInt(64) - 32);
		final double d3 = this.posZ + (this.rand.nextDouble() - 0.5) * 64.0;
		return this.teleportTo(d0, d2, d3);
	}

	@Override
	public void onLivingUpdate() {
		if (this.isWet() || this.isBurning()) {
			this.setAttackTarget(null);
			this.teleportRandomly();
		}
		this.isJumping = false;
		if (this.getAttackTarget() != null) {
			this.faceEntity(this.getAttackTarget(), 100.0f, 100.0f);
		}
		if (!this.worldObj.isRemote && this.isEntityAlive() && this.getAttackTarget() != null && this.getAttackTarget().getDistanceSqToEntity(this) < 16.0) {
			this.teleportRandomly();
		}
		super.onLivingUpdate();
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound("mob.zombie.step", 0.15f, 1.0f);
	}

	@Override
	protected String getLivingSound() {
		return null;
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
	protected float getSoundVolume() {
		return 0.4f;
	}

	@Override
	public boolean interact(EntityPlayer player) {
		ItemStack itemstack = player.inventory.getCurrentItem();
		if (this.isTamed()) {
			if (itemstack != null) {
				if (itemstack.getItem() instanceof ItemFood) {
					ItemFood itemfood = (ItemFood) itemstack.getItem();

					if (itemfood.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectFloat(18) < 20.0F) {
						if (!player.capabilities.isCreativeMode) {
							--itemstack.stackSize;
						}

						this.heal(itemfood.getHealAmount(itemstack));

						if (itemstack.stackSize <= 0) {
							player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
						}

						return true;
					}
				} else if (itemstack.getItem() == Items.dye) {
					EnumDyeColor enumdyecolor = EnumDyeColor.byDyeDamage(itemstack.getMetadata());

					if (enumdyecolor != this.getCollarColor()) {
						this.setCollarColor(enumdyecolor);

						if (!player.capabilities.isCreativeMode && --itemstack.stackSize <= 0) {
							player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
						}

						return true;
					}
				}
			}

			if (this.isOwner(player) && !this.worldObj.isRemote && !this.isBreedingItem(itemstack)) {
				this.aiSit.setSitting(!this.isSitting());
				this.isJumping = false;
				this.navigator.clearPathEntity();
				this.setAttackTarget((EntityLivingBase) null);
			}
		} else if (itemstack != null && itemstack.getItem() == MainClass.Sock && !this.isAngry()) {
			if (!player.capabilities.isCreativeMode) {
				--itemstack.stackSize;
			}

			if (itemstack.stackSize <= 0) {
				player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack) null);
			}

			if (!this.worldObj.isRemote) {
				if (this.rand.nextInt(3) == 0) {
					this.setTamed(true);
					this.navigator.clearPathEntity();
					this.setAttackTarget((EntityLivingBase) null);
					this.aiSit.setSitting(true);
					this.setHealth(20.0F);
					this.setOwnerId(player.getUniqueID().toString());
					this.playTameEffect(true);
					this.worldObj.setEntityState(this, (byte) 7);
				} else {
					this.playTameEffect(false);
					this.worldObj.setEntityState(this, (byte) 6);
				}
			}

			return true;
		}

		return true;
	}

	protected boolean teleportToEntity(final Entity par1Entity) {
		Vec3 vec3 = new Vec3(this.posX - par1Entity.posX, this.getEntityBoundingBox().minY + this.height / 2.0f - par1Entity.posY + par1Entity.getEyeHeight(), this.posZ - par1Entity.posZ);
		vec3 = vec3.normalize();
		final double d0 = 16.0;
		final double d2 = this.posX + (this.rand.nextDouble() - 0.5) * 8.0 - vec3.xCoord * d0;
		final double d3 = this.posY + (this.rand.nextInt(16) - 8) - vec3.yCoord * d0;
		final double d4 = this.posZ + (this.rand.nextDouble() - 0.5) * 8.0 - vec3.zCoord * d0;
		return this.teleportTo(d2, d3, d4);
	}

	protected boolean teleportTo(final double par1, final double par3, final double par5) {
		final EnderTeleportEvent event = new EnderTeleportEvent(this, par1, par3, par5, 0.0f);
		if (MinecraftForge.EVENT_BUS.post(event)) {
			return false;
		}
		final double d3 = this.posX;
		final double d4 = this.posY;
		final double d5 = this.posZ;
		this.posX = event.targetX;
		this.posY = event.targetY;
		this.posZ = event.targetZ;
		boolean flag = false;
		final int i = MathHelper.floor_double(this.posX);
		int j = MathHelper.floor_double(this.posY);
		final int k = MathHelper.floor_double(this.posZ);
		if (this.worldObj.isBlockLoaded(new BlockPos(i, j, k))) {
			boolean flag2 = false;
			while (!flag2 && j > 0) {
				final Block block = this.worldObj.getBlockState(new BlockPos(i, j - 1, k)).getBlock();
				if (block.getMaterial().blocksMovement()) {
					flag2 = true;
				} else {
					--this.posY;
					--j;
				}
			}
			if (flag2) {
				this.setPosition(this.posX, this.posY, this.posZ);
				if (this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() && !this.worldObj.isAnyLiquid(this.getEntityBoundingBox())) {
					flag = true;
				}
			}
		}
		if (!flag) {
			this.setPosition(d3, d4, d5);
			return false;
		}
		final short short1 = 128;
		for (int l = 0; l < short1; ++l) {
			final double d6 = l / (short1 - 1.0);
			final float f = (this.rand.nextFloat() - 0.5f) * 0.2f;
			final float f2 = (this.rand.nextFloat() - 0.5f) * 0.2f;
			final float f3 = (this.rand.nextFloat() - 0.5f) * 0.2f;
			final double d7 = d3 + (this.posX - d3) * d6 + (this.rand.nextDouble() - 0.5) * this.width * 2.0;
			final double d8 = d4 + (this.posY - d4) * d6 + this.rand.nextDouble() * this.height;
			final double d9 = d5 + (this.posZ - d5) * d6 + (this.rand.nextDouble() - 0.5) * this.width * 2.0;
			this.worldObj.spawnParticle(EnumParticleTypes.PORTAL, d7, d8, d9, f, f2, f3);
		}
		this.worldObj.playSoundEffect(d3, d4, d5, "mob.endermen.portal", 1.0f, 1.0f);
		this.playSound("mob.endermen.portal", 1.0f, 1.0f);
		return true;
	}

	@Override
	public void attackEntityWithRangedAttack(final EntityLivingBase par1EntityLivingBase, final float par2) {
		final double d0 = ((Entity) par1EntityLivingBase).posX - this.posX;
		final double d2 = ((Entity) par1EntityLivingBase).posY + par1EntityLivingBase.getEyeHeight() - 1.100000023841858 - ((Entity) par1EntityLivingBase).posY;
		final double d3 = ((Entity) par1EntityLivingBase).posZ - this.posZ;
		final float f1 = MathHelper.sqrt_double(d0 * d0 + d3 * d3) * 0.2f;
		final StupefyProjectile entitysnowball = new StupefyProjectile(this.worldObj, this, d0 + this.rand.nextGaussian() * f1, d2, d3 + this.rand.nextGaussian() * f1);
		entitysnowball.posY = this.posY + this.height / 2.0f + 0.5;
		this.worldObj.spawnEntityInWorld(entitysnowball);
	}

	public void func_70844_e(final boolean par1) {
		byte var2 = this.dataWatcher.getWatchableObjectByte(16);
		if (par1) {
			var2 |= 0x1;
		} else {
			var2 &= 0xFFFFFFFE;
		}
		this.dataWatcher.updateObject(16, var2);
	}

	@Override
	public EntityWolf createChild(final EntityAgeable var1) {
		return null;
	}
}
