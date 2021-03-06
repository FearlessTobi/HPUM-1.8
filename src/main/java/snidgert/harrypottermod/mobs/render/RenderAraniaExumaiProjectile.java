package snidgert.harrypottermod.mobs.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import snidgert.harrypottermod.mobs.ModelMagicProjectile;
import snidgert.harrypottermod.projectiles.AraniaExumaiProjectile;

@SideOnly(Side.CLIENT)
public class RenderAraniaExumaiProjectile extends Render {

	private static final ResourceLocation texture;
	private ModelBase model;

	public RenderAraniaExumaiProjectile(final RenderManager renderManager) {
		super(renderManager);
		this.model = new ModelMagicProjectile();
	}

	@Override
	protected ResourceLocation getEntityTexture(final Entity entity) {
		return this.getCustomTexture((AraniaExumaiProjectile) entity);
	}

	private ResourceLocation getCustomTexture(final AraniaExumaiProjectile entity) {
		return RenderAraniaExumaiProjectile.texture;
	}

	@Override
	public void doRender(final Entity entity, final double x, final double y, final double z, final float yaw, final float partialTick) {
		GL11.glPushMatrix();
		this.bindTexture(RenderAraniaExumaiProjectile.texture);
		GL11.glTranslated(x, y, z);
		this.model.render(entity, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
		GL11.glPopMatrix();
	}

	static {
		texture = new ResourceLocation("harrypottermod:textures/mobs/AraniaExumai.png");
	}
}
