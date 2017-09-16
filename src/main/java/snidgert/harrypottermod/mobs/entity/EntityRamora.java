package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityRamora extends EntitySquid {

	public EntityRamora(final World p_i1693_1_) {
		super(p_i1693_1_);
	}

	@Override
	protected void dropFewItems(final boolean par1, final int par2) {
		this.dropItem((Item) null, 1);
	}
}
