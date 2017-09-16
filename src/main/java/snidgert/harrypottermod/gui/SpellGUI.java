package snidgert.harrypottermod.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import snidgert.harrypottermod.MainClass;
import snidgert.harrypottermod.wands.DPSWandClass;
import snidgert.harrypottermod.wands.SupportWandClass;
import snidgert.harrypottermod.wands.TankWandClass;
import snidgert.harrypottermod.wands.WoodWandClass;

public class SpellGUI extends Gui {

	private Minecraft mc;
	public static final ResourceLocation EntityTexture;
	public static final ResourceLocation EntityTexture2;
	public static final ResourceLocation EntityTexture3;
	public static final ResourceLocation EntityTexture4;
	public static final ResourceLocation EntityTexture5;
	public static final ResourceLocation EntityTexture6;
	public static final ResourceLocation EntityTexture7;
	public static final ResourceLocation EntityTexture8;
	public static final ResourceLocation EntityTexture9;
	public static final ResourceLocation EntityTexture10;
	public static final ResourceLocation EntityTexture11;
	public static final ResourceLocation EntityTexture12;
	public static final ResourceLocation EntityTexture13;
	public static final ResourceLocation EntityTexture14;
	public static final ResourceLocation EntityTexture15;
	public static final ResourceLocation EntityTexture16;
	public static final ResourceLocation EntityTexture17;
	public static final ResourceLocation EntityTexture18;
	public static final ResourceLocation EntityTexture19;
	public static final ResourceLocation EntityTexture20;
	public static final ResourceLocation EntityTexture21;
	public static final ResourceLocation EntityTexture22;
	public static final ResourceLocation EntityTexture23;
	public static final ResourceLocation EntityTexture24;
	public static final ResourceLocation EntityTexture25;
	public static final ResourceLocation EntityTexture26;
	public static final ResourceLocation EntityTexture27;
	public static final ResourceLocation EntityTexture28;
	public static final ResourceLocation EntityTexture29;
	public static final ResourceLocation EntityTexture30;
	public static final ResourceLocation EntityTexture31;
	public static final ResourceLocation EntityTexture32;
	public static final ResourceLocation EntityTexture33;
	public static final ResourceLocation EntityTexture34;
	public static final ResourceLocation EntityTexture35;
	public static final ResourceLocation EntityTexture36;
	public static final ResourceLocation EntityTexture37;
	public static final ResourceLocation EntityTexture38;
	public static final ResourceLocation EntityTexture39;
	public static final ResourceLocation EntityTexture40;
	public static final ResourceLocation EntityTexture41;
	public static final ResourceLocation EntityTexture42;
	public static final ResourceLocation accio;
	public static final ResourceLocation espiskey;
	public static final ResourceLocation avis;
	public static final ResourceLocation fiendfyre;
	public static final ResourceLocation fi;
	public static final ResourceLocation glacius;
	public static final ResourceLocation lumos;
	public static final ResourceLocation nox;
	public static final ResourceLocation protego;
	public static final ResourceLocation sep;
	public static final ResourceLocation augua;
	public static final ResourceLocation pt;
	public static final ResourceLocation orchideous;
	public static final ResourceLocation alohomora;
	public static final ResourceLocation apparition;
	public static final ResourceLocation incendio;
	public static final ResourceLocation reducto;
	public static final ResourceLocation ae;
	public static final ResourceLocation levi;
	public static final ResourceLocation confringo;
	public static final ResourceLocation arrow;
	public static final ResourceLocation sem;
	public static final ResourceLocation stupefy;
	public static final ResourceLocation dis;
	public static final ResourceLocation patronus;
	public static final ResourceLocation imperio;
	public static final ResourceLocation crucio;
	public static final ResourceLocation av;
	public static final ResourceLocation darkmark;
	public static final ResourceLocation rat;
	public static final ResourceLocation cat;
	public static final ResourceLocation dog;
	public static final ResourceLocation stag;
	public static final ResourceLocation raven;
	public static final ResourceLocation owl;
	public static final ResourceLocation falcon;
	public static final ResourceLocation phoenix;
	public static final ResourceLocation snidget;
	public static final ResourceLocation rwl;
	public static final ResourceLocation confundo;
	public static final ResourceLocation rid;
	private static final int BUFF_ICON_SIZE = 72;
	private static final int BUFF_ICON_SPACING = 74;
	private static final int BUFF_ICON_BASE_U_OFFSET = 0;
	private static final int BUFF_ICON_BASE_V_OFFSET = 0;
	private static final int BUFF_ICONS_PER_ROW = 99999;

