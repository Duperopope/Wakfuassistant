/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.ssl.SslContext
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.ssl.SslContext;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/*
 * Renamed from aCO
 */
public class aco_2
extends ChannelInitializer<SocketChannel> {
    private static final adi_2 dCc = new adi_2();
    private static final adh_2 dCd = new adh_2();
    private static final adg_2 dCe = new adg_2();
    private final adc_2 dCf;
    private final Supplier<adj_2> dCg;
    private final SslContext dCh;
    private final List<aav_1<?>> dCi = new ArrayList();

    public aco_2(adc_2 adc_22, Supplier<adj_2> supplier, SslContext sslContext) {
        this.dCf = adc_22;
        this.dCg = supplier;
        this.dCh = sslContext;
    }

    public void a(aav_1<?> aav_12) {
        this.dCi.add(aav_12);
    }

    public void a(SocketChannel socketChannel) {
        Object object;
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        if (this.dCh != null) {
            object = this.dCh.newHandler(socketChannel.alloc());
            channelPipeline.addLast(new ChannelHandler[]{object});
        }
        object = new adb_2(this.dCf, this.dCi);
        channelPipeline.addLast(new ChannelHandler[]{object});
        channelPipeline.addLast(new ChannelHandler[]{dCe});
        channelPipeline.addLast(new ChannelHandler[]{dCd});
        adj_2 adj_22 = this.dCg.get();
        channelPipeline.addLast(new ChannelHandler[]{dCc});
        channelPipeline.addLast(new ChannelHandler[]{adj_22});
    }

    public String toString() {
        return "ServerInitializer{m_decoders=" + this.dCi.size() + "}";
    }

    public /* synthetic */ void initChannel(Channel channel) {
        this.a((SocketChannel)channel);
    }
}

