package snidgert.harrypottermod.food;

import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Bean10Class extends ItemFood {

	private final String name = "Bean10";

	public Bean10Class(final int amount, final float f, final boolean isWolfFood) {
		super(amount, isWolfFood);
		GameRegistry.registerItem(this, name);
	}

	public String getName() {
		return name;
	}

}
