package snidgert.harrypottermod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.MainClass;

public class SilverOreClass extends Block {

	private final String name = "SilverOre";

	public SilverOreClass(final Material material) {
		super(material);
		GameRegistry.registerBlock(this, name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(5.0f);
		this.setResistance(4.0f);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return MainClass.SilverIngot;
	}

	public String getName() {
		return name;
	}

}
