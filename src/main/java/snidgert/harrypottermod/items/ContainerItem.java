package snidgert.harrypottermod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import snidgert.harrypottermod.SlotItemInv;

public class ContainerItem extends Container {

	public final InventoryItem inventory;
	private static final int INV_START = 8;
	private static final int INV_END = 34;
	private static final int HOTBAR_START = 35;
	private static final int HOTBAR_END = 43;

	public ContainerItem(final EntityPlayer par1Player, final InventoryPlayer inventoryPlayer, final InventoryItem inventoryItem) {
		this.inventory = inventoryItem;
		for (int i = 0; i < 8; ++i) {
			this.addSlotToContainer(new SlotItemInv(this.inventory, i, 80 + 18 * (i / 4), 8 + 18 * (i % 4)));
		}
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				this.addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		for (int i = 0; i < 9; ++i) {
			this.addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
		}
	}

	@Override
	public boolean canInteractWith(final EntityPlayer player) {
		return this.inventory.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int par2) {
		ItemStack itemstack = null;
		final Slot slot = super.inventorySlots.get(par2);
		if (slot != null && slot.getHasStack()) {
			final ItemStack itemstack2 = slot.getStack();
			itemstack = itemstack2.copy();
			if (par2 < 8) {
				if (!this.mergeItemStack(itemstack2, 8, 44, true)) {
					return null;
				}
				slot.onSlotChange(itemstack2, itemstack);
			} else if (par2 >= 8 && par2 < 35) {
				if (!this.mergeItemStack(itemstack2, 35, 44, false)) {
					return null;
				}
			} else if (par2 >= 35 && par2 < 44 && !this.mergeItemStack(itemstack2, 8, 35, false)) {
				return null;
			}
			if (itemstack2.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}
			if (itemstack2.stackSize == itemstack.stackSize) {
				return null;
			}
			slot.onPickupFromSlot(par1EntityPlayer, itemstack2);
		}
		return itemstack;
	}

	@Override
	public ItemStack slotClick(final int slot, final int button, final int flag, final EntityPlayer player) {
		if (slot >= 0 && this.getSlot(slot) != null && this.getSlot(slot).getStack() == player.getHeldItem()) {
			return null;
		}
		return super.slotClick(slot, button, flag, player);
	}
}
