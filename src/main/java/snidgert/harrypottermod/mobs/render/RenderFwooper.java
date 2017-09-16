package snidgert.harrypottermod.mobs.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Fwooper;
import snidgert.harrypottermod.mobs.entity.EntityFwooper;

public class RenderFwooper extends RenderLiving {

	public static final ResourceLocation EntityTexture;
	public static final ResourceLocation EntityTexture2;
	public static final ResourceLocation EntityTexture3;
	public static final ResourceLocation EntityTexture4;
	public static final ResourceLocation EntityTexture5;
	public static final ResourceLocation EntityTexture6;
	public static final ResourceLocation EntityTexture7;
	protected Fwooper model;

	public RenderFwooper(RenderManager renderManager, final ModelBase p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Fwooper) this.mainModel;
	}

	public void renderFwooper(final EntityFwooper entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderFwooper((EntityFwooper) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderFwooper((EntityFwooper) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		final EntityFwooper thisentity = (EntityFwooper) entity;
		switch (thisentity.getTextureType()) {
		case 0: {
			return RenderFwooper.EntityTexture;
		}
		case 1: {
			return RenderFwooper.EntityTexture2;
		}
		case 2: {
			return RenderFwooper.EntityTexture3;
		}
		case 3: {
			return RenderFwooper.EntityTexture4;
		}
		case 4: {
			return RenderFwooper.EntityTexture5;
		}
		case 5: {
			return RenderFwooper.EntityTexture6;
		}
		case 6: {
			return RenderFwooper.EntityTexture7;
		}
		default: {
			return RenderFwooper.EntityTexture;
		}
		}
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Fwooper1.png");
		EntityTexture2 = new ResourceLocation("harrypottermod:textures/mobs/Fwooper2.png");
		EntityTexture3 = new ResourceLocation("harrypottermod:textures/mobs/Fwooper3.png");
		EntityTexture4 = new ResourceLocation("harrypottermod:textures/mobs/Fwooper4.png");
		EntityTexture5 = new ResourceLocation("harrypottermod:textures/mobs/Fwooper5.png");
		EntityTexture6 = new ResourceLocation("harrypottermod:textures/mobs/Fwooper6.png");
		EntityTexture7 = new ResourceLocation("harrypottermod:textures/mobs/Fwooper7.png");
	}
}
