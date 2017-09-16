package snidgert.harrypottermod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties {

	public static final String EXT_PROP_NAME = "ExtendedPlayer";
	private final EntityPlayer player;
	private int currentMana;
	private int maxMana;

	public ExtendedPlayer(final EntityPlayer player) {
		this.player = player;
		final int n = 50;
		this.maxMana = n;
		this.currentMana = n;
	}

	public static final void register(final EntityPlayer player) {
		player.registerExtendedProperties("ExtendedPlayer", new ExtendedPlayer(player));
	}

	public static final ExtendedPlayer get(final EntityPlayer player) {
		return (ExtendedPlayer) player.getExtendedProperties("ExtendedPlayer");
	}

	@Override
	public void saveNBTData(final NBTTagCompound compound) {
		final NBTTagCompound properties = new NBTTagCompound();
		properties.setInteger("CurrentMana", this.currentMana);
		properties.setInteger("MaxMana", this.maxMana);
		compound.setTag("ExtendedPlayer", properties);
	}

	@Override
	public void loadNBTData(final NBTTagCompound compound) {
		final NBTTagCompound properties = (NBTTagCompound) compound.getTag("ExtendedPlayer");
		this.currentMana = properties.getInteger("CurrentMana");
		this.maxMana = properties.getInteger("MaxMana");
		System.out.println("[TUT PROPS] Mana from NBT: " + this.currentMana + "/" + this.maxMana);
	}

	@Override
	public void init(final Entity entity, final World world) {
	}

	public boolean consumeMana(final int amount) {
		final boolean sufficient = amount <= this.currentMana;
		this.currentMana -= ((amount < this.currentMana) ? amount : this.currentMana);
		return sufficient;
	}

	public void replenishMana() {
		this.currentMana = this.maxMana;
	}

	public void setCurrentMana(final int amount) {
		this.currentMana = ((amount < this.maxMana) ? amount : this.maxMana);
	}

	public void setMaxMana(final int amount) {
		this.maxMana = ((amount > 0) ? amount : 0);
	}

	public float getCurrentMana() {
		return this.currentMana;
	}

	public float getMaxMana() {
		return 1000.0f;
	}
}
