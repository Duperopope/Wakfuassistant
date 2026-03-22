/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  javax.inject.Inject
 *  org.apache.log4j.Logger
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import javax.inject.Inject;
import org.apache.log4j.Logger;

/*
 * Renamed from cAv
 */
final class cav_0
extends SimpleChannelInboundHandler<String> {
    private final Logger moJ = Logger.getLogger(cav_0.class);
    private final euA moK;

    @Inject
    cav_0(euA euA2) {
        super(true);
        this.moK = euA2;
    }

    protected void b(ChannelHandlerContext channelHandlerContext, String string) {
        Gson gson = new GsonBuilder().create();
        cag_0 cag_02 = (cag_0)gson.fromJson(string, cag_0.class);
        switch (cag_02.eGH()) {
            case moZ: {
                cad_0 cad_02 = (cad_0)gson.fromJson(string, cad_0.class);
                this.a(cad_02, channelHandlerContext);
                break;
            }
            case moY: {
                cah_0 cah_02 = (cah_0)gson.fromJson(string, cah_0.class);
                this.a(cah_02, channelHandlerContext);
                break;
            }
            case moX: {
                this.moJ.warn((Object)("Received message with id " + cag_02.getId() + " but it was ignored"));
            }
        }
    }

    private void a(cah_0 cah_02, ChannelHandlerContext channelHandlerContext) {
        this.moK.Oh(cah_02.eGI());
    }

    private void a(cad_0 cad_02, ChannelHandlerContext channelHandlerContext) {
        this.moJ.error((Object)("Error message received from updater: " + cad_02.getMessage() + " (type: " + cad_02.aeV() + ")"));
        channelHandlerContext.close();
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.b(channelHandlerContext, (String)object);
    }
}

