/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.GameApi
 *  com.ankama.haapi.client.okhttp.ankama.api.GameApi$sendEventCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.GameApi$sendEventRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.GameApi;
import com.ankamagames.wakfu.client.WakfuClient;
import org.apache.log4j.Logger;

/*
 * Renamed from cbO
 */
public final class cbo_2 {
    private static final Logger lKW = Logger.getLogger(cbo_2.class);

    private cbo_2() {
    }

    public static void a(cbl_2 cbl_22, Object ... objectArray) {
        cbn_2 cbn_22 = cbp_2.b(cbl_22, objectArray);
        GameApi.sendEventRequest sendEventRequest2 = GameApi.sendEventRequest().game(Long.valueOf(cbn_22.esv())).sessionId(Long.valueOf(cbn_22.esx())).eventId(Long.valueOf(cbn_22.esw())).data(cbn_22.esy()).date(null);
        GameApi.sendEventCallback sendEventCallback2 = GameApi.sendEventCallback().on204(apiResponse -> lKW.debug((Object)("[" + apiResponse.getStatusCode() + "] Sent event " + cbn_22.esw() + " with result " + String.valueOf(apiResponse.getData())))).onDefault(apiResponse -> lKW.warn((Object)("[" + apiResponse.getStatusCode() + "] sent event " + cbn_22.esw() + " and received unexpected success code : " + (String)apiResponse.getData()))).onException(throwable -> lKW.warn((Object)("Unable to send event " + cbn_22.esw()), throwable));
        WakfuClient.ceU().sendAsync((ApiCallback.Request)sendEventRequest2, (ApiCallback.Callback)sendEventCallback2);
    }
}

