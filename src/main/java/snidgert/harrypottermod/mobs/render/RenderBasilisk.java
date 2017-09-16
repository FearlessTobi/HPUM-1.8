package snidgert.harrypottermod.mobs.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Basilisk;
import snidgert.harrypottermod.mobs.entity.EntityBasilisk;

public class RenderBasilisk extends RenderLiving {

	public static final ResourceLocation EntityTexture;
	protected Basilisk model;
	private float scale;

	public RenderBasilisk(RenderManager renderManager, final ModelBase p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Basilisk) this.mainModel;
		this.scale = 1.5f;
	}

	protected void preRenderCallback(final EntityBasilisk entitybasilisk, final float par2) {
		GL11.glScalef(this.scale, this.scale, this.scale);
	}

	@Override
	protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
		this.preRenderCallback((EntityBasilisk) par1EntityLivingBase, par2);
	}

	public void renderBasilisk(final EntityBasilisk entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderBasilisk((EntityBasilisk) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderBasilisk((EntityBasilisk) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderBasilisk.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Basilisk.png");
	}
}
