package snidgert.harrypottermod.wands;

import java.util.List;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import snidgert.harrypottermod.MainClass;
import snidgert.harrypottermod.mobs.entity.EntityBoggartDementor;
import snidgert.harrypottermod.mobs.entity.EntityDogForm;
import snidgert.harrypottermod.mobs.entity.EntityRavenForm;
import snidgert.harrypottermod.mobs.entity.EntitySnidgetForm;
import snidgert.harrypottermod.projectiles.AraniaExumaiProjectile;
import snidgert.harrypottermod.projectiles.AvadakedavraProjectile;
import snidgert.harrypottermod.projectiles.ConfringoStrongProjectile;
import snidgert.harrypottermod.projectiles.CrucioProjectile;
import snidgert.harrypottermod.projectiles.ExpelliarmusStrongProjectile;
import snidgert.harrypottermod.projectiles.ImperioProjectile;
import snidgert.harrypottermod.projectiles.IncendioProjectile;
import snidgert.harrypottermod.projectiles.PatronusStrongProjectile;
import snidgert.harrypottermod.projectiles.SectumsempraStrongProjectile;
import snidgert.harrypottermod.projectiles.StupefyStrongProjectile;

public class DPSWandClass extends Item {

	public boolean PrevSpell;
	public boolean NextSpell;
	public boolean Nox;
	public boolean Quick0;
	public boolean Quick1;
	public boolean Quick2;
	public boolean Quick3;
	public boolean Quick4;
	public boolean Quick5;
	public boolean Quick6;
	public boolean Quick7;
	public boolean Quick8;
	public boolean Quick9;
	public static boolean DPS;
	public static boolean Evil;

	private final String name = "DPSWandClass";

	public DPSWandClass() {
		GameRegistry.registerItem(this, name);
		this.setMaxStackSize(1);
		this.setMaxDamage(24);
	}

