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

public class DeluminatorClass extends Item {

	public boolean PrevSpell;
	public boolean NextSpell;

	private final String name = "Deluminator";

	public DeluminatorClass() {
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
		world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:Illuminator", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
		if (world.getBlockState(new BlockPos(j, k, l)).getBlock() == Blocks.water) {
			world.setBlockState(new BlockPos(j, k, l), Blocks.ice.getDefaultState());
			world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
		}
		if (world.getBlockState(new BlockPos(j, k, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k - 1, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k - 1, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k - 1, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k - 1, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k - 1, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k - 1, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k - 1, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k - 1, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k - 1, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k - 1, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k - 1, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k - 1, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k - 1, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k - 1, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k - 1, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k - 1, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k - 1, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k - 1, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k - 1, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k - 1, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k - 1, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k - 1, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k - 1, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k - 1, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k - 1, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k + 1, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k + 1, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k + 1, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k + 1, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k + 1, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k + 1, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k + 1, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k + 1, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k + 1, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k + 1, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k + 1, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k + 1, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k + 1, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k + 1, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k + 1, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k + 1, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k + 1, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k + 1, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k + 1, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k + 1, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k + 1, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k + 1, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k + 1, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k + 1, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k + 1, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k - 2, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k - 2, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k - 2, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k - 2, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k - 2, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k - 2, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k - 2, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k - 2, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k - 2, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k - 2, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k - 2, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k - 2, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k - 2, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k - 2, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k - 2, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k - 2, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k - 2, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k - 2, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k - 2, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k - 2, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k - 2, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k - 2, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k - 2, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k - 2, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k - 2, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k + 2, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k + 2, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k + 2, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k + 2, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k + 2, l), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k + 2, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k + 2, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k + 2, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j, k + 2, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k + 2, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k + 2, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k + 2, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k + 2, l - 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k + 2, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k + 2, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k + 2, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 1, k + 2, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k + 2, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k + 2, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k + 2, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k + 2, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k + 2, l + 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 2, k + 2, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 2)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j + 1, k + 2, l - 2), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 1)).getBlock() == MainClass.TorchOff) {
			setTorch(world, new BlockPos(j - 2, k + 2, l + 1), Blocks.torch.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k - 1, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k - 1, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k - 1, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k - 1, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k - 1, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k + 1, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k + 1, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k + 1, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k + 1, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k + 1, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k - 2, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k - 2, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k - 2, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k - 2, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k - 2, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k + 2, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k + 2, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k + 2, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k + 2, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j, k + 2, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l - 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l + 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 2)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l - 2), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 1)).getBlock() == MainClass.LampOff) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l + 1), Blocks.redstone_lamp.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k - 1, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k - 1, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k - 1, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k - 1, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 1, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k - 1, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 1, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k - 1, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 1, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k - 1, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 1, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k - 1, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 1, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k - 1, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k + 1, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k + 1, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k + 1, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k + 1, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 1, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k + 1, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 1, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k + 1, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 1, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k + 1, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 1, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k + 1, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 1, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k + 1, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k - 2, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k - 2, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k - 2, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k - 2, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k - 2, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k - 2, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k - 2, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k - 2, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k - 2, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k - 2, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k - 2, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k - 2, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k - 2, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k - 2, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k + 2, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k + 2, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k + 2, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k + 2, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j, k + 2, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j, k + 2, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l - 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 1, k + 2, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 1, k + 2, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l + 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l + 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 2, k + 2, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 2, k + 2, l + 1), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j + 1, k + 2, l - 2)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j + 1, k + 2, l - 2), Blocks.glowstone.getDefaultState());
		}
		if (world.getBlockState(new BlockPos(j - 2, k + 2, l + 1)).getBlock() == MainClass.GlowstoneOff) {
			world.setBlockState(new BlockPos(j - 2, k + 2, l + 1), Blocks.glowstone.getDefaultState());
		}
		return new ItemStack(MainClass.PutOuter);
	}

	private void setTorch(World world, BlockPos blockPos, IBlockState defaultState) {
		world.setBlockState(blockPos, defaultState.withProperty(BlockTorch.FACING, world.getBlockState(blockPos).getValue(BlockTorch.FACING)));
	}

	public String getName() {
		return name;
	}

}
