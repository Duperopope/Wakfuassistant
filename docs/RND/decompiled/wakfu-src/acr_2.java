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
 * Renamed from aCR
 */
class acr_2
implements ChannelFutureListener {
    private final Bootstrap dCp;

    acr_2(Bootstrap bootstrap) {
        this.dCp = bootstrap;
    }

    public void a(ChannelFuture channelFuture) {
        TimeUnit.NANOSECONDS.sleep(TimeUnit.SECONDS.toNanos(5L));
        acq_2.b(this.dCp, this);
    }

    public String toString() {
        return "ShutdownListener{m_bootstrap=" + String.valueOf(this.dCp) + "}";
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

