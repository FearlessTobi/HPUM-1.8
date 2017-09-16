package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.World;

public class EntityFluffy extends EntityWolf {

	public EntityFluffy(final World arg0) {
		super(arg0);
		this.setSize(3.0f, 4.0f);
	}

	@Override
	protected String getLivingSound() {
		return "harrypottermod:FluffyBark";
	}

	@Override
	protected String getDeathSound() {
		return "harrypottermod:FluffyHurt";
	}

	protected String getAngrySoundName() {
		return "harrypottermod:FluffyGrowl";
	}

	@Override
	protected String getHurtSound() {
		return "harrypottermod:FluffyHurt";
	}

	@Override
	public EntityWolf createChild(final EntityAgeable var1) {
		return null;
	}
}
