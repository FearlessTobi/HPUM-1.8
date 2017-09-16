package snidgert.harrypottermod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RowanStickClass extends Item {

	private final String name = "RowanStick";

	public RowanStickClass() {
		GameRegistry.registerItem(this, name);
	}

	public String getName() {
		return name;
	}

}
