package snidgert.harrypottermod;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import snidgert.harrypottermod.food.TileEntityEveryFlavourBeans;
import snidgert.harrypottermod.mobs.Aragog;
import snidgert.harrypottermod.mobs.Augurey;
import snidgert.harrypottermod.mobs.Basilisk;
import snidgert.harrypottermod.mobs.Billywig;
import snidgert.harrypottermod.mobs.Bird;
import snidgert.harrypottermod.mobs.Bludger;
import snidgert.harrypottermod.mobs.BoggartDementor;
import snidgert.harrypottermod.mobs.Book;
import snidgert.harrypottermod.mobs.Bowtruckle;
import snidgert.harrypottermod.mobs.Bundimun;
import snidgert.harrypottermod.mobs.CatForm;
import snidgert.harrypottermod.mobs.Centaur;
import snidgert.harrypottermod.mobs.Chizpurfle;
import snidgert.harrypottermod.mobs.Clabbert;
import snidgert.harrypottermod.mobs.Dementor;
import snidgert.harrypottermod.mobs.Demiguise;
import snidgert.harrypottermod.mobs.DogForm;
import snidgert.harrypottermod.mobs.Dugbog;
import snidgert.harrypottermod.mobs.Fairy;
import snidgert.harrypottermod.mobs.FalconForm;
import snidgert.harrypottermod.mobs.FiendFyreDragon;
import snidgert.harrypottermod.mobs.FireCrab;
import snidgert.harrypottermod.mobs.Flobberworm;
import snidgert.harrypottermod.mobs.Fluffy;
import snidgert.harrypottermod.mobs.FlyingBroomstick;
import snidgert.harrypottermod.mobs.FordAnglia;
import snidgert.harrypottermod.mobs.Fwooper;
import snidgert.harrypottermod.mobs.Ghost;
import snidgert.harrypottermod.mobs.Ghoul;
import snidgert.harrypottermod.mobs.Gnome;
import snidgert.harrypottermod.mobs.Goblin;
import snidgert.harrypottermod.mobs.GoldenSnitch;
import snidgert.harrypottermod.mobs.Graphorn;
import snidgert.harrypottermod.mobs.Griffin;
import snidgert.harrypottermod.mobs.Grindylow;
import snidgert.harrypottermod.mobs.Hippocampus;
import snidgert.harrypottermod.mobs.Hippogriff;
import snidgert.harrypottermod.mobs.Horklump;
import snidgert.harrypottermod.mobs.Horntail;
import snidgert.harrypottermod.mobs.HouseElf;
import snidgert.harrypottermod.mobs.Imp;
import snidgert.harrypottermod.mobs.ImperioMob;
import snidgert.harrypottermod.mobs.Jarvey;
import snidgert.harrypottermod.mobs.Jobberknoll;
import snidgert.harrypottermod.mobs.Kelpie;
import snidgert.harrypottermod.mobs.Key;
import snidgert.harrypottermod.mobs.Knarl;
import snidgert.harrypottermod.mobs.Kneazle;
import snidgert.harrypottermod.mobs.Leprechaun;
import snidgert.harrypottermod.mobs.Levitate;
import snidgert.harrypottermod.mobs.MasterKey;
import snidgert.harrypottermod.mobs.Mermaid;
import snidgert.harrypottermod.mobs.ModelAurorArmour;
import snidgert.harrypottermod.mobs.ModelDeathEaterArmor;
import snidgert.harrypottermod.mobs.Moke;
import snidgert.harrypottermod.mobs.MonsterBook;
import snidgert.harrypottermod.mobs.Motorbike;
import snidgert.harrypottermod.mobs.Motorbike2;
import snidgert.harrypottermod.mobs.Nagini;
import snidgert.harrypottermod.mobs.Nogtail;
import snidgert.harrypottermod.mobs.Nundu;
import snidgert.harrypottermod.mobs.Occamy;
import snidgert.harrypottermod.mobs.OwlForm;
import snidgert.harrypottermod.mobs.Patronus;
import snidgert.harrypottermod.mobs.Phoenix;
import snidgert.harrypottermod.mobs.PhoenixForm;
import snidgert.harrypottermod.mobs.Pixie;
import snidgert.harrypottermod.mobs.Puffskein;
import snidgert.harrypottermod.mobs.Quaffle;
import snidgert.harrypottermod.mobs.Quintaped;
import snidgert.harrypottermod.mobs.Ramora;
import snidgert.harrypottermod.mobs.RatFrom;
import snidgert.harrypottermod.mobs.RavenForm;
import snidgert.harrypottermod.mobs.RedCap;
import snidgert.harrypottermod.mobs.Reem;
import snidgert.harrypottermod.mobs.Runespoor;
import snidgert.harrypottermod.mobs.Shield;
import snidgert.harrypottermod.mobs.Snake;
import snidgert.harrypottermod.mobs.Snidget;
import snidgert.harrypottermod.mobs.SnidgetForm;
import snidgert.harrypottermod.mobs.StagForm;
import snidgert.harrypottermod.mobs.StoneSoldier;
import snidgert.harrypottermod.mobs.Tebo;
import snidgert.harrypottermod.mobs.Thestral;
import snidgert.harrypottermod.mobs.Troll;
import snidgert.harrypottermod.mobs.UkaranianIronbelly;
import snidgert.harrypottermod.mobs.Unicorn;
import snidgert.harrypottermod.mobs.Veela;
import snidgert.harrypottermod.mobs.Werewolf;
import snidgert.harrypottermod.mobs.WerewolfArmor;
import snidgert.harrypottermod.mobs.WerewolfMob;
import snidgert.harrypottermod.mobs.WingedHorse;
import snidgert.harrypottermod.mobs.entity.EntityAragog;
import snidgert.harrypottermod.mobs.entity.EntityAugurey;
import snidgert.harrypottermod.mobs.entity.EntityBasilisk;
import snidgert.harrypottermod.mobs.entity.EntityBillywig;
import snidgert.harrypottermod.mobs.entity.EntityBird;
import snidgert.harrypottermod.mobs.entity.EntityBludger;
import snidgert.harrypottermod.mobs.entity.EntityBoggartDementor;
import snidgert.harrypottermod.mobs.entity.EntityBook;
import snidgert.harrypottermod.mobs.entity.EntityBowtruckle;
import snidgert.harrypottermod.mobs.entity.EntityBundimun;
import snidgert.harrypottermod.mobs.entity.EntityCatForm;
import snidgert.harrypottermod.mobs.entity.EntityCentaur;
import snidgert.harrypottermod.mobs.entity.EntityChizpurfle;
import snidgert.harrypottermod.mobs.entity.EntityClabbert;
import snidgert.harrypottermod.mobs.entity.EntityDementor;
import snidgert.harrypottermod.mobs.entity.EntityDemiguise;
import snidgert.harrypottermod.mobs.entity.EntityDogForm;
import snidgert.harrypottermod.mobs.entity.EntityDugbog;
import snidgert.harrypottermod.mobs.entity.EntityFairy;
import snidgert.harrypottermod.mobs.entity.EntityFalconForm;
import snidgert.harrypottermod.mobs.entity.EntityFiendfyreDragon;
import snidgert.harrypottermod.mobs.entity.EntityFireCrab;
import snidgert.harrypottermod.mobs.entity.EntityFlobberworm;
import snidgert.harrypottermod.mobs.entity.EntityFluffy;
import snidgert.harrypottermod.mobs.entity.EntityFlyingBroomstick;
import snidgert.harrypottermod.mobs.entity.EntityFordAnglia;
import snidgert.harrypottermod.mobs.entity.EntityFwooper;
import snidgert.harrypottermod.mobs.entity.EntityGhost;
import snidgert.harrypottermod.mobs.entity.EntityGhoul;
import snidgert.harrypottermod.mobs.entity.EntityGnome;
import snidgert.harrypottermod.mobs.entity.EntityGoblin;
import snidgert.harrypottermod.mobs.entity.EntityGoldenSnitch;
import snidgert.harrypottermod.mobs.entity.EntityGraphorn;
import snidgert.harrypottermod.mobs.entity.EntityGriffin;
import snidgert.harrypottermod.mobs.entity.EntityGrindylow;
import snidgert.harrypottermod.mobs.entity.EntityHippocampus;
import snidgert.harrypottermod.mobs.entity.EntityHippogriff;
import snidgert.harrypottermod.mobs.entity.EntityHorklump;
import snidgert.harrypottermod.mobs.entity.EntityHorntail;
import snidgert.harrypottermod.mobs.entity.EntityHouseElf;
import snidgert.harrypottermod.mobs.entity.EntityImp;
import snidgert.harrypottermod.mobs.entity.EntityImperioMob;
import snidgert.harrypottermod.mobs.entity.EntityJarvey;
import snidgert.harrypottermod.mobs.entity.EntityJobberknoll;
import snidgert.harrypottermod.mobs.entity.EntityKelpie;
import snidgert.harrypottermod.mobs.entity.EntityKey;
import snidgert.harrypottermod.mobs.entity.EntityKnarl;
import snidgert.harrypottermod.mobs.entity.EntityKneazle;
import snidgert.harrypottermod.mobs.entity.EntityLeprechaun;
import snidgert.harrypottermod.mobs.entity.EntityLevitate;
import snidgert.harrypottermod.mobs.entity.EntityMasterKey;
import snidgert.harrypottermod.mobs.entity.EntityMermaid;
import snidgert.harrypottermod.mobs.entity.EntityMoke;
import snidgert.harrypottermod.mobs.entity.EntityMonsterBook;
import snidgert.harrypottermod.mobs.entity.EntityMotorbike;
import snidgert.harrypottermod.mobs.entity.EntityMotorbike2;
import snidgert.harrypottermod.mobs.entity.EntityNagini;
import snidgert.harrypottermod.mobs.entity.EntityNogtail;
import snidgert.harrypottermod.mobs.entity.EntityNundu;
import snidgert.harrypottermod.mobs.entity.EntityOccamy;
import snidgert.harrypottermod.mobs.entity.EntityOwlForm;
import snidgert.harrypottermod.mobs.entity.EntityPatronus;
import snidgert.harrypottermod.mobs.entity.EntityPhoenix;
import snidgert.harrypottermod.mobs.entity.EntityPhoenixForm;
import snidgert.harrypottermod.mobs.entity.EntityPixie;
import snidgert.harrypottermod.mobs.entity.EntityPuffskein;
import snidgert.harrypottermod.mobs.entity.EntityQuaffle;
import snidgert.harrypottermod.mobs.entity.EntityQuintaped;
import snidgert.harrypottermod.mobs.entity.EntityRamora;
import snidgert.harrypottermod.mobs.entity.EntityRatForm;
import snidgert.harrypottermod.mobs.entity.EntityRavenForm;
import snidgert.harrypottermod.mobs.entity.EntityRedCap;
import snidgert.harrypottermod.mobs.entity.EntityReem;
import snidgert.harrypottermod.mobs.entity.EntityRunespoor;
import snidgert.harrypottermod.mobs.entity.EntityShield;
import snidgert.harrypottermod.mobs.entity.EntitySnake;
import snidgert.harrypottermod.mobs.entity.EntitySnidget;
import snidgert.harrypottermod.mobs.entity.EntitySnidgetForm;
import snidgert.harrypottermod.mobs.entity.EntityStagForm;
import snidgert.harrypottermod.mobs.entity.EntityStoneSoldier;
import snidgert.harrypottermod.mobs.entity.EntityTebo;
import snidgert.harrypottermod.mobs.entity.EntityThestral;
import snidgert.harrypottermod.mobs.entity.EntityTroll;
import snidgert.harrypottermod.mobs.entity.EntityUkaranianIronbelly;
import snidgert.harrypottermod.mobs.entity.EntityUnicorn;
import snidgert.harrypottermod.mobs.entity.EntityVeela;
import snidgert.harrypottermod.mobs.entity.EntityWerewolf;
import snidgert.harrypottermod.mobs.entity.EntityWerewolfMob;
import snidgert.harrypottermod.mobs.entity.EntityWingedHorse;
import snidgert.harrypottermod.mobs.render.*;
import snidgert.harrypottermod.projectiles.AraniaExumaiProjectile;
import snidgert.harrypottermod.projectiles.AvadakedavraProjectile;
import snidgert.harrypottermod.projectiles.ConfringoProjectile;
import snidgert.harrypottermod.projectiles.ConfringoStrongProjectile;
import snidgert.harrypottermod.projectiles.ConfundoProjectile;
import snidgert.harrypottermod.projectiles.ConfundoStrongProjectile;
import snidgert.harrypottermod.projectiles.CrucioProjectile;
import snidgert.harrypottermod.projectiles.CrucioStrongProjectile;
import snidgert.harrypottermod.projectiles.ExpelliarmusProjectile;
import snidgert.harrypottermod.projectiles.ExpelliarmusStrongProjectile;
import snidgert.harrypottermod.projectiles.ImperioProjectile;
import snidgert.harrypottermod.projectiles.IncendioProjectile;
import snidgert.harrypottermod.projectiles.LevicorpusProjectile;
import snidgert.harrypottermod.projectiles.LevicorpusStrongProjectile;
import snidgert.harrypottermod.projectiles.PatronusProjectile;
import snidgert.harrypottermod.projectiles.PatronusStrongProjectile;
import snidgert.harrypottermod.projectiles.ReductoProjectile;
import snidgert.harrypottermod.projectiles.ReductoStrongProjectile;
import snidgert.harrypottermod.projectiles.SectumsempraProjectile;
import snidgert.harrypottermod.projectiles.SectumsempraStrongProjectile;
import snidgert.harrypottermod.projectiles.StunProjectile;
import snidgert.harrypottermod.projectiles.StunStrongProjectile;
import snidgert.harrypottermod.projectiles.StupefyProjectile;
import snidgert.harrypottermod.projectiles.StupefyStrongProjectile;
import snidgert.harrypottermod.tileentities.TileEntityBoggartChestLocked;
import snidgert.harrypottermod.tileentities.TileEntityBoggartChestOpen;
import snidgert.harrypottermod.tileentities.TileEntityCabinet;
import snidgert.harrypottermod.tileentities.TileEntityCrystalball;
import snidgert.harrypottermod.tileentities.TileEntityCup;
import snidgert.harrypottermod.tileentities.TileEntityDarkMarkClass;
import snidgert.harrypottermod.tileentities.TileEntityDiadem;
import snidgert.harrypottermod.tileentities.TileEntityDiary;
import snidgert.harrypottermod.tileentities.TileEntityGOF;
import snidgert.harrypottermod.tileentities.TileEntityGoldenEgg;
import snidgert.harrypottermod.tileentities.TileEntityGoldenEggOpen;
import snidgert.harrypottermod.tileentities.TileEntityHand;
import snidgert.harrypottermod.tileentities.TileEntityHat;
import snidgert.harrypottermod.tileentities.TileEntityLocket;
import snidgert.harrypottermod.tileentities.TileEntityMirror;
import snidgert.harrypottermod.tileentities.TileEntityPensieve;
import snidgert.harrypottermod.tileentities.TileEntityPensievePlane;
import snidgert.harrypottermod.tileentities.TileEntityRing;
import snidgert.harrypottermod.tileentities.TileEntityStoneSoldierBlock;
import snidgert.harrypottermod.tileentities.TileEntityTriCup;
import snidgert.harrypottermod.tileentities.TileEntityWandCrafter;

