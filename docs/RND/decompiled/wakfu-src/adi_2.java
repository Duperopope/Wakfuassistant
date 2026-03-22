/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  org.apache.log4j.Logger
 */
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.apache.log4j.Logger;

/*
 * Renamed from aDi
 */
@ChannelHandler.Sharable
public class adi_2
extends ChannelInboundHandlerAdapter {
    private static final Logger dCS = Logger.getLogger(adi_2.class);

    private static String a(ChannelHandlerContext channelHandlerContext, String string) {
        String string2 = channelHandlerContext.channel().toString();
        return string2 + " " + string;
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        channelHandlerContext.fireChannelActive();
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        channelHandlerContext.fireChannelInactive();
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        dCS.error((Object)adi_2.a(channelHandlerContext, "Channel exception caught : " + throwable.getMessage()), throwable);
    }
}

