package snidgert.harrypottermod.mobs.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityNagini extends EntityMob {

	public EntityNagini(final World par1World) {
		super(par1World);
	}

	@Override
	protected String getLivingSound() {
		return "harrypottermod:Hiss1";
	}

	@Override
	protected String getDeathSound() {
		return "harrypottermod:hiss2";
	}

	protected String getAngrySoundName() {
		return null;
	}

	@Override
	protected String getHurtSound() {
		return "harrypottermod:hiss2";
	}

	@Override
	protected void playStepSound(BlockPos pos, Block blockIn) {

	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.9);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0);
	}
}
