package snidgert.harrypottermod.blocks;

import java.util.Random;

import net.minecraft.block.BlockWeb;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.MainClass;
import snidgert.harrypottermod.mobs.entity.EntityAragog;

public class AcromantulaWebClass extends BlockWeb {

	private final String name = "AcromantulaWeb";

	public AcromantulaWebClass() {
		super();
		GameRegistry.registerBlock(this, name);
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		if (!(entityIn instanceof EntityAragog)) {
			entityIn.setInWeb();
		}
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(MainClass.AcromantulaWeb);
	}

	public String getName() {
		return name;
	}

}
