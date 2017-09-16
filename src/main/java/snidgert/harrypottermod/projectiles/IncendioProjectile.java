package snidgert.harrypottermod.projectiles;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import snidgert.harrypottermod.MainClass;

public class IncendioProjectile extends MagicProjectile {

	private static final String __OBFID = "CL_00001721";

	public IncendioProjectile(final World par1World) {
		super(par1World);
		this.setSize(0.3125f, 0.3125f);
	}

	public IncendioProjectile(final World par1World, final EntityLivingBase par2EntityLivingBase, final double par3, final double par5, final double par7) {
		super(par1World, par2EntityLivingBase, par3, par5, par7);
		this.setSize(0.3125f, 0.3125f);
	}

	public IncendioProjectile(final World par1World, final double par2, final double par4, final double par6, final double par8, final double par10, final double par12) {
		super(par1World, par2, par4, par6, par8, par10, par12);
		this.setSize(0.3125f, 0.3125f);
	}

	@Override
	public void onUpdate() {
		super.worldObj.spawnParticle(EnumParticleTypes.FLAME, super.posX, super.posY, super.posZ, 0.0, 0.0, 0.0);
		super.onUpdate();
	}

	@Override
	public boolean isBurning() {
		return true;
	}

	@Override
	protected void onImpact(final MovingObjectPosition par1MovingObjectPosition) {
		if (!super.worldObj.isRemote) {
			if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
				if (((EntityLivingBase) par1MovingObjectPosition.entityHit).isPotionActive(MainClass.ShieldEffect)) {
					((EntityLivingBase) par1MovingObjectPosition.entityHit).removePotionEffect(MainClass.ShieldEffect.id);
				} else if (!par1MovingObjectPosition.entityHit.isImmuneToFire() && par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.magic, 3.0f)) {
					par1MovingObjectPosition.entityHit.setFire(5);
				}
			} else {
				int i = par1MovingObjectPosition.getBlockPos().getX();
				int j = par1MovingObjectPosition.getBlockPos().getY();
				int k = par1MovingObjectPosition.getBlockPos().getZ();
				switch (par1MovingObjectPosition.sideHit) {
				case DOWN: {
					--j;
					break;
				}
				case UP: {
					++j;
					break;
				}
				case EAST: {
					--k;
					break;
				}
				case WEST: {
					++k;
					break;
				}
				case NORTH: {
					--i;
					break;
				}
				case SOUTH: {
					++i;
					break;
				}
				}
				if (super.worldObj.isAirBlock(new BlockPos(i, j, k))) {
					super.worldObj.setBlockState(new BlockPos(i, j, k), Blocks.fire.getDefaultState());
				}
			}
			this.setDead();
		}
	}

	@Override
	public boolean canBeCollidedWith() {
		return false;
	}

	@Override
	public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
		return false;
	}
}
