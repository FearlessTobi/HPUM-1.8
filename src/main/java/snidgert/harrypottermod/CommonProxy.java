package snidgert.harrypottermod;

import net.minecraftforge.fml.common.network.FMLEventChannel;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

	public FMLEventChannel channel;

	public void renderStuff() {
	}

	public void registerTileEntitySpecialRenderer() {
	}

	public void registerItemRenderers() {
	}

	public void preInit() {
		(this.channel = NetworkRegistry.INSTANCE.newEventDrivenChannel("Flying")).register(new EntityPacketHandler());
	}
}
