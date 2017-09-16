package snidgert.harrypottermod.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.mobs.entity.EntityNagini;

public class BFangClass extends Item {

	private final String name = "BFang";

	public BFangClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(1);
	}

	@Override
	public boolean hitEntity(final ItemStack par1ItemStack, final EntityLivingBase par2EntityLivingBase, final EntityLivingBase par3EntityLivingBase) {
		if (par2EntityLivingBase instanceof EntityNagini) {
			par2EntityLivingBase.setDead();
		}
		return true;
	}

	public String getName() {
		return name;
	}

}
