/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.Optional;

/*
 * Renamed from aXn
 */
public class axn_0
extends SimpleChannelInboundHandler<ch_2> {
    protected void a(ChannelHandlerContext channelHandlerContext, ch_2 ch_22) {
        if (ch_22.fD() == aue_0.cVJ().cVO().xl()) {
            return;
        }
        if (ch_22.lK() <= 0) {
            return;
        }
        az_2 az_22 = ch_22.R(0);
        int n = az_22.hc();
        Optional<apk_0> optional = apk_0.mL(n);
        optional.ifPresent(apk_02 -> apl_0.eAC.a(ch_22.fD(), (apk_0)((Object)apk_02)));
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (ch_2)object);
    }
}

