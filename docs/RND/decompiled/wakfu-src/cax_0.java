/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  javax.inject.Inject
 *  javax.inject.Provider
 *  org.apache.log4j.Logger
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Provider;
import org.apache.log4j.Logger;

/*
 * Renamed from cAx
 */
public final class cax_0
implements cap_0 {
    private static final String moM = "127.0.0.1";
    public static final int moN = 20;
    private final AtomicBoolean moO = new AtomicBoolean();
    final ScheduledExecutorService moP;
    private final auc_0 moQ;
    final Provider<List<ChannelHandler>> moR;
    private Bootstrap dCp;
    final Logger moS = Logger.getLogger(cax_0.class);

    @Inject
    public cax_0(auc_0 auc_02, Provider<List<ChannelHandler>> provider) {
        this.moR = provider;
        this.moP = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors(), new ThreadFactoryBuilder().setNameFormat("Updater-Com-%d").build());
        this.moQ = auc_02;
    }

    private Bootstrap eGA() {
        return (Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)new NioEventLoopGroup())).channel(NioSocketChannel.class)).option(ChannelOption.TCP_NODELAY, (Object)true)).option(ChannelOption.SO_KEEPALIVE, (Object)true)).handler((ChannelHandler)new cay_0(this));
    }

    @Override
    public void start() {
        if (!this.eGC()) {
            return;
        }
        try {
            this.dCp = this.eGA();
        }
        catch (Exception exception) {
            this.moS.error((Object)"Unable to configure bootstrap to communicate with updater: ", (Throwable)exception);
            return;
        }
        this.eGB();
    }

    void eGB() {
        if (!this.eGC()) {
            return;
        }
        int n = this.moQ.d("UPDATER_COMMUNICATION_PORT", 0);
        this.moS.info((Object)("Trying to establish connection to updater communication service on port " + n));
        ChannelFuture channelFuture = this.dCp.connect(moM, n);
        channelFuture.addListener((GenericFutureListener)new caz_0(this));
    }

    private boolean eGC() {
        if (this.moO.get()) {
            return false;
        }
        if (this.moQ.d("UPDATER_COMMUNICATION_PORT", 0) == 0) {
            this.moS.warn((Object)"Updater communication service is not currently configured: Service is unactivated.");
            return false;
        }
        return true;
    }

    @Override
    public void bhk() {
        this.moO.set(true);
        if (this.dCp == null) {
            return;
        }
        Future future = this.dCp.group().shutdownGracefully();
        try {
            future.sync();
        }
        catch (InterruptedException interruptedException) {
            this.moS.error((Object)"Exception during shutting down gracefully", (Throwable)interruptedException);
        }
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    ChannelHandler eGD() {
        return new caa_0(this);
    }
}

