package snidgert.harrypottermod.blocks;

import java.util.Random;

import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.wands.DPSWandClass;
import snidgert.harrypottermod.wands.SupportWandClass;
import snidgert.harrypottermod.wands.TankWandClass;

public class BrokenGlassClass extends BlockGlass {

	private final String name = "BrokenGlass";

	public BrokenGlassClass(final Material material) {
		super(material, true);
		GameRegistry.registerBlock(this, name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.0f);
		this.setResistance(0.0f);
	}

	@Override
	public int quantityDropped(final Random par1Random) {
		return 0;
	}

	@Override
	public boolean onBlockActivated(World par1World, BlockPos pos, IBlockState state, EntityPlayer par5EntityPlayer, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (par5EntityPlayer.getHeldItem() != null && par5EntityPlayer.getHeldItem().getItem() instanceof DPSWandClass) {
			par1World.setBlockState(pos, Blocks.glass.getDefaultState());
			par1World.playSoundEffect(((Entity) par5EntityPlayer).posX + 0.5, ((Entity) par5EntityPlayer).posY + 0.5, ((Entity) par5EntityPlayer).posZ + 0.5, "harrypottermod:Reparo", 1.0f, 1.2f);
			par5EntityPlayer.addExperience(200);
			return true;
		}
		if (par5EntityPlayer.getHeldItem() != null && par5EntityPlayer.getHeldItem().getItem() instanceof TankWandClass) {
			par1World.setBlockState(pos, Blocks.glass.getDefaultState());
			par1World.playSoundEffect(((Entity) par5EntityPlayer).posX + 0.5, ((Entity) par5EntityPlayer).posY + 0.5, ((Entity) par5EntityPlayer).posZ + 0.5, "harrypottermod:Reparo", 1.0f, 1.2f);
			par5EntityPlayer.addExperience(200);
			return true;
		}
		if (par5EntityPlayer.getHeldItem() != null && par5EntityPlayer.getHeldItem().getItem() instanceof SupportWandClass) {
			par1World.setBlockState(pos, Blocks.glass.getDefaultState());
			par1World.playSoundEffect(((Entity) par5EntityPlayer).posX + 0.5, ((Entity) par5EntityPlayer).posY + 0.5, ((Entity) par5EntityPlayer).posZ + 0.5, "harrypottermod:Reparo", 1.0f, 1.2f);
			par5EntityPlayer.addExperience(200);
			return true;
		}
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	protected boolean canSilkHarvest() {
		return false;
	}

	public String getName() {
		return name;
	}

}
