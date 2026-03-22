/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;

/*
 * Renamed from aXd
 */
public class axd_0
extends ByteToMessageDecoder {
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        byte by = byteBuf.readByte();
        switch (by) {
            case 0: {
                list.add(byteBuf.readBytes(byteBuf.readableBytes()));
                break;
            }
            case 2: {
                list.add(new axy_0());
                break;
            }
        }
    }
}

