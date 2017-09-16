package snidgert.harrypottermod.mobs.entity;

import com.google.common.base.Predicate;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.IAnimals;

public interface CustomMobSelectors extends IAnimals {

	Predicate<Entity> mobSelectorWolf = new Predicate<Entity>() {

		@Override
		public boolean apply(Entity entityIn) {
			if (!(entityIn instanceof EntityCreeper) && !(entityIn instanceof EntityGhast)) {
				return entityIn instanceof IMob;
			} else {
				return false;
			}
		}
	};
}