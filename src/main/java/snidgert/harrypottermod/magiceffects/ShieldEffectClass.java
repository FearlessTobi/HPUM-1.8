package snidgert.harrypottermod.magiceffects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class ShieldEffectClass extends Potion {

	public ShieldEffectClass(final ResourceLocation par1, final boolean par2, final int par3) {
		super(par1, par2, par3);
	}

	@Override
	public boolean isReady(final int p_76397_1_, final int p_76397_2_) {
		return true;
	}

	public void performEffect(final EntityLivingBase entity) {
		Potion.potionTypes[super.id].performEffect(entity, super.id);
	}
}
