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
 * Renamed from aXq
 */
public class axq_0
extends SimpleChannelInboundHandler<cb_1> {
    protected void a(ChannelHandlerContext channelHandlerContext, cb_1 cb_12) {
        long l = aue_0.cVJ().cVO().xl();
        if (l != cb_12.fD()) {
            return;
        }
        be_2 be_22 = cb_12.kh();
        apl_0.eAC.a(be_22.hD().fD(), be_22.hD().getName(), be_22.hD().getTag(), be_22.hF());
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (cb_1)object);
    }
}

