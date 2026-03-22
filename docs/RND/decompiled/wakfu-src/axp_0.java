/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/*
 * Renamed from aXp
 */
public class axp_0
extends SimpleChannelInboundHandler<cp_2> {
    protected void a(ChannelHandlerContext channelHandlerContext, cp_2 cp_22) {
        long l = aue_0.cVJ().cVO().xl();
        if (l != cp_22.fD()) {
            return;
        }
        apl_0.eAC.il(cp_22.gA());
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (cp_2)object);
    }
}

