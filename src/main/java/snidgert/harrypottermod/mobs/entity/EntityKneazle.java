package snidgert.harrypottermod.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityKneazle extends EntityWolfBase { //DONE: Refactoring

	public EntityKneazle(final World par1World) {
		super(par1World);
		setSize(1.0f, 1.0f);
		((PathNavigateGround) this.getNavigator()).setAvoidsWater(true);
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, super.aiSit);
		tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0, true));
		tasks.addTask(5, new EntityAIFollowOwner(this, 1.0, 10.0f, 2.0f));
		tasks.addTask(6, new EntityAIMate(this, 1.0));
		tasks.addTask(7, new EntityAIWander(this, 2.0));
		tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
		tasks.addTask(9, new EntityAILookIdle(this));
		targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
		targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
		targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
		targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, true, false, CustomMobSelectors.mobSelectorWolf));
		setTamed(false);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		dataWatcher.addObject(18, new Float(getHealth()));
		dataWatcher.addObject(19, new Byte((byte) 0));
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
		playSound("mob.wolf.step", 0.15f, 1.0f);
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

	public EntityKneazle spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
		final EntityKneazle entitywolf = new EntityKneazle(worldObj);
		final String s = getOwnerId();
		if (s != null && s.trim().length() > 0) {
			entitywolf.setOwnerId(s);
			entitywolf.setTamed(true);
		}
		return entitywolf;
	}

	@Override
	public boolean shouldAttackEntity(final EntityLivingBase par1EntityLivingBase, final EntityLivingBase par2EntityLivingBase) {
		if (!(par1EntityLivingBase instanceof EntityCreeper) && !(par1EntityLivingBase instanceof EntityGhast)) {
			if (par1EntityLivingBase instanceof EntityKneazle) {
				final EntityKneazle entitywolf = (EntityKneazle) par1EntityLivingBase;
			}
			return (!(par1EntityLivingBase instanceof EntityPlayer) || !(par2EntityLivingBase instanceof EntityPlayer) || ((EntityPlayer) par2EntityLivingBase).canAttackPlayer((EntityPlayer) par1EntityLivingBase)) && (!(par1EntityLivingBase instanceof EntityHorse) || !((EntityHorse) par1EntityLivingBase).isTame());
		}
		return false;
	}

	@Override
	public EntityAgeable createChild(final EntityAgeable par1EntityAgeable) {
		return spawnBabyAnimal(par1EntityAgeable);
	}
}
