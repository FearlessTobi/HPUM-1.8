package snidgert.harrypottermod.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.mobs.entity.EntityQuaffle;

public class QuaffleClass extends Item {

	private final String name = "Quaffle";

	public QuaffleClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(1);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
		final Vec3 look = entityplayer.getLookVec();
		final EntityQuaffle fireball2 = new EntityQuaffle(world, entityplayer);
		fireball2.setPosition(((Entity) entityplayer).posX + look.xCoord * 2.0, ((Entity) entityplayer).posY + look.yCoord * 2.0, ((Entity) entityplayer).posZ + look.zCoord * 2.0);
		fireball2.addVelocity(look.xCoord * 1.4, look.yCoord * 1.4, look.zCoord * 1.4);
		world.spawnEntityInWorld(fireball2);
		if (!entityplayer.capabilities.isCreativeMode) {
			--itemstack.stackSize;
		}
		return itemstack;
	}

	public String getName() {
		return name;
	}

}
