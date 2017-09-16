package snidgert.harrypottermod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PhoenixFeatherClass extends Item {

	private final String name = "PhoenixFeather";

	public PhoenixFeatherClass() {
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxStackSize(64);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
		return par1ItemStack;
	}

	public String getName() {
		return name;
	}

}
