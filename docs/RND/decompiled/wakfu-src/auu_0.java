/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.ssl.SslHandshakeCompletionEvent
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.ssl.SslHandshakeCompletionEvent;

/*
 * Renamed from aUu
 */
class auu_0
extends adj_2 {
    private final String gyO;
    private final int gyP;

    auu_0(String string, int n) {
        super(() -> new ccj_0(aue_0.cVJ()), new cck_0());
        this.gyO = string;
        this.gyP = n;
    }

    @Override
    protected void a(ChannelHandlerContext channelHandlerContext, SslHandshakeCompletionEvent sslHandshakeCompletionEvent) {
        super.a(channelHandlerContext, sslHandshakeCompletionEvent);
        if (sslHandshakeCompletionEvent.isSuccess()) {
            return;
        }
        aut_0.gyL.error((Object)"SSL connection problem", sslHandshakeCompletionEvent.cause());
        aut_0.d(this.gyO, this.gyP, false);
    }
}

