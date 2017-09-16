package snidgert.harrypottermod.mobs.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Clabbert;
import snidgert.harrypottermod.mobs.entity.EntityClabbert;

public class RenderClabbert extends RenderLiving {

	public static final ResourceLocation EntityTexture;
	public static final ResourceLocation EntityTexture2;
	protected Clabbert model;

	public RenderClabbert(RenderManager renderManager, final ModelBase p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Clabbert) this.mainModel;
	}

	public void renderClabbert(final EntityClabbert entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderClabbert((EntityClabbert) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderClabbert((EntityClabbert) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		final EntityClabbert thisentity = (EntityClabbert) entity;
		switch (thisentity.getTextureType()) {
		case 0: {
			return RenderClabbert.EntityTexture;
		}
		case 1: {
			return RenderClabbert.EntityTexture2;
		}
		default: {
			return RenderClabbert.EntityTexture;
		}
		}
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Clabbert.png");
		EntityTexture2 = new ResourceLocation("harrypottermod:textures/mobs/ClabbertWarning.png");
	}
}
