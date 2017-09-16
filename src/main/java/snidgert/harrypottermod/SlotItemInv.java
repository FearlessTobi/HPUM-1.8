package snidgert.harrypottermod;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import snidgert.harrypottermod.items.ItemStoreClass;

public class SlotItemInv extends Slot {

	public SlotItemInv(final IInventory par1iInventory, final int par2, final int par3, final int par4) {
		super(par1iInventory, par2, par3, par4);
	}

	@Override
	public boolean isItemValid(final ItemStack itemstack) {
		return !(itemstack.getItem() instanceof ItemStoreClass);
	}
}
