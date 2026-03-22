/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.MoneyApi
 *  com.ankama.haapi.client.okhttp.ankama.api.MoneyApi$ogrinsAmountCallback
 *  com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.MoneyApi;
import com.ankama.haapi.client.okhttp.ankama.model.MoneyBalance;
import com.ankamagames.wakfu.client.WakfuClient;
import org.apache.log4j.Logger;

/*
 * Renamed from bOP
 */
public final class bop_0 {
    private static final Logger kNM = Logger.getLogger(bop_0.class);

    private bop_0() {
    }

    public static void a(boo_0 boo_02) {
        MoneyApi.ogrinsAmountCallback ogrinsAmountCallback2 = MoneyApi.ogrinsAmountCallback().on200(apiResponse -> boo_02.IO(GC.A(((MoneyBalance)apiResponse.getData()).getAmount().floatValue()))).onDefault(apiResponse -> {
            kNM.warn((Object)("Error " + apiResponse.getStatusCode() + " while retrieving Ogrins amount : " + (String)apiResponse.getData()));
            boo_02.IO(0);
        }).onException(throwable -> {
            kNM.error(throwable);
            boo_02.IO(0);
        });
        WakfuClient.ceU().sendAsync((ApiCallback.Request)MoneyApi.ogrinsAmountRequest(), (ApiCallback.Callback)ogrinsAmountCallback2);
    }
}

