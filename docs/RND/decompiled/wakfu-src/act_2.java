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
 * Renamed from aCT
 */
class act_2
implements ChannelFutureListener {
    private final EventLoopGroup dCs;

    act_2(EventLoopGroup eventLoopGroup) {
        this.dCs = eventLoopGroup;
    }

    public void a(ChannelFuture channelFuture) {
        this.dCs.shutdownGracefully();
    }

    public String toString() {
        return "ShutdownListener{m_group=" + String.valueOf(this.dCs) + "}";
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

