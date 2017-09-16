package snidgert.harrypottermod.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.MainClass;

public class RemembrallClass extends Item {

	private final String name = "Remembrall";

	public RemembrallClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(1);
	}

	@Override
	public int getMaxItemUseDuration(final ItemStack stack) {
		return 1;
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack stack, final World world, final EntityPlayer player) { //Doesn't work in 1.7 too
		if (!world.isRemote && !player.isSneaking()) {
			player.openGui(MainClass.instance, 3, ((Entity) player).worldObj, (int) ((Entity) player).posX, (int) ((Entity) player).posY, (int) ((Entity) player).posZ);
		}
		return stack;
	}

	public String getName() {
		return name;
	}

}
