package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import snidgert.harrypottermod.MainClass;

public class EntityQuaffle extends EntityCreature {

	public float field_70886_e;
	public float destPos;
	public float field_70884_g;
	public float field_70888_h;
	public float field_70889_i;

	public EntityQuaffle(final World arg0, final EntityPlayer player) {
		super(arg0);
		this.setSize(this.field_70889_i = 1.0f, 1.0f);
	}

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.field_70888_h = this.field_70886_e;
		this.field_70884_g = this.destPos;
		this.destPos += (float) ((this.onGround ? -1 : 4) * 0.3);
		if (this.destPos < 0.0f) {
			this.destPos = 0.0f;
		}
		if (this.destPos > 1.0f) {
			this.destPos = 1.0f;
		}
		if (!this.onGround && this.field_70889_i < 1.0f) {
			this.field_70889_i = 1.0f;
		}
		this.field_70889_i *= 0.9;
		if (!this.onGround && this.motionY < 0.0) {
			this.motionY *= 1.0;
			this.motionX *= 1.0;
			this.motionZ *= 1.0;
		}
		this.field_70886_e += this.field_70889_i * 2.0f;
	}

	@Override
	protected void dropFewItems(final boolean par1, final int par2) {
		this.dropItem(MainClass.Quaffle, 1);
	}

	@Override
	public boolean interact(final EntityPlayer par1EntityPlayer) {
		par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(MainClass.Quaffle, 1));
		this.setDead();
		return true;
	}
}
