/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.socket.SocketChannel
 *  io.netty.handler.codec.protobuf.ProtobufDecoder
 *  io.netty.handler.codec.protobuf.ProtobufEncoder
 *  io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder
 *  io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender
 */
import com.google.inject.Inject;
import com.google.protobuf.MessageLite;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import java.util.Set;

/*
 * Renamed from aCP
 */
public class acp_2
extends ChannelInitializer<SocketChannel> {
    private final mq_2 dCj;

    @Inject
    public acp_2(mq_2 mq_22) {
        this.dCj = mq_22;
    }

    public void a(SocketChannel socketChannel) {
        ChannelPipeline channelPipeline = socketChannel.pipeline();
        channelPipeline.addLast(new ChannelHandler[]{new ProtobufVarint32FrameDecoder()});
        channelPipeline.addLast(new ChannelHandler[]{new ProtobufDecoder((MessageLite)mk_2.aUv())});
        channelPipeline.addLast(new ChannelHandler[]{new mo_2(this.dCj.aUE())});
        channelPipeline.addLast(new ChannelHandler[]{new ProtobufVarint32LengthFieldPrepender()});
        channelPipeline.addLast(new ChannelHandler[]{new ProtobufEncoder()});
        channelPipeline.addLast(new ChannelHandler[]{new mp_2(this.dCj.aUE())});
        Set<ChannelHandler> set = this.dCj.aUF();
        for (ChannelHandler channelHandler : set) {
            channelPipeline.addLast(new ChannelHandler[]{channelHandler});
        }
    }

    public String toString() {
        return "ProtobufInitializer{m_provider=" + String.valueOf(this.dCj) + "}";
    }

    public /* synthetic */ void initChannel(Channel channel) {
        this.a((SocketChannel)channel);
    }
}

