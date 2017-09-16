package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.World;

public class EntityStoneSoldier extends EntityWolf {

	public EntityStoneSoldier(final World arg0) {
		super(arg0);
		this.setSize(1.0f, 2.0f);
	}

	public EntityStoneSoldier(final World par1World, final double par2, final double par4, final double par6) {
		this(par1World);
		this.setPosition(par2, par4 + this.getYOffset(), par6);
		this.motionX = 0.0;
		this.motionY = 0.0;
		this.motionZ = 0.0;
		this.prevPosX = par2;
		this.prevPosY = par4;
		this.prevPosZ = par6;
	}

	@Override
	protected String getLivingSound() {
		return "harrypottermod:";
	}

	@Override
	protected String getDeathSound() {
		return "harrypottermod:";
	}

	protected String getAngrySoundName() {
		return "harrypottermod:";
	}

	@Override
	protected String getHurtSound() {
		return "harrypottermod:";
	}

	@Override
	public EntityWolf createChild(final EntityAgeable var1) {
		return null;
	}
}
