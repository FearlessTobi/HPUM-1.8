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
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import snidgert.harrypottermod.MainClass;
import snidgert.harrypottermod.mobs.entity.EntityBird;
import snidgert.harrypottermod.mobs.entity.EntityBoggartDementor;
import snidgert.harrypottermod.mobs.entity.EntityCatForm;
import snidgert.harrypottermod.mobs.entity.EntityDogForm;
import snidgert.harrypottermod.mobs.entity.EntityFalconForm;
import snidgert.harrypottermod.mobs.entity.EntityFiendfyreDragon;
import snidgert.harrypottermod.mobs.entity.EntityNagini;
import snidgert.harrypottermod.mobs.entity.EntityOwlForm;
import snidgert.harrypottermod.mobs.entity.EntityPhoenixForm;
import snidgert.harrypottermod.mobs.entity.EntityRatForm;
import snidgert.harrypottermod.mobs.entity.EntityRavenForm;
import snidgert.harrypottermod.mobs.entity.EntityShield;
import snidgert.harrypottermod.mobs.entity.EntitySnake;
import snidgert.harrypottermod.mobs.entity.EntitySnidgetForm;
import snidgert.harrypottermod.mobs.entity.EntityStagForm;
import snidgert.harrypottermod.projectiles.AraniaExumaiProjectile;
import snidgert.harrypottermod.projectiles.AvadakedavraProjectile;
import snidgert.harrypottermod.projectiles.ConfringoProjectile;
import snidgert.harrypottermod.projectiles.ConfundoProjectile;
import snidgert.harrypottermod.projectiles.CrucioProjectile;
import snidgert.harrypottermod.projectiles.ExpelliarmusProjectile;
import snidgert.harrypottermod.projectiles.ImperioProjectile;
import snidgert.harrypottermod.projectiles.IncendioProjectile;
import snidgert.harrypottermod.projectiles.LevicorpusProjectile;
import snidgert.harrypottermod.projectiles.PatronusProjectile;
import snidgert.harrypottermod.projectiles.ReductoProjectile;
import snidgert.harrypottermod.projectiles.SectumsempraProjectile;
import snidgert.harrypottermod.projectiles.StunProjectile;
import snidgert.harrypottermod.projectiles.StupefyProjectile;

public abstract class WoodWandClass extends Item {

	public boolean PrevSpell;
	public boolean NextSpell;

