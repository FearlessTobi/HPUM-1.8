package snidgert.harrypottermod.mobs.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Horntail;
import snidgert.harrypottermod.mobs.entity.EntityHorntail;

public class RenderHorntail extends RenderLiving {

	public static final ResourceLocation EntityTexture;
	protected Horntail model;
	private float scale;

	public RenderHorntail(RenderManager renderManager, final ModelBase p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Horntail) this.mainModel;
		this.scale = 2.0f;
	}

	protected void preRenderCallback(final EntityHorntail entityhorntail, final float par2) {
		GL11.glScalef(this.scale, this.scale, this.scale);
	}

	@Override
	protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
		this.preRenderCallback((EntityHorntail) par1EntityLivingBase, par2);
	}

	public void renderHorntail(final EntityHorntail entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderHorntail((EntityHorntail) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderHorntail((EntityHorntail) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderHorntail.EntityTexture;
	}

	protected float handleRotationFloat(final EntityHorntail par1EntityChicken, final float par2) {
		final float f1 = par1EntityChicken.field_70888_h + (par1EntityChicken.field_70886_e - par1EntityChicken.field_70888_h) * par2;
		final float f2 = par1EntityChicken.field_70884_g + (par1EntityChicken.destPos - par1EntityChicken.field_70884_g) * par2;
		return (MathHelper.sin(f1) + 1.0f) * f2;
	}

	@Override
	protected float handleRotationFloat(final EntityLivingBase par1EntityLivingBase, final float par2) {
		return this.handleRotationFloat((EntityHorntail) par1EntityLivingBase, par2);
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Horntail.png");
	}
}
