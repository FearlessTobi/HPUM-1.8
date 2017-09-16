package snidgert.harrypottermod;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.FMLNetworkEvent;
import net.minecraftforge.fml.common.network.internal.FMLProxyPacket;
import net.minecraftforge.fml.relauncher.Side;
import snidgert.harrypottermod.mobs.entity.EntityCatForm;
import snidgert.harrypottermod.mobs.entity.EntityDogForm;
import snidgert.harrypottermod.mobs.entity.EntityDragonRideable;
import snidgert.harrypottermod.mobs.entity.EntityFalconForm;
import snidgert.harrypottermod.mobs.entity.EntityFlyingBroomstick;
import snidgert.harrypottermod.mobs.entity.EntityFordAnglia;
import snidgert.harrypottermod.mobs.entity.EntityGriffin;
import snidgert.harrypottermod.mobs.entity.EntityHippogriff;
import snidgert.harrypottermod.mobs.entity.EntityMotorbike;
import snidgert.harrypottermod.mobs.entity.EntityMotorbike2;
import snidgert.harrypottermod.mobs.entity.EntityOwlForm;
import snidgert.harrypottermod.mobs.entity.EntityPhoenixForm;
import snidgert.harrypottermod.mobs.entity.EntityRatForm;
import snidgert.harrypottermod.mobs.entity.EntityRavenForm;
import snidgert.harrypottermod.mobs.entity.EntitySnidgetForm;
import snidgert.harrypottermod.mobs.entity.EntityStagForm;
import snidgert.harrypottermod.mobs.entity.EntityThestral;
import snidgert.harrypottermod.mobs.entity.EntityUnicorn;
import snidgert.harrypottermod.mobs.entity.EntityWerewolf;
import snidgert.harrypottermod.mobs.entity.EntityWingedHorse;
import snidgert.harrypottermod.wands.DPSWandClass;
import snidgert.harrypottermod.wands.ElderWandClass;
import snidgert.harrypottermod.wands.SupportWandClass;
import snidgert.harrypottermod.wands.TankWandClass;

public class EntityPacketHandler {

	public static final String CHANNEL = "Flying";

	@SubscribeEvent
	public void onServerPacket(final FMLNetworkEvent.ServerCustomPacketEvent event) {
		if (event.packet.channel().equals("Flying")) {
			this.handle(event.packet, ((NetHandlerPlayServer) event.handler).playerEntity);
		}
	}

