package snidgert.harrypottermod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SilverIngotClass extends Item {

	private final String name = "SilverIngot";

	public SilverIngotClass() {
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

	public String getName() {
		return name;
	}

}
