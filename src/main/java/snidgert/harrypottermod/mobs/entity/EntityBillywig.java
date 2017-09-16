package snidgert.harrypottermod.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import snidgert.harrypottermod.MainClass;

public class EntityBillywig extends EntityBat {

	public EntityBillywig(final World p_i1680_1_) {
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
	protected String getLivingSound() {
		return null;
	}

	protected String getAngrySoundName() {
		return null;
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {

	}

	@Override
	protected void dropFewItems(final boolean par1, final int par2) {
		this.dropItem(MainClass.BillywigStinger, 1);
	}
}
