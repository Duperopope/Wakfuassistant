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
 * Renamed from aXo
 */
public class axo_0
extends SimpleChannelInboundHandler<cl_2> {
    protected void a(ChannelHandlerContext channelHandlerContext, cl_2 cl_22) {
        long l = aue_0.cVJ().cVO().xl();
        if (l != cl_22.fD()) {
            return;
        }
        be_2 be_22 = cl_22.kh();
        apl_0.eAC.a(be_22.hD().fD(), be_22.hD().getName(), be_22.hD().getTag(), be_22.hF());
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (cl_2)object);
    }
}

