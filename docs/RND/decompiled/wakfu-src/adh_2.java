/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from aDh
 */
@ChannelHandler.Sharable
public class adh_2
extends MessageToByteEncoder<aam_2> {
    private static final Logger dCR = LoggerFactory.getLogger(adh_2.class);

    protected void a(ChannelHandlerContext channelHandlerContext, aam_2 aam_22, ByteBuf byteBuf) {
        if (!(aam_22 instanceof aai_2)) {
            dCR.error("Wrong message are provided to current {}, expected ? extends {} implement {} but receive {} without implementation of {}. WTF !", new Object[]{((Object)((Object)this)).getClass(), aam_2.class, aai_2.class, aam_22.getClass(), aai_2.class});
            return;
        }
        byte[] byArray = ((aai_2)((Object)aam_22)).aVX();
        hp_2.na(aam_22.d()).update(byArray.length);
        byteBuf.writeBytes(byArray);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.a(channelHandlerContext, (aam_2)object, byteBuf);
    }
}

