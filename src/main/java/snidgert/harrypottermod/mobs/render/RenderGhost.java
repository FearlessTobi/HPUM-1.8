package snidgert.harrypottermod.mobs.render;

import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Ghost;
import snidgert.harrypottermod.mobs.entity.EntityGhost;

public class RenderGhost extends RenderLiving {

	private static final Map field_110852_a;
	public static final ResourceLocation EntityTexture;
	public static final ResourceLocation EntityTexture2;
	public static final ResourceLocation EntityTexture3;
	protected Ghost model;
	private ModelBase scaleAmount;

	public RenderGhost(RenderManager renderManager, final ModelBase p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Ghost) this.mainModel;
		this.scaleAmount = p_i1262_1_;
	}

	public void renderGhost(final EntityGhost entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderGhost((EntityGhost) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderGhost((EntityGhost) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		final EntityGhost thisentity = (EntityGhost) entity;
		switch (thisentity.getTextureType()) {
		case 0: {
			return RenderGhost.EntityTexture;
		}
		case 1: {
			return RenderGhost.EntityTexture2;
		}
		case 2: {
			return RenderGhost.EntityTexture3;
		}
		default: {
			return RenderGhost.EntityTexture;
		}
		}
	}

	static {
		field_110852_a = Maps.newHashMap();
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Ghost.png");
		EntityTexture2 = new ResourceLocation("harrypottermod:textures/mobs/Ghost2.png");
		EntityTexture3 = new ResourceLocation("harrypottermod:textures/mobs/Ghost3.png");
	}
}
