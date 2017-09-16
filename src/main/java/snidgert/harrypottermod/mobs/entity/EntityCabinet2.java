package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityCabinet2 extends Entity {

	public EntityCabinet2(final World par1World) {
		super(par1World);
	}

	@Override
	protected void entityInit() {
		this.getDataWatcher().addObject(25, super.posX);
		this.getDataWatcher().addObject(26, super.posY);
		this.getDataWatcher().addObject(27, super.posZ);
	}

	public int getPosX() {
		return super.dataWatcher.getWatchableObjectInt(25);
	}

	public int getPosY() {
		return super.dataWatcher.getWatchableObjectInt(26);
	}

	public int getPosZ() {
		return super.dataWatcher.getWatchableObjectInt(27);
	}

	@Override
	protected void readEntityFromNBT(final NBTTagCompound var1) {
	}

	@Override
	protected void writeEntityToNBT(final NBTTagCompound var1) {
	}
}
