package snidgert.harrypottermod.spellsystem;

import java.util.HashMap;

public class MagicLevelClientManager {

	public static WizardPlayer player;
	public static HashMap<String, WizardPlayer> players;

	public static WizardPlayer getPlayer() {
		return MagicLevelClientManager.player;
	}

	public static void setPlayer(final WizardPlayer p) {
		MagicLevelClientManager.player = p;
	}

	public static WizardPlayer getPlayer(final String player) {
		if (MagicLevelClientManager.players.containsKey(player)) {
			return MagicLevelClientManager.players.get(player);
		}
		return null;
	}

	public static void addPlayer(final String player, final WizardPlayer wizard) {
		MagicLevelClientManager.players.put(player, wizard);
	}

	public static void removePlayer(final String player) {
		MagicLevelClientManager.players.get(player);
	}

	static {
		MagicLevelClientManager.players = new HashMap<String, WizardPlayer>();
	}
}
