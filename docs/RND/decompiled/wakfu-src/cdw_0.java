/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi$sendDeviceInfosCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.AccountApi$sendDeviceInfosRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.AccountApi;
import com.ankamagames.wakfu.client.WakfuClient;
import org.apache.log4j.Logger;

/*
 * Renamed from cdw
 */
public final class cdw_0
extends adj_1 {
    static final Logger lQO = Logger.getLogger(cdw_0.class);
    public static final cdw_0 lQP = new cdw_0();

    private cdw_0() {
        super(new cdx(), new cdA(), new cdb_0(), new cdF(), new cdy(), new cdC(), new cdz_0(), new cdg_0(), new cdD(), new cdE(), new ceq_0());
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    static void eud() {
        exu_0 exu_02 = exu_0.fft();
        long l = aup_0.cWj();
        String string = exu_02 == exu_0.oYs ? "ANKAMA" : "PARTNER";
        String string2 = "STANDALONE";
        String string3 = ady_1.bYZ().bZc();
        String string4 = "PC";
        String string5 = exu_02.bZc();
        String string6 = auw_0.cUT().orElseGet(() -> System.getProperty("user.name"));
        AccountApi.sendDeviceInfosRequest sendDeviceInfosRequest2 = AccountApi.sendDeviceInfosRequest().sessionId(Long.valueOf(l)).connectionType(string).clientType("STANDALONE").os(string3).device("PC").partner(string5).deviceUid(string6);
        AccountApi.sendDeviceInfosCallback sendDeviceInfosCallback2 = AccountApi.sendDeviceInfosCallback().on204(apiResponse -> lQO.info((Object)"Device information sent")).onDefault(apiResponse -> lQO.warn((Object)("Unable to send device information : " + (String)apiResponse.getData()))).onException(throwable -> lQO.warn((Object)"Unable to send device information", throwable));
        WakfuClient.ceU().sendAsync((ApiCallback.Request)sendDeviceInfosRequest2, (ApiCallback.Callback)sendDeviceInfosCallback2);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        exu_1.rJd.b(bit_1.kit);
    }
}

