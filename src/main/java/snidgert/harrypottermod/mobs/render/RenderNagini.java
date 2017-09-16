package snidgert.harrypottermod.mobs.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Nagini;
import snidgert.harrypottermod.mobs.entity.EntityNagini;

public class RenderNagini extends RenderLiving {

	public static final ResourceLocation EntityTexture;
	protected Nagini model;
	private float scale;

	public RenderNagini(RenderManager renderManager, final ModelBase par2, final float par3) {
		super(renderManager, par2, par3);
		this.model = (Nagini) this.mainModel;
		this.scale = 1.5f;
	}

	public void renderNagini(final EntityNagini entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	protected void preRenderCallback(final EntityNagini entityaragog, final float par2) {
		GL11.glScalef(this.scale, this.scale, this.scale);
	}

	@Override
	protected void preRenderCallback(final EntityLivingBase par1EntityLivingBase, final float par2) {
		this.preRenderCallback((EntityNagini) par1EntityLivingBase, par2);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderNagini((EntityNagini) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderNagini((EntityNagini) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderNagini.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Nagini.png");
	}
}
