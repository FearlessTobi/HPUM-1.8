package snidgert.harrypottermod.projectiles;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import snidgert.harrypottermod.MainClass;

public class ConfundoStrongProjectile extends MagicProjectile {

	public int field_92057_e;

	public ConfundoStrongProjectile(final World par1World) {
		super(par1World);
		this.field_92057_e = 0;
		this.setSize(0.5f, 0.5f);
	}

	public ConfundoStrongProjectile(final World par1World, final double par2, final double par4, final double par6, final double par8, final double par10, final double par12) {
		super(par1World, par2, par4, par6, par8, par10, par12);
		this.field_92057_e = 0;
	}

	public ConfundoStrongProjectile(final World par1World, final EntityLivingBase par2EntityLivingBase, final double par3, final double par5, final double par7) {
		super(par1World, par2EntityLivingBase, par3, par5, par7);
		this.field_92057_e = 0;
	}

	@Override
	public void onUpdate() {
		super.worldObj.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, super.posX - 0.1, super.posY, super.posZ, 0.0, 0.0, 0.0);
		super.worldObj.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, super.posX, super.posY, super.posZ - 0.1, 0.0, 0.0, 0.0);
		super.worldObj.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, super.posX + 0.1, super.posY, super.posZ, 0.0, 0.0, 0.0);
		super.worldObj.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, super.posX, super.posY, super.posZ + 0.1, 0.0, 0.0, 0.0);
		super.worldObj.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, super.posX, super.posY, super.posZ, 0.0, 0.0, 0.0);
		super.onUpdate();
	}

	@Override
	protected void onImpact(final MovingObjectPosition par1MovingObjectPosition) {
		if (!super.worldObj.isRemote) {
			if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
				if (((EntityLivingBase) par1MovingObjectPosition.entityHit).isPotionActive(MainClass.ShieldEffect)) {
					((EntityLivingBase) par1MovingObjectPosition.entityHit).removePotionEffect(MainClass.ShieldEffect.id);
				} else {
					((EntityLivingBase) par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.confusion.id, 200, 100));
				}
			}
			super.worldObj.newExplosion((Entity) null, super.posX, super.posY, super.posZ, this.field_92057_e, true, super.worldObj.getGameRules().getBoolean("mobGriefing"));
			this.setDead();
		}
	}

	@Override
	public void writeEntityToNBT(final NBTTagCompound par1NBTTagCompound) {
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setInteger("ExplosionPower", this.field_92057_e);
	}

	@Override
	public void readEntityFromNBT(final NBTTagCompound par1NBTTagCompound) {
		super.readEntityFromNBT(par1NBTTagCompound);
		if (par1NBTTagCompound.hasKey("ExplosionPower")) {
			this.field_92057_e = par1NBTTagCompound.getInteger("ExplosionPower");
		}
	}
}
