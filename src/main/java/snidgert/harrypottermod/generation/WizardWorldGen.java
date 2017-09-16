package snidgert.harrypottermod.generation;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import snidgert.harrypottermod.MainClass;

public class WizardWorldGen implements IWorldGenerator {

	@Override
	public void generate(final Random random, final int chunkX, final int chunkZ, final World world, final IChunkProvider chunkGenerator, final IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: {
			this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
		}
		case 1: {
			this.generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
		case -1: {
			this.generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
		}
	}

	public void generateNether(final World world, final Random random, final int x, final int z) {
	}

	public void generateEnd(final World world, final Random random, final int x, final int z) {
	}

	public void generateSurface(final World world, final Random random, final int x, final int z) {

		this.addOreSpawn(MainClass.SilverOre, 0, world, random, x, z, 16, 16, 4 + random.nextInt(6), 16, 30, 70);
		this.addOreSpawn(MainClass.RubyOre, 0, world, random, x, z, 16, 16, 4 + random.nextInt(6), 4, 1, 12);
		this.addOreSpawn(MainClass.Marble, 0, world, random, x, z, 16, 16, 4 + random.nextInt(6), 20, 40, 100);
		this.addOreSpawn(MainClass.BlackMarble, 0, world, random, x, z, 16, 16, 4 + random.nextInt(6), 20, 40, 100);
		this.addOreSpawn(MainClass.MagicPowerOre, 0, world, random, x, z, 16, 16, 4 + random.nextInt(6), 17, 10, 80);

		final BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenerator(new BlockPos(x, 0, z));
		if (biome == BiomeGenBase.plains) {
			for (int a = 0; a < 1; ++a) {
				final int i = x + random.nextInt(256);
				final int j = z + random.nextInt(256);
				final int k = world.getHeight(new BlockPos(i, 0, j)).getY();
				new StructurePlatform().generate(world, random, new BlockPos(i, k, j));
			}
		}

	}

	private void addOreSpawn(final Block block, final int meta, final World world, final Random random, final int blockX, final int blockZ, final int maxX, final int maxZ, final int maxSize, final int chance, final int minY, final int maxY) {
		for (int i = 0; i < chance; ++i) {
			final int posX = blockX + random.nextInt(maxX);
			final int posY = minY + random.nextInt(maxY - minY);
			final int posZ = blockZ + random.nextInt(maxZ);
			new WorldGenMinable(block.getDefaultState(), maxSize).generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}
}
