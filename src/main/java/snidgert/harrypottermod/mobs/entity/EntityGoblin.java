package snidgert.harrypottermod.mobs.entity;

import java.util.Random;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.world.World;

public class EntityGoblin extends EntityVillager {

	public EntityGoblin(final World p_i1578_1_) {
		super(p_i1578_1_);
	}

	@Override
	protected void entityInit() {
		final Random rnd = new Random();
		final int two = rnd.nextInt(6);
		super.entityInit();
		this.getDataWatcher().addObject(25, 5);
		this.dataWatcher.updateObject(25, two);
	}

	public int getTextureType() {
		return this.dataWatcher.getWatchableObjectInt(25);
	}

	@Override
	public EntityVillager createChild(final EntityAgeable p_90011_1_) {
		return null;
	}
}
