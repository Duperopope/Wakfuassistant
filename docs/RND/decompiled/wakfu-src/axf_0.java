/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;

/*
 * Renamed from aXf
 */
public class axf_0
extends MessageToMessageEncoder<MessageLite> {
    protected void a(ChannelHandlerContext channelHandlerContext, MessageLite messageLite, List<Object> list) {
        ar_2 ar_22 = ap_2.eF();
        ar_22.w(ai_2.a(messageLite.getDefaultInstanceForType()));
        ar_22.H(messageLite.toByteString());
        av_1 av_12 = at_1.eW();
        av_12.x(Math.abs(Long.valueOf(aym_2.bSE()).intValue()));
        av_12.b(ar_22);
        an_2 an_22 = al_1.eh();
        an_22.a(av_12);
        axz_0 axz_02 = new axz_0(0);
        axz_02.dQ(an_22.eo().toByteArray());
        list.add(axz_02);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (MessageLite)object, list);
    }
}

