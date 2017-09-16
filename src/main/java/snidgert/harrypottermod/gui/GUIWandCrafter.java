package snidgert.harrypottermod.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import snidgert.harrypottermod.tileentities.TileEntityWandCrafter;

public class GUIWandCrafter extends GuiContainer {

	private static final ResourceLocation Texture;
	private TileEntityWandCrafter wandcrafter;

	public GUIWandCrafter(final InventoryPlayer player, final TileEntityWandCrafter tileentity) {
		super(new ContainerWandCrafter(player, tileentity));
		this.wandcrafter = tileentity;
		super.ySize = 176;
		super.xSize = 166;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		Minecraft.getMinecraft().getTextureManager().bindTexture(GUIWandCrafter.Texture);
		this.drawTexturedModalRect(super.guiLeft, super.guiTop, 0, 0, super.ySize, super.xSize);
		if (this.wandcrafter.hasPower()) {
			final int i2 = this.wandcrafter.getPowerRemainingScaled(53);
			this.drawTexturedModalRect(super.guiLeft + 143, super.guiTop + 5 + 52 - i2, 176, 82 - i2, 16, i2);
		}
		final int i2 = this.wandcrafter.getCrafterProgressScaled(14);
		this.drawTexturedModalRect(super.guiLeft + 51, super.guiTop + 21, 176, 0, i2, 30);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(final int i, final int j) {
		final String name = this.wandcrafter.hasCustomName() ? this.wandcrafter.getName() : I18n.format(this.wandcrafter.getName(), new Object[0]);
		this.fontRendererObj.drawString(name, super.ySize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, super.xSize - 96 + 5, 4210752);
	}

	static {
		Texture = new ResourceLocation("harrypottermod:textures/gui/wandcraftergui.png");
	}
}
