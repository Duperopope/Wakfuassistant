/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.handler.logging.LogLevel
 *  io.netty.handler.logging.LoggingHandler
 *  io.netty.util.concurrent.DefaultThreadFactory
 *  org.apache.log4j.Logger
 */
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.util.concurrent.DefaultThreadFactory;
import java.util.concurrent.ThreadFactory;
import org.apache.log4j.Logger;

/*
 * Renamed from aWX
 */
public class awx_0 {
    private static final Logger hwa = Logger.getLogger(awx_0.class);
    public static final String hwb = "inter-chat";
    private static final int hwc = 1000;
    private static final int hwd = 4000;
    private static final int hwe = 120000;
    public static final int hwf = 2;
    private final String hwg;
    private final int hwh;
    private final ChannelHandler hwi;

    public awx_0(ChannelHandler channelHandler, String string, int n) {
        this.hwg = string;
        this.hwh = n;
        this.hwi = channelHandler;
    }

    public boolean a(awy_0 awy_02) {
        NioEventLoopGroup nioEventLoopGroup = new NioEventLoopGroup(2, (ThreadFactory)new DefaultThreadFactory(hwb));
        Bootstrap bootstrap = new Bootstrap();
        ((Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)bootstrap.group((EventLoopGroup)nioEventLoopGroup)).remoteAddress(this.hwg, this.hwh).channel(NioSocketChannel.class)).option(ChannelOption.SO_KEEPALIVE, (Object)true)).handler((ChannelHandler)new LoggingHandler(LogLevel.INFO))).handler(this.hwi);
        axa_0 axa_02 = new axa_0(bootstrap);
        awy_02.a(axa_02);
        axb_0 axb_02 = new axb_0(bootstrap, axa_02);
        axb_02.bXW();
        return true;
    }

    public static int cXO() {
        return GC.q(1000, 4000);
    }

    public static int Af(int n) {
        return Math.min(n * 2, 120000);
    }
}

