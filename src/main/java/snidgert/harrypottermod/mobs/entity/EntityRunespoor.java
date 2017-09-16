package snidgert.harrypottermod.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityRunespoor extends EntityAnimal {

	private static final String __OBFID = "CL_00001647";

	public EntityRunespoor(final World p_i1689_1_) {
		super(p_i1689_1_);
		this.setSize(0.9f, 0.9f);
		((PathNavigateGround) this.getNavigator()).setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(6, new EntityAIWander(this, 1.0));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, true));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0, true));
	}

	@Override
	public boolean attackEntityAsMob(final Entity p_70652_1_) {
		this.worldObj.setEntityState(this, (byte) 4);
		final boolean flag = p_70652_1_.attackEntityFrom(DamageSource.causeMobDamage(this), 7 + this.rand.nextInt(15));
		return flag;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
	}

	@Override
	protected void updateAITasks() {
		super.updateAITasks();
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(16, (byte) 0);
	}

	@Override
	protected String getLivingSound() {
		return "harrypottermod:Hiss1";
	}

	@Override
	protected String getDeathSound() {
		return "harrypottermod:hiss2";
	}

	protected String getAngrySoundName() {
		return null;
	}

	@Override
	protected String getHurtSound() {
		return "harrypottermod:hiss2";
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {

	}

	@Override
	public EntityRunespoor createChild(final EntityAgeable p_90011_1_) {
		return null;
	}
}
