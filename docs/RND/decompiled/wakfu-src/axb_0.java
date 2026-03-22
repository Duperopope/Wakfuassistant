/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.log4j.Logger
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/*
 * Renamed from aXb
 */
public class axb_0
implements ChannelFutureListener {
    private static final Logger hwA = Logger.getLogger(axb_0.class);
    private final Bootstrap hwB;
    private final axa_0 hwC;
    private int hwx;

    public axb_0(Bootstrap bootstrap, axa_0 axa_02) {
        this.hwB = bootstrap;
        this.hwC = axa_02;
        this.hwC.a(this);
        this.hwx = awx_0.cXO();
    }

    public void a(ChannelFuture channelFuture) {
        if (channelFuture.isSuccess()) {
            this.hwx = awx_0.cXO();
            channelFuture.channel().closeFuture().addListener((GenericFutureListener)this.hwC);
            return;
        }
        hwA.warn((Object)String.format("[CHAT] Connection failed, next tentative in %dms", this.hwx));
        TimeUnit.NANOSECONDS.sleep(TimeUnit.MILLISECONDS.toNanos(this.hwx));
        this.hwx = awx_0.Af(this.hwx);
        this.bXW();
    }

    public void bXW() {
        this.hwB.connect().addListener((GenericFutureListener)this);
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

