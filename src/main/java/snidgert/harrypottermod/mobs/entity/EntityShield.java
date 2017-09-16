package snidgert.harrypottermod.mobs.entity;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import snidgert.harrypottermod.MainClass;

public class EntityShield extends EntityAnimal {

	public EntityShield(final World par1World) {
		super(par1World);
		this.setSize(4.0f, 4.0f);
		this.setHealth(20.0f);
		((PathNavigateGround) this.getNavigator()).setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4f));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0, true));
		this.tasks.addTask(6, new EntityAIMate(this, 1.0));
		this.tasks.addTask(7, new EntityAIWander(this, 2.0));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		final EntityPlayer player = this.worldObj.getClosestPlayer(this.posX, this.posY, this.posZ, 9.9999999999E10);
		if (!player.isSneaking() || player.capabilities.isFlying) {
			final Vec3 look = player.getLookVec();
			this.setPosition(((Entity) player).posX, ((Entity) player).posY - 2.0, ((Entity) player).posZ);
		}
		if (player.isSneaking() && !player.capabilities.isFlying) {
			this.setDead();
		}
		final List list1 = this.worldObj.getEntitiesWithinAABB(EntityFireball.class, new AxisAlignedBB(this.posX, this.posY, this.posZ, this.posX + 1.0, this.posY + 1.0, this.posZ + 1.0).expand(5.0, 5.0, 5.0));
		for (int j1 = 0; j1 < list1.size(); ++j1) {
			final EntityFireball entityitem = (EntityFireball) list1.get(j1);
			if (entityitem != null) {
				entityitem.setDead();
			}
		}
		if (!player.isPotionActive(MainClass.ShieldEffect)) {
			this.setDead();
		}
	}

	@Override
	public void onDeath(final DamageSource par1DamageSource) {
		this.setDead();
		super.onDeath(par1DamageSource);
	}

	@Override
	public void handleStatusUpdate(final byte par1) {
		if (par1 == 4) {
			this.playSound("mob.irongolem.throw", 1.0f, 1.0f);
		} else {
			super.handleStatusUpdate(par1);
		}
	}

	@Override
	public EntityAgeable createChild(final EntityAgeable entityageable) {
		return null;
	}
}
