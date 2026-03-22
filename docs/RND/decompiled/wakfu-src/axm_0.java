/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  org.apache.log4j.Logger
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.log4j.Logger;

/*
 * Renamed from aXm
 */
public class axm_0
extends SimpleChannelInboundHandler<bp_1> {
    private static final Logger hwL = Logger.getLogger(axm_0.class);

    protected void a(ChannelHandlerContext channelHandlerContext, bp_1 bp_12) {
        if (bp_12.ak() < 1) {
            return;
        }
        bp_12.ai().forEach(be_22 -> apl_0.eAC.a(be_22.hD().fD(), be_22.hD().getName(), be_22.hD().getTag(), be_22.hF()));
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (bp_1)object);
    }
}

