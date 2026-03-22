/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi$createTokenCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi$createTokenRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.Token
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.AccountApi;
import com.ankama.haapi.client.okhttp.ankama.model.Token;
import com.ankamagames.wakfu.client.WakfuClient;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.apache.log4j.Logger;

/*
 * Renamed from aXj
 */
@ChannelHandler.Sharable
public class axj_0
extends SimpleChannelInboundHandler<axy_0> {
    private static final Logger hwG = Logger.getLogger(axj_0.class);
    public static final long hwH = 99L;
    public static final int hwI = 2;
    public static final int hwJ = 3;
    public static final String hwK = "WakfuUser";

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        channelHandlerContext.writeAndFlush((Object)new axz_0(1));
    }

    protected void a(ChannelHandlerContext channelHandlerContext, axy_0 axy_02) {
        AccountApi.createTokenRequest createTokenRequest2 = AccountApi.createTokenRequest().game(Long.valueOf(99L));
        AccountApi.createTokenCallback createTokenCallback2 = AccountApi.createTokenCallback().on200(apiResponse -> axj_0.a((Token)apiResponse.getData(), channelHandlerContext.channel())).onDefault(apiResponse -> hwG.error((Object)("[CHAT] Error " + apiResponse.getStatusCode() + " requesting Chat token : " + (String)apiResponse.getData()))).onException(throwable -> hwG.error((Object)"[CHAT] Error requesting Chat token", throwable));
        WakfuClient.ceU().sendAsync((ApiCallback.Request)createTokenRequest2, (ApiCallback.Callback)createTokenCallback2);
    }

    private static void a(Token token, Channel channel) {
        String string = token.getToken();
        axv_0 axv_02 = new axv_0();
        axv_02.kS(string);
        axv_02.Ag(2);
        axv_02.Ah(ady_1.bYZ().bZd());
        axv_02.Ai(3);
        axv_02.kT(auw_0.cUT().orElse(hwK));
        axv_02.kU("");
        channel.writeAndFlush((Object)axv_02);
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (axy_0)object);
    }
}

