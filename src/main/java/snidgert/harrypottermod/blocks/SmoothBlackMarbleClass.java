package snidgert.harrypottermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmoothBlackMarbleClass extends Block {

	private final String name = "SmoothBlackMarble";

	public SmoothBlackMarbleClass(final Material material) {
		super(material);
		GameRegistry.registerBlock(this, name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(3.0f);
		this.setResistance(4.0f);
	}

	public String getName() {
		return name;
	}

}
