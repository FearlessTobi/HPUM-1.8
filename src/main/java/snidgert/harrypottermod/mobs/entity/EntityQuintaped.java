package snidgert.harrypottermod.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityQuintaped extends EntityMob {

	private int conversionTime;

	public EntityQuintaped(final World par1World) {
		super(par1World);
		((PathNavigateGround) this.getNavigator()).setBreakDoors(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIBreakDoor(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0, false));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0, true));
		this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.0));
		this.tasks.addTask(5, new EntityAIMoveThroughVillage(this, 1.0, false));
		this.tasks.addTask(6, new EntityAIWander(this, 1.0));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true, false, null));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false, false, null));
		this.setSize(1.5f, 2.5f);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(15.0);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.getDataWatcher().addObject(12, (byte) 0);
		this.getDataWatcher().addObject(13, (byte) 0);
		this.getDataWatcher().addObject(14, (byte) 0);
	}

	@Override
	protected String getLivingSound() {
		return "mob.cat.living";
	}

	@Override
	protected String getHurtSound() {
		return "mob.cat.hurt";
	}

	@Override
	protected String getDeathSound() {
		return "mob.cat.death";
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound("mob.wolf.step", 0.15f, 1.0f);
	}
}
