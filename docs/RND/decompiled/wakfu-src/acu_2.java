/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from aCU
 */
public final class acu_2 {
    private static final int dCt = 0;
    private static final int dCu = 1;
    private final String dCv;
    private final int dCw;

    public acu_2(String string, int n) {
        this.dCv = string;
        this.dCw = n;
    }

    public boolean f(boolean bl, boolean bl2) {
        NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup(0, (ThreadFactory)new acv_2(this.dCv, this.dCw));
        Bootstrap bootstrap = new Bootstrap();
        ((Bootstrap)((Bootstrap)((Bootstrap)bootstrap.group((EventLoopGroup)nioEventLoopGroup)).remoteAddress(this.dCv, this.dCw).channel(NioSocketChannel.class)).option(ChannelOption.SO_KEEPALIVE, (Object)true)).handler((ChannelHandler)FG.aLe().e(acp_2.class));
        Object object = bl2 ? new acw_2(bootstrap) : new acy_1((EventLoopGroup)nioEventLoopGroup);
        return bl ? acu_2.a(bootstrap, object) : acu_2.b(bootstrap, object);
    }

    private static boolean a(Bootstrap bootstrap, ChannelFutureListener channelFutureListener) {
        ChannelFuture channelFuture = bootstrap.connect();
        channelFuture.await(1L, TimeUnit.SECONDS);
        if (!channelFuture.isSuccess()) {
            bootstrap.group().shutdownGracefully();
            return false;
        }
        channelFuture.channel().closeFuture().addListener((GenericFutureListener)channelFutureListener);
        return true;
    }

    static boolean b(Bootstrap bootstrap, ChannelFutureListener channelFutureListener) {
        acx_2 acx_22 = new acx_2(bootstrap, channelFutureListener);
        acx_22.bXW();
        return true;
    }

    public String toString() {
        return "ProtobufConnection{, m_host='" + this.dCv + "', m_port=" + this.dCw + "}";
    }
}