public class ClientProxy extends CommonProxy {

	public static int KEY_DOWN;
	public static int KEY_UP;
	public static int KEY_SPECIAL;
	public static int KEY_PREVWAND;
	public static int KEY_NEXTWAND;
	public static int KEY_Quick0;
	public static int KEY_Quick1;
	public static int KEY_Quick2;
	public static int KEY_Quick3;
	public static int KEY_Quick4;
	public static int KEY_Quick5;
	public static int KEY_Quick6;
	public static int KEY_Quick7;
	public static int KEY_Quick8;
	public static int KEY_Quick9;
	public static final Map<Item, ModelBiped> armorModel;

	@Override
	public void preInit() {
		super.preInit();
		MinecraftForge.EVENT_BUS.register(
				new KeyHandler(ClientProxy.KEY_UP, ClientProxy.KEY_DOWN, ClientProxy.KEY_SPECIAL, ClientProxy.KEY_PREVWAND, ClientProxy.KEY_NEXTWAND, ClientProxy.KEY_Quick0, ClientProxy.KEY_Quick1, ClientProxy.KEY_Quick2, ClientProxy.KEY_Quick3, ClientProxy.KEY_Quick4, ClientProxy.KEY_Quick5, ClientProxy.KEY_Quick6, ClientProxy.KEY_Quick7, ClientProxy.KEY_Quick8, ClientProxy.KEY_Quick9));
	}

