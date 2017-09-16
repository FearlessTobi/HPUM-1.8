package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityHorklump extends EntityAnimal {

	private static final String __OBFID = "CL_00001647";

	public EntityHorklump(final World p_i1689_1_) {
		super(p_i1689_1_);
		this.setSize(0.5f, 0.5f);
		this.tasks.addTask(6, new EntityAIWander(this, 0.01));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(2.5E-6);
	}

	@Override
	protected void updateAITasks() {
		super.updateAITasks();
	}

	@Override
	public EntityHorklump createChild(final EntityAgeable p_90011_1_) {
		return null;
	}
}
