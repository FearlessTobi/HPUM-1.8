package snidgert.harrypottermod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UnicornHairClass extends Item {

	private final String name = "UnicornHair";

	public UnicornHairClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(64);
	}

	public String getName() {
		return name;
	}

}
