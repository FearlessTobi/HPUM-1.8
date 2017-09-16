package snidgert.harrypottermod.mobs.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Bird;
import snidgert.harrypottermod.mobs.entity.EntityBird;

public class RenderBird extends RenderLiving {

	public static final ResourceLocation EntityTexture1;
	public static final ResourceLocation EntityTexture2;
	public static final ResourceLocation EntityTexture3;
	public static final ResourceLocation EntityTexture4;
	public static final ResourceLocation EntityTexture5;
	public static final ResourceLocation EntityTexture6;
	public static final ResourceLocation EntityTexture7;
	public static final ResourceLocation EntityTexture8;
	protected Bird model;

	public RenderBird(RenderManager renderManager, final ModelBase p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Bird) this.mainModel;
	}

	public void renderBird(final EntityBird entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderBird((EntityBird) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderBird((EntityBird) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		final EntityBird thisentity = (EntityBird) entity;
		switch (thisentity.getTextureType()) {
		case 0: {
			return RenderBird.EntityTexture1;
		}
		case 1: {
			return RenderBird.EntityTexture2;
		}
		case 2: {
			return RenderBird.EntityTexture3;
		}
		case 3: {
			return RenderBird.EntityTexture4;
		}
		case 4: {
			return RenderBird.EntityTexture5;
		}
		case 5: {
			return RenderBird.EntityTexture6;
		}
		case 6: {
			return RenderBird.EntityTexture7;
		}
		case 7: {
			return RenderBird.EntityTexture8;
		}
		default: {
			return RenderBird.EntityTexture1;
		}
		}
	}

	static {
		EntityTexture1 = new ResourceLocation("harrypottermod:textures/mobs/bird1.png");
		EntityTexture2 = new ResourceLocation("harrypottermod:textures/mobs/bird2.png");
		EntityTexture3 = new ResourceLocation("harrypottermod:textures/mobs/bird3.png");
		EntityTexture4 = new ResourceLocation("harrypottermod:textures/mobs/bird4.png");
		EntityTexture5 = new ResourceLocation("harrypottermod:textures/mobs/bird5.png");
		EntityTexture6 = new ResourceLocation("harrypottermod:textures/mobs/bird6.png");
		EntityTexture7 = new ResourceLocation("harrypottermod:textures/mobs/bird7.png");
		EntityTexture8 = new ResourceLocation("harrypottermod:textures/mobs/bird8.png");
	}
}
