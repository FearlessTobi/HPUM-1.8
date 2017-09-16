package snidgert.harrypottermod.spellsystem;

import java.util.HashMap;

public class MagicLevelServerManager {

	public static HashMap<String, WizardPlayer> players;

	public static WizardPlayer getPlayer(final String player) {
		if (MagicLevelServerManager.players.containsKey(player)) {
			return MagicLevelServerManager.players.get(player);
		}
		return null;
	}

	public static void addPlayer(final String player, final WizardPlayer wizard) {
		MagicLevelServerManager.players.put(player, wizard);
	}

	public static void removePlayer(final String player) {
		MagicLevelServerManager.players.get(player);
	}

	static {
		MagicLevelServerManager.players = new HashMap<String, WizardPlayer>();
	}
}
