package snidgert.harrypottermod.generation;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class MagicBiomes {

	public static BiomeGenBase biomeLondon;

	public static void init() {
		registerBiomes();
	}

	public static void registerBiomes() {
		BiomeDictionary.registerBiomeType(MagicBiomes.biomeLondon = new BiomeLondon(50).setBiomeName("London"), new BiomeDictionary.Type[] { BiomeDictionary.Type.FOREST });
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(MagicBiomes.biomeLondon, 10));
	}
}
