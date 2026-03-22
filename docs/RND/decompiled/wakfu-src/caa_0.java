/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from cAA
 */
class caa_0
extends ChannelInboundHandlerAdapter {
    final /* synthetic */ cax_0 moV;

    caa_0(cax_0 cax_02) {
        this.moV = cax_02;
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        this.moV.moS.info((Object)"Connection to updater communication service established.");
        super.channelActive(channelHandlerContext);
    }

    public void channelUnregistered(ChannelHandlerContext channelHandlerContext) {
        this.moV.moS.info((Object)"Connection lost with updater communication service, scheduling reconnection within 20 seconds");
        this.moV.moP.schedule(new cab_0(this), 20L, TimeUnit.SECONDS);
        super.channelUnregistered(channelHandlerContext);
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        this.moV.moS.error((Object)"Error caught on channel: ", throwable);
        if (channelHandlerContext.channel().isOpen()) {
            channelHandlerContext.channel().close().sync();
        }
    }
}

