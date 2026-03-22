/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandlerContext
 */
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/*
 * Renamed from aCN
 */
public class acn_2 {
    private final ChannelHandlerContext dCb;

    public acn_2(ChannelHandlerContext channelHandlerContext) {
        this.dCb = channelHandlerContext;
    }

    public ChannelFuture bXT() {
        return this.dCb.close();
    }

    public boolean bSr() {
        return this.dCb.channel().isActive();
    }

    public <OutputMessage extends aam_2> void h(OutputMessage OutputMessage) {
        byte[] byArray = ((aai_2)((Object)OutputMessage)).aVX();
        this.dCb.writeAndFlush((Object)byArray);
        hp_2.na(OutputMessage.d()).update(byArray.length);
    }

    public ChannelHandlerContext bXU() {
        return this.dCb;
    }

    public InetAddress bXV() {
        InetSocketAddress inetSocketAddress = (InetSocketAddress)this.dCb.channel().remoteAddress();
        return inetSocketAddress.getAddress();
    }
}

