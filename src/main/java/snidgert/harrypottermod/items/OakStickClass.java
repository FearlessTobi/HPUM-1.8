package snidgert.harrypottermod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OakStickClass extends Item {

	private final String name = "OakStick";

	public OakStickClass() {
		GameRegistry.registerItem(this, name);
	}

	public String getName() {
		return name;
	}

}
