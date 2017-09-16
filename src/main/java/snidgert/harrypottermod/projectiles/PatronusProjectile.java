package snidgert.harrypottermod.projectiles;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import snidgert.harrypottermod.mobs.entity.EntityDementor;
import snidgert.harrypottermod.mobs.entity.EntityPatronus;
import snidgert.harrypottermod.particles.EntityPatronusSpellFX;

public class PatronusProjectile extends MagicProjectile {

	public int field_92057_e;

	public PatronusProjectile(final World par1World) {
		super(par1World);
		this.field_92057_e = 0;
		this.setSize(0.5f, 0.5f);
	}

	public PatronusProjectile(final World par1World, final double par2, final double par4, final double par6, final double par8, final double par10, final double par12) {
		super(par1World, par2, par4, par6, par8, par10, par12);
		this.field_92057_e = 0;
	}

	public PatronusProjectile(final World par1World, final EntityLivingBase par2EntityLivingBase, final double par3, final double par5, final double par7) {
		super(par1World, par2EntityLivingBase, par3, par5, par7);
		this.field_92057_e = 0;
	}

	@Override
	protected void onImpact(final MovingObjectPosition par1MovingObjectPosition) {
		final EntityPlayer player = super.worldObj.getClosestPlayer(super.posX, super.posY, super.posZ, 1.0E44);
		if (!super.worldObj.isRemote && super.rand.nextInt(4) == 0) {
			byte b0 = 1;
			if (super.rand.nextInt(32) == 0) {
				b0 = 4;
			}
			for (int i = 0; i < b0; ++i) {
				final EntityPatronus entitychicken = new EntityPatronus(super.worldObj);
				entitychicken.setLocationAndAngles(super.posX, super.posY, super.posZ, super.rotationYaw, 0.0f);
				super.worldObj.spawnEntityInWorld(entitychicken);
				entitychicken.setOwnerId(player.getUniqueID().toString());
				entitychicken.setTamed(true);
			}
		}
		if (par1MovingObjectPosition.entityHit instanceof EntityDementor) {
			par1MovingObjectPosition.entityHit.setDead();
		}
		if (!super.worldObj.isRemote) {
			this.setDead();
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void onUpdate() {
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityPatronusSpellFX(super.worldObj, super.posX, super.posY, super.posZ, 0.0, 0.0, 0.0));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityPatronusSpellFX(super.worldObj, super.posX - 0.1, super.posY, super.posZ, 0.0, 0.0, 0.0));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityPatronusSpellFX(super.worldObj, super.posX, super.posY, super.posZ - 0.1, 0.0, 0.0, 0.0));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityPatronusSpellFX(super.worldObj, super.posX, super.posY, super.posZ + 0.1, 0.0, 0.0, 0.0));
		Minecraft.getMinecraft().effectRenderer.addEffect(new EntityPatronusSpellFX(super.worldObj, super.posX + 0.1, super.posY, super.posZ, 0.0, 0.0, 0.0));
		super.onUpdate();
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
