package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityDementor extends EntityMob { //DONE: Refactoring

	private float heightOffset;
	private int heightOffsetUpdateTime;
	private int field_70846_g;

	public EntityDementor(final World par1World) {
		super(par1World);
		this.heightOffset = 0.5f;
		this.isImmuneToFire = true;
		this.experienceValue = 10;

		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 0.75D, false));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}

	public EntityDementor(final World par1World, final double par2, final double par4, final double par6) {
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
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.43000000417232515);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(16, new Byte((byte) 0));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender(final float par1) {
		return 15728880;
	}

	@Override
	public float getBrightness(final float par1) {
		return 1.0f;
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
			this.isAirBorne = false; //Important for attack in the air
		}

		final int i = MathHelper.floor_double(this.posX);
		int j = MathHelper.floor_double(this.posZ);
		j = MathHelper.floor_double(this.posX + (i % 2 * 2 - 1) * 0.25f);
		final int k = MathHelper.floor_double(this.posY);
		final int l = MathHelper.floor_double(this.posZ + (i / 2 % 2 * 2 - 1) * 0.25f);
		makeIceAndSnow(j, k, l);

		super.updateAITasks();
	}

	@Override
	public void fall(float distance, float damageMultiplier) {
	}

	@Override
	protected boolean isValidLightLevel() {
		return true;
	}

	public void makeIceAndSnow(int j, int k, int l) {
		if (this.worldObj.getBiomeGenForCoords(new BlockPos(j, 0, l)).getFloatTemperature(new BlockPos(l, l, l)) < 0.8f && Blocks.snow_layer.canPlaceBlockAt(this.worldObj, new BlockPos(j, k, l))) {
			if (this.worldObj.getBlockState(new BlockPos(j, k, l)).getBlock() != Blocks.snow_layer) {
				this.setPosition(this.posX, this.posY + 0.2, this.posZ);
				this.worldObj.setBlockState(new BlockPos(j, k, l), Blocks.snow_layer.getDefaultState());
			}
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k - 1, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k - 1, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k - 1, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k - 1, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k - 1, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k - 1, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k - 1, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k - 1, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k - 1, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k - 1, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k - 1, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k - 1, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k - 1, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k - 1, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k - 1, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k - 1, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k - 1, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k - 1, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k - 1, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k - 1, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k - 1, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k - 1, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k - 1, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k - 1, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k - 1, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k - 1, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k - 1, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k - 1, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k - 1, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k - 1, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k - 1, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k - 1, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k - 1, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k - 1, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k - 1, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k - 1, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k - 1, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k - 1, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k - 1, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k - 1, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k - 1, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k - 1, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k - 1, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k - 1, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k - 1, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k - 1, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k - 1, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k - 1, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k - 1, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k - 1, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k + 1, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k + 1, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k + 1, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k + 1, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k + 1, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k + 1, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k + 1, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k + 1, l)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k + 1, l), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k + 1, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k + 1, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k + 1, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k + 1, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k + 1, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k + 1, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j, k + 1, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j, k + 1, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k + 1, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k + 1, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k + 1, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k + 1, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k + 1, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k + 1, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k + 1, l - 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k + 1, l - 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k + 1, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k + 1, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k + 1, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k + 1, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k + 1, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k + 1, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 1, k + 1, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 1, k + 1, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k + 1, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k + 1, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k + 1, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k + 1, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k + 1, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k + 1, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k + 1, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k + 1, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k + 1, l + 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k + 1, l + 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 2, k + 1, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 2, k + 1, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j + 1, k + 1, l - 2)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j + 1, k + 1, l - 2), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
		if (this.worldObj.getBlockState(new BlockPos(j - 2, k + 1, l + 1)).getBlock() == Blocks.water) {
			this.worldObj.setBlockState(new BlockPos(j - 2, k + 1, l + 1), Blocks.ice.getDefaultState());
			this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, 1.2f);
		}
	}

}