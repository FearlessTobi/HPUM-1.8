package snidgert.harrypottermod.armor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import snidgert.harrypottermod.ClientProxy;

public class WerewolfArmorClass extends ItemArmor {

	public WerewolfArmorClass(final ItemArmor.ArmorMaterial material, final int renderIndex, final int type) {
		super(material, renderIndex, type);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", "harrypottermod", this.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
		player.setInvisible(true);
		player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 5, 10));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5, 10));
	}

	@Override
	public String getUnlocalizedName(final ItemStack itemstack) {
		return String.format("item.%s%s", "harrypottermod", this.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(final String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(46) + 1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(final EntityLivingBase entityLiving, final ItemStack itemstack, final int armorSlot) {
		final ModelBiped armorModel = ClientProxy.armorModel.get(this);
		if (armorModel != null) {
			armorModel.isSneak = entityLiving.isSneaking();
			((ModelBase) armorModel).isRiding = entityLiving.isRiding();
			((ModelBase) armorModel).isChild = entityLiving.isChild();
			armorModel.heldItemRight = 0;
			armorModel.aimedBow = false;
			final EntityPlayer player = (EntityPlayer) entityLiving;
			final ItemStack held_item = player.getEquipmentInSlot(0);
			if (held_item != null) {
				armorModel.heldItemRight = 1;
				if (player.getItemInUseCount() > 0) {
					final EnumAction enumaction = held_item.getItemUseAction();
					if (enumaction == EnumAction.BOW) {
						armorModel.aimedBow = true;
					} else if (enumaction == EnumAction.BLOCK) {
						armorModel.heldItemRight = 3;
					}
				}
			}
		}
		return armorModel;
	}

	@Override
	public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String layer) {
		return "harrypottermod:textures/models/armor/WerewolfArmor.png";
	}
}
