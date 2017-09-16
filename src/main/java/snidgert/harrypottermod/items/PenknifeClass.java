package snidgert.harrypottermod.items;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PenknifeClass extends Item {

	private final String name = "Penknife";

	public PenknifeClass() {
		GameRegistry.registerItem(this, name);
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World par3World, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (par3World.getBlockState(pos).getBlock() == Blocks.iron_door) {

			IBlockState state = par3World.getBlockState(pos);
			BlockPos blockpos = state.getValue(BlockDoor.HALF) == BlockDoor.EnumDoorHalf.LOWER ? pos : pos.down();
			IBlockState iblockstate = pos.equals(blockpos) ? state : par3World.getBlockState(blockpos);
			state = iblockstate.cycleProperty(BlockDoor.OPEN);
			par3World.setBlockState(blockpos, state, 2);
			par3World.markBlockRangeForRenderUpdate(blockpos, pos);
			par3World.playAuxSFXAtEntity(playerIn, state.getValue(BlockDoor.OPEN).booleanValue() ? 1003 : 1006, pos, 0);

		}
		return true;
	}

	public String getName() {
		return name;
	}

}
