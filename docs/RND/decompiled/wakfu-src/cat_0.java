/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 */
import com.google.gson.Gson;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/*
 * Renamed from cAt
 */
final class cat_0
extends ChannelInboundHandlerAdapter {
    cat_0() {
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        channelHandlerContext.writeAndFlush((Object)new Gson().toJson((Object)cae_0.eGF()));
        super.channelActive(channelHandlerContext);
    }
}

