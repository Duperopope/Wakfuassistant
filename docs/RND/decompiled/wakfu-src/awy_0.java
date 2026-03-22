/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandlerContext
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aWY
 */
public class awy_0 {
    private ChannelHandlerContext dCb;
    private axa_0 hwj;

    @Nullable
    public ChannelFuture bXT() {
        if (this.hwj != null) {
            this.hwj.cXR();
        }
        if (this.dCb == null) {
            return null;
        }
        return this.dCb.close();
    }

    public boolean bSr() {
        if (this.dCb == null) {
            return false;
        }
        return this.dCb.channel().isActive();
    }

    public void c(@NotNull MessageLite messageLite) {
        if (this.dCb == null || !this.dCb.channel().isActive()) {
            return;
        }
        this.dCb.writeAndFlush((Object)messageLite);
    }

    public void cXP() {
        this.hwj.cXS();
    }

    public void beZ() {
        this.dCb = null;
        this.hwj = null;
    }

    public void b(ChannelHandlerContext channelHandlerContext) {
        this.dCb = channelHandlerContext;
    }

    public ChannelHandlerContext bXU() {
        return this.dCb;
    }

    void a(axa_0 axa_02) {
        this.hwj = axa_02;
    }
}

