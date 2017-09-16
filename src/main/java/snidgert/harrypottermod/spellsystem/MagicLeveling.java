package snidgert.harrypottermod.spellsystem;

public class MagicLeveling {

	public static int Level;
	public static int Exp;
	public static int CurrentExp;
	public static int CurrentExpNeeded;
	public static int ExpNeeded;
	public static int[] NeededExp;

	public MagicLeveling(final int Level, final int Exp) {
		MagicLeveling.Level = Level;
		MagicLeveling.Exp = Exp;
		MagicLeveling.ExpNeeded = getNeededExp(Level);
		MagicLeveling.CurrentExpNeeded = MagicLeveling.ExpNeeded - Exp;
		MagicLeveling.CurrentExp = Exp - getNeededExp(Level - 1);
	}

	public static void addExp(final int i) {
		MagicLeveling.Exp += i;
		if (MagicLeveling.Exp > getNeededExp(100)) {
			MagicLeveling.Exp = getNeededExp(100);
		} else if (MagicLeveling.Exp > MagicLeveling.ExpNeeded) {
			LevelUp();
		} else {
			MagicLeveling.CurrentExpNeeded = MagicLeveling.ExpNeeded - MagicLeveling.Exp;
			MagicLeveling.CurrentExp = MagicLeveling.Exp - getNeededExp(MagicLeveling.Level - 1);
		}
	}

	public static void LevelUp() {
		++MagicLeveling.Level;
		MagicLeveling.ExpNeeded = getNeededExp(MagicLeveling.Level);
		MagicLeveling.CurrentExpNeeded = MagicLeveling.ExpNeeded - MagicLeveling.Exp;
		MagicLeveling.CurrentExp = MagicLeveling.Exp - getNeededExp(MagicLeveling.Level - 1);
	}

	public static void calculateNeededExp() {
		for (int i = 0; i < 100; ++i) {
			MagicLeveling.NeededExp[i] = i * i * 100;
		}
	}

	public static void setExp(final int xp) {
		for (int i = 99; i >= 0; --i) {
			if (xp > getNeededExp(i - 1)) {
				setLevel(i);
			}
		}
	}

	public static void setLevel(final int lvl) {
		MagicLeveling.Level = lvl;
		MagicLeveling.Exp = getNeededExp(lvl - 1);
		MagicLeveling.ExpNeeded = getNeededExp(lvl);
		MagicLeveling.CurrentExpNeeded = MagicLeveling.ExpNeeded - MagicLeveling.Exp;
		MagicLeveling.CurrentExp = MagicLeveling.Exp - getNeededExp(MagicLeveling.Level - 1);
	}

	public static int getNeededExp(final int lvl) {
		return MagicLeveling.NeededExp[lvl - 1];
	}

	static {
		MagicLeveling.NeededExp = new int[100];
	}
}
