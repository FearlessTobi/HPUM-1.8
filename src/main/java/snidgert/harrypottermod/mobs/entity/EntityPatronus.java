package snidgert.harrypottermod.mobs.entity;

import java.util.List;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
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
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityPatronus extends EntityWolfBase { //DONE: Refactoring

	public EntityPatronus(final World par1World) {
		super(par1World);
		setSize(1.5f, 2.0f);
		((PathNavigateGround) this.getNavigator()).setAvoidsWater(true);
		tasks.addTask(1, new EntityAISwimming(this));
		tasks.addTask(2, super.aiSit);
		tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4f));
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
	public void onUpdate() {
		super.onUpdate();
		final List list1 = worldObj.getEntitiesWithinAABB(EntityLiving.class, new AxisAlignedBB(posX, posY, posZ, posX + 1.0, posY + 1.0, posZ + 1.0).expand(1.0, 1.0, 1.0));
		for (int j2 = 0; j2 < list1.size(); ++j2) {
			final EntityLiving entityitem = (EntityLiving) list1.get(j2);
			if (entityitem instanceof IMob) {
				entityitem.attackEntityFrom(DamageSource.causeMobDamage(this), 2 + rand.nextInt(15));
			}
		}
		final EntityPlayer player = worldObj.getClosestPlayer(posX, posY, posZ, 9.9999999999E10);
		if (player != null && player.isSneaking() && !player.capabilities.isFlying) {
			setDead();
		}
	}

	public EntityPatronus spawnBabyAnimal(final EntityAgeable par1EntityAgeable) {
		final EntityPatronus entitywolf = new EntityPatronus(worldObj);
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
			if (par1EntityLivingBase instanceof EntityPatronus) {
				final EntityPatronus entitywolf = (EntityPatronus) par1EntityLivingBase;
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
