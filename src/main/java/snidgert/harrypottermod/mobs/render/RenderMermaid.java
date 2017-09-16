package snidgert.harrypottermod.mobs.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.mobs.Mermaid;
import snidgert.harrypottermod.mobs.entity.EntityMermaid;
import snidgert.harrypottermod.mobs.render.layerhelditem.LayerHeldItemMermaid;

public class RenderMermaid extends RenderLiving {

	public static final ResourceLocation EntityTexture;
	public static final ResourceLocation EntityTexture2;
	public Mermaid model;

	public RenderMermaid(RenderManager renderManager, final ModelBiped p_i1262_1_, final float p_i1262_2_) {
		super(renderManager, p_i1262_1_, p_i1262_2_);
		this.model = (Mermaid) this.mainModel;
		this.addLayer(new LayerHeldItemMermaid(this));
	}

	protected int shouldRenderPass(final EntityLiving p_77032_1_, final int p_77032_2_, final float p_77032_3_) {
		final ItemStack itemstack = p_77032_1_.getEquipmentInSlot(4 - p_77032_2_);
		if (itemstack != null) {
			final Item item = itemstack.getItem();
			if (item instanceof ItemArmor) {
				final ItemArmor itemarmor = (ItemArmor) item;
				final int j = itemarmor.getColor(itemstack);
				if (j != -1) {
					final float f1 = (j >> 16 & 0xFF) / 255.0f;
					final float f2 = (j >> 8 & 0xFF) / 255.0f;
					final float f3 = (j & 0xFF) / 255.0f;
					GL11.glColor3f(f1, f2, f3);
					if (itemstack.isItemEnchanted()) {
						return 31;
					}
					return 16;
				} else {
					GL11.glColor3f(1.0f, 1.0f, 1.0f);
					if (itemstack.isItemEnchanted()) {
						return 15;
					}
					return 1;
				}
			}
		}
		return -1;
	}

	protected void func_82422_c() {
		GL11.glTranslatef(0.0f, 0.1875f, 0.0f);
	}

	public void renderMermaid(final EntityMermaid entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	public void doRenderLiving(final EntityLiving par1EntityLiving, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderMermaid((EntityMermaid) par1EntityLiving, par2, par4, par6, par8, par9);
	}

	@Override
	public void doRender(final EntityLiving par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
		this.renderMermaid((EntityMermaid) par1Entity, par2, par4, par6, par8, par9);
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		final EntityMermaid thisentity = (EntityMermaid) entity;
		switch (thisentity.getTextureType()) {
		case 0: {
			return RenderMermaid.EntityTexture;
		}
		case 1: {
			return RenderMermaid.EntityTexture2;
		}
		default: {
			return RenderMermaid.EntityTexture;
		}
		}
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/mobs/Merpeople1.png");
		EntityTexture2 = new ResourceLocation("harrypottermod:textures/mobs/Merpeople2.png");
	}
}
