package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityPuffskein extends EntitySlime implements IMob {

	public float squishAmount;
	public float squishFactor;
	public float prevSquishFactor;
	private boolean wasOnGround;

	public EntityPuffskein(final World p_i1742_1_) {
		super(p_i1742_1_);
	}

	@Override
	protected Item getDropItem() {
		return null;
	}

	@Override
	protected boolean canDamagePlayer() {
		return false;
	}

	@Override
	public void setDead() {
		this.isDead = true;
	}

	@Override
	protected EntityPuffskein createInstance() {
		return new EntityPuffskein(this.worldObj);
	}

	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		return 0;
	}

	@Override
	protected boolean spawnCustomParticles() {
		return true;
	}

}
