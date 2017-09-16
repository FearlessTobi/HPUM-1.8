package snidgert.harrypottermod.items;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.MainClass;

public class PutOuterClass extends Item {

	public boolean PrevSpell;
	public boolean NextSpell;

	private final String name = "PutOuter";

	public PutOuterClass() {
		GameRegistry.registerItem(this, name);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxStackSize(1);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
		final int i = MathHelper.floor_double(Minecraft.getMinecraft().objectMouseOver.getBlockPos().getX());
		int j = MathHelper.floor_double(Minecraft.getMinecraft().objectMouseOver.getBlockPos().getZ());
		j = MathHelper.floor_double(Minecraft.getMinecraft().objectMouseOver.getBlockPos().getX() + (i % 2 * 2 - 1) * 0.25f);
		final int k = MathHelper.floor_double(Minecraft.getMinecraft().objectMouseOver.getBlockPos().getY());
		final int l = MathHelper.floor_double(Minecraft.getMinecraft().objectMouseOver.getBlockPos().getZ() + (i / 2 % 2 * 2 - 1) * 0.25f);
		world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:Deluminator", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
		if (world.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k - 1, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k - 1, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k - 1, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k - 1, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k - 1, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k - 1, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k - 1, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k - 1, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k - 1, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k - 1, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k - 1, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k - 1, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k - 1, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k - 1, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k - 1, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k - 1, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k - 1, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k - 1, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k - 1, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k - 1, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k - 1, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k - 1, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k - 1, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k - 1, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k - 1, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k + 1, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k + 1, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k + 1, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k + 1, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k + 1, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k + 1, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k + 1, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k + 1, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k + 1, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k + 1, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k + 1, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k + 1, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k + 1, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k + 1, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k + 1, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k + 1, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k + 1, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k + 1, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k + 1, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k + 1, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k + 1, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k + 1, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k + 1, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k + 1, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k + 1, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k - 2, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k - 2, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k - 2, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k - 2, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k - 2, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k - 2, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k - 2, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k - 2, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k - 2, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k - 2, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k - 2, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k - 2, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k - 2, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k - 2, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k - 2, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k - 2, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k - 2, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k - 2, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k - 2, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k - 2, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k - 2, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k - 2, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k - 2, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k - 2, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k - 2, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k + 2, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k + 2, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k + 2, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k + 2, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k + 2, l), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k + 2, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k + 2, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k + 2, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j, k + 2, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k + 2, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k + 2, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k + 2, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k + 2, l - 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k + 2, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k + 2, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k + 2, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 1, k + 2, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k + 2, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k + 2, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k + 2, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k + 2, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k + 2, l + 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 2, k + 2, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 2)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j + 1, k + 2, l - 2), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 1)).getBlock() == Blocks.torch) {
			setTorchOff(world, new BlockPos(j - 2, k + 2, l + 1), MainClass.TorchOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 2)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 1)).getBlock() == Blocks.redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k - 1, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k - 1, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k - 1, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k - 1, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k - 1, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k + 1, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k + 1, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k + 1, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k + 1, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k + 1, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k - 2, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k - 2, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k - 2, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k - 2, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k - 2, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k + 2, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k + 2, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k + 2, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k + 2, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j, k + 2, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l - 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l + 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 2)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l - 2), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 1)).getBlock() == Blocks.glowstone) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l + 1), MainClass.GlowstoneOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k - 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j, k + 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l - 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l + 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 2)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l - 2), MainClass.LampOff.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 1)).getBlock() == Blocks.lit_redstone_lamp) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l + 1), MainClass.LampOff.getDefaultState());
		}
		return new ItemStack(MainClass.Deluminator);
	}

	private void setTorchOff(World world, BlockPos blockPos, IBlockState defaultState) {
		world.setBlockState(blockPos, defaultState.withProperty(BlockTorch.FACING, world.getBlockState(blockPos).getValue(BlockTorch.FACING)));
	}

	public String getName() {
		return name;
	}

}
