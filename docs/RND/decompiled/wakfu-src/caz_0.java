/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.Future
 */
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;

/*
 * Renamed from cAz
 */
class caz_0
implements ChannelFutureListener {
    final /* synthetic */ cax_0 moU;

    caz_0(cax_0 cax_02) {
        this.moU = cax_02;
    }

    public void a(ChannelFuture channelFuture) {
        if (channelFuture.cause() != null) {
            this.moU.moS.error((Object)"Error caught on channel during connect: ", channelFuture.cause());
        }
    }

    public /* synthetic */ void operationComplete(Future future) {
        this.a((ChannelFuture)future);
    }
}

