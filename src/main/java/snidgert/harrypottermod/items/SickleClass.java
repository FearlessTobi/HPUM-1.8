package snidgert.harrypottermod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SickleClass extends Item {

	private final String name = "Sickle";

	public SickleClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(64);
	}

	public String getName() {
		return name;
	}

}
