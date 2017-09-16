package snidgert.harrypottermod.projectiles;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class MagicProjectile extends Entity {

	private int xTile = -1;
	private int yTile = -1;
	private int zTile = -1;
	private Block inTile;
	private boolean inGround;
	public EntityLivingBase shootingEntity;
	private int ticksAlive;
	private int ticksInAir;
	public double accelerationX;
	public double accelerationY;
	public double accelerationZ;
	private static final String __OBFID = "CL_00001717";

	public MagicProjectile(final World par1World) {
		super(par1World);
		this.setSize(1.0f, 1.0f);
	}

	@Override
	protected void entityInit() {
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean isInRangeToRenderDist(final double distance) {
		double d0 = this.getEntityBoundingBox().getAverageEdgeLength() * 4.0D;

		if (Double.isNaN(d0)) {
			d0 = 4.0D;
		}
		d0 = d0 * 64.0D;

		return distance < d0 * d0;
	}

	public MagicProjectile(final World par1World, final double par2, final double par4, final double par6, final double par8, final double par10, final double par12) {
		super(par1World);
		this.setSize(1.0f, 1.0f);
		this.setLocationAndAngles(par2, par4, par6, super.rotationYaw, super.rotationPitch);
		this.setPosition(par2, par4, par6);
		final double d6 = MathHelper.sqrt_double(par8 * par8 + par10 * par10 + par12 * par12);
		this.accelerationX = par8 / d6 * 0.1;
		this.accelerationY = par10 / d6 * 0.1;
		this.accelerationZ = par12 / d6 * 0.1;
	}

	public MagicProjectile(final World par1World, final EntityLivingBase par2EntityLivingBase, double par3, double par5, double par7) {
		super(par1World);
		this.shootingEntity = par2EntityLivingBase;
		this.setSize(1.0f, 1.0f);
		this.setLocationAndAngles(((Entity) par2EntityLivingBase).posX, ((Entity) par2EntityLivingBase).posY, ((Entity) par2EntityLivingBase).posZ, ((Entity) par2EntityLivingBase).rotationYaw, ((Entity) par2EntityLivingBase).rotationPitch);
		this.setPosition(super.posX, super.posY, super.posZ);
		final double motionX = 0.0;
		super.motionZ = motionX;
		super.motionY = motionX;
		super.motionX = motionX;
		par3 += super.rand.nextGaussian() * 0.4;
		par5 += super.rand.nextGaussian() * 0.4;
		par7 += super.rand.nextGaussian() * 0.4;
		final double d3 = MathHelper.sqrt_double(par3 * par3 + par5 * par5 + par7 * par7);
		this.accelerationX = par3 / d3 * 0.1;
		this.accelerationY = par5 / d3 * 0.1;
		this.accelerationZ = par7 / d3 * 0.1;
	}

	@Override
	public void onUpdate() {
		if (this.worldObj.isRemote || (this.shootingEntity == null || !this.shootingEntity.isDead) && this.worldObj.isBlockLoaded(new BlockPos(this))) {
			super.onUpdate();

			if (this.inGround) {
				if (this.worldObj.getBlockState(new BlockPos(this.xTile, this.yTile, this.zTile)).getBlock() == this.inTile) {
					++this.ticksAlive;

					if (this.ticksAlive == 200) {
						this.setDead();
					}

					return;
				}

				this.inGround = false;
				this.motionX *= this.rand.nextFloat() * 0.2F;
				this.motionY *= this.rand.nextFloat() * 0.2F;
				this.motionZ *= this.rand.nextFloat() * 0.2F;
				this.ticksAlive = 0;
				this.ticksInAir = 0;
			} else {
				++this.ticksInAir;
			}

			Vec3 vec3 = new Vec3(this.posX, this.posY, this.posZ);
			Vec3 vec31 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
			MovingObjectPosition movingobjectposition = this.worldObj.rayTraceBlocks(vec3, vec31);
			vec3 = new Vec3(this.posX, this.posY, this.posZ);
			vec31 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

			if (movingobjectposition != null) {
				vec31 = new Vec3(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
			}

			Entity entity = null;
			List<Entity> list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
			double d0 = 0.0D;

			for (int i = 0; i < list.size(); ++i) {
				Entity entity1 = list.get(i);

				if (entity1.canBeCollidedWith() && (!entity1.isEntityEqual(this.shootingEntity) || this.ticksInAir >= 25)) {
					float f = 0.3F;
					AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox().expand(f, f, f);
					MovingObjectPosition movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);

					if (movingobjectposition1 != null) {
						double d1 = vec3.squareDistanceTo(movingobjectposition1.hitVec);

						if (d1 < d0 || d0 == 0.0D) {
							entity = entity1;
							d0 = d1;
						}
					}
				}
			}

			if (entity != null) {
				movingobjectposition = new MovingObjectPosition(entity);
			}

			if (movingobjectposition != null) {
				this.onImpact(movingobjectposition);
			}

			this.posX += this.motionX;
			this.posY += this.motionY;
			this.posZ += this.motionZ;
			float f1 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
			this.rotationYaw = (float) (MathHelper.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) + 90.0F;

			for (this.rotationPitch = (float) (MathHelper.atan2(f1, this.motionY) * 180.0D / Math.PI) - 90.0F; this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {
				;
			}

			while (this.rotationPitch - this.prevRotationPitch >= 180.0F) {
				this.prevRotationPitch += 360.0F;
			}

			while (this.rotationYaw - this.prevRotationYaw < -180.0F) {
				this.prevRotationYaw -= 360.0F;
			}

			while (this.rotationYaw - this.prevRotationYaw >= 180.0F) {
				this.prevRotationYaw += 360.0F;
			}

			this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
			this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
			float f2 = this.getMotionFactor();

			if (this.isInWater()) {
				for (int j = 0; j < 4; ++j) {
					float f3 = 0.25F;
					this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * f3, this.posY - this.motionY * f3, this.posZ - this.motionZ * f3, this.motionX, this.motionY, this.motionZ, new int[0]);
				}

				f2 = 0.8F;
			}

			this.motionX += this.accelerationX;
			this.motionY += this.accelerationY;
			this.motionZ += this.accelerationZ;
			this.motionX *= f2;
			this.motionY *= f2;
			this.motionZ *= f2;
			this.setPosition(this.posX, this.posY, this.posZ);
		} else {
			this.setDead();
		}
	}

	protected float getMotionFactor() {
		return 0.95f;
	}

	protected abstract void onImpact(final MovingObjectPosition p0);

	@Override
	public void writeEntityToNBT(NBTTagCompound tagCompound) {
		tagCompound.setShort("xTile", (short) this.xTile);
		tagCompound.setShort("yTile", (short) this.yTile);
		tagCompound.setShort("zTile", (short) this.zTile);
		ResourceLocation resourcelocation = Block.blockRegistry.getNameForObject(this.inTile);
		tagCompound.setString("inTile", resourcelocation == null ? "" : resourcelocation.toString());
		tagCompound.setByte("inGround", (byte) (this.inGround ? 1 : 0));
		tagCompound.setTag("direction", this.newDoubleNBTList(new double[] { this.motionX, this.motionY, this.motionZ }));
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound tagCompund) {
		this.xTile = tagCompund.getShort("xTile");
		this.yTile = tagCompund.getShort("yTile");
		this.zTile = tagCompund.getShort("zTile");

		if (tagCompund.hasKey("inTile", 8)) {
			this.inTile = Block.getBlockFromName(tagCompund.getString("inTile"));
		} else {
			this.inTile = Block.getBlockById(tagCompund.getByte("inTile") & 255);
		}

		this.inGround = tagCompund.getByte("inGround") == 1;

		if (tagCompund.hasKey("direction", 9)) {
			NBTTagList nbttaglist = tagCompund.getTagList("direction", 6);
			this.motionX = nbttaglist.getDoubleAt(0);
			this.motionY = nbttaglist.getDoubleAt(1);
			this.motionZ = nbttaglist.getDoubleAt(2);
		} else {
			this.setDead();
		}
	}

	@Override
	public boolean canBeCollidedWith() {
		return true;
	}

	@Override
	public float getCollisionBorderSize() {
		return 1.0f;
	}

	@Override
	public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
		if (this.isEntityInvulnerable(par1DamageSource)) {
			return false;
		}
		this.setBeenAttacked();
		if (par1DamageSource.getEntity() != null) {
			final Vec3 vec3 = par1DamageSource.getEntity().getLookVec();
			if (vec3 != null) {
				super.motionX = vec3.xCoord;
				super.motionY = vec3.yCoord;
				super.motionZ = vec3.zCoord;
				this.accelerationX = super.motionX * 0.1;
				this.accelerationY = super.motionY * 0.1;
				this.accelerationZ = super.motionZ * 0.1;
			}
			if (par1DamageSource.getEntity() instanceof EntityLivingBase) {
				this.shootingEntity = (EntityLivingBase) par1DamageSource.getEntity();
			}
			return true;
		}
		return false;
	}

	@Override
	public float getBrightness(final float par1) {
		return 1.0f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender(final float par1) {
		return 15728880;
	}
}
