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
 * Renamed from aXt
 */
public class axt_0
extends SimpleChannelInboundHandler<cs_1> {
    protected void a(ChannelHandlerContext channelHandlerContext, cs_1 cs_12) {
        if (cs_12.fD() == aue_0.cVJ().cVO().xl()) {
            return;
        }
        apl_0.eAC.a(cs_12.fD(), axt_0.c(cs_12.ky()));
    }

    private static aPN c(cq_2 cq_22) {
        switch (cq_22) {
            case iO: {
                return aPN.eAH;
            }
            case iP: {
                return aPN.eAI;
            }
            case iQ: 
            case iN: {
                return aPN.eAG;
            }
        }
        return aPN.eAG;
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (cs_1)object);
    }
}

