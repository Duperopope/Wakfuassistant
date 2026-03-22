/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/*
 * Renamed from aXg
 */
public class axg_0
extends MessageToByteEncoder<axz_0> {
    protected void a(ChannelHandlerContext channelHandlerContext, axz_0 axz_02, ByteBuf byteBuf) {
        switch (axz_02.aFW()) {
            case 0: {
                byte[] byArray = axz_02.cXY();
                if (byArray == null) {
                    return;
                }
                int n = 5 + byArray.length;
                byteBuf.ensureWritable(n);
                byteBuf.writeInt(n);
                byteBuf.writeByte(0);
                byteBuf.writeBytes(byArray);
                break;
            }
            case 1: {
                byteBuf.ensureWritable(5);
                byteBuf.writeInt(5);
                byteBuf.writeByte(1);
                break;
            }
            case 3: {
                byteBuf.ensureWritable(5);
                byteBuf.writeInt(5);
                byteBuf.writeByte(3);
                break;
            }
        }
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.a(channelHandlerContext, (axz_0)object, byteBuf);
    }
}

