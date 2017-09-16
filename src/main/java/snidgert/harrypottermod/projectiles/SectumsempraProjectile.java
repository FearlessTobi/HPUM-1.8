package snidgert.harrypottermod.projectiles;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import snidgert.harrypottermod.MainClass;
import snidgert.harrypottermod.particles.EntityWhiteSpellFX;

public class SectumsempraProjectile extends MagicProjectile {

	public int field_92057_e;

	public SectumsempraProjectile(final World par1World) {
		super(par1World);
		this.field_92057_e = 0;
		this.setSize(0.5f, 0.5f);
	}

	public SectumsempraProjectile(final World par1World, final double par2, final double par4, final double par6, final double par8, final double par10, final double par12) {
		super(par1World, par2, par4, par6, par8, par10, par12);
		this.field_92057_e = 0;
	}

	public SectumsempraProjectile(final World par1World, final EntityLivingBase par2EntityLivingBase, final double par3, final double par5, final double par7) {
		super(par1World, par2EntityLivingBase, par3, par5, par7);
		this.field_92057_e = 0;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void onUpdate() {
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityWhiteSpellFX(super.worldObj, super.posX, super.posY, super.posZ, 0.0, 0.0, 0.0));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityWhiteSpellFX(super.worldObj, super.posX - 0.1, super.posY, super.posZ, 0.0, 0.0, 0.0));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityWhiteSpellFX(super.worldObj, super.posX, super.posY, super.posZ - 0.1, 0.0, 0.0, 0.0));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityWhiteSpellFX(super.worldObj, super.posX, super.posY, super.posZ + 0.1, 0.0, 0.0, 0.0));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityWhiteSpellFX(super.worldObj, super.posX + 0.1, super.posY, super.posZ, 0.0, 0.0, 0.0));
		super.onUpdate();
	}

	@Override
	protected void onImpact(final MovingObjectPosition par1MovingObjectPosition) {
		if (!super.worldObj.isRemote) {
			if (par1MovingObjectPosition.entityHit != null && par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
				if (((EntityLivingBase) par1MovingObjectPosition.entityHit).isPotionActive(MainClass.ShieldEffect)) {
					((EntityLivingBase) par1MovingObjectPosition.entityHit).removePotionEffect(MainClass.ShieldEffect.id);
				} else {
					if (super.shootingEntity != null) {
						if (par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeMobDamage(super.shootingEntity), 30.0f) && !par1MovingObjectPosition.entityHit.isEntityAlive()) {
							super.shootingEntity.heal(30.0f);
						}
					} else {
						par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.magic, 30.0f);
					}
					if (par1MovingObjectPosition.entityHit instanceof EntityLivingBase) {
						final double timeMultiplier = 0.5;
						final int time = (int) (30 * timeMultiplier);
						((EntityLivingBase) par1MovingObjectPosition.entityHit).addPotionEffect(new PotionEffect(Potion.wither.id, time, 1));
					}
				}
			}
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
