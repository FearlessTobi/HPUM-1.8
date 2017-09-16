package snidgert.harrypottermod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;

public class InventoryItem implements IInventory {

	private String name;
	public static final int INV_SIZE = 8;
	private ItemStack[] inventory;
	private final ItemStack invItem;

	public InventoryItem(final ItemStack stack) {
		this.name = "Inventory Item";
		this.inventory = new ItemStack[8];
		this.invItem = stack;
		if (!stack.hasTagCompound()) {
			stack.setTagCompound(new NBTTagCompound());
		}
		this.readFromNBT(stack.getTagCompound());
	}

	@Override
	public int getSizeInventory() {
		return this.inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(final int slot) {
		return this.inventory[slot];
	}

	@Override
	public ItemStack decrStackSize(final int slot, final int amount) {
		ItemStack stack = this.getStackInSlot(slot);
		if (stack != null) {
			if (stack.stackSize > amount) {
				stack = stack.splitStack(amount);
				this.markDirty();
			} else {
				this.setInventorySlotContents(slot, null);
			}
		}
		return stack;
	}

	@Override
	public void setInventorySlotContents(final int slot, final ItemStack itemstack) {
		this.inventory[slot] = itemstack;
		if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
			itemstack.stackSize = this.getInventoryStackLimit();
		}
		this.markDirty();
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void markDirty() {
		for (int i = 0; i < this.getSizeInventory(); ++i) {
			if (this.getStackInSlot(i) != null && this.getStackInSlot(i).stackSize == 0) {
				this.inventory[i] = null;
			}
		}
		this.writeToNBT(this.invItem.getTagCompound());
	}

	@Override
	public boolean isUseableByPlayer(final EntityPlayer player) {
		return player.getHeldItem() == this.invItem;
	}

	@Override
	public boolean isItemValidForSlot(final int slot, final ItemStack itemstack) {
		return !(itemstack.getItem() instanceof ItemStoreClass);
	}

	public void readFromNBT(final NBTTagCompound tagcompound) {
		final NBTTagList items = tagcompound.getTagList("ItemInventory", 10);
		for (int i = 0; i < items.tagCount(); ++i) {
			final NBTTagCompound item = items.getCompoundTagAt(i);
			final byte slot = item.getByte("Slot");
			if (slot >= 0 && slot < this.getSizeInventory()) {
				this.inventory[slot] = ItemStack.loadItemStackFromNBT(item);
			}
		}
	}

	public void writeToNBT(final NBTTagCompound tagcompound) {
		final NBTTagList items = new NBTTagList();
		for (int i = 0; i < this.getSizeInventory(); ++i) {
			if (this.getStackInSlot(i) != null) {
				final NBTTagCompound item = new NBTTagCompound();
				item.setInteger("Slot", i);
				this.getStackInSlot(i).writeToNBT(item);
				items.appendTag(item);
			}
		}
		tagcompound.setTag("ItemInventory", items);
	}

	@Override
	public boolean hasCustomName() {
		return this.name.length() > 0;
	}

	@Override
	public void openInventory(EntityPlayer player) {
	}

	@Override
	public void closeInventory(EntityPlayer player) {
	}

	@Override
	public IChatComponent getDisplayName() {
		return this.hasCustomName() ? new ChatComponentText(this.getName()) : new ChatComponentTranslation(this.getName(), new Object[0]);
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		if (this.inventory[index] != null) {
			ItemStack itemstack = this.inventory[index];
			this.inventory[index] = null;
			return itemstack;
		} else {
			return null;
		}
	}

	@Override
	public int getField(int id) {
		return 0;
	}

	@Override
	public void setField(int id, int value) {
	}

	@Override
	public int getFieldCount() {
		return 0;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.getSizeInventory(); ++i) {
			this.inventory[i] = null;
		}
	}

}
