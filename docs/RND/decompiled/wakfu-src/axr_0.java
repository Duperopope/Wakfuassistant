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
 * Renamed from aXr
 */
public class axr_0
extends SimpleChannelInboundHandler<cm_2> {
    protected void a(ChannelHandlerContext channelHandlerContext, cm_2 cm_22) {
        if (cm_22.fD() == aue_0.cVJ().cVO().xl()) {
            return;
        }
        apl_0.eAC.a(cm_22.fD(), axr_0.d(cm_22));
    }

    private static apm_0 d(cm_2 cm_22) {
        switch (cm_22.nO()) {
            case iy: {
                return apm_0.eAD;
            }
            case iz: 
            case iA: {
                return apm_0.eAE;
            }
        }
        return apm_0.eAE;
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (cm_2)object);
    }
}

