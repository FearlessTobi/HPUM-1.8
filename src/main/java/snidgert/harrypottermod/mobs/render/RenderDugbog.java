package snidgert.harrypottermod.mobs.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Dugbog;
import snidgert.harrypottermod.mobs.entity.EntityDugbog;

public class RenderDugbog extends RenderLiving {

	public static final ResourceLocation EntityTexture;
	public static final ResourceLocation EntityTexture2;
	public static final ResourceLocation EntityTexture3;
	public static final ResourceLocation EntityTexture4;
	public static final ResourceLocation EntityTexture5;
	public static final ResourceLocation EntityTexture6;
	protected Dugbog model;

	public RenderDugbog(RenderManager renderManager, final ModelBase p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Dugbog) this.mainModel;
	}

	public void renderDugbog(final EntityDugbog entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderDugbog((EntityDugbog) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderDugbog((EntityDugbog) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		final EntityDugbog thisentity = (EntityDugbog) entity;
		switch (thisentity.getTextureType()) {
		case 0: {
			return RenderDugbog.EntityTexture;
		}
		case 1: {
			return RenderDugbog.EntityTexture2;
		}
		case 2: {
			return RenderDugbog.EntityTexture3;
		}
		case 3: {
			return RenderDugbog.EntityTexture4;
		}
		case 4: {
			return RenderDugbog.EntityTexture5;
		}
		case 5: {
			return RenderDugbog.EntityTexture6;
		}
		default: {
			return RenderDugbog.EntityTexture;
		}
		}
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Dugbog1.png");
		EntityTexture2 = new ResourceLocation("harrypottermod:textures/mobs/Dugbog2.png");
		EntityTexture3 = new ResourceLocation("harrypottermod:textures/mobs/Dugbog3.png");
		EntityTexture4 = new ResourceLocation("harrypottermod:textures/mobs/Dugbog4.png");
		EntityTexture5 = new ResourceLocation("harrypottermod:textures/mobs/Dugbog5.png");
		EntityTexture6 = new ResourceLocation("harrypottermod:textures/mobs/Dugbog6.png");
	}
}
