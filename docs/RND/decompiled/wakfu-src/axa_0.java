/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 *  org.apache.log4j.Logger
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.log4j.Logger;

/*
 * Renamed from aXa
 */
public class axa_0
implements ChannelFutureListener {
    private static final Logger hwv = Logger.getLogger(axa_0.class);
    private final Bootstrap hww;
    private int hwx;
    private final AtomicBoolean hwy = new AtomicBoolean(false);
    private axb_0 hwz;

    public axa_0(Bootstrap bootstrap) {
        this.hww = bootstrap;
        this.hwx = awx_0.cXO();
    }

    public void cXR() {
        this.hwy.set(true);
    }

    public void a(axb_0 axb_02) {
        this.hwz = axb_02;
    }

    public void cXS() {
        this.hwx = awx_0.cXO();
    }

    public void a(ChannelFuture channelFuture) {
        if (this.hwy.get()) {
            this.hww.config().group().shutdownGracefully();
            hwv.info((Object)"[CHAT] Connection closed");
        } else {
            hwv.warn((Object)String.format("[CHAT] Connection lost, reconnection in %dms", this.hwx));
            TimeUnit.NANOSECONDS.sleep(TimeUnit.MILLISECONDS.toNanos(this.hwx));
            this.hwx = awx_0.Af(this.hwx);
            this.hwz.bXW();
        }
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

