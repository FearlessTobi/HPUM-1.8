package snidgert.harrypottermod.mobs.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import snidgert.harrypottermod.MainClass;

public class EntityAragog extends EntityCaveSpider {

	public EntityAragog(final World arg0) {
		super(arg0);
		this.setSize(4.0f, 3.0f);
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.3);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0);
	}

	@Override
	public void onLivingUpdate() {
		if (!this.worldObj.isRemote) {
			final int i = MathHelper.floor_double(this.posX);
			int j = MathHelper.floor_double(this.posZ);
			j = MathHelper.floor_double(this.posX + (i % 2 * 2 - 1) * 0.25f);
			final int k = MathHelper.floor_double(this.posY);
			final int l = MathHelper.floor_double(this.posZ + (i / 2 % 2 * 2 - 1) * 0.25f);
			if (this.worldObj.getBiomeGenForCoords(new BlockPos(j, 0, l)).getFloatTemperature(new BlockPos(l, l, l)) < 0.8f && Blocks.snow_layer.canPlaceBlockAt(this.worldObj, new BlockPos(j, k, l))) {
				this.setPosition(this.posX, this.posY, this.posZ);
				this.worldObj.setBlockState(new BlockPos(j, k, l), MainClass.AcromantulaWeb.getDefaultState());
			}
		}
		super.onLivingUpdate();
	}
}
