/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.ssl.SslHandler
 *  io.netty.handler.ssl.SslHandshakeCompletionEvent
 */
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.ssl.SslHandshakeCompletionEvent;
import java.util.Optional;

/*
 * Renamed from aDj
 */
public class adj_2
extends SimpleChannelInboundHandler<aam_2> {
    private final aza_2<? extends ayf_2> dCT;
    private final adk_2 dCU;
    protected ayf_2 dCV;

    public adj_2(aza_2<? extends ayf_2> aza_22, adk_2 adk_22) {
        this.dCT = aza_22;
        this.dCU = adk_22;
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        ChannelPipeline channelPipeline = channelHandlerContext.pipeline();
        Optional<SslHandler> optional = Optional.ofNullable((SslHandler)channelPipeline.get(SslHandler.class));
        if (optional.isEmpty()) {
            this.a(channelHandlerContext);
        }
        channelHandlerContext.fireChannelActive();
    }

    public void a(ChannelHandlerContext channelHandlerContext, aam_2 aam_22) {
        if (aam_22.bUg() == null) {
            aam_22.a(this.dCV);
        }
        aaw_1.bUq().h(aam_22);
        channelHandlerContext.fireChannelRead((Object)aam_22);
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        this.bXY();
        channelHandlerContext.fireChannelInactive();
    }

    public final void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object object) {
        if (object instanceof SslHandshakeCompletionEvent) {
            this.a(channelHandlerContext, (SslHandshakeCompletionEvent)object);
        }
        channelHandlerContext.fireUserEventTriggered(object);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, SslHandshakeCompletionEvent sslHandshakeCompletionEvent) {
        if (!sslHandshakeCompletionEvent.isSuccess()) {
            return;
        }
        this.a(channelHandlerContext);
    }

    private void a(ChannelHandlerContext channelHandlerContext) {
        this.dCV = this.dCT.createNew();
        this.dCV.a(new acn_2(channelHandlerContext));
        this.dCV.bSm();
        this.dCU.a(this.dCV);
    }

    private void bXY() {
        if (this.dCV == null) {
            return;
        }
        this.dCV.bSo();
        this.dCU.b(this.dCV);
    }

    public String toString() {
        return "ClientMessageHandler{m_entityFactory=" + String.valueOf(this.dCT) + ", m_eventsHandler=" + String.valueOf(this.dCU) + ", m_entity=" + (this.dCV != null) + "}";
    }

    public /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (aam_2)object);
    }
}

