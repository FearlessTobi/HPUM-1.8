package snidgert.harrypottermod.mobs.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Snake;
import snidgert.harrypottermod.mobs.entity.EntitySnake;

public class RenderSnake extends RenderLiving {

	public static final ResourceLocation EntityTexture;
	public static final ResourceLocation EntityTexture2;
	public static final ResourceLocation EntityTexture3;
	public static final ResourceLocation EntityTexture4;
	public static final ResourceLocation EntityTexture5;
	protected Snake model;

	public RenderSnake(RenderManager renderManager, final ModelBase p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Snake) this.mainModel;
	}

	public void renderSnake(final EntitySnake entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderSnake((EntitySnake) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderSnake((EntitySnake) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		final EntitySnake thisentity = (EntitySnake) entity;
		switch (thisentity.getTextureType()) {
		case 0: {
			return RenderSnake.EntityTexture;
		}
		case 1: {
			return RenderSnake.EntityTexture2;
		}
		case 2: {
			return RenderSnake.EntityTexture3;
		}
		case 3: {
			return RenderSnake.EntityTexture4;
		}
		case 4: {
			return RenderSnake.EntityTexture5;
		}
		default: {
			return RenderSnake.EntityTexture;
		}
		}
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Snake2.png");
		EntityTexture2 = new ResourceLocation("harrypottermod:textures/mobs/Snake3.png");
		EntityTexture3 = new ResourceLocation("harrypottermod:textures/mobs/Snake4.png");
		EntityTexture4 = new ResourceLocation("harrypottermod:textures/mobs/Snake5.png");
		EntityTexture5 = new ResourceLocation("harrypottermod:textures/mobs/Snake6.png");
	}
}
