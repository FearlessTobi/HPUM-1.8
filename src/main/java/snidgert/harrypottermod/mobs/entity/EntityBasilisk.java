package snidgert.harrypottermod.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureAttribute;
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
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import snidgert.harrypottermod.MainClass;

public class EntityBasilisk extends EntityMob implements IBossDisplayData {

	private int conversionTime;

	public EntityBasilisk(final World par1World) {
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
		this.setSize(3.0f, 10.0f);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(13.0);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.getDataWatcher().addObject(12, (byte) 0);
		this.getDataWatcher().addObject(13, (byte) 0);
		this.getDataWatcher().addObject(14, (byte) 0);
		this.dataWatcher.addObject(17, new Integer(0));
		this.dataWatcher.addObject(18, new Integer(0));
		this.dataWatcher.addObject(19, new Integer(0));
		this.dataWatcher.addObject(20, new Integer(0));
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
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}

	@Override
	protected void dropFewItems(final boolean p_70628_1_, final int p_70628_2_) {
		for (int j = this.rand.nextInt(3 + p_70628_2_), k = 0; k < j; ++k) {
			this.dropItem(MainClass.BasiliskScale, 1);
		}
		for (int j = this.rand.nextInt(3 + p_70628_2_), k = 0; k < j; ++k) {
			this.dropItem(MainClass.BFang, 1);
		}
	}
}