	private void handle(final FMLProxyPacket packet, final EntityPlayer player) {
		final ByteBuf payload = packet.payload();
		final long data = payload.readLong();
		final Entity Mount = ((Entity) player).ridingEntity;
		if (Mount != null && Mount instanceof EntityDragonRideable) {
			((EntityDragonRideable) Mount).FlyUp = false;
			((EntityDragonRideable) Mount).FlyDown = false;
			((EntityDragonRideable) Mount).FireBreath = false;
			if (data == 2L) {
				((EntityDragonRideable) Mount).FlyUp = true;
			} else if (data == 3L) {
				((EntityDragonRideable) Mount).FireBreath = true;
			} else if (data == 1L) {
				((EntityDragonRideable) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityHippogriff) {
			((EntityHippogriff) Mount).FlyUp = false;
			((EntityHippogriff) Mount).FlyDown = false;
			if (data == 2L) {
				((EntityHippogriff) Mount).FlyUp = true;
			} else if (data == 1L) {
				((EntityHippogriff) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityGriffin) {
			((EntityGriffin) Mount).FlyUp = false;
			((EntityGriffin) Mount).FlyDown = false;
			if (data == 2L) {
				((EntityGriffin) Mount).FlyUp = true;
			} else if (data == 1L) {
				((EntityGriffin) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityFordAnglia) {
			((EntityFordAnglia) Mount).FlyUp = false;
			((EntityFordAnglia) Mount).FlyDown = false;
			((EntityFordAnglia) Mount).FireBreath = false;
			if (data == 2L) {
				((EntityFordAnglia) Mount).FlyUp = true;
			} else if (data == 3L) {
				((EntityFordAnglia) Mount).FireBreath = true;
			} else if (data == 1L) {
				((EntityFordAnglia) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityMotorbike) {
			((EntityMotorbike) Mount).FlyUp = false;
			((EntityMotorbike) Mount).FlyDown = false;
			((EntityMotorbike) Mount).FireBreath = false;
			if (data == 2L) {
				((EntityMotorbike) Mount).FlyUp = true;
			} else if (data == 3L) {
				((EntityMotorbike) Mount).FireBreath = true;
			} else if (data == 1L) {
				((EntityMotorbike) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityMotorbike2) {
			((EntityMotorbike2) Mount).FlyUp = false;
			((EntityMotorbike2) Mount).FlyDown = false;
			((EntityMotorbike2) Mount).FireBreath = false;
			if (data == 2L) {
				((EntityMotorbike2) Mount).FlyUp = true;
			} else if (data == 3L) {
				((EntityMotorbike2) Mount).FireBreath = true;
			} else if (data == 1L) {
				((EntityMotorbike2) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityFlyingBroomstick) {
			((EntityFlyingBroomstick) Mount).FlyUp = false;
			((EntityFlyingBroomstick) Mount).FlyDown = false;
			((EntityFlyingBroomstick) Mount).FireBreath = false;
			if (data == 2L) {
				((EntityFlyingBroomstick) Mount).FlyUp = true;
			} else if (data == 3L) {
				((EntityFlyingBroomstick) Mount).FireBreath = true;
			} else if (data == 1L) {
				((EntityFlyingBroomstick) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityPhoenixForm) {
			((EntityPhoenixForm) Mount).FlyUp = false;
			((EntityPhoenixForm) Mount).FlyDown = false;
			((EntityPhoenixForm) Mount).FireBreath = false;
			if (data == 2L) {
				((EntityPhoenixForm) Mount).FlyUp = true;
			} else if (data == 3L) {
				((EntityPhoenixForm) Mount).FireBreath = true;
			} else if (data == 1L) {
				((EntityPhoenixForm) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityRavenForm) {
			((EntityRavenForm) Mount).FlyUp = false;
			((EntityRavenForm) Mount).FlyDown = false;
			if (data == 2L) {
				((EntityRavenForm) Mount).FlyUp = true;
			} else if (data == 1L) {
				((EntityRavenForm) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntitySnidgetForm) {
			((EntitySnidgetForm) Mount).FlyUp = false;
			((EntitySnidgetForm) Mount).FlyDown = false;
			if (data == 2L) {
				((EntitySnidgetForm) Mount).FlyUp = true;
			} else if (data == 1L) {
				((EntitySnidgetForm) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityFalconForm) {
			((EntityFalconForm) Mount).FlyUp = false;
			((EntityFalconForm) Mount).FlyDown = false;
			if (data == 2L) {
				((EntityFalconForm) Mount).FlyUp = true;
			} else if (data == 1L) {
				((EntityFalconForm) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityOwlForm) {
			((EntityOwlForm) Mount).FlyUp = false;
			((EntityOwlForm) Mount).FlyDown = false;
			if (data == 2L) {
				((EntityOwlForm) Mount).FlyUp = true;
			} else if (data == 1L) {
				((EntityOwlForm) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityWerewolf) {
			((EntityWerewolf) Mount).FlyUp = false;
			if (data == 2L) {
				((EntityWerewolf) Mount).FlyUp = true;
			}
		}
		if (Mount != null && Mount instanceof EntityStagForm) {
			((EntityStagForm) Mount).FlyUp = false;
			if (data == 2L) {
				((EntityStagForm) Mount).FlyUp = true;
			}
		}
		if (Mount != null && Mount instanceof EntityDogForm) {
			((EntityDogForm) Mount).FlyUp = false;
			if (data == 2L) {
				((EntityDogForm) Mount).FlyUp = true;
			}
		}
		if (Mount != null && Mount instanceof EntityCatForm) {
			((EntityCatForm) Mount).FlyUp = false;
			if (data == 2L) {
				((EntityCatForm) Mount).FlyUp = true;
			}
		}
		if (Mount != null && Mount instanceof EntityRatForm) {
			((EntityRatForm) Mount).FlyUp = false;
			if (data == 2L) {
				((EntityRatForm) Mount).FlyUp = true;
			}
		}
		if (Mount != null && Mount instanceof EntityWingedHorse) {
			((EntityWingedHorse) Mount).FlyUp = false;
			((EntityWingedHorse) Mount).FlyDown = false;
			if (data == 2L) {
				((EntityWingedHorse) Mount).FlyUp = true;
			} else if (data == 1L) {
				((EntityWingedHorse) Mount).FlyDown = true;
			}
		}
		if (Mount != null && Mount instanceof EntityUnicorn) {
			((EntityUnicorn) Mount).FlyUp = false;
			((EntityUnicorn) Mount).FlyDown = false;
			if (data == 2L) {
				((EntityUnicorn) Mount).FlyUp = true;
			}
		}
		if (Mount != null && Mount instanceof EntityThestral) {
			((EntityThestral) Mount).FlyUp = false;
			((EntityThestral) Mount).FlyDown = false;
			if (data == 2L) {
				((EntityThestral) Mount).FlyUp = true;
			} else if (data == 1L) {
				((EntityThestral) Mount).FlyDown = true;
			}
		}

		if (player.getHeldItem() != null && player.getHeldItem().getItem() == MainClass.ElderWand) {
			if (data == 6L) {
				((ElderWandClass) player.getHeldItem().getItem()).NextSpell = true;
			} else if (data == 7L) {
				((ElderWandClass) player.getHeldItem().getItem()).PrevSpell = true;
			}
		}
		if (player.getHeldItem() != null && player.getHeldItem().getItem() == MainClass.DPSWandClass) {
			((DPSWandClass) player.getHeldItem().getItem()).Nox = false;
			if (data == 6L) {
				((DPSWandClass) player.getHeldItem().getItem()).NextSpell = true;
			} else if (data == 7L) {
				((DPSWandClass) player.getHeldItem().getItem()).PrevSpell = true;
			} else if (data == 3L) {
				((DPSWandClass) player.getHeldItem().getItem()).Nox = true;
			} else if (data == 8L) {
				((DPSWandClass) player.getHeldItem().getItem()).Quick0 = true;
			} else if (data == 9L) {
				((DPSWandClass) player.getHeldItem().getItem()).Quick1 = true;
			} else if (data == 10L) {
				((DPSWandClass) player.getHeldItem().getItem()).Quick2 = true;
			} else if (data == 11L) {
				((DPSWandClass) player.getHeldItem().getItem()).Quick3 = true;
			} else if (data == 12L) {
				((DPSWandClass) player.getHeldItem().getItem()).Quick4 = true;
			} else if (data == 13L) {
				((DPSWandClass) player.getHeldItem().getItem()).Quick5 = true;
			} else if (data == 14L) {
				((DPSWandClass) player.getHeldItem().getItem()).Quick6 = true;
			} else if (data == 15L) {
				((DPSWandClass) player.getHeldItem().getItem()).Quick7 = true;
			} else if (data == 16L) {
				((DPSWandClass) player.getHeldItem().getItem()).Quick8 = true;
			} else if (data == 17L) {
				((DPSWandClass) player.getHeldItem().getItem()).Quick9 = true;
			}
		}
		if (player.getHeldItem() != null && player.getHeldItem().getItem() == MainClass.TankWandClass) {
			((TankWandClass) player.getHeldItem().getItem()).Nox = false;
			if (data == 6L) {
				((TankWandClass) player.getHeldItem().getItem()).NextSpell = true;
			} else if (data == 7L) {
				((TankWandClass) player.getHeldItem().getItem()).PrevSpell = true;
			} else if (data == 3L) {
				((TankWandClass) player.getHeldItem().getItem()).Nox = true;
			} else if (data == 8L) {
				((TankWandClass) player.getHeldItem().getItem()).Quick0 = true;
			} else if (data == 9L) {
				((TankWandClass) player.getHeldItem().getItem()).Quick1 = true;
			} else if (data == 10L) {
				((TankWandClass) player.getHeldItem().getItem()).Quick2 = true;
			} else if (data == 11L) {
				((TankWandClass) player.getHeldItem().getItem()).Quick3 = true;
			} else if (data == 12L) {
				((TankWandClass) player.getHeldItem().getItem()).Quick4 = true;
			} else if (data == 13L) {
				((TankWandClass) player.getHeldItem().getItem()).Quick5 = true;
			} else if (data == 14L) {
				((TankWandClass) player.getHeldItem().getItem()).Quick6 = true;
			} else if (data == 15L) {
				((TankWandClass) player.getHeldItem().getItem()).Quick7 = true;
			} else if (data == 16L) {
				((TankWandClass) player.getHeldItem().getItem()).Quick8 = true;
			} else if (data == 17L) {
				((TankWandClass) player.getHeldItem().getItem()).Quick9 = true;
			}
		}
		if (player.getHeldItem() != null && player.getHeldItem().getItem() == MainClass.SupportWandClass) {
			((SupportWandClass) player.getHeldItem().getItem()).Nox = false;
			if (data == 6L) {
				((SupportWandClass) player.getHeldItem().getItem()).NextSpell = true;
			} else if (data == 7L) {
				((SupportWandClass) player.getHeldItem().getItem()).PrevSpell = true;
			} else if (data == 3L) {
				((SupportWandClass) player.getHeldItem().getItem()).Nox = true;
			} else if (data == 8L) {
				((SupportWandClass) player.getHeldItem().getItem()).Quick0 = true;
			} else if (data == 9L) {
				((SupportWandClass) player.getHeldItem().getItem()).Quick1 = true;
			} else if (data == 10L) {
				((SupportWandClass) player.getHeldItem().getItem()).Quick2 = true;
			} else if (data == 11L) {
				((SupportWandClass) player.getHeldItem().getItem()).Quick3 = true;
			} else if (data == 12L) {
				((SupportWandClass) player.getHeldItem().getItem()).Quick4 = true;
			} else if (data == 13L) {
				((SupportWandClass) player.getHeldItem().getItem()).Quick5 = true;
			} else if (data == 14L) {
				((SupportWandClass) player.getHeldItem().getItem()).Quick6 = true;
			} else if (data == 15L) {
				((SupportWandClass) player.getHeldItem().getItem()).Quick7 = true;
			} else if (data == 16L) {
				((SupportWandClass) player.getHeldItem().getItem()).Quick8 = true;
			} else if (data == 17L) {
				((SupportWandClass) player.getHeldItem().getItem()).Quick9 = true;
			}
		}

	}

	public static FMLProxyPacket getPacket(final int i, final Side side) {
		final ByteBuf buffer = Unpooled.buffer();
		buffer.writeLong(i);
		final FMLProxyPacket packet = new FMLProxyPacket(new PacketBuffer(buffer), "Flying");
		packet.setTarget(side);
		return packet;
	}
}