	@Override
	public void renderStuff() {

		RenderingRegistry.registerEntityRenderingHandler(ExpelliarmusProjectile.class, RenderExpelliarmusProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(AvadakedavraProjectile.class, RenderAvadakedavraProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(PatronusProjectile.class, RenderPatronusProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(StupefyProjectile.class, RenderStupefyProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(ConfringoProjectile.class, RenderConfringoProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(ReductoProjectile.class, RenderReductoProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(CrucioProjectile.class, RenderCrucioProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(ImperioProjectile.class, RenderImperioProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(AraniaExumaiProjectile.class, RenderAraniaExumaiProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(SectumsempraProjectile.class, RenderSectumsempraProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(LevicorpusProjectile.class, RenderLevicorpusProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(IncendioProjectile.class, RenderIncendioProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(StunProjectile.class, RenderStunProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(ConfundoProjectile.class, RenderConfundoProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(PatronusStrongProjectile.class, RenderPatronusStrongProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(ExpelliarmusStrongProjectile.class, RenderExpelliarmusStrongProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(StupefyStrongProjectile.class, RenderStupefyStrongProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(ConfringoStrongProjectile.class, RenderConfringoStrongProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(ReductoStrongProjectile.class, RenderReductoStrongProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(CrucioStrongProjectile.class, RenderCrucioStrongProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(SectumsempraStrongProjectile.class, RenderSectumsempraStrongProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(LevicorpusStrongProjectile.class, RenderLevicorpusStrongProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(StunStrongProjectile.class, RenderStunStrongProjectile::new);
		RenderingRegistry.registerEntityRenderingHandler(ConfundoStrongProjectile.class, RenderConfundoStrongProjectile::new);

		final TileEntitySpecialRenderer render1 = new RenderCup();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCup.class, render1);
		final TileEntitySpecialRenderer render2 = new RenderTriCup();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTriCup.class, render2);
		final TileEntitySpecialRenderer render3 = new RenderDiadem();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDiadem.class, render3);
		final TileEntitySpecialRenderer render4 = new RenderDiary();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDiary.class, render4);
		final TileEntitySpecialRenderer render5 = new RenderGoldenEgg();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldenEgg.class, render5);
		final TileEntitySpecialRenderer render6 = new RenderGoldenEggOpen();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldenEggOpen.class, render6);
		final TileEntitySpecialRenderer render7 = new RenderPensievePlane();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPensievePlane.class, render7);
		final TileEntitySpecialRenderer render8 = new RenderPensieve();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPensieve.class, render8);
		final TileEntitySpecialRenderer render9 = new RenderLocket();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLocket.class, render9);
		final TileEntitySpecialRenderer render10 = new RenderRing();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRing.class, render10);
		final TileEntitySpecialRenderer render11 = new RenderHand();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHand.class, render11);
		final TileEntitySpecialRenderer render12 = new RenderMirror();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMirror.class, render12);
		final TileEntitySpecialRenderer render13 = new RenderGOF();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGOF.class, render13);
		final TileEntitySpecialRenderer render14 = new RenderCabinet();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCabinet.class, render14);
		final TileEntitySpecialRenderer render15 = new RenderEveryFlavourBeans();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEveryFlavourBeans.class, render15);
		final TileEntitySpecialRenderer render16 = new RenderHat();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHat.class, render16);
		final TileEntitySpecialRenderer render17 = new RenderBoggartChestLocked();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBoggartChestLocked.class, render17);
		final TileEntitySpecialRenderer render18 = new RenderBoggartChestOpen();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBoggartChestOpen.class, render18);
		final TileEntitySpecialRenderer render19 = new RenderWandCrafter();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWandCrafter.class, render19);
		final TileEntitySpecialRenderer render20 = new RenderCrystalball();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrystalball.class, render20);
		final TileEntitySpecialRenderer render21 = new RenderDarkMark();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDarkMarkClass.class, render21);
		final TileEntitySpecialRenderer render22 = new RenderStoneSoldierBlock();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStoneSoldierBlock.class, render22);

		RenderingRegistry.registerEntityRenderingHandler(EntityHorntail.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderHorntail(manager, new Horntail(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityBasilisk.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderBasilisk(manager, new Basilisk(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFluffy.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderFluffy(manager, new Fluffy(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityWerewolfMob.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderWerewolfMob(manager, new WerewolfMob(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityHippogriff.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderHippogriff(manager, new Hippogriff(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPhoenix.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderPhoenix(manager, new Phoenix(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityDementor.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderDementor(manager, new Dementor(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityBook.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderBook(manager, new Book(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySnake.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderSnake(manager, new Snake(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityShield.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderShield(manager, new Shield(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPatronus.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderPatronus(manager, new Patronus(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityBird.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderBird(manager, new Bird(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityImperioMob.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderImperioMob(manager, new ImperioMob(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMonsterBook.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderMonsterBook(manager, new MonsterBook(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityLevitate.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderLevitate(manager, new Levitate(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldenSnitch.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderGoldenSnitch(manager, new GoldenSnitch(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityQuaffle.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderQuaffle(manager, new Quaffle(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityBludger.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderBludger(manager, new Bludger(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFordAnglia.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderFordAnglia(manager, new FordAnglia(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMotorbike.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderMotorbike(manager, new Motorbike(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMotorbike2.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderMotorbike2(manager, new Motorbike2(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlyingBroomstick.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderFlyingBroomstick(manager, new FlyingBroomstick(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityWerewolf.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderWerewolf(manager, new Werewolf(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityStagForm.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderStagForm(manager, new StagForm(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityDogForm.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderDogForm(manager, new DogForm(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityCatForm.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderCatForm(manager, new CatForm(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityRatForm.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderRatForm(manager, new RatFrom(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityAragog.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderAragog(manager, new Aragog(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPhoenixForm.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderPhoenixForm(manager, new PhoenixForm(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityRavenForm.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderRavenForm(manager, new RavenForm(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySnidgetForm.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderSnidgetForm(manager, new SnidgetForm(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFalconForm.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderFalconForm(manager, new FalconForm(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityOwlForm.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderOwlForm(manager, new OwlForm(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityNagini.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderNagini(manager, new Nagini(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityKey.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderKey(manager, new Key(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMasterKey.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderMasterKey(manager, new MasterKey(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGhost.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderGhost(manager, new Ghost(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFiendfyreDragon.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderFiendfyreDragon(manager, new FiendFyreDragon(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityHouseElf.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderHouseElf(manager, new HouseElf(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityBoggartDementor.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderBoggartDementor(manager, new BoggartDementor(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityWingedHorse.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderWingedHorse(manager, new WingedHorse(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicorn.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderUnicorn(manager, new Unicorn(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityThestral.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderThestral(manager, new Thestral(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityBillywig.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderBillywig(manager, new Billywig(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGriffin.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderGriffin(manager, new Griffin(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGrindylow.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderGrindylow(manager, new Grindylow(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityHippocampus.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderHippocampus(manager, new Hippocampus(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPuffskein.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderPuffskein(manager, new Puffskein(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityNogtail.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderNogtail(manager, new Nogtail(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityRunespoor.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderRunespoor(manager, new Runespoor(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTroll.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderTroll(manager, new Troll(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityRedCap.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderRedCap(manager, new RedCap(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityBowtruckle.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderBowtruckle(manager, new Bowtruckle(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityPixie.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderPixie(manager, new Pixie(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGoblin.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderGoblin(manager, new Goblin(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFairy.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderFairy(manager, new Fairy(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityAugurey.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderAugurey(manager, new Augurey(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityUkaranianIronbelly.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderUkaranianIronbelly(manager, new UkaranianIronbelly(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityClabbert.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderClabbert(manager, new Clabbert(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityBundimun.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderBundimun(manager, new Bundimun(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityChizpurfle.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderChizpurfle(manager, new Chizpurfle(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMermaid.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderMermaid(manager, new Mermaid(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderCentaur(manager, new Centaur(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityDugbog.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderDugbog(manager, new Dugbog(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGnome.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderGnome(manager, new Gnome(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityTebo.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderTebo(manager, new Tebo(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityRamora.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderRamora(manager, new Ramora(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityMoke.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderMoke(manager, new Moke(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityJobberknoll.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderJobberknoll(manager, new Jobberknoll(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntitySnidget.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderSnidget(manager, new Snidget(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityDemiguise.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderDemiguise(manager, new Demiguise(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFireCrab.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderFireCrab(manager, new FireCrab(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFlobberworm.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderFlobberworm(manager, new Flobberworm(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityFwooper.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderFwooper(manager, new Fwooper(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGhoul.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderGhoul(manager, new Ghoul(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityGraphorn.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderGraphorn(manager, new Graphorn(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityHorklump.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderHorklump(manager, new Horklump(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityImp.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderImp(manager, new Imp(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityJarvey.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderJarvey(manager, new Jarvey(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityKelpie.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderKelpie(manager, new Kelpie(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityKnarl.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderKnarl(manager, new Knarl(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityKneazle.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderKneazle(manager, new Kneazle(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityNundu.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderNundu(manager, new Nundu(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityOccamy.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderOccamy(manager, new Occamy(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityQuintaped.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderQuintaped(manager, new Quintaped(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityReem.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderReem(manager, new Reem(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityVeela.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderVeela(manager, new Veela(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityLeprechaun.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderLeprechaun(manager, new Leprechaun(), 0.3f);
			}
		});
		RenderingRegistry.registerEntityRenderingHandler(EntityStoneSoldier.class, new IRenderFactory() {

			@Override
			public Render createRenderFor(RenderManager manager) {
				return new RenderStoneSoldier(manager, new StoneSoldier(), 0.3f);
			}
		});

		final ModelAurorArmour auror_armor = new ModelAurorArmour(0.5f);
		final ModelAurorArmour auror_legs = new ModelAurorArmour(0.5f);
		final WerewolfArmor werewolf_armor = new WerewolfArmor(0.5f);
		final WerewolfArmor werewolf_legs = new WerewolfArmor(0.5f);
		final ModelDeathEaterArmor deatheater_armor = new ModelDeathEaterArmor(0.5f);
		final ModelDeathEaterArmor deatheater_legs = new ModelDeathEaterArmor(0.5f);
		ClientProxy.armorModel.put(MainClass.AurorChest, auror_armor);
		ClientProxy.armorModel.put(MainClass.AurorHat, auror_armor);
		ClientProxy.armorModel.put(MainClass.AurorLegs, auror_legs);
		ClientProxy.armorModel.put(MainClass.AurorShoes, auror_armor);
		ClientProxy.armorModel.put(MainClass.DeathEaterChest, deatheater_armor);
		ClientProxy.armorModel.put(MainClass.DeathEaterHat, deatheater_armor);
		ClientProxy.armorModel.put(MainClass.DeathEaterLegs, deatheater_legs);
		ClientProxy.armorModel.put(MainClass.DeathEaterShoes, deatheater_armor);
		ClientProxy.armorModel.put(MainClass.WerewolfChest, werewolf_armor);
		ClientProxy.armorModel.put(MainClass.WerewolfHead, werewolf_armor);
		ClientProxy.armorModel.put(MainClass.WerewolfLegs, werewolf_legs);
		ClientProxy.armorModel.put(MainClass.WerewolfFeet, werewolf_armor);
	}

	@Override
	public void registerTileEntitySpecialRenderer() {
	}

	static {
		ClientProxy.KEY_DOWN = 46;
		ClientProxy.KEY_UP = 19;
		ClientProxy.KEY_SPECIAL = 33;
		ClientProxy.KEY_PREVWAND = 47;
		ClientProxy.KEY_NEXTWAND = 34;
		ClientProxy.KEY_Quick0 = 82;
		ClientProxy.KEY_Quick1 = 79;
		ClientProxy.KEY_Quick2 = 80;
		ClientProxy.KEY_Quick3 = 81;
		ClientProxy.KEY_Quick4 = 75;
		ClientProxy.KEY_Quick5 = 76;
		ClientProxy.KEY_Quick6 = 77;
		ClientProxy.KEY_Quick7 = 71;
		ClientProxy.KEY_Quick8 = 72;
		ClientProxy.KEY_Quick9 = 73;
		armorModel = new HashMap<Item, ModelBiped>();
	}
}
