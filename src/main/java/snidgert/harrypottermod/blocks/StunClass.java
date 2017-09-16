package snidgert.harrypottermod.blocks;

import net.minecraft.block.BlockWeb;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class StunClass extends BlockWeb {

	private final String name = "Stun";

	public StunClass(final Material material) {
		GameRegistry.registerBlock(this, name);
		this.setHardness(1.0f);
		this.setResistance(1.0f);
	}

	public String getName() {
		return name;
	}

}
