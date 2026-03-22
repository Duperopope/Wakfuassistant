/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.EventLoopGroup
 *  io.netty.util.concurrent.Future
 */
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoopGroup;
import io.netty.util.concurrent.Future;

/*
 * Renamed from aDa
 */
class ada_2
implements ChannelFutureListener {
    private final EventLoopGroup dCI;
    private final EventLoopGroup dCJ;

    ada_2(EventLoopGroup eventLoopGroup, EventLoopGroup eventLoopGroup2) {
        this.dCI = eventLoopGroup;
        this.dCJ = eventLoopGroup2;
    }

    public void a(ChannelFuture channelFuture) {
        this.dCI.shutdownGracefully();
        this.dCJ.shutdownGracefully();
    }

    public String toString() {
        return "ShutdownListener{m_bossGroup=" + String.valueOf(this.dCI) + ", m_workerGroup=" + String.valueOf(this.dCJ) + "}";
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

