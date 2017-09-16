package snidgert.harrypottermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import snidgert.harrypottermod.MainClass;
import snidgert.harrypottermod.mobs.entity.EntityFiendfyreDragon;
import snidgert.harrypottermod.tileentities.TileEntityRing;
import snidgert.harrypottermod.wands.WoodWandClass;

public class RingClass extends BlockContainer {

	private final String name = "Ring";

	public RingClass(final Material arg0) {
		super(arg0);
		GameRegistry.registerBlock(this, name);
		this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
		this.setBlockUnbreakable();
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
	public TileEntity createNewTileEntity(final World arg0, final int arg1) {
		return new TileEntityRing();
	}

	@Override
	public boolean onBlockActivated(World par1World, BlockPos pos, IBlockState state, EntityPlayer par5EntityPlayer, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (par5EntityPlayer.getHeldItem() != null && par5EntityPlayer.getHeldItem().getItem() == MainClass.SwordofGryffindor) {
			par1World.setBlockToAir(pos);
		} else if (par5EntityPlayer.getHeldItem() != null && par5EntityPlayer.getHeldItem().getItem() == MainClass.BFang) {
			par1World.setBlockToAir(pos);
		} else if (par5EntityPlayer.getHeldItem() != null && par5EntityPlayer.getHeldItem().getItem() instanceof WoodWandClass) {
			par1World.setBlockToAir(pos);
			if (par1World.isAirBlock(pos)) {
				par1World.setBlockState(pos, Blocks.lava.getDefaultState());
			}
			if (par1World.isAirBlock(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()))) {
				par1World.setBlockState(new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ()), Blocks.fire.getDefaultState());
			}
			if (par1World.isAirBlock(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()))) {
				par1World.setBlockState(new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ()), Blocks.fire.getDefaultState());
			}
			if (par1World.isAirBlock(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1))) {
				par1World.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1), Blocks.fire.getDefaultState());
			}
			if (par1World.isAirBlock(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1))) {
				par1World.setBlockState(new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1), Blocks.fire.getDefaultState());
			}
			final EntityFiendfyreDragon entityboat = new EntityFiendfyreDragon(par1World, pos.getX() + 0.5f, pos.getY() + 5.0f, pos.getZ() + 0.5f);
			if (!par1World.isRemote) {
				par1World.spawnEntityInWorld(entityboat);
			}
		}
		return true;
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

	public String getName() {
		return name;
	}

}
