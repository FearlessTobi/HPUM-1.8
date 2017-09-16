package snidgert.harrypottermod;

import java.util.Random;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityHandler {

	public static void registerHorntail(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 7, 1, 1, EnumCreatureType.CREATURE,
				new BiomeGenBase[] { BiomeGenBase.iceMountains, BiomeGenBase.sky, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerBasilisk(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 2, 1, 1, EnumCreatureType.MONSTER, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.jungle, BiomeGenBase.roofedForest });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerFord(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.AMBIENT, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerFluffy(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.plains });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerWerewolf(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 12, 1, 3, EnumCreatureType.MONSTER, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.plains, BiomeGenBase.jungle });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerHippogriff(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 8, 1, 5, EnumCreatureType.CREATURE,
				new BiomeGenBase[] { BiomeGenBase.iceMountains, BiomeGenBase.sky, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerPhoenix(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 9, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.desertHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerDementor(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 12, 1, 6, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills,
				BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerBook(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 15, 1, 15, EnumCreatureType.MONSTER, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.plains });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerSnake(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerShield(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerPatronus(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerBird(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerImperio(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerMonsterBook(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.MONSTER, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerLevitate(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerSnitch(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerBludger(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerMotocycle(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerMotocycle2(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerBroom(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerSpider(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 4, 1, 1, EnumCreatureType.MONSTER, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerForm(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerProjectile(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 128, 1, true);
	}

	public static void registerNagini(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 1, 1, 1, EnumCreatureType.MONSTER, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerGhost(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerFiendfyre(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.MONSTER, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerCabinet(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerElf(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 14, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerBoggart(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}

	public static void registerWingedHorse(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 4, EnumCreatureType.CREATURE,
				new BiomeGenBase[] { BiomeGenBase.iceMountains, BiomeGenBase.sky, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerUnicorn(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerThestral(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 15, 2, 4, EnumCreatureType.CREATURE,
				new BiomeGenBase[] { BiomeGenBase.iceMountains, BiomeGenBase.sky, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerBillywig(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 20, 1, 5, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.plains });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerGriffin(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 9, 1, 2, EnumCreatureType.CREATURE,
				new BiomeGenBase[] { BiomeGenBase.iceMountains, BiomeGenBase.sky, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerGrindylow(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 12, 1, 2, EnumCreatureType.AMBIENT, new BiomeGenBase[] { BiomeGenBase.ocean, BiomeGenBase.deepOcean });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerMermaid(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 2, EnumCreatureType.WATER_CREATURE, new BiomeGenBase[] { BiomeGenBase.ocean, BiomeGenBase.deepOcean });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerHippocampus(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 13, 1, 2, EnumCreatureType.WATER_CREATURE, new BiomeGenBase[] { BiomeGenBase.ocean, BiomeGenBase.deepOcean });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerRamora(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 15, 1, 2, EnumCreatureType.WATER_CREATURE, new BiomeGenBase[] { BiomeGenBase.ocean, BiomeGenBase.deepOcean });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerPuffskein(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerNogtail(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 8, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerRunespoor(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerTroll(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 7, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.extremeHills, BiomeGenBase.iceMountains });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerRedCap(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 15, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.extremeHills, BiomeGenBase.iceMountains });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerBowtruckle(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 15, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerPixie(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 16, 1, 6, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerGoblin(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 4, 10, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerFairy(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 6, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerAugurey(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 11, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.desertHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerClabbert(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 15, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.jungle });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerBundimun(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 14, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.desertHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerChizpurfle(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 25, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.desertHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerCentaur(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 15, 1, 10, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.plains });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerDugbog(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 25, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerGnome(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.birchForest, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerTebo(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.jungle });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerMoke(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 15, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.jungle });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerJobberknoll(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 25, 1, 6, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerSnidget(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 6, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerDemiguise(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 3, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerFireCrab(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 4, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.beach });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerFlobberworm(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.swampland });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerFwooper(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 6, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.savanna, BiomeGenBase.savannaPlateau });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerGhoul(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 8, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerGraphorn(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.extremeHills, BiomeGenBase.iceMountains });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerHorklump(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 15, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.forest, BiomeGenBase.taiga, BiomeGenBase.birchForest, BiomeGenBase.mushroomIsland, BiomeGenBase.roofedForest });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerImp(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.river, BiomeGenBase.swampland });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerJarvey(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 20, 1, 3, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.extremeHills, BiomeGenBase.iceMountains });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerKelpie(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 4, 1, 3, EnumCreatureType.WATER_CREATURE, new BiomeGenBase[] { BiomeGenBase.river, BiomeGenBase.swampland, BiomeGenBase.ocean });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerKnarl(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 20, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.roofedForest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.taiga });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerKneazle(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 13, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.roofedForest, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.taiga });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerNundu(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 4, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.savanna, BiomeGenBase.savannaPlateau });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerOccamy(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 12, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.taiga, BiomeGenBase.desert });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerQuintaped(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 3, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.mushroomIsland, BiomeGenBase.roofedForest });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerReem(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 10, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.savanna, BiomeGenBase.forest });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerVeela(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 7, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.taiga, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.plains });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerLeprechaun(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 7, 1, 1, EnumCreatureType.CREATURE, new BiomeGenBase[] { BiomeGenBase.taiga, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.roofedForest });
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
		EntityList.entityEggs.put(EntityId, new EntityList.EntityEggInfo(EntityId, mainColor, subColor));
	}

	public static void registerStoneSoldier(final Class entityclass, final String name) {
		final int EntityId = EntityRegistry.findGlobalUniqueEntityId();
		final long x = name.hashCode();
		final Random random = new Random(x);
		final int mainColor = random.nextInt() * 16777215;
		final int subColor = random.nextInt() * 16777215;
		EntityRegistry.registerGlobalEntityID(entityclass, name, EntityId);
		EntityRegistry.addSpawn(entityclass, 0, 0, 0, EnumCreatureType.CREATURE, new BiomeGenBase[0]);
		EntityRegistry.registerModEntity(entityclass, name, EntityId, MainClass.instance, 64, 1, true);
	}
}