	@Override
	public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
		Label_27960: {
			switch (this.getDamage(itemstack)) {
			case 0: {
				if (this.getDamage(itemstack) == 0) {
				}
				break;
			}
			case 1: {
				if (this.getDamage(itemstack) == 1 && !world.isRemote) {
					final List list1 = world.getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ, ((Entity) entityplayer).posX + 1.0, ((Entity) entityplayer).posY + 1.0, ((Entity) entityplayer).posZ + 1.0).expand(20.0, 20.0, 20.0));
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
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					final double d0 = Item.itemRand.nextGaussian() * 0.02;
					final double d2 = Item.itemRand.nextGaussian() * 0.02;
					final double d3 = Item.itemRand.nextGaussian() * 0.02;
					world.spawnParticle(EnumParticleTypes.HEART, ((Entity) entityplayer).posX + Item.itemRand.nextFloat() * ((Entity) entityplayer).width * 2.0f - ((Entity) entityplayer).width, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ + Item.itemRand.nextFloat() * ((Entity) entityplayer).width * 2.0f - ((Entity) entityplayer).width, d0, d2, d3);
					world.spawnParticle(EnumParticleTypes.HEART, ((Entity) entityplayer).posX + Item.itemRand.nextFloat() * ((Entity) entityplayer).width * 2.0f - ((Entity) entityplayer).width, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ + Item.itemRand.nextFloat() * ((Entity) entityplayer).width * 2.0f - ((Entity) entityplayer).width, d0, d2, d3);
					world.spawnParticle(EnumParticleTypes.HEART, ((Entity) entityplayer).posX + Item.itemRand.nextFloat() * ((Entity) entityplayer).width * 2.0f - ((Entity) entityplayer).width, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ + Item.itemRand.nextFloat() * ((Entity) entityplayer).width * 2.0f - ((Entity) entityplayer).width, d0, d2, d3);
					world.spawnParticle(EnumParticleTypes.HEART, ((Entity) entityplayer).posX + Item.itemRand.nextFloat() * ((Entity) entityplayer).width * 2.0f - ((Entity) entityplayer).width, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ + Item.itemRand.nextFloat() * ((Entity) entityplayer).width * 2.0f - ((Entity) entityplayer).width, d0, d2, d3);
					world.spawnParticle(EnumParticleTypes.HEART, ((Entity) entityplayer).posX + Item.itemRand.nextFloat() * ((Entity) entityplayer).width * 2.0f - ((Entity) entityplayer).width, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ + Item.itemRand.nextFloat() * ((Entity) entityplayer).width * 2.0f - ((Entity) entityplayer).width, d0, d2, d3);
					entityplayer.heal(10.0f);
					entityplayer.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 2));
				}
			}
			case 3: {
				if (this.getDamage(itemstack) != 3) {
					break Label_27960;
				}
				final float f = 1.0f;
				final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
				final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
				final double d4 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
				final double d5 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
				final double d6 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
				final Vec3 vec3 = new Vec3(d4, d5, d6);
				final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
				final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
				final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
				final float f7 = MathHelper.sin(-f2 * 0.017453292f);
				final float f8 = f5 * f6;
				final float f9 = f4 * f6;
				final double d7 = 5.0;
				final Vec3 vec4 = vec3.addVector(f8 * d7, f7 * d7, f9 * d7);
				final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
				if (movingobjectposition == null) {
					return itemstack;
				}
				final Vec3 vec5 = entityplayer.getLook(f);
				boolean flag = false;
				final float f10 = 1.0f;
				final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d7, vec5.yCoord * d7, vec5.zCoord * d7).expand(f10, f10, f10));
				for (int i = 0; i < list2.size(); ++i) {
					final Entity entity = (Entity) list2.get(i);
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
					break Label_27960;
				}
				int i = movingobjectposition.getBlockPos().getX();
				int k = movingobjectposition.getBlockPos().getY();
				final int l = movingobjectposition.getBlockPos().getZ();
				if (world.getBlockState(new BlockPos(i, k, l)).getBlock() == Blocks.snow_layer) {
					--k;
				}
				final EntityBird entityboat = new EntityBird(world, i + 0.5f, k + 1.0f, l + 0.5f);
				((Entity) entityboat).rotationYaw = ((MathHelper.floor_double(((Entity) entityplayer).rotationYaw * 4.0f / 360.0f + 0.5) & 0x3) - 1) * 90;
				if (!world.getCollidingBoundingBoxes(entityboat, ((Entity) entityboat).getEntityBoundingBox().expand(-0.1, -0.1, -0.1)).isEmpty()) {
					return itemstack;
				}
				if (!world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					world.spawnEntityInWorld(entityboat);
				}
				break Label_27960;
			}
			case 4: {
				if (this.getDamage(itemstack) != 4) {
					break Label_27960;
				}
				final float f = 1.0f;
				final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
				final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
				final double d4 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
				final double d5 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
				final double d6 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
				final Vec3 vec3 = new Vec3(d4, d5, d6);
				final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
				final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
				final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
				final float f7 = MathHelper.sin(-f2 * 0.017453292f);
				final float f8 = f5 * f6;
				final float f9 = f4 * f6;
				final double d7 = 5.0;
				final Vec3 vec4 = vec3.addVector(f8 * d7, f7 * d7, f9 * d7);
				final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
				if (movingobjectposition == null) {
					return itemstack;
				}
				final Vec3 vec5 = entityplayer.getLook(f);
				boolean flag = false;
				final float f10 = 1.0f;
				final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d7, vec5.yCoord * d7, vec5.zCoord * d7).expand(f10, f10, f10));
				for (int i = 0; i < list2.size(); ++i) {
					final Entity entity = (Entity) list2.get(i);
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
					break Label_27960;
				}
				final int h = movingobjectposition.getBlockPos().getX();
				int m = movingobjectposition.getBlockPos().getY();
				final int k2 = movingobjectposition.getBlockPos().getZ();
				if (!world.isRemote) {
					final List list3 = world.getEntitiesWithinAABB(EntityNagini.class, new AxisAlignedBB(h, m, k2, h + 1.0, m + 1.0, k2 + 1.0).expand(2.0, 2.0, 2.0));
					for (int p = 0; p < list3.size(); ++p) {
						final EntityNagini entityitem2 = (EntityNagini) list3.get(p);
						if (entityitem2 != null) {
							entityitem2.setDead();
						}
					}
				}
				if (world.getBlockState(new BlockPos(h, m, k2)).getBlock() == Blocks.snow_layer) {
					--m;
				}
				if (world.isAirBlock(new BlockPos(h, m + 1, k2))) {
					world.setBlockState(new BlockPos(h, m + 1, k2), Blocks.lava.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(h + 1, m + 1, k2))) {
					world.setBlockState(new BlockPos(h + 1, m + 1, k2), Blocks.fire.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(h - 1, m + 1, k2))) {
					world.setBlockState(new BlockPos(h - 1, m + 1, k2), Blocks.fire.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(h, m + 1, k2 + 1))) {
					world.setBlockState(new BlockPos(h, m + 1, k2 + 1), Blocks.fire.getDefaultState());
				}
				if (world.isAirBlock(new BlockPos(h, m + 1, k2 - 1))) {
					world.setBlockState(new BlockPos(h, m + 1, k2 - 1), Blocks.fire.getDefaultState());
				}
				final EntityFiendfyreDragon entityboat2 = new EntityFiendfyreDragon(world, h + 0.5f, m + 5.0f, k2 + 0.5f);
				((Entity) entityboat2).rotationYaw = ((MathHelper.floor_double(((Entity) entityplayer).rotationYaw * 4.0f / 360.0f + 0.5) & 0x3) - 1) * 90;
				if (!world.getCollidingBoundingBoxes(entityboat2, ((Entity) entityboat2).getEntityBoundingBox().expand(-0.1, -0.1, -0.1)).isEmpty()) {
					return itemstack;
				}
				if (!world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					world.spawnEntityInWorld(entityboat2);
				}
				break Label_27960;
			}
			case 5: {
				if (this.getDamage(itemstack) == 5 && !world.isRemote) {
					entityplayer.curePotionEffects(new ItemStack(Items.milk_bucket));
				}
			}
			case 6: {
				if (this.getDamage(itemstack) != 6) {
					break Label_27960;
				}
				final int j2 = (int) ((Entity) entityplayer).posX;
				final int k3 = (int) ((Entity) entityplayer).posY - 1;
				final int l2 = (int) ((Entity) entityplayer).posZ;
				if (world.getBlockState(new BlockPos(j2, k3, l2)).getBlock() == Blocks.water) {
					world.setBlockState(new BlockPos(j2, k3, l2), Blocks.ice.getDefaultState());
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
				}
				if (world.getBlockState(new BlockPos(j2, k3, l2 + 1)).getBlock() == Blocks.water) {
					world.setBlockState(new BlockPos(j2, k3, l2 + 1), Blocks.ice.getDefaultState());
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
				}
				if (world.getBlockState(new BlockPos(j2 + 1, k3, l2)).getBlock() == Blocks.water) {
					world.setBlockState(new BlockPos(j2 + 1, k3, l2), Blocks.ice.getDefaultState());
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
				}
				if (world.getBlockState(new BlockPos(j2 + 1, k3, l2 + 1)).getBlock() == Blocks.water) {
					world.setBlockState(new BlockPos(j2 + 1, k3, l2 + 1), Blocks.ice.getDefaultState());
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
				}
				if (world.getBlockState(new BlockPos(j2 - 1, k3, l2)).getBlock() == Blocks.water) {
					world.setBlockState(new BlockPos(j2 - 1, k3, l2), Blocks.ice.getDefaultState());
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
				}
				if (world.getBlockState(new BlockPos(j2, k3, l2 - 1)).getBlock() == Blocks.water) {
					world.setBlockState(new BlockPos(j2, k3, l2 - 1), Blocks.ice.getDefaultState());
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
				}
				if (world.getBlockState(new BlockPos(j2 - 1, k3, l2 - 1)).getBlock() == Blocks.water) {
					world.setBlockState(new BlockPos(j2 - 1, k3, l2 - 1), Blocks.ice.getDefaultState());
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
				}
				if (world.getBlockState(new BlockPos(j2 + 1, k3, l2 - 1)).getBlock() == Blocks.water) {
					world.setBlockState(new BlockPos(j2 + 1, k3, l2 - 1), Blocks.ice.getDefaultState());
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
				}
				if (world.getBlockState(new BlockPos(j2 - 1, k3, l2 + 1)).getBlock() == Blocks.water) {
					world.setBlockState(new BlockPos(j2 - 1, k3, l2 + 1), Blocks.ice.getDefaultState());
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:IceFreeze", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
				}
				break Label_27960;
			}
			case 7: {
				if (this.getDamage(itemstack) == 7) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 999999999, 1));
				}
			}
			case 8: {
				if (this.getDamage(itemstack) == 8 && entityplayer.getActivePotionEffect(Potion.nightVision) != null) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.removePotionEffect(Potion.nightVision.id);
				}
			}
			case 9: {
				if (this.getDamage(itemstack) == 9) {
					final EntityShield entityshield = new EntityShield(world);
					world.spawnEntityInWorld(entityshield);
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.addPotionEffect(new PotionEffect(MainClass.ShieldEffect.id, 200, 1, false, true));
				}
			}
			case 10: {
				if (this.getDamage(itemstack) != 10) {
					break Label_27960;
				}
				final float f = 1.0f;
				final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
				final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
				final double d4 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
				final double d5 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
				final double d6 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
				final Vec3 vec3 = new Vec3(d4, d5, d6);
				final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
				final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
				final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
				final float f7 = MathHelper.sin(-f2 * 0.017453292f);
				final float f8 = f5 * f6;
				final float f9 = f4 * f6;
				final double d7 = 5.0;
				final Vec3 vec4 = vec3.addVector(f8 * d7, f7 * d7, f9 * d7);
				final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
				if (movingobjectposition == null) {
					return itemstack;
				}
				final Vec3 vec5 = entityplayer.getLook(f);
				boolean flag = false;
				final float f10 = 1.0f;
				final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d7, vec5.yCoord * d7, vec5.zCoord * d7).expand(f10, f10, f10));
				for (int i = 0; i < list2.size(); ++i) {
					final Entity entity = (Entity) list2.get(i);
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
					break Label_27960;
				}
				int i = movingobjectposition.getBlockPos().getX();
				int k = movingobjectposition.getBlockPos().getY();
				final int l = movingobjectposition.getBlockPos().getZ();
				if (world.getBlockState(new BlockPos(i, k, l)).getBlock() == Blocks.snow_layer) {
					--k;
				}
				final EntitySnake entityboat3 = new EntitySnake(world, i + 0.5f, k + 1.0f, l + 0.5f);
				((Entity) entityboat3).rotationYaw = ((MathHelper.floor_double(((Entity) entityplayer).rotationYaw * 4.0f / 360.0f + 0.5) & 0x3) - 1) * 90;
				entityboat3.setOwnerId(entityplayer.getUniqueID().toString());
				entityboat3.setTamed(true);
				if (!world.getCollidingBoundingBoxes(entityboat3, ((Entity) entityboat3).getEntityBoundingBox().expand(-0.1, -0.1, -0.1)).isEmpty()) {
					return itemstack;
				}
				if (!world.isRemote) {
					world.spawnEntityInWorld(entityboat3);
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
				}
				break Label_27960;
			}
			case 11: {
				if (this.getDamage(itemstack) != 11) {
					break Label_27960;
				}
				final float f = 1.0f;
				final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
				final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
				final double d4 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
				final double d5 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
				final double d6 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
				final Vec3 vec3 = new Vec3(d4, d5, d6);
				final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
				final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
				final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
				final float f7 = MathHelper.sin(-f2 * 0.017453292f);
				final float f8 = f5 * f6;
				final float f9 = f4 * f6;
				final double d7 = 5.0;
				final Vec3 vec4 = vec3.addVector(f8 * d7, f7 * d7, f9 * d7);
				final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
				if (movingobjectposition == null) {
					return itemstack;
				}
				final Vec3 vec5 = entityplayer.getLook(f);
				boolean flag = false;
				final float f10 = 1.0f;
				final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d7, vec5.yCoord * d7, vec5.zCoord * d7).expand(f10, f10, f10));
				for (int i = 0; i < list2.size(); ++i) {
					final Entity entity = (Entity) list2.get(i);
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
					break Label_27960;
				}
				final int h = movingobjectposition.getBlockPos().getX();
				final int m = movingobjectposition.getBlockPos().getY();
				final int k2 = movingobjectposition.getBlockPos().getZ();
				if (world.isAirBlock(new BlockPos(h, m + 1, k2))) {
					world.setBlockState(new BlockPos(h, m + 1, k2), Blocks.flowing_water.getDefaultState());
				}
				break Label_27960;
			}
			case 12: {
				if (this.getDamage(itemstack) != 12) {
					break Label_27960;
				}
				final float f = 1.0f;
				final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
				final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
				final double d4 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
				final double d5 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
				final double d6 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
				final Vec3 vec3 = new Vec3(d4, d5, d6);
				final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
				final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
				final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
				final float f7 = MathHelper.sin(-f2 * 0.017453292f);
				final float f8 = f5 * f6;
				final float f9 = f4 * f6;
				final double d7 = 5.0;
				final Vec3 vec4 = vec3.addVector(f8 * d7, f7 * d7, f9 * d7);
				final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
				if (movingobjectposition == null) {
					return itemstack;
				}
				final Vec3 vec5 = entityplayer.getLook(f);
				boolean flag = false;
				final float f10 = 1.0f;
				final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d7, vec5.yCoord * d7, vec5.zCoord * d7).expand(f10, f10, f10));
				for (int i = 0; i < list2.size(); ++i) {
					final Entity entity = (Entity) list2.get(i);
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
					break Label_27960;
				}
				final int h = movingobjectposition.getBlockPos().getX();
				final int m = movingobjectposition.getBlockPos().getY();
				final int k2 = movingobjectposition.getBlockPos().getZ();
				if (world.isAirBlock(new BlockPos(h, m + 1, k2)) && Blocks.red_flower.canPlaceBlockAt(world, new BlockPos(h, m + 1, k2))) {
					world.setBlockState(new BlockPos(h, m + 1, k2), Blocks.red_flower.getDefaultState());
				}
				break Label_27960;
			}
			case 13: {
				if (this.getDamage(itemstack) != 13) {
					break Label_27960;
				}
				final float f = 1.0f;
				final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
				final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
				final double d4 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
				final double d5 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
				final double d6 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
				final Vec3 vec3 = new Vec3(d4, d5, d6);
				final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
				final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
				final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
				final float f7 = MathHelper.sin(-f2 * 0.017453292f);
				final float f8 = f5 * f6;
				final float f9 = f4 * f6;
				final double d7 = 5.0;
				final Vec3 vec4 = vec3.addVector(f8 * d7, f7 * d7, f9 * d7);
				final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
				if (movingobjectposition == null) {
					return itemstack;
				}
				final Vec3 vec5 = entityplayer.getLook(f);
				boolean flag = false;
				final float f10 = 1.0f;
				final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d7, vec5.yCoord * d7, vec5.zCoord * d7).expand(f10, f10, f10));
				for (int i = 0; i < list2.size(); ++i) {
					final Entity entity = (Entity) list2.get(i);
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
					break Label_27960;
				}
				final int h = movingobjectposition.getBlockPos().getX();
				final int m = movingobjectposition.getBlockPos().getY();
				final int k2 = movingobjectposition.getBlockPos().getZ();
				if (world.getBlockState(new BlockPos(h, m, k2)).getBlock() == Blocks.iron_door) {

					BlockPos pos = new BlockPos(h, m, k2);
					IBlockState state = world.getBlockState(pos);
					BlockPos blockpos = state.getValue(BlockDoor.HALF) == BlockDoor.EnumDoorHalf.LOWER ? pos : pos.down();
					IBlockState iblockstate = pos.equals(blockpos) ? state : world.getBlockState(blockpos);
					state = iblockstate.cycleProperty(BlockDoor.OPEN);
					world.setBlockState(blockpos, state, 2);
					world.markBlockRangeForRenderUpdate(blockpos, pos);
					world.playAuxSFXAtEntity(entityplayer, state.getValue(BlockDoor.OPEN).booleanValue() ? 1003 : 1006, pos, 0);

					break Label_27960;
				}

				if (world.isAirBlock(new BlockPos(h, m + 1, k2)) && Blocks.redstone_torch.canPlaceBlockAt(world, new BlockPos(h, m + 1, k2))) {
					world.playSoundEffect(h + 0.5, m + 0.5, k2 + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					world.setBlockState(new BlockPos(h, m + 1, k2), Blocks.redstone_torch.getDefaultState());
				}
				break Label_27960;
			}
			case 14: {
				if (this.getDamage(itemstack) == 14) {
					final Vec3 look = entityplayer.getLookVec();
					entityplayer.setPosition(((Entity) entityplayer).posX + look.xCoord * 30.0, ((Entity) entityplayer).posY + look.yCoord * 30.0, ((Entity) entityplayer).posZ + look.zCoord * 30.0);
				}
			}
			default: {
				if (this.getDamage(itemstack) > 29 || this.getDamage(itemstack) < 15) {
					break Label_27960;
				}
				final ArrowNockEvent event = new ArrowNockEvent(entityplayer, itemstack);
				MinecraftForge.EVENT_BUS.post(event);
				if (event.isCanceled()) {
					return event.result;
				}
				entityplayer.setItemInUse(itemstack, this.getMaxItemUseDuration(itemstack));
				break Label_27960;
			}
			case 30: {
				if (this.getDamage(itemstack) != 30) {
					break Label_27960;
				}
				final float f = 1.0f;
				final float f2 = ((Entity) entityplayer).prevRotationPitch + (((Entity) entityplayer).rotationPitch - ((Entity) entityplayer).prevRotationPitch) * f;
				final float f3 = ((Entity) entityplayer).prevRotationYaw + (((Entity) entityplayer).rotationYaw - ((Entity) entityplayer).prevRotationYaw) * f;
				final double d4 = ((Entity) entityplayer).prevPosX + (((Entity) entityplayer).posX - ((Entity) entityplayer).prevPosX) * f;
				final double d5 = ((Entity) entityplayer).prevPosY + (((Entity) entityplayer).posY - ((Entity) entityplayer).prevPosY) * f + 1.62 - ((Entity) entityplayer).getYOffset();
				final double d6 = ((Entity) entityplayer).prevPosZ + (((Entity) entityplayer).posZ - ((Entity) entityplayer).prevPosZ) * f;
				final Vec3 vec3 = new Vec3(d4, d5, d6);
				final float f4 = MathHelper.cos(-f3 * 0.017453292f - 3.1415927f);
				final float f5 = MathHelper.sin(-f3 * 0.017453292f - 3.1415927f);
				final float f6 = -MathHelper.cos(-f2 * 0.017453292f);
				final float f7 = MathHelper.sin(-f2 * 0.017453292f);
				final float f8 = f5 * f6;
				final float f9 = f4 * f6;
				final double d7 = 5.0;
				final Vec3 vec4 = vec3.addVector(f8 * d7, f7 * d7, f9 * d7);
				final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3, vec4, true);
				if (movingobjectposition == null) {
					return itemstack;
				}
				final Vec3 vec5 = entityplayer.getLook(f);
				boolean flag = false;
				final float f10 = 1.0f;
				final List list2 = world.getEntitiesWithinAABBExcludingEntity(entityplayer, ((Entity) entityplayer).getEntityBoundingBox().addCoord(vec5.xCoord * d7, vec5.yCoord * d7, vec5.zCoord * d7).expand(f10, f10, f10));
				for (int i = 0; i < list2.size(); ++i) {
					final Entity entity = (Entity) list2.get(i);
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
					break Label_27960;
				}
				final int h = movingobjectposition.getBlockPos().getX();
				final int m = movingobjectposition.getBlockPos().getY();
				final int k2 = movingobjectposition.getBlockPos().getZ();
				if (world.isAirBlock(new BlockPos(h, m + 1, k2))) {
					world.setBlockState(new BlockPos(h, m + 1, k2), MainClass.DarkMark.getDefaultState());
				}
				break Label_27960;
			}
			case 31: {
				if (this.getDamage(itemstack) == 31 && !world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.setInvisible(true);
					((Entity) entityplayer).noClip = true;
					final EntityRatForm entitylevitate = new EntityRatForm(world);
					entitylevitate.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
					world.spawnEntityInWorld(entitylevitate);
					entityplayer.mountEntity(entitylevitate);
				}
			}
			case 32: {
				if (this.getDamage(itemstack) == 32 && !world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.setInvisible(true);
					((Entity) entityplayer).noClip = true;
					final EntityCatForm entitylevitate2 = new EntityCatForm(world);
					entitylevitate2.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
					world.spawnEntityInWorld(entitylevitate2);
					entityplayer.mountEntity(entitylevitate2);
				}
			}
			case 33: {
				if (this.getDamage(itemstack) == 33 && !world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.setInvisible(true);
					((Entity) entityplayer).noClip = true;
					final EntityDogForm entitylevitate3 = new EntityDogForm(world);
					entitylevitate3.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
					world.spawnEntityInWorld(entitylevitate3);
					entityplayer.mountEntity(entitylevitate3);
				}
			}
			case 34: {
				if (this.getDamage(itemstack) == 34 && !world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.setInvisible(true);
					((Entity) entityplayer).noClip = true;
					final EntityStagForm entitylevitate4 = new EntityStagForm(world);
					entitylevitate4.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
					world.spawnEntityInWorld(entitylevitate4);
					entityplayer.mountEntity(entitylevitate4);
				}
			}
			case 35: {
				if (this.getDamage(itemstack) == 35 && !world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.setInvisible(true);
					((Entity) entityplayer).noClip = true;
					final EntityRavenForm entitylevitate5 = new EntityRavenForm(world);
					entitylevitate5.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
					world.spawnEntityInWorld(entitylevitate5);
					entityplayer.mountEntity(entitylevitate5);
				}
			}
			case 36: {
				if (this.getDamage(itemstack) == 36 && !world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.setInvisible(true);
					((Entity) entityplayer).noClip = true;
					final EntityOwlForm entitylevitate6 = new EntityOwlForm(world);
					entitylevitate6.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
					world.spawnEntityInWorld(entitylevitate6);
					entityplayer.mountEntity(entitylevitate6);
				}
			}
			case 37: {
				if (this.getDamage(itemstack) == 37 && !world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.setInvisible(true);
					((Entity) entityplayer).noClip = true;
					final EntityFalconForm entitylevitate7 = new EntityFalconForm(world);
					entitylevitate7.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
					world.spawnEntityInWorld(entitylevitate7);
					entityplayer.mountEntity(entitylevitate7);
				}
			}
			case 38: {
				if (this.getDamage(itemstack) == 38 && !world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.setInvisible(true);
					((Entity) entityplayer).noClip = true;
					final EntityPhoenixForm entitylevitate8 = new EntityPhoenixForm(world);
					entitylevitate8.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
					world.spawnEntityInWorld(entitylevitate8);
					entityplayer.mountEntity(entitylevitate8);
				}
			}
			case 39: {
				if (this.getDamage(itemstack) == 39 && !world.isRemote) {
					world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
					entityplayer.setInvisible(true);
					((Entity) entityplayer).noClip = true;
					final EntitySnidgetForm entitylevitate9 = new EntitySnidgetForm(world);
					entitylevitate9.setPosition(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ);
					world.spawnEntityInWorld(entitylevitate9);
					entityplayer.mountEntity(entitylevitate9);
				}
			}
			case 40: {
				if (this.getDamage(itemstack) == 40 && !world.isRemote) {
					final List list1 = world.getEntitiesWithinAABB(EntityBoggartDementor.class, new AxisAlignedBB(((Entity) entityplayer).posX, ((Entity) entityplayer).posY, ((Entity) entityplayer).posZ, ((Entity) entityplayer).posX + 1.0, ((Entity) entityplayer).posY + 1.0, ((Entity) entityplayer).posZ + 1.0).expand(8.0, 8.0, 8.0));
					for (int j = 0; j < list1.size(); ++j) {
						final EntityBoggartDementor entityitem3 = (EntityBoggartDementor) list1.get(j);
						if (entityitem3 != null) {
							world.playSoundEffect(((Entity) entityplayer).posX + 0.5, ((Entity) entityplayer).posY + 0.5, ((Entity) entityplayer).posZ + 0.5, "harrypottermod:WandFlick", 1.0f, Item.itemRand.nextFloat() * 0.4f + 0.8f);
							entityitem3.setDead();
						}
					}
				}
			}
			case 41: {
				if (this.getDamage(itemstack) == 41) {
				}
				break;
			}
			}
		}
		return itemstack;
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
		if (this.getDamage(par1ItemStack) == 15 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final IncendioProjectile fireball2 = new IncendioProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball2.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball2.accelerationX = look.xCoord * 0.1;
			fireball2.accelerationY = look.yCoord * 0.1;
			fireball2.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball2);
		}
		if (this.getDamage(par1ItemStack) == 16 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final ReductoProjectile fireball3 = new ReductoProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball3.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball3.accelerationX = look.xCoord * 0.1;
			fireball3.accelerationY = look.yCoord * 0.1;
			fireball3.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball3);
		}
		if (this.getDamage(par1ItemStack) == 17 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final AraniaExumaiProjectile fireball4 = new AraniaExumaiProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball4.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball4.accelerationX = look.xCoord * 0.1;
			fireball4.accelerationY = look.yCoord * 0.1;
			fireball4.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball4);
		}
		if (this.getDamage(par1ItemStack) == 18 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final StunProjectile fireball5 = new StunProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball5.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball5.accelerationX = look.xCoord * 0.1;
			fireball5.accelerationY = look.yCoord * 0.1;
			fireball5.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball5);
		}
		if (this.getDamage(par1ItemStack) == 19 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final LevicorpusProjectile fireball6 = new LevicorpusProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball6.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball6.accelerationX = look.xCoord * 0.1;
			fireball6.accelerationY = look.yCoord * 0.1;
			fireball6.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball6);
		}
		if (this.getDamage(par1ItemStack) == 20 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final ConfringoProjectile fireball7 = new ConfringoProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball7.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball7.accelerationX = look.xCoord * 0.1;
			fireball7.accelerationY = look.yCoord * 0.1;
			fireball7.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball7);
		}
		if (this.getDamage(par1ItemStack) == 21 && !par2World.isRemote) {
			par2World.spawnEntityInWorld(entityarrow);
		}
		if (this.getDamage(par1ItemStack) == 22 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final SectumsempraProjectile fireball8 = new SectumsempraProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball8.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball8.accelerationX = look.xCoord * 0.1;
			fireball8.accelerationY = look.yCoord * 0.1;
			fireball8.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball8);
		}
		if (this.getDamage(par1ItemStack) == 23 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final StupefyProjectile fireball9 = new StupefyProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball9.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball9.accelerationX = look.xCoord * 0.1;
			fireball9.accelerationY = look.yCoord * 0.1;
			fireball9.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball9);
		}
		if (this.getDamage(par1ItemStack) == 24 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final ExpelliarmusProjectile fireball10 = new ExpelliarmusProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball10.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball10.accelerationX = look.xCoord * 0.1;
			fireball10.accelerationY = look.yCoord * 0.1;
			fireball10.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball10);
		}
		if (this.getDamage(par1ItemStack) == 25 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final PatronusProjectile fireball11 = new PatronusProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball11.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball11.accelerationX = look.xCoord * 0.1;
			fireball11.accelerationY = look.yCoord * 0.1;
			fireball11.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball11);
		}
		if (this.getDamage(par1ItemStack) == 26 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final ImperioProjectile fireball12 = new ImperioProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball12.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball12.accelerationX = look.xCoord * 0.1;
			fireball12.accelerationY = look.yCoord * 0.1;
			fireball12.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball12);
		}
		if (this.getDamage(par1ItemStack) == 27 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final CrucioProjectile fireball13 = new CrucioProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball13.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball13.accelerationX = look.xCoord * 0.1;
			fireball13.accelerationY = look.yCoord * 0.1;
			fireball13.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball13);
		}
		if (this.getDamage(par1ItemStack) == 28 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final AvadakedavraProjectile fireball14 = new AvadakedavraProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball14.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball14.accelerationX = look.xCoord * 0.1;
			fireball14.accelerationY = look.yCoord * 0.1;
			fireball14.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball14);
		}
		if (this.getDamage(par1ItemStack) == 29 && !par2World.isRemote) {
			final Vec3 look = par3EntityPlayer.getLookVec();
			final ConfundoProjectile fireball15 = new ConfundoProjectile(par2World, par3EntityPlayer, 1.0, 1.0, 1.0);
			fireball15.setPosition(((Entity) par3EntityPlayer).posX + look.xCoord * 2.0, ((Entity) par3EntityPlayer).posY + (look.yCoord + 0.7) * 2.0, ((Entity) par3EntityPlayer).posZ + look.zCoord * 2.0);
			fireball15.accelerationX = look.xCoord * 0.1;
			fireball15.accelerationY = look.yCoord * 0.1;
			fireball15.accelerationZ = look.zCoord * 0.1;
			par2World.spawnEntityInWorld(fireball15);
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

			if (this.getDamage(par1ItemStack) > 41 || this.getDamage(par1ItemStack) < 0)
				this.setDamage(par1ItemStack, 0);

			if (this.NextSpell) {
				if (this.getDamage(par1ItemStack) <= 40) {
					this.setDamage(par1ItemStack, this.getDamage(par1ItemStack) + 1);
				}
				this.NextSpell = false;
			}

			if (this.PrevSpell) {
				this.setDamage(par1ItemStack, this.getDamage(par1ItemStack) - 1);
				this.PrevSpell = false;
			}
		}

	}

}
