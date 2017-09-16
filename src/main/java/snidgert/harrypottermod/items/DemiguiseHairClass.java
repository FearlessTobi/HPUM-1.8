package snidgert.harrypottermod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DemiguiseHairClass extends Item {

	private final String name = "DemiguiseHair";

	public DemiguiseHairClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(64);
	}

	public String getName() {
		return name;
	}

}
