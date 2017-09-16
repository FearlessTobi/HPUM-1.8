package snidgert.harrypottermod.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SockClass extends Item {

	private final String name = "Sock";

	public SockClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(1);
	}

	public String getName() {
		return name;
	}

}
