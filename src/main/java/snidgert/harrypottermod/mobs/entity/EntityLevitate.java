package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import snidgert.harrypottermod.MainClass;

public class EntityLevitate extends EntityAnimal {

	public EntityLevitate(final World par1World) {
		super(par1World);
		this.setSize(1.0f, 1.0f);
	}

	@Override
	public void onUpdate() {
		final EntityPlayer player = this.worldObj.getClosestPlayer(this.posX, this.posY, this.posZ, 9.9999999999E10);
		if (player == null)
			return;
		if (!player.isSneaking()) {
			final Vec3 look = player.getLookVec();
			this.setPosition(((Entity) player).posX + look.xCoord * 1.5, ((Entity) player).posY + look.yCoord * 1.5, ((Entity) player).posZ + look.zCoord * 1.5);
		}
		if (player.isSneaking()) {
			this.setDead();
			final int x = (int) this.lastTickPosX;
			final int y = (int) this.lastTickPosY;
			final int z = (int) this.lastTickPosZ;
			if (this.worldObj.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.air) {
				this.worldObj.setBlockState(new BlockPos(x, y, z), MainClass.WingardiumLeviosaBlock.getDefaultState());
			}
		}
	}

	@Override
	public EntityAgeable createChild(final EntityAgeable entityageable) {
		return null;
	}
}
