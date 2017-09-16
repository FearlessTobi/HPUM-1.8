package snidgert.harrypottermod.items;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TridentClass extends ItemSword {

	private final String name = "Trident";

	public TridentClass(final Item.ToolMaterial toolMaterial) {
		super(toolMaterial);
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(1);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
		final String s = EnumChatFormatting.getTextWithoutFormattingCodes(itemstack.getDisplayName());
		if (s.equals("The Trident of Poseidon")) {
			final float f = 1.0f;
			final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
			final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
			final double d0 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
			final double d2 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
			final double d3 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
			final Vec3 vec3 = new Vec3(d0, d2, d3);
			final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
			final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
			final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
			final float f7 = MathHelper.sin(-f2 * 0.017453292f);
			final float f8 = f5 * f6;
			final float f9 = f4 * f6;
			final double d4 = 5.0;
			final Vec3 vec4 = vec3.addVector(f8 * d4, f7 * d4, f9 * d4);
			final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
			if (movingobjectposition == null) {
				return itemstack;
			}
			final Vec3 vec5 = entityplayer.getLook(f);
			boolean flag = false;
			final float f10 = 1.0f;
			final List list = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d4, vec5.yCoord * d4, vec5.zCoord * d4).expand(f10, f10, f10));
			for (int i = 0; i < list.size(); ++i) {
				final Entity entity = (Entity) list.get(i);
				if (entity.canBeCollidedWith()) {
					final float f11 = entity.getCollisionBorderSize();
					final AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox().expand(f11, f11, f11);
					if (axisalignedbb.isVecInside(vec3)) {
						flag = true;
					}
				}
			}
			if (flag) {
				return itemstack;
			}
			if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
				final int h = movingobjectposition.getBlockPos().getX();
				final int j = movingobjectposition.getBlockPos().getY();
				final int k = movingobjectposition.getBlockPos().getZ();
				if (world.isAirBlock(new BlockPos(h, j + 1, k))) {
					world.setBlockState(new BlockPos(h, j + 1, k), Blocks.flowing_water.getDefaultState());
				}
			}
		}
		return itemstack;
	}

	public String getName() {
		return name;
	}

}
