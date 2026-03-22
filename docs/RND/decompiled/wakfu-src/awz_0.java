/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.codec.LengthFieldBasedFrameDecoder
 *  io.netty.handler.ssl.SslContext
 *  io.netty.handler.ssl.SslContextBuilder
 *  io.netty.handler.ssl.SslHandler
 *  io.netty.handler.timeout.IdleStateHandler
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.timeout.IdleStateHandler;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aWZ
 */
public class awz_0
extends ChannelInitializer<SocketChannel> {
    private static final Logger hwk = Logger.getLogger(awz_0.class);
    private static final int hwl = 4;
    private static final int hwm = 0x100000;
    private static final int hwn = 30;
    public static final String hwo = "SpinDecoder";
    public static final String hwp = "AuthenticationHandler";
    public static final String hwq = "ProtobufDecoder";
    public static final String hwr = "InterChatMessageDecoder";
    public static final String hws = "InterChatAvailabilityHandler";
    private final awy_0 hwt;
    private final String hwu;

    public awz_0(awy_0 awy_02, @NotNull String string) {
        this.hwt = awy_02;
        this.hwu = string;
    }

    protected void a(SocketChannel socketChannel) {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        SslHandler sslHandler = this.cXQ().newHandler(socketChannel.alloc());
        channelPipeline.addLast(new ChannelHandler[]{sslHandler});
        channelPipeline.addLast(new ChannelHandler[]{new axi_0()});
        channelPipeline.addLast(new ChannelHandler[]{new LengthFieldBasedFrameDecoder(0x100000, 0, 4, -4, 4)});
        channelPipeline.addLast(hwo, (ChannelHandler)new axd_0());
        channelPipeline.addLast(new ChannelHandler[]{new axg_0()});
        channelPipeline.addLast(new ChannelHandler[]{new axf_0()});
        channelPipeline.addLast(new ChannelHandler[]{new axe_0()});
        channelPipeline.addLast(new ChannelHandler[]{new IdleStateHandler(0, 30, 0)});
        channelPipeline.addLast(new ChannelHandler[]{new aXk()});
        channelPipeline.addLast(hws, (ChannelHandler)new axj_0());
        channelPipeline.addLast(hwp, (ChannelHandler)new axh_0(this.hwt));
        channelPipeline.addLast(new ChannelHandler[]{new aXl()});
        channelPipeline.addLast(new ChannelHandler[]{new axt_0()});
        channelPipeline.addLast(new ChannelHandler[]{new axr_0()});
        channelPipeline.addLast(new ChannelHandler[]{new axn_0()});
        channelPipeline.addLast(new ChannelHandler[]{new axm_0()});
        channelPipeline.addLast(new ChannelHandler[]{new axo_0()});
        channelPipeline.addLast(new ChannelHandler[]{new axq_0()});
        channelPipeline.addLast(new ChannelHandler[]{new axp_0()});
    }

    private SslContext cXQ() {
        if (acm_2.gZ(this.hwu)) {
            return SslContextBuilder.forClient().build();
        }
        hwk.info((Object)("Insecure SSL context used for host " + this.hwu));
        return acm_2.bXS();
    }

    protected /* synthetic */ void initChannel(Channel channel) {
        this.a((SocketChannel)channel);
    }
}

