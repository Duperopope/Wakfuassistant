/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from aXc
 */
public class axc_0
extends MessageToMessageDecoder<al_1> {
    private static final Logger hwD = Logger.getLogger(axc_0.class);

    protected void a(ChannelHandlerContext channelHandlerContext, al_1 al_12, List<Object> list) {
        try {
            axc_0.a(al_12, list);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            hwD.error((Object)"[CHAT] Error when decoding message", (Throwable)invalidProtocolBufferException);
        }
    }

    private static void a(al_1 al_12, List<Object> list) {
        if (al_12.ea()) {
            ax_1 ax_12 = al_12.eb();
            ap_2 ap_22 = ax_12.eT();
            if (ax_12.fm() == aa_2.eg) {
                axc_0.a(ap_22, list);
            } else {
                hwD.info((Object)String.format("[CHAT] Error %s when receiving response to message id=%d", new Object[]{ax_12.fm(), ax_12.eR()}));
            }
        } else if (al_12.ed()) {
            axc_0.a(al_12.ee(), list);
        }
    }

    private static void a(ap_2 ap_22, List<Object> list) {
        if (ap_22.d() == 0) {
            return;
        }
        Optional<MessageLite> optional = ai_2.g(ap_22.d());
        if (optional.isEmpty()) {
            hwD.error((Object)("[CHAT] Unknown proto for id = " + ap_22.d()));
            return;
        }
        MessageLite messageLite = (MessageLite)optional.get().getParserForType().parseFrom(ap_22.eD());
        list.add(messageLite);
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (al_1)object, list);
    }
}

