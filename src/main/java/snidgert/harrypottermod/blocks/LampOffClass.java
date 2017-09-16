package snidgert.harrypottermod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LampOffClass extends Block {

	private final String name = "LampOff";

	public LampOffClass(final Material material) {
		super(material);
		GameRegistry.registerBlock(this, name);
	}

	public String getName() {
		return name;
	}

}
