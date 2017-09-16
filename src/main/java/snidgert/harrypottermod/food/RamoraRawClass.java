package snidgert.harrypottermod.food;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RamoraRawClass extends ItemFood {

	private final String name = "RamoraRaw";

	public RamoraRawClass(final int amount, final float f, final boolean isWolfFood) {
		super(amount, isWolfFood);
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

	public String getName() {
		return name;
	}

}
