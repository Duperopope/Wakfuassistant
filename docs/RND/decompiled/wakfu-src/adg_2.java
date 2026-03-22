/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/*
 * Renamed from aDg
 */
@ChannelHandler.Sharable
public class adg_2
extends MessageToByteEncoder<byte[]> {
    protected void a(ChannelHandlerContext channelHandlerContext, byte[] byArray, ByteBuf byteBuf) {
        byteBuf.writeBytes(byArray);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.a(channelHandlerContext, (byte[])object, byteBuf);
    }
}

