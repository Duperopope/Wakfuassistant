/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import java.util.List;

/*
 * Renamed from cAy
 */
class cay_0
extends ChannelInitializer<SocketChannel> {
    final /* synthetic */ cax_0 moT;

    cay_0(cax_0 cax_02) {
        this.moT = cax_02;
    }

    public void a(SocketChannel socketChannel) {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        for (ChannelHandler channelHandler : (List)this.moT.moR.get()) {
            channelPipeline.addLast(new ChannelHandler[]{channelHandler});
        }
        channelPipeline.addLast(new ChannelHandler[]{this.moT.eGD()});
    }

    public /* synthetic */ void initChannel(Channel channel) {
        this.a((SocketChannel)channel);
    }
}

