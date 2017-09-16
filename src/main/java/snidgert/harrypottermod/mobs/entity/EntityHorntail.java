package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import snidgert.harrypottermod.MainClass;

public class EntityHorntail extends EntityDragonRideable {

	protected EntityPlayer rider;
	public boolean FlyUp;
	public boolean FlyDown;
	public boolean FireBreath;
	public float field_70886_e;
	public float destPos;
	public float field_70884_g;
	public float field_70888_h;
	public float field_70889_i;

	public EntityHorntail(final World par1World) {
		super(par1World);
		this.field_70889_i = 1.0f;
		this.setSize(10.0f, 5.5f);
	}

	@Override
	protected void dropFewItems(final boolean par1, final int par2) {
		this.dropItem(Item.getItemFromBlock(MainClass.GoldenEgg), 1);
	}
}
