package snidgert.harrypottermod.particles;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityDarkGreenSpellFX extends EntityFX {

	private int baseTextureIndex;
	private boolean field_92054_ax;
	private boolean field_92048_ay;
	private float fadeColourRed;
	private float fadeColourGreen;
	private float fadeColourBlue;
	private boolean hasFadeColour;
	private static final String __OBFID = "CL_00000905";

	public EntityDarkGreenSpellFX(final World par1World, final double par2, final double par4, final double par6, final double par8, final double par10, final double par12) {
		super(par1World, par2, par4, par6);
		this.baseTextureIndex = 160;
		this.motionX = par8;
		this.motionY = par10;
		this.motionZ = par12;
		super.particleScale *= 0.75f;
		super.particleMaxAge = 48 + this.rand.nextInt(12);
		this.noClip = false;
		super.particleRed = 0.34901962f;
		super.particleGreen = 0.80784315f;
		super.particleBlue = 0.5372549f;
	}

	public void setTrail(final boolean par1) {
		this.field_92054_ax = par1;
	}

	public void setTwinkle(final boolean par1) {
		this.field_92048_ay = par1;
	}

	public void setColour(final int par1) {
		final float f = ((par1 & 0xFF0000) >> 16) / 255.0f;
		final float f2 = ((par1 & 0xFF00) >> 8) / 255.0f;
		final float f3 = ((par1 & 0xFF) >> 0) / 255.0f;
		final float f4 = 1.0f;
		this.setRBGColorF(f * f4, f2 * f4, f3 * f4);
	}

	public void setFadeColour(final int par1) {
		this.fadeColourRed = 255.0f;
		this.fadeColourGreen = 0.0f;
		this.fadeColourBlue = 0.0f;
		this.hasFadeColour = true;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox() {
		return null;
	}

	@Override
	public boolean canBePushed() {
		return false;
	}

	@Override
	public void renderParticle(final WorldRenderer par1WorldRenderer, final Entity parEntity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		if (!this.field_92048_ay || super.particleAge < super.particleMaxAge / 3 || (super.particleAge + super.particleMaxAge) / 3 % 2 == 0) {
			super.renderParticle(par1WorldRenderer, parEntity, par2, par3, par4, par5, par6, par7);
		}
	}

	@Override
	public void onUpdate() {
		this.prevPosX = this.posX;
		this.prevPosY = this.posY;
		this.prevPosZ = this.posZ;
		if (super.particleAge++ >= super.particleMaxAge) {
			this.setDead();
		}
		if (super.particleAge > super.particleMaxAge / 2) {
			this.setAlphaF(1.0f - (super.particleAge - super.particleMaxAge / 2) / super.particleMaxAge);
			if (this.hasFadeColour) {
				super.particleRed += (this.fadeColourRed - super.particleRed) * 0.2f;
				super.particleGreen += (this.fadeColourGreen - super.particleGreen) * 0.2f;
				super.particleBlue += (this.fadeColourBlue - super.particleBlue) * 0.2f;
			}
		}
		this.setParticleTextureIndex(this.baseTextureIndex + (7 - super.particleAge * 8 / super.particleMaxAge));
		if (this.onGround) {
			this.motionX *= 0.699999988079071;
			this.motionZ *= 0.699999988079071;
		}
		if (this.field_92054_ax && super.particleAge < super.particleMaxAge / 2 && (super.particleAge + super.particleMaxAge) % 2 == 0) {
			final EntityDarkGreenSpellFX entityfireworksparkfx = new EntityDarkGreenSpellFX(this.worldObj, this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
			entityfireworksparkfx.setRBGColorF(super.particleRed, super.particleGreen, super.particleBlue);
			entityfireworksparkfx.particleAge = entityfireworksparkfx.particleMaxAge / 2;
			if (this.hasFadeColour) {
				entityfireworksparkfx.hasFadeColour = true;
				entityfireworksparkfx.fadeColourRed = this.fadeColourRed;
				entityfireworksparkfx.fadeColourGreen = this.fadeColourGreen;
				entityfireworksparkfx.fadeColourBlue = this.fadeColourBlue;
			}
			entityfireworksparkfx.field_92048_ay = this.field_92048_ay;
			Minecraft.getMinecraft().effectRenderer.addEffect(entityfireworksparkfx);
		}
	}

	@Override
	public int getBrightnessForRender(final float par1) {
		return 15728880;
	}

	@Override
	public float getBrightness(final float par1) {
		return 1.0f;
	}
}
