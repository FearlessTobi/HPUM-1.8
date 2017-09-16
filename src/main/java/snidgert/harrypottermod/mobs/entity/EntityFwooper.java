package snidgert.harrypottermod.mobs.entity;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import snidgert.harrypottermod.MainClass;

public class EntityFwooper extends EntityBat {

	public EntityFwooper(final World p_i1680_1_) {
		super(p_i1680_1_);
	}

	@Override
	protected String getHurtSound() {
		return null;
	}

	@Override
	protected String getDeathSound() {
		return null;
	}

	@Override
	protected void dropFewItems(final boolean par1, final int par2) {
		this.dropItem(MainClass.FwooperFeather, 4);
	}

	@Override
	protected String getLivingSound() {
		return "mob.endermen.death";
	}

	protected String getAngrySoundName() {
		return null;
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {

	}

	@Override
	protected void entityInit() {
		final Random rnd = new Random();
		final int two = rnd.nextInt(7);
		super.entityInit();
		this.getDataWatcher().addObject(25, 5);
		this.dataWatcher.updateObject(25, two);
	}

	public int getTextureType() {
		return this.dataWatcher.getWatchableObjectInt(25);
	}
}
