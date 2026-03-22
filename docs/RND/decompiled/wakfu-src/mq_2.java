/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.ChannelHandler
 */
import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandler;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from Mq
 */
public interface mq_2 {
    public Map<Long, MessageLite> aUE();

    public Set<ChannelHandler> aUF();
}

