/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from aCW
 */
class acw_2
implements ChannelFutureListener {
    private final Bootstrap dCA;

    acw_2(Bootstrap bootstrap) {
        this.dCA = bootstrap;
    }

    public void a(ChannelFuture channelFuture) {
        TimeUnit.NANOSECONDS.sleep(TimeUnit.SECONDS.toNanos(1L));
        acu_2.b(this.dCA, this);
    }

    public String toString() {
        return "ShutdownListener{m_bootstrap=" + String.valueOf(this.dCA) + "}";
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

