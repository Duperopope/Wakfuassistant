/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from aCS
 */
class acs_2
implements ChannelFutureListener {
    private final Bootstrap dCq;
    private final ChannelFutureListener dCr;
    private long cOZ = System.nanoTime();

    acs_2(Bootstrap bootstrap, ChannelFutureListener channelFutureListener) {
        this.dCq = bootstrap;
        this.dCr = channelFutureListener;
    }

    public void a(ChannelFuture channelFuture) {
        if (channelFuture.isSuccess()) {
            channelFuture.channel().closeFuture().addListener((GenericFutureListener)this.dCr);
            return;
        }
        long l = System.nanoTime() - this.cOZ;
        TimeUnit.NANOSECONDS.sleep(TimeUnit.SECONDS.toNanos(5L) - l);
        this.bXW();
    }

    void bXW() {
        this.cOZ = System.nanoTime();
        this.dCq.connect().addListener((GenericFutureListener)this);
    }

    public String toString() {
        return "RetryListener{m_bootStrap=" + String.valueOf(this.dCq) + ", m_start=" + this.cOZ + "}";
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

