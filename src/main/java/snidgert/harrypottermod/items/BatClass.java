package snidgert.harrypottermod.items;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BatClass extends Item {

	private final String name = "Bat";

	public BatClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(1);
	}

	@Override
	public void onUpdate(final ItemStack itemstack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {
		if (!itemstack.isItemEnchanted()) {
			itemstack.addEnchantment(Enchantment.knockback, 3);
		}
	}

	public String getName() {
		return name;
	}

}
