/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.MessageLiteOrBuilder
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from Mp
 */
public class mp_2
extends MessageToMessageEncoder<MessageLiteOrBuilder> {
    private final HashMap<MessageLite, Long> aSf = new HashMap();

    public mp_2(Map<Long, MessageLite> map) {
        for (Map.Entry<Long, MessageLite> entry : map.entrySet()) {
            this.aSf.put(entry.getValue(), entry.getKey());
        }
    }

    protected void a(ChannelHandlerContext channelHandlerContext, MessageLiteOrBuilder messageLiteOrBuilder, List<Object> list) {
        MessageLite messageLite;
        if (!this.aSf.containsKey(messageLiteOrBuilder.getDefaultInstanceForType())) {
            throw new IllegalStateException("Trying to encode message which is not on defined protos : " + String.valueOf(messageLiteOrBuilder));
        }
        if (messageLiteOrBuilder instanceof MessageLite) {
            messageLite = (MessageLite)messageLiteOrBuilder;
        } else if (messageLiteOrBuilder instanceof MessageLite.Builder) {
            messageLite = ((MessageLite.Builder)messageLiteOrBuilder).build();
        } else {
            throw new IllegalStateException("Trying to encode message which is neither MessageLite nor MessageLite.Builder : " + String.valueOf(messageLiteOrBuilder));
        }
        byte[] byArray = messageLite.toByteArray();
        mm_2 mm_22 = mk_2.aUt().cP(this.aSf.get(messageLite.getDefaultInstanceForType())).eD(ByteString.copyFrom((byte[])byArray));
        mk_2 mk_22 = mm_22.aUz();
        list.add(mk_22);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (MessageLiteOrBuilder)object, list);
    }
}