	@Override
	public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
		if (!DPSWandClass.DPS) {
			Label_9740: {
				switch (this.getDamage(itemstack)) {
				case 0: {
					if (this.getDamage(itemstack) == 0) {
					}
					break;
				}
				case 1: {
					if (this.getDamage(itemstack) == 1 && !world.isRemote) {
						final List list1 = world.getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ, ((Entity) entityplayer).posX + 1.0, ((Entity) entityplayer).posY + 1.0, ((Entity) entityplayer).posZ + 1.0).expand(50.0, 50.0, 50.0));
						for (int j = 0; j < list1.size(); ++j) {
							final EntityItem entityitem = (EntityItem) list1.get(j);
							if (entityitem != null) {
								world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
								entityitem.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);

							}
						}
					}
				}
				case 2: {
					if (this.getDamage(itemstack) == 2) {
					}
					break;
				}
				case 3: {
					if (this.getDamage(itemstack) == 3) {
						final int i = (int) ((Entity) entityplayer).posX;
						final int k = (int) ((Entity) entityplayer).posY;
						final int l = (int) ((Entity) entityplayer).posZ;
						if (world.getBlockState(new BlockPos(i, k, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k - 1, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k - 1, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k - 1, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k - 1, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k - 1, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k - 1, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k - 1, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k - 1, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k - 1, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k - 1, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k - 1, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k - 1, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k - 1, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k - 1, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k - 1, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k - 1, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k - 1, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k - 1, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k - 1, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k - 1, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k - 1, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k - 1, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k - 1, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k - 1, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k - 1, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k - 1, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k - 1, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k - 1, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k - 1, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k - 1, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k - 1, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k - 1, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k - 1, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k - 1, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k - 1, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k - 1, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k - 1, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k - 1, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k - 1, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k - 1, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k - 1, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k - 1, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k - 1, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k - 1, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k - 1, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k - 1, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k - 1, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k - 1, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k - 1, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k - 1, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k + 1, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k + 1, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k + 1, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k + 1, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k + 1, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k + 1, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k + 1, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k + 1, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k + 1, l)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k + 1, l), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k + 1, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k + 1, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k + 1, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k + 1, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k + 1, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k + 1, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i, k + 1, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i, k + 1, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k + 1, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k + 1, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k + 1, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k + 1, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k + 1, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k + 1, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k + 1, l - 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k + 1, l - 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k + 1, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k + 1, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k + 1, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k + 1, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k + 1, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k + 1, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 1, k + 1, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 1, k + 1, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k + 1, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k + 1, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k + 1, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k + 1, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k + 1, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k + 1, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k + 1, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k + 1, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k + 1, l + 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k + 1, l + 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 2, k + 1, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 2, k + 1, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i + 1, k + 1, l - 2)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i + 1, k + 1, l - 2), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}
						if (world.getBlockState(new BlockPos(i - 2, k + 1, l + 1)).getBlock() == Blocks.water) {
							world.setBlockState(new BlockPos(i - 2, k + 1, l + 1), Blocks.ice.getDefaultState());
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						}

					}
				}
				case 4: {
					if (this.getDamage(itemstack) != 4) {
						break Label_9740;
					}
					if (this.Nox && entityplayer.getActivePotionEffect(Potion.nightVision) != null) {
						world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						entityplayer.removePotionEffect(Potion.nightVision.id);
						this.Nox = false;

						break Label_9740;
					}
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 999999999, 1));

					break Label_9740;
				}
				case 5: {
					if (this.getDamage(itemstack) != 5) {
						break Label_9740;
					}
					final float f = 1.0f;
					final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
					final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
					final double d0 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
					final double d2 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
					final double d3 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
					final Vec3 vec3 = new Vec3(d0, d2, d3);
					final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
					final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
					final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
					final float f7 = MathHelper.sin(-f2 * 0.017453292f);
					final float f8 = f5 * f6;
					final float f9 = f4 * f6;
					final double d4 = 5.0;
					final Vec3 vec4 = vec3.addVector(f8 * d4, f7 * d4, f9 * d4);
					final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
					if (movingobjectposition == null) {
						return itemstack;
					}
					final Vec3 vec5 = entityplayer.getLook(f);
					boolean flag = false;
					final float f10 = 1.0f;
					final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d4, vec5.yCoord * d4, vec5.zCoord * d4).expand(f10, f10, f10));
					for (int m = 0; m < list2.size(); ++m) {
						final Entity entity = (Entity) list2.get(m);
						if (entity.canBeCollidedWith()) {
							final float f11 = entity.getCollisionBorderSize();
							final AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox().expand(f11, f11, f11);
							if (axisalignedbb.isVecInside(vec3)) {
								flag = true;
							}
						}
					}
					if (flag) {
						return itemstack;
					}
					if (movingobjectposition.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) {
						break Label_9740;
					}
					final int h = movingobjectposition.getBlockPos().getX();
					final int j2 = movingobjectposition.getBlockPos().getY();
					final int k2 = movingobjectposition.getBlockPos().getZ();
					if (world.isAirBlock(new BlockPos(h, j2 + 1, k2))) {
						world.setBlockState(new BlockPos(h, j2 + 1, k2), Blocks.flowing_water.getDefaultState());

					}
					break Label_9740;
				}
				case 6: {
					if (this.getDamage(itemstack) != 6) {
						break Label_9740;
					}
					final float f = 1.0f;
					final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
					final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
					final double d0 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
					final double d2 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
					final double d3 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
					final Vec3 vec3 = new Vec3(d0, d2, d3);
					final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
					final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
					final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
					final float f7 = MathHelper.sin(-f2 * 0.017453292f);
					final float f8 = f5 * f6;
					final float f9 = f4 * f6;
					final double d4 = 5.0;
					final Vec3 vec4 = vec3.addVector(f8 * d4, f7 * d4, f9 * d4);
					final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
					if (movingobjectposition == null) {
						return itemstack;
					}
					final Vec3 vec5 = entityplayer.getLook(f);
					boolean flag = false;
					final float f10 = 1.0f;
					final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d4, vec5.yCoord * d4, vec5.zCoord * d4).expand(f10, f10, f10));
					for (int m = 0; m < list2.size(); ++m) {
						final Entity entity = (Entity) list2.get(m);
						if (entity.canBeCollidedWith()) {
							final float f11 = entity.getCollisionBorderSize();
							final AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox().expand(f11, f11, f11);
							if (axisalignedbb.isVecInside(vec3)) {
								flag = true;
							}
						}
					}
					if (flag) {
						return itemstack;
					}
					if (movingobjectposition.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) {
						break Label_9740;
					}
					final int h = movingobjectposition.getBlockPos().getX();
					final int j2 = movingobjectposition.getBlockPos().getY();
					final int k2 = movingobjectposition.getBlockPos().getZ();
					if (world.isAirBlock(new BlockPos(h, j2 + 1, k2)) && Blocks.red_flower.canPlaceBlockAt(world, new BlockPos(h, j2 + 1, k2))) {
						world.setBlockState(new BlockPos(h, j2 + 1, k2), Blocks.red_flower.getDefaultState());

					}
					break Label_9740;
				}
				case 7: {
					if (this.getDamage(itemstack) != 7) {
						break Label_9740;
					}
					final float f = 1.0f;
					final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
					final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
					final double d0 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
					final double d2 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
					final double d3 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
					final Vec3 vec3 = new Vec3(d0, d2, d3);
					final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
					final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
					final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
					final float f7 = MathHelper.sin(-f2 * 0.017453292f);
					final float f8 = f5 * f6;
					final float f9 = f4 * f6;
					final double d4 = 5.0;
					final Vec3 vec4 = vec3.addVector(f8 * d4, f7 * d4, f9 * d4);
					final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
					if (movingobjectposition == null) {
						return itemstack;
					}
					final Vec3 vec5 = entityplayer.getLook(f);
					boolean flag = false;
					final float f10 = 1.0f;
					final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d4, vec5.yCoord * d4, vec5.zCoord * d4).expand(f10, f10, f10));
					for (int m = 0; m < list2.size(); ++m) {
						final Entity entity = (Entity) list2.get(m);
						if (entity.canBeCollidedWith()) {
							final float f11 = entity.getCollisionBorderSize();
							final AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox().expand(f11, f11, f11);
							if (axisalignedbb.isVecInside(vec3)) {
								flag = true;
							}
						}
					}
					if (flag) {
						return itemstack;
					}
					if (movingobjectposition.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) {
						break Label_9740;
					}
					final int h = movingobjectposition.getBlockPos().getX();
					final int j2 = movingobjectposition.getBlockPos().getY();
					final int k2 = movingobjectposition.getBlockPos().getZ();
					if (world.getBlockState(new BlockPos(h, j2, k2)).getBlock() == Blocks.iron_door) {

						BlockPos pos = new BlockPos(h, j2, k2);
						IBlockState state = world.getBlockState(pos);
						BlockPos blockpos = state.getValue(BlockDoor.HALF) == BlockDoor.EnumDoorHalf.LOWER ? pos : pos.down();
						IBlockState iblockstate = pos.equals(blockpos) ? state : world.getBlockState(blockpos);
						state = iblockstate.cycleProperty(BlockDoor.OPEN);
						world.setBlockState(blockpos, state, 2);
						world.markBlockRangeForRenderUpdate(blockpos, pos);
						world.playAuxSFXAtEntity(entityplayer, state.getValue(BlockDoor.OPEN).booleanValue() ? 1003 : 1006, pos, 0);

						break Label_9740;
					}

					if (world.isAirBlock(new BlockPos(h, j2 + 1, k2)) && Blocks.redstone_torch.canPlaceBlockAt(world, new BlockPos(h, j2 + 1, k2))) {
						world.playSoundEffect(h + 0.5, j2 + 0.5, k2 + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						world.setBlockState(new BlockPos(h, j2 + 1, k2), Blocks.redstone_torch.getDefaultState());

					}
					break Label_9740;
				}
				case 8: {
					if (this.getDamage(itemstack) == 8) {
						final Vec3 look = entityplayer.getLookVec();
						entityplayer.setPosition(((Entity) entityplayer).posX + look.xCoord * 30.0, ((Entity) entityplayer).posY + look.yCoord * 30.0, ((Entity) entityplayer).posZ + look.zCoord * 30.0);

					}
				}
				case 9: {
					if (this.getDamage(itemstack) == 9 && !world.isRemote) {
						world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						entityplayer.setInvisible(true);
						((Entity) entityplayer).noClip = true;
						final EntityDogForm entitylevitate = new EntityDogForm(world);
						entitylevitate.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
						world.spawnEntityInWorld(entitylevitate);
						entityplayer.mountEntity(entitylevitate);

					}
				}
				case 10: {
					if (this.getDamage(itemstack) == 10 && !world.isRemote) {
						world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						entityplayer.setInvisible(true);
						((Entity) entityplayer).noClip = true;
						final EntityRavenForm entitylevitate2 = new EntityRavenForm(world);
						entitylevitate2.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
						world.spawnEntityInWorld(entitylevitate2);
						entityplayer.mountEntity(entitylevitate2);

					}
				}
				case 11: {
					if (this.getDamage(itemstack) == 11 && !world.isRemote) {
						world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
						entityplayer.setInvisible(true);
						((Entity) entityplayer).noClip = true;
						final EntitySnidgetForm entitylevitate3 = new EntitySnidgetForm(world);
						entitylevitate3.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
						world.spawnEntityInWorld(entitylevitate3);
						entityplayer.mountEntity(entitylevitate3);

					}
				}
				case 12: {
					if (this.getDamage(itemstack) == 12 && !world.isRemote) {
						final List list1 = world.getEntitiesWithinAABB(EntityBoggartDementor.class, new AxisAlignedBB(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ, ((Entity) entityplayer).posX + 1.0, ((Entity) entityplayer).posY + 1.0, ((Entity) entityplayer).posZ + 1.0).expand(8.0, 8.0, 8.0));
						for (int j = 0; j < list1.size(); ++j) {
							final EntityBoggartDementor entityitem2 = (EntityBoggartDementor) list1.get(j);
							if (entityitem2 != null) {
								world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
								entityitem2.setDead();

							}
						}
					}
				}
				case 13: {
					if (this.getDamage(itemstack) != 13) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 14: {
					if (this.getDamage(itemstack) != 14) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 15: {
					if (this.getDamage(itemstack) != 15) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 16: {
					if (this.getDamage(itemstack) != 16) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 17: {
					if (this.getDamage(itemstack) != 17) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 18: {
					if (this.getDamage(itemstack) != 18) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 19: {
					if (this.getDamage(itemstack) != 19) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 20: {
					if (this.getDamage(itemstack) != 20) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 21: {
					if (this.getDamage(itemstack) != 21) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 22: {
					if (this.getDamage(itemstack) != 22) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 23: {
					if (this.getDamage(itemstack) != 23) {
						break Label_9740;
					}
					final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
					MinecraftForge.EVENT_BUS.post(event);
					if (event.isCanceled()) {
						return event.result;
					}
					entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));

					break Label_9740;
				}
				case 24: {
					if (this.getDamage(itemstack) != 24) {
						break;
					}
					final float f = 1.0f;
					final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
					final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
					final double d0 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
					final double d2 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
					final double d3 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
					final Vec3 vec3 = new Vec3(d0, d2, d3);
					final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
					final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
					final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
					final float f7 = MathHelper.sin(-f2 * 0.017453292f);
					final float f8 = f5 * f6;
					final float f9 = f4 * f6;
					final double d4 = 5.0;
					final Vec3 vec4 = vec3.addVector(f8 * d4, f7 * d4, f9 * d4);
					final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
					if (movingobjectposition == null) {
						return itemstack;
					}
					final Vec3 vec5 = entityplayer.getLook(f);
					boolean flag = false;
					final float f10 = 1.0f;
					final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d4, vec5.yCoord * d4, vec5.zCoord * d4).expand(f10, f10, f10));
					for (int m = 0; m < list2.size(); ++m) {
						final Entity entity = (Entity) list2.get(m);
						if (entity.canBeCollidedWith()) {
							final float f11 = entity.getCollisionBorderSize();
							final AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox().expand(f11, f11, f11);
							if (axisalignedbb.isVecInside(vec3)) {
								flag = true;
							}
						}
					}
					if (flag) {
						return itemstack;
					}
					if (movingobjectposition.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) {
						break;
					}
					final int h = movingobjectposition.getBlockPos().getX();
					final int j2 = movingobjectposition.getBlockPos().getY();
					final int k2 = movingobjectposition.getBlockPos().getZ();
					if (world.isAirBlock(new BlockPos(h, j2 + 1, k2))) {
						world.setBlockState(new BlockPos(h, j2 + 1, k2), MainClass.DarkMark.getDefaultState());
						break;
					}
					break;
				}
				}
			}
			return itemstack;
		}
		return new ItemStack(MainClass.RowanStick, 1);
	}

	@Override
	public void onPlayerStoppedUsing(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer, final int par4) {
		int j = this.getMaxItemUseDuration(par1ItemStack) - par4;
		final ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled()) {
			return;
		}
		j = event.charge;
		final boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;
		float f = j / 20.0f;
		f = (f * f + f * 2.0f) / 3.0f;
		if (f < 0.1) {
			return;
		}
		if (f > 1.0f) {
			f = 1.0f;
		}
		final EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 2.0f);
		if (f == 1.0f) {
			entityarrow.setIsCritical(true);
		}
		final int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);
		if (k > 0) {
			entityarrow.setDamage(entityarrow.getDamage() + k * 0.5 + 0.5);
		}
		final int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);
		if (l > 0) {
			entityarrow.setKnockbackStrength(l);
		}
		if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0) {
			entityarrow.setFire(100);
		}
		par2World.playSoundEffect(((Entity) par3EntityPlayer).posX + 0.5, ((Entity) par3EntityPlayer).posY + 0.5, ((Entity) par3EntityPlayer).posZ + 0.5, "harrypottermod:WandAttack", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
		if (this.getDamage(par1ItemStack) == 13 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final IncendioProjectile fireball2 = new IncendioProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball2.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball2.accelerationX = look.xCoord * 0.1;
			fireball2.accelerationY = look.yCoord * 0.1;
			fireball2.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball2);
		}
		if (this.getDamage(par1ItemStack) == 14 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final AraniaExumaiProjectile fireball3 = new AraniaExumaiProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball3.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball3.accelerationX = look.xCoord * 0.1;
			fireball3.accelerationY = look.yCoord * 0.1;
			fireball3.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball3);
		}
		if (this.getDamage(par1ItemStack) == 15 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final ConfringoStrongProjectile fireball4 = new ConfringoStrongProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball4.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball4.accelerationX = look.xCoord * 0.1;
			fireball4.accelerationY = look.yCoord * 0.1;
			fireball4.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball4);
		}
		if (this.getDamage(par1ItemStack) == 16 && !par2World.isRemote) {
			par2World.spawnEntityInWorld(entityarrow);
		}
		if (this.getDamage(par1ItemStack) == 17 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final SectumsempraStrongProjectile fireball5 = new SectumsempraStrongProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball5.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball5.accelerationX = look.xCoord * 0.1;
			fireball5.accelerationY = look.yCoord * 0.1;
			fireball5.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball5);
		}
		if (this.getDamage(par1ItemStack) == 18 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final StupefyStrongProjectile fireball6 = new StupefyStrongProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball6.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball6.accelerationX = look.xCoord * 0.1;
			fireball6.accelerationY = look.yCoord * 0.1;
			fireball6.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball6);
		}
		if (this.getDamage(par1ItemStack) == 19 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final ExpelliarmusStrongProjectile fireball7 = new ExpelliarmusStrongProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball7.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball7.accelerationX = look.xCoord * 0.1;
			fireball7.accelerationY = look.yCoord * 0.1;
			fireball7.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball7);
		}
		if (this.getDamage(par1ItemStack) == 20 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final PatronusStrongProjectile fireball8 = new PatronusStrongProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball8.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball8.accelerationX = look.xCoord * 0.1;
			fireball8.accelerationY = look.yCoord * 0.1;
			fireball8.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball8);
		}
		if (this.getDamage(par1ItemStack) == 21 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final ImperioProjectile fireball9 = new ImperioProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball9.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball9.accelerationX = look.xCoord * 0.1;
			fireball9.accelerationY = look.yCoord * 0.1;
			fireball9.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball9);
		}
		if (this.getDamage(par1ItemStack) == 22 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final CrucioProjectile fireball10 = new CrucioProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball10.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball10.accelerationX = look.xCoord * 0.1;
			fireball10.accelerationY = look.yCoord * 0.1;
			fireball10.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball10);
		}
		if (this.getDamage(par1ItemStack) == 23 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final AvadakedavraProjectile fireball11 = new AvadakedavraProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball11.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball11.accelerationX = look.xCoord * 0.1;
			fireball11.accelerationY = look.yCoord * 0.1;
			fireball11.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball11);
		}
	}

	@Override
	public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
		return 72000;
	}

	@Override
	public EnumAction getItemUseAction(final ItemStack par1ItemStack) {
		return EnumAction.BOW;
	}

	@Override
	public void onUpdate(final ItemStack par1ItemStack, final World par2World, final Entity par3Entity, final int par4, final boolean par5) {

		if (!par2World.isRemote && par3Entity instanceof EntityPlayer && par1ItemStack == ((EntityPlayer) par3Entity).getHeldItem()) {

			if (this.NextSpell) {
				if (DPSWandClass.Evil) {
					if (this.getDamage(par1ItemStack) <= 23) {
						this.setDamage(par1ItemStack, this.getDamage(par1ItemStack) + 1);
						this.NextSpell = false;
					}
				} else if (this.getDamage(par1ItemStack) <= 23) {
					this.setDamage(par1ItemStack, this.getDamage(par1ItemStack) + 1);
					this.NextSpell = false;
				}
			}
			if (this.PrevSpell && this.getDamage(par1ItemStack) >= 1) {
				this.setDamage(par1ItemStack, this.getDamage(par1ItemStack) - 1);
				this.PrevSpell = false;
			}
			if (this.Quick0) {
				this.setDamage(par1ItemStack, 20);
				this.Quick0 = false;
			}
			if (this.Quick1) {
				this.setDamage(par1ItemStack, 14);
				this.Quick1 = false;
			}
			if (this.Quick2) {
				this.setDamage(par1ItemStack, 16);
				this.Quick2 = false;
			}
			if (this.Quick3) {
				this.setDamage(par1ItemStack, 15);
				this.Quick3 = false;
			}
			if (this.Quick4) {
				this.setDamage(par1ItemStack, 19);
				this.Quick4 = false;
			}
			if (this.Quick5) {
				this.setDamage(par1ItemStack, 9);
				this.Quick5 = false;
			}
			if (this.Quick6) {
				this.setDamage(par1ItemStack, 10);
				this.Quick6 = false;
			}
			if (this.Quick7) {
				this.setDamage(par1ItemStack, 17);
				this.Quick7 = false;
			}
			if (this.Quick8) {
				this.setDamage(par1ItemStack, 11);
				this.Quick8 = false;
			}
			if (this.Quick9) {
				this.setDamage(par1ItemStack, 18);
				this.Quick9 = false;
			}
		}

	}

	public String getName() {
		return name;
	}

}
