package snidgert.harrypottermod.mobs.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Quaffle;
import snidgert.harrypottermod.mobs.entity.EntityQuaffle;

public class RenderQuaffle extends RenderLiving {

	public static final ResourceLocation EntityTexture;
	protected Quaffle model;

	public RenderQuaffle(RenderManager renderManager, final ModelBase p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Quaffle) this.mainModel;
	}

	public void renderQuaffle(final EntityQuaffle entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderQuaffle((EntityQuaffle) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderQuaffle((EntityQuaffle) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderQuaffle.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Quaffle.png");
	}
}
