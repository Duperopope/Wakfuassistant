/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelDuplexHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.timeout.IdleState
 *  io.netty.handler.timeout.IdleStateEvent
 */
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

public class aXk
extends ChannelDuplexHandler {
    public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object object) {
        IdleStateEvent idleStateEvent;
        if (object instanceof IdleStateEvent && (idleStateEvent = (IdleStateEvent)object).state() == IdleState.WRITER_IDLE) {
            channelHandlerContext.writeAndFlush((Object)new axz_0(3));
        }
    }
}

