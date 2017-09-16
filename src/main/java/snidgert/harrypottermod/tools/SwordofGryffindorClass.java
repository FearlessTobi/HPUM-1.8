package snidgert.harrypottermod.tools;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.mobs.entity.EntityNagini;

public class SwordofGryffindorClass extends ItemSword {

	private final String name = "SwordofGryffindor";

	public SwordofGryffindorClass(final Item.ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(1);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
		final float f = 1.0f;
		final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
		final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
		final double d = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
		final double d2 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
		final double d3 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
		final Vec3 vec3d = new Vec3(d, d2, d3);
		final float f4 = MathHelper.cos(-f3 * 0.01745329f - 3.141593f);
		final float f5 = MathHelper.sin(-f3 * 0.01745329f - 3.141593f);
		final float f6 = -MathHelper.cos(-f2 * 0.01745329f);
		final float f7 = MathHelper.sin(-f2 * 0.01745329f);
		final float f8 = f5 * f6;
		final float f9 = f7;
		final float f10 = f4 * f6;
		final double d4 = 5000.0;
		final Vec3 vec3d2 = vec3d.addVector(f8 * d4, f9 * d4, f10 * d4);
		final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3d, vec3d2, true);
		if (movingobjectposition == null) {
			return itemstack;
		}
		final int i = movingobjectposition.getBlockPos().getX();
		final int j = movingobjectposition.getBlockPos().getY();
		final int k = movingobjectposition.getBlockPos().getZ();
		world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
		return itemstack;
	}

	@Override
	public boolean hitEntity(final ItemStack par1ItemStack, final EntityLivingBase par2EntityLivingBase, final EntityLivingBase par3EntityLivingBase) {
		if (par2EntityLivingBase instanceof EntityNagini) {
			par2EntityLivingBase.setDead();
		}
		return true;
	}

	public String getName() {
		return name;
	}

}
