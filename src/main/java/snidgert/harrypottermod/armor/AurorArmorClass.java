package snidgert.harrypottermod.armor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import snidgert.harrypottermod.ClientProxy;

public class AurorArmorClass extends ItemArmor {

	public AurorArmorClass(final ItemArmor.ArmorMaterial material, final int renderIndex, final int type) {
		super(material, renderIndex, type);
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", "harrypottermod", this.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
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
			armorModel.bipedHead.showModel = (armorSlot == 0);
			armorModel.bipedHeadwear.showModel = false;
			armorModel.bipedBody.showModel = (armorSlot == 1 || armorSlot == 2);
			armorModel.bipedRightArm.showModel = (armorSlot == 1);
			armorModel.bipedLeftArm.showModel = (armorSlot == 1);
			armorModel.bipedRightLeg.showModel = (armorSlot == 2 || armorSlot == 3);
			armorModel.bipedLeftLeg.showModel = (armorSlot == 2 || armorSlot == 3);
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
		return "harrypottermod:textures/models/armor/AurorArmor.png";
	}
}
