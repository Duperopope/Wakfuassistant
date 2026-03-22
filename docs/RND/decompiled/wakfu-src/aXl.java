/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  org.jetbrains.annotations.NotNull
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.jetbrains.annotations.NotNull;

public class aXl
extends SimpleChannelInboundHandler<k> {
    protected void a(ChannelHandlerContext channelHandlerContext, k k2) {
        api_0 api_02 = new api_0(k2.R().t().fD(), k2.R().q());
        api_02.m(aPl.exC);
        long l = aue_0.cVJ().cVO().xl();
        boolean bl = k2.R().t().fD() == l;
        String string = aXl.a(k2.R(), bl);
        api_02.je(string);
        aPh.czg().a(api_02, string, bl);
    }

    @NotNull
    private static String a(h h2, boolean bl) {
        if (bl) {
            return apl_0.eAC.ju(h2.n()).orElse("<UNDEFINED>");
        }
        return apl_0.T(h2.t().getName(), h2.t().getTag());
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (k)object);
    }
}

