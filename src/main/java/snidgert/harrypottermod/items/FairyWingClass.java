package snidgert.harrypottermod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FairyWingClass extends Item {

	private final String name = "FairyWing";

	public FairyWingClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(64);
	}

	public String getName() {
		return name;
	}

}
