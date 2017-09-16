package snidgert.harrypottermod.food;

import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Bean4Class extends ItemFood {

	private final String name = "Bean4";

	public Bean4Class(final int amount, final float f, final boolean isWolfFood) {
		super(amount, isWolfFood);
		GameRegistry.registerItem(this, name);
	}

	public String getName() {
		return name;
	}

}
