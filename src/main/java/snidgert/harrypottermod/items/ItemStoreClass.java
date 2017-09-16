package snidgert.harrypottermod.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.MainClass;

public class ItemStoreClass extends Item {

	private final String name = "ItemStore";

	public ItemStoreClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(1);
	}

	@Override
	public int getMaxItemUseDuration(final ItemStack stack) {
		return 1;
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack stack, final World world, final EntityPlayer player) {
		if (!world.isRemote) {
			if (!player.isSneaking()) {
				player.openGui(MainClass.instance, MainClass.GUI_ITEM_INV, ((Entity) player).worldObj, (int) ((Entity) player).posX, (int) ((Entity) player).posY, (int) ((Entity) player).posZ);
			} else {
				new InventoryItem(player.getHeldItem()).setInventorySlotContents(0, new ItemStack(Items.diamond, 4));
			}
		}
		return stack;
	}

	public String getName() {
		return name;
	}

}