	public SpellGUI(final Minecraft mc) {
		this.mc = mc;
	}

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onRenderExperienceBar(final RenderGameOverlayEvent event) {
		if (event.isCancelable() || event.type != RenderGameOverlayEvent.ElementType.EXPERIENCE) {
			return;
		}
		final int xPos = 2;
		final int yPos = 2;
		final ItemStack itemstack = Minecraft.getMinecraft().thePlayer.getHeldItem();
		if (itemstack != null && itemstack.getItem() instanceof DPSWandClass) {
			if (itemstack.getItem().getDamage(itemstack) == 1) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.accio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 2) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.rwl);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 3) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.glacius);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 4) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.lumos);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 5) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.augua);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 6) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.orchideous);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 7) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.alohomora);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 8) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.apparition);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 9) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.dog);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 10) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.raven);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 11) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.snidget);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 12) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.rid);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 13) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.incendio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 14) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.ae);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 15) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.confringo);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 16) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.arrow);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 17) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.sem);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 18) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.stupefy);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 19) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.dis);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 20) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.patronus);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 21) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.imperio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 22) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.crucio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 23) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.av);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 24) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.darkmark);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
		}
		if (itemstack != null && itemstack.getItem() instanceof TankWandClass) {
			if (itemstack.getItem().getDamage(itemstack) == 1) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.accio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 2) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.rwl);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 3) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.glacius);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 4) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.lumos);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 5) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.augua);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 6) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.orchideous);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 7) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.alohomora);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 8) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.apparition);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 9) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.espiskey);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 10) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.fiendfyre);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 11) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.protego);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 12) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.rid);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 13) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.rat);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 14) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.stag);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 15) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.falcon);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 16) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.incendio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 17) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.reducto);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 18) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.levi);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 19) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.dis);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 20) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.patronus);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 21) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.imperio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 22) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.crucio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 23) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.av);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 24) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.darkmark);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
		}
		if (itemstack != null && itemstack.getItem() instanceof SupportWandClass) {
			if (MainClass.SupportWandClass.getDamage(itemstack) == 1) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.accio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 2) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.rwl);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 3) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.glacius);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 4) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.lumos);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 5) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.augua);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 6) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.orchideous);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 7) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.alohomora);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 8) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.apparition);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 9) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.rid);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 10) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.avis);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 11) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.sep);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 12) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.fi);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 13) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.espiskey);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 14) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.cat);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 15) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.owl);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 16) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.phoenix);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 17) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.incendio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 18) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.confundo);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 19) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.pt);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 20) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.patronus);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 21) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.imperio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 22) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.crucio);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 23) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.av);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (MainClass.SupportWandClass.getDamage(itemstack) == 24) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.darkmark);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
		}
		if (itemstack != null && itemstack.getItem() instanceof WoodWandClass) {
			if (itemstack.getItem().getDamage(itemstack) == 1) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 2) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture2);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 3) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture3);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 4) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture4);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 5) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture5);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 6) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture6);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 7) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture7);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 8) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture8);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 9) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture9);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 10) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture10);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 11) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture11);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 12) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture13);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 13) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture14);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 14) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture15);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 15) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture16);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 16) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture17);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 17) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture18);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 18) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture12);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 19) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture19);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 20) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture20);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 21) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture21);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 22) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture22);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 23) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture23);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 24) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture24);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 25) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture25);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 26) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture26);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 27) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture27);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 28) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture28);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 29) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture41);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 30) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture29);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 31) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture30);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 32) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture31);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 33) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture32);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 34) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture33);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 35) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture34);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 36) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture35);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 37) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture36);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 38) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture37);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 39) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture38);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 40) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture42);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
			if (itemstack.getItem().getDamage(itemstack) == 41) {
				GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
				GL11.glDisable(2896);
				this.mc.renderEngine.bindTexture(SpellGUI.EntityTexture40);
				this.drawTexturedModalRect(xPos, yPos, 0, 0, 72, 72);
			}
		}
	}

	static {
		EntityTexture = new ResourceLocation("harrypottermod:textures/gui/acciogui.png");
		EntityTexture2 = new ResourceLocation("harrypottermod:textures/gui/episkeygui.png");
		EntityTexture3 = new ResourceLocation("harrypottermod:textures/gui/avisgui.png");
		EntityTexture4 = new ResourceLocation("harrypottermod:textures/gui/fiendfyregui.png");
		EntityTexture5 = new ResourceLocation("harrypottermod:textures/gui/figui.png");
		EntityTexture6 = new ResourceLocation("harrypottermod:textures/gui/glaciusgui.png");
		EntityTexture7 = new ResourceLocation("harrypottermod:textures/gui/lumosgui.png");
		EntityTexture8 = new ResourceLocation("harrypottermod:textures/gui/noxgui.png");
		EntityTexture9 = new ResourceLocation("harrypottermod:textures/gui/protegogui.png");
		EntityTexture10 = new ResourceLocation("harrypottermod:textures/gui/sepgui.png");
		EntityTexture11 = new ResourceLocation("harrypottermod:textures/gui/auguagui.png");
		EntityTexture12 = new ResourceLocation("harrypottermod:textures/gui/ptgui.png");
		EntityTexture13 = new ResourceLocation("harrypottermod:textures/gui/orchideousgui.png");
		EntityTexture14 = new ResourceLocation("harrypottermod:textures/gui/alohomoragui.png");
		EntityTexture15 = new ResourceLocation("harrypottermod:textures/gui/apparitiongui.png");
		EntityTexture16 = new ResourceLocation("harrypottermod:textures/gui/incendiogui.png");
		EntityTexture17 = new ResourceLocation("harrypottermod:textures/gui/reductogui.png");
		EntityTexture18 = new ResourceLocation("harrypottermod:textures/gui/aegui.png");
		EntityTexture19 = new ResourceLocation("harrypottermod:textures/gui/levigui.png");
		EntityTexture20 = new ResourceLocation("harrypottermod:textures/gui/confringogui.png");
		EntityTexture21 = new ResourceLocation("harrypottermod:textures/gui/arrowgui.png");
		EntityTexture22 = new ResourceLocation("harrypottermod:textures/gui/semgui.png");
		EntityTexture23 = new ResourceLocation("harrypottermod:textures/gui/stupefygui.png");
		EntityTexture24 = new ResourceLocation("harrypottermod:textures/gui/disgui.png");
		EntityTexture25 = new ResourceLocation("harrypottermod:textures/gui/patronusgui.png");
		EntityTexture26 = new ResourceLocation("harrypottermod:textures/gui/imperiogui.png");
		EntityTexture27 = new ResourceLocation("harrypottermod:textures/gui/cruciogui.png");
		EntityTexture28 = new ResourceLocation("harrypottermod:textures/gui/avgui.png");
		EntityTexture29 = new ResourceLocation("harrypottermod:textures/gui/darkmarkgui.png");
		EntityTexture30 = new ResourceLocation("harrypottermod:textures/gui/ratgui.png");
		EntityTexture31 = new ResourceLocation("harrypottermod:textures/gui/catgui.png");
		EntityTexture32 = new ResourceLocation("harrypottermod:textures/gui/doggui.png");
		EntityTexture33 = new ResourceLocation("harrypottermod:textures/gui/staggui.png");
		EntityTexture34 = new ResourceLocation("harrypottermod:textures/gui/ravengui.png");
		EntityTexture35 = new ResourceLocation("harrypottermod:textures/gui/owlgui.png");
		EntityTexture36 = new ResourceLocation("harrypottermod:textures/gui/falcongui.png");
		EntityTexture37 = new ResourceLocation("harrypottermod:textures/gui/phoenixgui.png");
		EntityTexture38 = new ResourceLocation("harrypottermod:textures/gui/snidgetgui.png");
		EntityTexture39 = new ResourceLocation("harrypottermod:textures/gui/reversalgui.png");
		EntityTexture40 = new ResourceLocation("harrypottermod:textures/gui/rwlgui.png");
		EntityTexture41 = new ResourceLocation("harrypottermod:textures/gui/confundogui.png");
		EntityTexture42 = new ResourceLocation("harrypottermod:textures/gui/ridgui.png");
		accio = new ResourceLocation("harrypottermod:textures/gui/acciogui.png");
		espiskey = new ResourceLocation("harrypottermod:textures/gui/episkeygui.png");
		avis = new ResourceLocation("harrypottermod:textures/gui/avisgui.png");
		fiendfyre = new ResourceLocation("harrypottermod:textures/gui/fiendfyregui.png");
		fi = new ResourceLocation("harrypottermod:textures/gui/figui.png");
		glacius = new ResourceLocation("harrypottermod:textures/gui/glaciusgui.png");
		lumos = new ResourceLocation("harrypottermod:textures/gui/lumosgui.png");
		nox = new ResourceLocation("harrypottermod:textures/gui/noxgui.png");
		protego = new ResourceLocation("harrypottermod:textures/gui/protegogui.png");
		sep = new ResourceLocation("harrypottermod:textures/gui/sepgui.png");
		augua = new ResourceLocation("harrypottermod:textures/gui/auguagui.png");
		pt = new ResourceLocation("harrypottermod:textures/gui/ptgui.png");
		orchideous = new ResourceLocation("harrypottermod:textures/gui/orchideousgui.png");
		alohomora = new ResourceLocation("harrypottermod:textures/gui/alohomoragui.png");
		apparition = new ResourceLocation("harrypottermod:textures/gui/apparitiongui.png");
		incendio = new ResourceLocation("harrypottermod:textures/gui/incendiogui.png");
		reducto = new ResourceLocation("harrypottermod:textures/gui/reductogui.png");
		ae = new ResourceLocation("harrypottermod:textures/gui/aegui.png");
		levi = new ResourceLocation("harrypottermod:textures/gui/levigui.png");
		confringo = new ResourceLocation("harrypottermod:textures/gui/confringogui.png");
		arrow = new ResourceLocation("harrypottermod:textures/gui/arrowgui.png");
		sem = new ResourceLocation("harrypottermod:textures/gui/semgui.png");
		stupefy = new ResourceLocation("harrypottermod:textures/gui/stupefygui.png");
		dis = new ResourceLocation("harrypottermod:textures/gui/disgui.png");
		patronus = new ResourceLocation("harrypottermod:textures/gui/patronusgui.png");
		imperio = new ResourceLocation("harrypottermod:textures/gui/imperiogui.png");
		crucio = new ResourceLocation("harrypottermod:textures/gui/cruciogui.png");
		av = new ResourceLocation("harrypottermod:textures/gui/avgui.png");
		darkmark = new ResourceLocation("harrypottermod:textures/gui/darkmarkgui.png");
		rat = new ResourceLocation("harrypottermod:textures/gui/ratgui.png");
		cat = new ResourceLocation("harrypottermod:textures/gui/catgui.png");
		dog = new ResourceLocation("harrypottermod:textures/gui/doggui.png");
		stag = new ResourceLocation("harrypottermod:textures/gui/staggui.png");
		raven = new ResourceLocation("harrypottermod:textures/gui/ravengui.png");
		owl = new ResourceLocation("harrypottermod:textures/gui/owlgui.png");
		falcon = new ResourceLocation("harrypottermod:textures/gui/falcongui.png");
		phoenix = new ResourceLocation("harrypottermod:textures/gui/phoenixgui.png");
		snidget = new ResourceLocation("harrypottermod:textures/gui/snidgetgui.png");
		rwl = new ResourceLocation("harrypottermod:textures/gui/rwlgui.png");
		confundo = new ResourceLocation("harrypottermod:textures/gui/confundogui.png");
		rid = new ResourceLocation("harrypottermod:textures/gui/ridgui.png");
	}
}
