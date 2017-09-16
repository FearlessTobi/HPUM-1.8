package snidgert.harrypottermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.mobs.entity.EntityLevitate;
import snidgert.harrypottermod.wands.DPSWandClass;
import snidgert.harrypottermod.wands.SupportWandClass;
import snidgert.harrypottermod.wands.TankWandClass;

public class WingardiumLeviosaBlockClass extends Block {

	private final String name = "WingardiumLeviosaBlock";

	public WingardiumLeviosaBlockClass(final Material material) {
		super(material);
		GameRegistry.registerBlock(this, name);
	}

	@Override
	public boolean onBlockActivated(World par1World, BlockPos pos, IBlockState state, EntityPlayer par5EntityPlayer, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (par5EntityPlayer.getHeldItem() != null && par5EntityPlayer.getHeldItem().getItem() instanceof DPSWandClass) {
			final EntityLevitate entitylevitate = new EntityLevitate(par1World);
			entitylevitate.setPosition(pos.getX(), pos.getY(), pos.getZ());
			par1World.spawnEntityInWorld(entitylevitate);
			par1World.setBlockToAir(pos);
			par1World.playSoundEffect(((Entity) par5EntityPlayer).posX + 0.5, ((Entity) par5EntityPlayer).posY + 0.5, ((Entity) par5EntityPlayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, 1.2f);
			par5EntityPlayer.addExperience(200);
			return true;
		}
		if (par5EntityPlayer.getHeldItem() != null && par5EntityPlayer.getHeldItem().getItem() instanceof TankWandClass) {
			final EntityLevitate entitylevitate = new EntityLevitate(par1World);
			entitylevitate.setPosition(pos.getX(), pos.getY(), pos.getZ());
			par1World.spawnEntityInWorld(entitylevitate);
			par1World.setBlockToAir(pos);
			par1World.playSoundEffect(((Entity) par5EntityPlayer).posX + 0.5, ((Entity) par5EntityPlayer).posY + 0.5, ((Entity) par5EntityPlayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, 1.2f);
			par5EntityPlayer.addExperience(200);
			return true;
		}
		if (par5EntityPlayer.getHeldItem() != null && par5EntityPlayer.getHeldItem().getItem() instanceof SupportWandClass) {
			final EntityLevitate entitylevitate = new EntityLevitate(par1World);
			entitylevitate.setPosition(pos.getX(), pos.getY(), pos.getZ());
			par1World.spawnEntityInWorld(entitylevitate);
			par1World.setBlockToAir(pos);
			par1World.playSoundEffect(((Entity) par5EntityPlayer).posX + 0.5, ((Entity) par5EntityPlayer).posY + 0.5, ((Entity) par5EntityPlayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, 1.2f);
			par5EntityPlayer.addExperience(200);
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

}
