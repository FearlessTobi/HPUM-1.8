package snidgert.harrypottermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GlowstoneOffClass extends Block {

	private final String name = "GlowstoneOff";

	public GlowstoneOffClass(final Material material) {
		super(material);
		GameRegistry.registerBlock(this, name);
	}

	public String getName() {
		return name;
	}

}
