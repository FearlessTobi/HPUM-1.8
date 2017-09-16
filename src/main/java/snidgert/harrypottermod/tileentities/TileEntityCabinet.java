package snidgert.harrypottermod.tileentities;

import net.minecraft.tileentity.TileEntity;

public class TileEntityCabinet extends TileEntity {

	public int getXCoord() {
		return super.pos.getX();
	}

	public int getZCoord() {
		return super.pos.getZ();
	}

	public int getYCoord() {
		return super.pos.getY();
	}
}
