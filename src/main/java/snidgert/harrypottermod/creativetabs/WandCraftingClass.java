package snidgert.harrypottermod.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import snidgert.harrypottermod.MainClass;

public class WandCraftingClass extends CreativeTabs {

	public WandCraftingClass(final int par1, final String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(MainClass.WandCrafterIdle);
	}
}
