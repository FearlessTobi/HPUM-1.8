package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityUkaranianIronbelly extends EntityDragonRideable {

	protected EntityPlayer rider;
	public boolean FlyUp;
	public boolean FlyDown;
	public boolean FireBreath;
	public float field_70886_e;
	public float destPos;
	public float field_70884_g;
	public float field_70888_h;
	public float field_70889_i;

	public EntityUkaranianIronbelly(final World par1World) {
		super(par1World);
		this.field_70889_i = 1.0f;
		this.setSize(10.0f, 5.5f);
	}
}
