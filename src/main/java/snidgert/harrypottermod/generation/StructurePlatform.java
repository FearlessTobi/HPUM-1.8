package snidgert.harrypottermod.generation;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class StructurePlatform extends WorldGenerator {

	protected Block[] GetValidSpawnBlocks() {
		return new Block[] { Blocks.dirt, Blocks.stone, Blocks.grass };
	}

	public boolean LocationIsValidSpawn(final World world, final int x, final int y, final int z) {
		final Block checkBlock = world.getBlockState(new BlockPos(x, y - 1, z)).getBlock();
		final Block blockAbove = world.getBlockState(new BlockPos(x, y, z)).getBlock();
		final Block blockBelow = world.getBlockState(new BlockPos(x, y - 2, z)).getBlock();
		for (final Block i : this.GetValidSpawnBlocks()) {
			if (blockAbove != Blocks.air) {
				return false;
			}
			if (checkBlock == i) {
				return true;
			}
			if (checkBlock == Blocks.snow_layer && blockBelow == i) {
				return true;
			}
			if (checkBlock.getMaterial() == Material.plants && blockBelow == i) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean generate(final World world, final Random rand, final BlockPos pos) {
		final int i = rand.nextInt(1);
		if (i == 0) {
			this.generate_r0(world, rand, pos.getX(), pos.getY(), pos.getZ());
		}
		return true;
	}

	public boolean generate_r0(final World world, final Random rand, final int x, final int y, final int z) {
		if (!this.LocationIsValidSpawn(world, x, y, z) || !this.LocationIsValidSpawn(world, x + 19, y, z) || !this.LocationIsValidSpawn(world, x + 19, y, z + 0) || !this.LocationIsValidSpawn(world, x, y, z + 0)) {
			return false;
		}
		world.setBlockState(new BlockPos(x + 0, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 1, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 2, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 3, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 10, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 11, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 12, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 13, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 14, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 15, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 16, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 17, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 18, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 19, y + 0, z + 0), Blocks.double_stone_slab.getDefaultState());
		world.setBlockState(new BlockPos(x + 0, y + 1, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 1, y + 1, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 2, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 3, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 4, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 5, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 8, y + 1, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 9, y + 1, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 10, y + 1, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 11, y + 1, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 12, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 13, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 14, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 15, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 16, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 17, y + 1, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 18, y + 1, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 19, y + 1, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 0, y + 2, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 1, y + 2, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 2, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 3, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 4, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 9, y + 2, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 10, y + 2, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 11, y + 2, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 12, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 13, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 14, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 15, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 16, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 17, y + 2, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 18, y + 2, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 19, y + 2, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 0, y + 3, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 1, y + 3, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 2, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 3, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 7, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 9, y + 3, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 10, y + 3, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 11, y + 3, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 12, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 13, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 14, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 15, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 16, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 17, y + 3, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 18, y + 3, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 19, y + 3, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 0, y + 4, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 1, y + 4, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 2, y + 4, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 10, y + 4, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 11, y + 4, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 12, y + 4, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 13, y + 4, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 14, y + 4, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 15, y + 4, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 16, y + 4, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 17, y + 4, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 18, y + 4, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 19, y + 4, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 0, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 1, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 2, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 3, y + 5, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 4, y + 5, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 5, y + 5, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 6, y + 5, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 7, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 8, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 9, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 10, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 11, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 12, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 13, y + 5, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 14, y + 5, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 15, y + 5, z + 0), Blocks.air.getDefaultState());
		world.setBlockState(new BlockPos(x + 16, y + 5, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 17, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 18, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 19, y + 5, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 0, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 1, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 2, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 3, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 4, y + 6, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 5, y + 6, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 6, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 7, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 8, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 9, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 10, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 11, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 12, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 13, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 14, y + 6, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.WEST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 15, y + 6, z + 0), Blocks.brick_stairs.getDefaultState().withProperty(BlockStairs.FACING, EnumFacing.EAST).withProperty(BlockStairs.HALF, BlockStairs.EnumHalf.TOP));
		world.setBlockState(new BlockPos(x + 16, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 17, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 18, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 19, y + 6, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 0, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 1, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 2, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 3, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 4, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 5, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 6, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 7, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 8, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 9, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 10, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 11, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 12, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 13, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 14, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 15, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 16, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 17, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 18, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		world.setBlockState(new BlockPos(x + 19, y + 7, z + 0), Blocks.brick_block.getDefaultState());
		return true;
	}
}
