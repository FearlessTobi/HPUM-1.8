package snidgert.harrypottermod.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.mobs.entity.EntityWerewolf;

public class WerewolfFormClass extends Item {

	private final String name = "WerewolfForm";

	public WerewolfFormClass() {
		GameRegistry.registerItem(this, name);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
		if (!world.isRemote) {
			entityplayer.setInvisible(true);
			((Entity) entityplayer).noClip = true;
			final EntityWerewolf entitylevitate = new EntityWerewolf(world);
			entitylevitate.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
			world.spawnEntityInWorld(entitylevitate);
			entityplayer.mountEntity(entitylevitate);
		}
		return itemstack;
	}

	public String getName() {
		return name;
	}

}
