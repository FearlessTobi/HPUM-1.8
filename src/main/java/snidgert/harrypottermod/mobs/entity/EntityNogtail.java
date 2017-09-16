package snidgert.harrypottermod.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityNogtail extends EntityAnimal {

	private final EntityAIControlledByPlayer aiControlledByPlayer;
	private static final String __OBFID = "CL_00001647";

	public EntityNogtail(final World p_i1689_1_) {
		super(p_i1689_1_);
		this.setSize(0.9f, 0.9f);
		((PathNavigateGround) this.getNavigator()).setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.25));
		this.tasks.addTask(2, this.aiControlledByPlayer = new EntityAIControlledByPlayer(this, 0.3f));
		this.tasks.addTask(3, new EntityAIMate(this, 1.0));
		this.tasks.addTask(4, new EntityAITempt(this, 1.2, Items.carrot_on_a_stick, false));
		this.tasks.addTask(4, new EntityAITempt(this, 1.2, Items.carrot, false));
		this.tasks.addTask(5, new EntityAIFollowParent(this, 1.1));
		this.tasks.addTask(6, new EntityAIWander(this, 1.0));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
		this.tasks.addTask(8, new EntityAILookIdle(this));
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
	public void writeEntityToNBT(final NBTTagCompound p_70014_1_) {
		super.writeEntityToNBT(p_70014_1_);
	}

	@Override
	public void readEntityFromNBT(final NBTTagCompound p_70037_1_) {
		super.readEntityFromNBT(p_70037_1_);
	}

	@Override
	protected String getLivingSound() {
		return "mob.pig.say";
	}

	@Override
	protected String getHurtSound() {
		return "mob.pig.say";
	}

	@Override
	protected String getDeathSound() {
		return "mob.pig.death";
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {
		this.playSound("mob.pig.step", 0.15f, 1.0f);
	}

	protected Item func_146068_u() {
		return this.isBurning() ? Items.cooked_porkchop : Items.porkchop;
	}

	@Override
	public EntityNogtail createChild(final EntityAgeable p_90011_1_) {
		return new EntityNogtail(this.worldObj);
	}

	@Override
	public boolean isBreedingItem(final ItemStack p_70877_1_) {
		return p_70877_1_ != null && p_70877_1_.getItem() == Items.carrot;
	}
}
