package snidgert.harrypottermod.mobs.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Occamy;
import snidgert.harrypottermod.mobs.entity.EntityOccamy;

public class RenderOccamy extends RenderLiving {

	public static final ResourceLocation EntityTexture;
	protected Occamy model;

	public RenderOccamy(RenderManager renderManager, final ModelBase p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Occamy) this.mainModel;
	}

	public void renderOccamy(final EntityOccamy entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderOccamy((EntityOccamy) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderOccamy((EntityOccamy) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		return RenderOccamy.EntityTexture;
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Occamy1.png");
	}
}
