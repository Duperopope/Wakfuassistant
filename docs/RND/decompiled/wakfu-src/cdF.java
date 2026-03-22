/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ApiResponse
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$getAccessTokenFromAnkamaApiKeyCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$getAccessTokenFromAnkamaApiKeyRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.AccessToken
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ApiResponse;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.AccessToken;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.Date;
import java.util.function.Consumer;

class cdF
implements aaq_2<czi> {
    cdF() {
    }

    @Override
    public boolean a(czi czi2) {
        if (WakfuClient.dSV.cfl().cgg()) {
            cdw_0.lQO.info((Object)"[WEB-TOKEN-DEBUG] Received Haapi ApiKey !");
        }
        if (fse_1.gFu().dp("demo")) {
            return false;
        }
        String string = WakfuClient.cfc();
        WakfuClient.ceU().setApiKey(czi2.getKey());
        WakfuClient.ceU().setUserAgent(string);
        WakfuClient.ceV().setApiKey(czi2.getKey());
        WakfuClient.ceV().setUserAgent(string);
        if (WakfuClient.dSV.cfl().cgg()) {
            cdw_0.lQO.info((Object)("[WEB-TOKEN-DEBUG] Haapi ApiKey used : " + czi2.getKey() + " with following user agent : " + string));
        }
        ShopApi.getAccessTokenFromAnkamaApiKeyRequest getAccessTokenFromAnkamaApiKeyRequest2 = ShopApi.getAccessTokenFromAnkamaApiKeyRequest();
        Consumer<ApiResponse> consumer = apiResponse -> cdw_0.lQO.error((Object)String.format("Unexpected code received on apiKey conversion (code : %s, result : %s)", apiResponse.getStatusCode(), apiResponse));
        ShopApi.getAccessTokenFromAnkamaApiKeyCallback getAccessTokenFromAnkamaApiKeyCallback2 = ShopApi.getAccessTokenFromAnkamaApiKeyCallback().on200(apiResponse -> {
            WakfuClient.ceW().setBearerToken(((AccessToken)apiResponse.getData()).getToken());
            WakfuClient.ceW().setUserAgent(string);
            if (WakfuClient.dSV.cfl().cgg()) {
                cdw_0.lQO.info((Object)("[WEB-TOKEN-DEBUG] Shopi BearerToken used : " + ((AccessToken)apiResponse.getData()).getToken() + " with following user agent : " + string));
            }
        }).on401(consumer).on403(consumer).on500(consumer).onDefault(apiResponse -> cdw_0.lQO.error((Object)String.format("Unexpected code received on apiKey conversion (code : %s, result : %s)", apiResponse.getStatusCode(), apiResponse))).onException(throwable -> cdw_0.lQO.error((Object)"Following error occured on apiKey conversion", throwable));
        WakfuClient.ceU().sendAsync((ApiCallback.Request)getAccessTokenFromAnkamaApiKeyRequest2, (ApiCallback.Callback)getAccessTokenFromAnkamaApiKeyCallback2);
        cdw_0.eud();
        bPq.kPe.ng(czi2.eGa());
        bPq.kPe.nh(ewo_0.oBF.l(ewr_0.oEB));
        if (aue_0.cVJ().c(csm_1.eOv())) {
            bib_0.ilf.dqn();
        }
        long l = czi2.eFZ();
        uw_0 uw_02 = uw_0.g(new Date(l));
        uz_0 uz_02 = uw_02.l(uw_0.g(new Date()));
        long l2 = Math.abs(uz_02.bjS() * 1000L);
        abg_2.bUP().a(() -> {
            if (WakfuClient.dSV.cfl().cgg()) {
                cdw_0.lQO.info((Object)"[WEB-TOKEN-DEBUG] Send request for shopApiKey !");
            }
            aue_0.cVJ().etu().d(new cyl_0(aum_0.cWf().aUXX().aUP()));
        }, l2, 1);
        return false;
    }

    @Override
    public int bkq() {
        return 23259;
    }
}

