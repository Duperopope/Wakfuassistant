/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.protobuf.MessageLite
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.codec.protobuf.ProtobufDecoder
 *  org.apache.log4j.Logger
 */
import com.google.gson.Gson;
import com.google.protobuf.MessageLite;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import java.nio.charset.StandardCharsets;
import org.apache.log4j.Logger;

/*
 * Renamed from aXh
 */
public class axh_0
extends SimpleChannelInboundHandler<ByteBuf> {
    private static final Logger hwE = Logger.getLogger(axh_0.class);
    private final awy_0 hwF;

    public axh_0(awy_0 awy_02) {
        this.hwF = awy_02;
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        String string = byteBuf.toString(StandardCharsets.UTF_8);
        axw_0 axw_02 = (axw_0)new Gson().fromJson(string, axw_0.class);
        if (axw_02.aGv()) {
            channelHandlerContext.pipeline().addAfter("SpinDecoder", "ProtobufDecoder", (ChannelHandler)new ProtobufDecoder((MessageLite)al_1.ej()));
            channelHandlerContext.pipeline().addAfter("ProtobufDecoder", "InterChatMessageDecoder", (ChannelHandler)new axc_0());
            channelHandlerContext.pipeline().remove("InterChatAvailabilityHandler");
            channelHandlerContext.pipeline().remove((ChannelHandler)this);
            this.hwF.b(channelHandlerContext);
            this.hwF.cXP();
            long l = aue_0.cVJ().cVO().xl();
            bi_1 bi_12 = bg_1.jD();
            bi_12.s(l);
            this.hwF.c((MessageLite)bi_12.jJ());
            bm_1 bm_12 = bk_2.jS();
            bm_12.t(l);
            bb_1 bb_12 = az_2.hk();
            bb_12.F(ewo_0.oBF.i(ewr_0.oCs));
            bm_12.a(bb_12);
            this.hwF.c((MessageLite)bm_12.jY());
        } else {
            hwE.error((Object)("[CHAT] Authentication failed error code=" + axw_02.cXX()));
        }
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (ByteBuf)object);
    }
}

