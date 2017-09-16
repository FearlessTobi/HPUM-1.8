package snidgert.harrypottermod.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GillyweedClass extends ItemFood {

	private final String name = "Gillyweed";

	public GillyweedClass(final int amount, final float saturation, final boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

	@Override
	public EnumAction getItemUseAction(final ItemStack par1ItemStack) {
		return EnumAction.EAT;
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		return par1ItemStack;
	}

	public String getName() {
		return name;
	}

}
