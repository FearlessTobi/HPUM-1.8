package snidgert.harrypottermod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import snidgert.harrypottermod.MainClass;
import snidgert.harrypottermod.tileentities.TileEntityWandCrafter;

public class WandCrafterClass extends BlockContainer {

	private Random rand;
	private final boolean isActive;
	private static boolean keepInventory;

	public WandCrafterClass(final boolean blockState) {
		super(Material.wood);
		this.rand = new Random();
		this.isActive = blockState;

		if (isActive)
			GameRegistry.registerBlock(this, "WandCrafterActive");
		else
			GameRegistry.registerBlock(this, "WandCrafterIdle");

	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (world.isRemote) {
			return true;
		}
		if (!player.isSneaking()) {
			final TileEntityWandCrafter entity = (TileEntityWandCrafter) world.getTileEntity(new BlockPos(pos.getX(), pos.getY(), pos.getZ()));
			if (entity != null) {
				FMLNetworkHandler.openGui(player, MainClass.instance, 4, world, pos.getX(), pos.getY(), pos.getZ());
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos) && World.doesBlockHaveSolidTopSurface(worldIn, pos.down());
	}

	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	@Override
	public boolean isFullCube() {
		return true;
	}

	@Override
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.CUTOUT;
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		this.setDefaultFacing(worldIn, pos, state);
	}

	private void setDefaultFacing(World worldIn, BlockPos pos, IBlockState state) {
		if (!worldIn.isRemote) {
			Block block = worldIn.getBlockState(pos.north()).getBlock();
			Block block1 = worldIn.getBlockState(pos.south()).getBlock();
			Block block2 = worldIn.getBlockState(pos.west()).getBlock();
			Block block3 = worldIn.getBlockState(pos.east()).getBlock();
			EnumFacing enumFacing = state.getValue(FACING);

			if (enumFacing == EnumFacing.NORTH && block.isFullBlock() && !block1.isFullBlock()) {
				enumFacing = EnumFacing.SOUTH;
			} else if (enumFacing == EnumFacing.SOUTH && block.isFullBlock() && !block1.isFullBlock()) {
				enumFacing = EnumFacing.NORTH;
			} else if (enumFacing == EnumFacing.WEST && block.isFullBlock() && !block1.isFullBlock()) {
				enumFacing = EnumFacing.EAST;
			} else if (enumFacing == EnumFacing.EAST && block.isFullBlock() && !block1.isFullBlock()) {
				enumFacing = EnumFacing.WEST;
			}

			worldIn.setBlockState(pos, state.withProperty(FACING, enumFacing), 2);
		}
	}

	@Override
	public IBlockState onBlockPlaced(World worldIN, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		EnumFacing enumFacing = EnumFacing.getFront(meta);

		if (enumFacing.getAxis() == EnumFacing.Axis.Y) {
			enumFacing = EnumFacing.NORTH;
		}

		return this.getDefaultState().withProperty(FACING, enumFacing);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(FACING).getIndex();
	}

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { FACING });
	}

	@SideOnly(Side.CLIENT)

	static final class SwitchEnumFacing {

		static final int[] FACING_LOOKUP = new int[EnumFacing.values().length];

		static {
			try {
				FACING_LOOKUP[EnumFacing.WEST.ordinal()] = 1;
			} catch (NoSuchFieldError var4) {
				;
			}
			try {
				FACING_LOOKUP[EnumFacing.EAST.ordinal()] = 2;
			} catch (NoSuchFieldError var3) {
				;
			}
			try {
				FACING_LOOKUP[EnumFacing.NORTH.ordinal()] = 3;
			} catch (NoSuchFieldError var2) {
				;
			}
			try {
				FACING_LOOKUP[EnumFacing.SOUTH.ordinal()] = 4;
			} catch (NoSuchFieldError var1) {
				;
			}
		}
	}

	@Override
	public TileEntity createNewTileEntity(final World var1, final int var2) {
		return new TileEntityWandCrafter();
	}

	public static void updateBlockState(final boolean craftingWand, final World world, final int xCoord, final int yCoord, final int zCoord) {
		final TileEntity entity = world.getTileEntity(new BlockPos(xCoord, yCoord, zCoord));
		WandCrafterClass.keepInventory = true;
		if (craftingWand) {
			world.setBlockState(new BlockPos(xCoord, yCoord, zCoord), MainClass.WandCrafterActive.getDefaultState());
		} else {
			world.setBlockState(new BlockPos(xCoord, yCoord, zCoord), MainClass.WandCrafterIdle.getDefaultState());
		}
		WandCrafterClass.keepInventory = false;
		if (entity != null) {
			entity.validate();
			world.setTileEntity(new BlockPos(xCoord, yCoord, zCoord), entity);
		}
	}

	public String getName() {
		if (isActive)
			return "WandCrafterActive";
		else
			return "WandCrafterIdle";
	}

	static {
		WandCrafterClass.keepInventory = false;
	}
}
