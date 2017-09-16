package snidgert.harrypottermod.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import snidgert.harrypottermod.GuiItemInventory;
import snidgert.harrypottermod.MainClass;
import snidgert.harrypottermod.items.ContainerItem;
import snidgert.harrypottermod.items.InventoryItem;
import snidgert.harrypottermod.tileentities.TileEntityWandCrafter;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
		final TileEntity entity = world.getTileEntity(new BlockPos(x, y, z));
		if (ID == MainClass.GUI_ITEM_INV) {
			return new ContainerItem(player, player.inventory, new InventoryItem(player.getHeldItem()));
		}
		if (entity != null) {
			switch (ID) {
			case 4: {
				if (entity instanceof TileEntityWandCrafter) {
					return new ContainerWandCrafter(player.inventory, (TileEntityWandCrafter) entity);
				}
				return null;
			}
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
		final TileEntity entity = world.getTileEntity(new BlockPos(x, y, z));
		if (ID == MainClass.GUI_ITEM_INV) {
			return new GuiItemInventory(new ContainerItem(player, player.inventory, new InventoryItem(player.getHeldItem())));
		}
		if (entity != null) {
			switch (ID) {
			case 4: {
				if (entity instanceof TileEntityWandCrafter) {
					return new GUIWandCrafter(player.inventory, (TileEntityWandCrafter) entity);
				}
				return null;
			}
			}
		}
		return null;
	}
}
