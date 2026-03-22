/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.bootstrap.BootstrapConfig
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.BootstrapConfig;
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
 * Renamed from aCQ
 */
public final class acq_2 {
    private static final int dCk = 5;
    private final String dCl;
    private final int dCm;
    private final aco_2 dCn;
    private int dCo;

    public acq_2(aco_2 aco_22, String string, int n) {
        this.dCl = string;
        this.dCm = n;
        this.dCn = aco_22;
    }

    public boolean f(boolean bl, boolean bl2) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("Net-Cnx-" + this.dCl + ":" + this.dCm + ">%d").build();
        NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup(this.dCo, threadFactory);
        Bootstrap bootstrap = new Bootstrap();
        ((Bootstrap)((Bootstrap)((Bootstrap)bootstrap.group((EventLoopGroup)nioEventLoopGroup)).remoteAddress(this.dCl, this.dCm).channel(NioSocketChannel.class)).option(ChannelOption.SO_KEEPALIVE, (Object)true)).handler((ChannelHandler)this.dCn);
        Object object = bl2 ? new acr_2(bootstrap) : new act_2((EventLoopGroup)nioEventLoopGroup);
        return bl ? acq_2.a(bootstrap, object) : acq_2.b(bootstrap, object);
    }

    private static boolean a(Bootstrap bootstrap, ChannelFutureListener channelFutureListener) {
        ChannelFuture channelFuture = bootstrap.connect();
        channelFuture.await(5L, TimeUnit.SECONDS);
        if (!channelFuture.isSuccess()) {
            BootstrapConfig bootstrapConfig = bootstrap.config();
            EventLoopGroup eventLoopGroup = bootstrapConfig.group();
            eventLoopGroup.shutdownGracefully();
            return false;
        }
        channelFuture.channel().closeFuture().addListener((GenericFutureListener)channelFutureListener);
        return true;
    }

    static boolean b(Bootstrap bootstrap, ChannelFutureListener channelFutureListener) {
        acs_2 acs_22 = new acs_2(bootstrap, channelFutureListener);
        acs_22.bXW();
        return true;
    }

    public void wZ(int n) {
        this.dCo = n;
    }

    public String toString() {
        return "ClientConnection{, m_host='" + this.dCl + "', m_port=" + this.dCm + "}";
    }
}

