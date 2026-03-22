/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from Mo
 */
public class mo_2
extends MessageToMessageDecoder<mk_2> {
    private final HashMap<Long, MessageLite> aSe;

    public mo_2(Map<Long, MessageLite> map) {
        this.aSe = new HashMap<Long, MessageLite>(map);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, mk_2 mk_22, List<Object> list) {
        MessageLite messageLite = this.aSe.get(mk_22.aUp());
        if (messageLite == null) {
            return;
        }
        MessageLite messageLite2 = messageLite.newBuilderForType().mergeFrom(mk_22.aUr()).build();
        list.add(messageLite2);
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (mk_2)object, list);
    }
}

