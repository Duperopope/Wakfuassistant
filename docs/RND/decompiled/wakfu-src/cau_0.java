/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  javax.inject.Inject
 */
import com.google.common.base.Preconditions;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;

/*
 * Renamed from cAu
 */
final class cau_0
extends SimpleChannelInboundHandler<String> {
    private final StringBuffer moI = new StringBuffer();

    @Inject
    cau_0() {
        super(true);
    }

    protected void b(ChannelHandlerContext channelHandlerContext, String string) {
        this.moI.append(string);
        this.c(channelHandlerContext);
    }

    private void c(ChannelHandlerContext channelHandlerContext) {
        String string = this.moI.toString();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            if (c2 == '{') {
                atomicInteger.incrementAndGet();
                continue;
            }
            if (c2 != '}' || atomicInteger.decrementAndGet() != 0) continue;
            this.moI.delete(0, i + 1);
            String string2 = string.substring(0, i + 1).trim();
            channelHandlerContext.fireChannelRead((Object)string2);
            this.c(channelHandlerContext);
            return;
        }
        Preconditions.checkState((atomicInteger.get() >= 0 ? 1 : 0) != 0, (Object)"Parsing error : more closing bracket than opening bracket");
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.b(channelHandlerContext, (String)object);
    }
}

