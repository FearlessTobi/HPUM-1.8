package snidgert.harrypottermod.mobs.entity;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import snidgert.harrypottermod.projectiles.IncendioProjectile;

public class EntityFireCrab extends EntityAnimal implements IRangedAttackMob {

	private int field_70846_g;

	public EntityFireCrab(final World par1World) {
		super(par1World);
		this.setSize(1.0f, 1.0f);
		((PathNavigateGround) this.getNavigator()).setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAIArrowAttack(this, 1.25, 20, 10.0f));
		this.tasks.addTask(2, new EntityAIWander(this, 1.0));
		this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
		this.tasks.addTask(4, new EntityAILookIdle(this));
		this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, true));
	}

	public EntityFireCrab(final World par1World, final double par2, final double par4, final double par6) {
		this(par1World);
		this.setPosition(par2, par4, par6);
		this.motionX = 0.0;
		this.motionY = 0.0;
		this.motionZ = 0.0;
		this.prevPosX = par2;
		this.prevPosY = par4;
		this.prevPosZ = par6;
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
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
	public void attackEntityWithRangedAttack(final EntityLivingBase par1EntityLivingBase, final float par2) {
		final double d0 = ((Entity) par1EntityLivingBase).posX - this.posX;
		final double d2 = ((Entity) par1EntityLivingBase).posY + par1EntityLivingBase.getEyeHeight() - 1.100000023841858 - ((Entity) par1EntityLivingBase).posY;
		final double d3 = ((Entity) par1EntityLivingBase).posZ - this.posZ;
		final float f1 = MathHelper.sqrt_double(d0 * d0 + d3 * d3) * 0.2f;
		final IncendioProjectile entitysnowball = new IncendioProjectile(this.worldObj, this, d0 + this.rand.nextGaussian() * f1, d2, d3 + this.rand.nextGaussian() * f1);
		entitysnowball.posY = this.posY + this.height / 2.0f + 0.5;
		this.worldObj.spawnEntityInWorld(entitysnowball);
	}

	@Override
	protected void entityInit() {
		final Random rnd = new Random();
		final int two = rnd.nextInt(2);
		this.dataWatcher.addObject(16, (byte) 0);
		this.getDataWatcher().addObject(25, 2);
		this.dataWatcher.updateObject(25, two);
		super.entityInit();
	}

	public int getTextureType() {
		return this.dataWatcher.getWatchableObjectInt(25);
	}

	@Override
	public EntityWolf createChild(final EntityAgeable var1) {
		return null;
	}
}
