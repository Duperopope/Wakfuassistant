/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
import com.google.gson.Gson;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

/*
 * Renamed from aXe
 */
public class axe_0
extends MessageToMessageEncoder<axv_0> {
    protected void a(ChannelHandlerContext channelHandlerContext, axv_0 axv_02, List<Object> list) {
        String string = new Gson().toJson((Object)axv_02);
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        axz_0 axz_02 = new axz_0(0);
        axz_02.dQ(byArray);
        list.add(axz_02);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (axv_0)object, list);
    }
}

