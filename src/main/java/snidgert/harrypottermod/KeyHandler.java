package snidgert.harrypottermod;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

public class KeyHandler {

	Minecraft mc;
	public static final String Z = "PrevWand";
	public static final String X = "NextWand";
	public static KeyBinding prevwand;
	public static KeyBinding nextwand;

	public static final String R = "FlyUp";
	public static final String C = "FlyDown";
	public static final String F = "Special";
	public static final String NUMPAD0 = "QuickSpell0";
	public static final String NUMPAD1 = "QuickSpell1";
	public static final String NUMPAD2 = "QuickSpell2";
	public static final String NUMPAD3 = "QuickSpell3";
	public static final String NUMPAD4 = "QuickSpell4";
	public static final String NUMPAD5 = "QuickSpell5";
	public static final String NUMPAD6 = "QuickSpell6";
	public static final String NUMPAD7 = "QuickSpell7";
	public static final String NUMPAD8 = "QuickSpell8";
	public static final String NUMPAD9 = "QuickSpell9";
	public static final String categorie = "key.categories.movement";
	public static KeyBinding flyup;
	public static KeyBinding flydown;
	public static KeyBinding special;
	public static KeyBinding quickspell0;
	public static KeyBinding quickspell1;
	public static KeyBinding quickspell2;
	public static KeyBinding quickspell3;
	public static KeyBinding quickspell4;
	public static KeyBinding quickspell5;
	public static KeyBinding quickspell6;
	public static KeyBinding quickspell7;
	public static KeyBinding quickspell8;
	public static KeyBinding quickspell9;

	public KeyHandler(final int Key_R, final int Key_C, final int Key_F, final int Key_Z, final int Key_X, final int Key_NUMPAD0, final int Key_NUMPAD1, final int Key_NUMPAD2, final int Key_NUMPAD3, final int Key_NUMPAD4, final int Key_NUMPAD5, final int Key_NUMPAD6, final int Key_NUMPAD7, final int Key_NUMPAD8, final int Key_NUMPAD9) {

		this.mc = Minecraft.getMinecraft();

		prevwand = new KeyBinding("Previous Spell", Key_Z, "key.categories.harrypottermod");
		nextwand = new KeyBinding("Next Spell", Key_X, "key.categories.harrypottermod");
		ClientRegistry.registerKeyBinding(prevwand);
		ClientRegistry.registerKeyBinding(nextwand);

		flyup = new KeyBinding("Fly Up", Key_R, "key.categories.harrypottermod");
		flydown = new KeyBinding("Fly Down", Key_C, "key.categories.harrypottermod");
		special = new KeyBinding("Special", Key_F, "key.categories.harrypottermod");
		quickspell0 = new KeyBinding("Quick Spell 0", Key_NUMPAD0, "key.categories.harrypottermod");
		quickspell1 = new KeyBinding("Quick Spell 1", Key_NUMPAD1, "key.categories.harrypottermod");
		quickspell2 = new KeyBinding("Quick Spell 2", Key_NUMPAD2, "key.categories.harrypottermod");
		quickspell3 = new KeyBinding("Quick Spell 3", Key_NUMPAD3, "key.categories.harrypottermod");
		quickspell4 = new KeyBinding("Quick Spell 4", Key_NUMPAD4, "key.categories.harrypottermod");
		quickspell5 = new KeyBinding("Quick Spell 5", Key_NUMPAD5, "key.categories.harrypottermod");
		quickspell6 = new KeyBinding("Quick Spell 6", Key_NUMPAD6, "key.categories.harrypottermod");
		quickspell7 = new KeyBinding("Quick Spell 7", Key_NUMPAD7, "key.categories.harrypottermod");
		quickspell8 = new KeyBinding("Quick Spell 8", Key_NUMPAD8, "key.categories.harrypottermod");
		quickspell9 = new KeyBinding("Quick Spell 9", Key_NUMPAD9, "key.categories.harrypottermod");
		ClientRegistry.registerKeyBinding(flyup);
		ClientRegistry.registerKeyBinding(flydown);
		ClientRegistry.registerKeyBinding(special);
		ClientRegistry.registerKeyBinding(quickspell0);
		ClientRegistry.registerKeyBinding(quickspell1);
		ClientRegistry.registerKeyBinding(quickspell2);
		ClientRegistry.registerKeyBinding(quickspell3);
		ClientRegistry.registerKeyBinding(quickspell4);
		ClientRegistry.registerKeyBinding(quickspell5);
		ClientRegistry.registerKeyBinding(quickspell6);
		ClientRegistry.registerKeyBinding(quickspell7);
		ClientRegistry.registerKeyBinding(quickspell8);
		ClientRegistry.registerKeyBinding(quickspell9);
	}

	@SubscribeEvent
	public void onKeyInput(final KeyInputEvent event) {
		final boolean next = nextwand.isPressed();
		final boolean prev = prevwand.isPressed();
		final EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		if (this.mc != null && this.mc.thePlayer != null) {
			final Entity mount = ((Entity) this.mc.thePlayer).ridingEntity;
			if (next && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(6, Side.SERVER));
			} else if (prev && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(7, Side.SERVER));
			}
		}
	}

	@SubscribeEvent
	public void onTick(final TickEvent.ClientTickEvent evt) {
		final boolean fly = Keyboard.isKeyDown(flyup.getKeyCode());
		final boolean land = Keyboard.isKeyDown(flydown.getKeyCode());
		final boolean specials = Keyboard.isKeyDown(special.getKeyCode());
		final boolean jump = Keyboard.isKeyDown(flyup.getKeyCode());
		final boolean quick0 = Keyboard.isKeyDown(quickspell0.getKeyCode());
		final boolean quick2 = Keyboard.isKeyDown(quickspell1.getKeyCode());
		final boolean quick3 = Keyboard.isKeyDown(quickspell2.getKeyCode());
		final boolean quick4 = Keyboard.isKeyDown(quickspell3.getKeyCode());
		final boolean quick5 = Keyboard.isKeyDown(quickspell4.getKeyCode());
		final boolean quick6 = Keyboard.isKeyDown(quickspell5.getKeyCode());
		final boolean quick7 = Keyboard.isKeyDown(quickspell6.getKeyCode());
		final boolean quick8 = Keyboard.isKeyDown(quickspell7.getKeyCode());
		final boolean quick9 = Keyboard.isKeyDown(quickspell8.getKeyCode());
		final boolean quick10 = Keyboard.isKeyDown(quickspell9.getKeyCode());
		final EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		if (this.mc != null && this.mc.thePlayer != null) {
			final Entity mount = ((Entity) this.mc.thePlayer).ridingEntity;
			if (fly) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(2, Side.SERVER));
			} else if (land) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(1, Side.SERVER));
			} else if (specials) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(3, Side.SERVER));
			} else if (quick0 && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(8, Side.SERVER));
			} else if (quick2 && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(9, Side.SERVER));
			} else if (quick3 && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(10, Side.SERVER));
			} else if (quick4 && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(11, Side.SERVER));
			} else if (quick5 && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(12, Side.SERVER));
			} else if (quick6 && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(13, Side.SERVER));
			} else if (quick7 && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(14, Side.SERVER));
			} else if (quick8 && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(15, Side.SERVER));
			} else if (quick9 && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(16, Side.SERVER));
			} else if (quick10 && player.getHeldItem() != null) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(17, Side.SERVER));
			} else if (!land && !fly) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(4, Side.SERVER));
			} else if (!specials && !fly && !land) {
				MainClass.proxy.channel.sendToServer(EntityPacketHandler.getPacket(5, Side.SERVER));
			}
		}
	}

}
