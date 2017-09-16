package snidgert.harrypottermod.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;
import snidgert.harrypottermod.tileentities.TileEntityWandCrafter;

public class ContainerWandCrafter extends Container {

	private TileEntityWandCrafter wandcrafter;
	private int dualCookTime;
	private int dualPower;
	private int lastItemBurnTime;

	public ContainerWandCrafter(final InventoryPlayer player, final TileEntityWandCrafter tileentity) {
		this.dualCookTime = 0;
		this.dualPower = 0;
		this.lastItemBurnTime = 0;
		this.wandcrafter = tileentity;
		this.addSlotToContainer(new Slot(tileentity, 0, 33, 17));
		this.addSlotToContainer(new Slot(tileentity, 1, 67, 17));
		this.addSlotToContainer(new Slot(tileentity, 2, 143, 61));
		this.addSlotToContainer(new SlotWandCrafter(player.player, tileentity, 3, 50, 57));
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; ++j) {
				this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		for (int i = 0; i < 9; ++i) {
			this.addSlotToContainer(new Slot(player, i, 8 + i * 18, 142));
		}
	}

	@Override
	public boolean canInteractWith(final EntityPlayer player) {
		return this.wandcrafter.isUseableByPlayer(player);
	}

	@Override
	public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int par2) {
		ItemStack itemstack = null;
		final Slot slot = super.inventorySlots.get(par2);
		if (slot != null && slot.getHasStack()) {
			final ItemStack itemstack2 = slot.getStack();
			itemstack = itemstack2.copy();
			if (par2 == 2) {
				if (!this.mergeItemStack(itemstack2, 3, 39, true)) {
					return null;
				}
				slot.onSlotChange(itemstack2, itemstack);
			} else if (par2 != 1 && par2 != 0) {
				if (FurnaceRecipes.instance().getSmeltingResult(itemstack2) != null) {
					if (!this.mergeItemStack(itemstack2, 0, 1, false)) {
						return null;
					}
				} else if (TileEntityFurnace.isItemFuel(itemstack2)) {
					if (!this.mergeItemStack(itemstack2, 1, 2, false)) {
						return null;
					}
				} else if (par2 >= 3 && par2 < 30) {
					if (!this.mergeItemStack(itemstack2, 30, 39, false)) {
						return null;
					}
				} else if (par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack2, 3, 30, false)) {
					return null;
				}
			} else if (!this.mergeItemStack(itemstack2, 3, 39, false)) {
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
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for (int i = 0; i < super.crafters.size(); ++i) {
			final ICrafting par1 = super.crafters.get(i);
			if (this.dualCookTime != this.wandcrafter.dualCookTime) {
				par1.sendProgressBarUpdate(this, 0, this.wandcrafter.dualCookTime);
			}
			if (this.dualPower != this.wandcrafter.dualPower) {
				par1.sendProgressBarUpdate(this, 1, this.wandcrafter.dualPower);
			}
		}
		this.dualCookTime = this.wandcrafter.dualCookTime;
		this.dualPower = this.wandcrafter.dualPower;
	}

	@Override
	public void updateProgressBar(final int i, final int j) {
		if (i == 0) {
			this.wandcrafter.dualCookTime = j;
		}
		if (i == 1) {
			this.wandcrafter.dualPower = j;
		}
	}
}
