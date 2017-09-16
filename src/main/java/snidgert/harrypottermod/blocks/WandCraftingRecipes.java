package snidgert.harrypottermod.blocks;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import snidgert.harrypottermod.MainClass;

public class WandCraftingRecipes {

	public static ItemStack getWand(final Item item, final Item item2) {
		return getOutPut(item, item2);
	}

	public static ItemStack getOutPut(final Item item, final Item item2) {
		if ((item == MainClass.DragonHeartString && item2 == MainClass.OakStick) || (item2 == MainClass.DragonHeartString && item == MainClass.OakStick)) {
			return new ItemStack(MainClass.TankWandClass, 1);
		}
		if ((item == MainClass.UnicornHair && item2 == MainClass.BirchStick) || (item2 == MainClass.UnicornHair && item == MainClass.BirchStick)) {
			return new ItemStack(MainClass.SupportWandClass, 1);
		}
		if ((item == MainClass.PhoenixFeather && item2 == MainClass.RowanStick) || (item2 == MainClass.PhoenixFeather && item == MainClass.RowanStick)) {
			return new ItemStack(MainClass.DPSWandClass, 1);
		}
		return null;
	}
}
