package snidgert.harrypottermod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RubyClass extends Item {

	private final String name = "Ruby";

	public RubyClass() {
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

	public String getName() {
		return name;
	}

}
