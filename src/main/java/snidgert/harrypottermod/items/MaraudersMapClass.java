package snidgert.harrypottermod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemMap;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MaraudersMapClass extends ItemMap {

	private final String name = "MaraudersMap";

	public MaraudersMapClass() {
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxStackSize(1);
	}

	public String getName() {
		return name;
	}

}
