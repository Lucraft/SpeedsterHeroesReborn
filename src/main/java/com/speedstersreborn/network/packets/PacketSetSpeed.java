package com.speedstersreborn.network.packets;

import com.revivalcore.common.capabilities.CapabilitySpeedster;
import com.revivalcore.common.capabilities.ISpeedsterCap;
import com.revivalcore.util.helper.PlayerHelper;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketSetSpeed implements IMessage {



    public PacketSetSpeed() {
    }

    public PacketSetSpeed(EntityPlayer player) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    @Override
    public void fromBytes(ByteBuf buf) {

    }

    public static class Handler implements IMessageHandler<PacketSetSpeed, IMessage> {
        @Override
        public IMessage onMessage(PacketSetSpeed message, MessageContext ctx) {
            ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
                EntityPlayer player = ctx.getServerHandler().player;
                ISpeedsterCap data = CapabilitySpeedster.get(player);
                if (data.isSpeedster() && data.getSpeedLevel() < 1.0f) {
                    data.setSpeedLevel(data.getSpeedLevel() + 0.1F);
                    PlayerHelper.sendMessage(player, "Speed: " + data.getSpeedLevel(), true);
                }
                data.sync();
            });
            return null;
        }
    }

}