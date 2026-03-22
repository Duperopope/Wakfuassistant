/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.AlmanaxApi
 *  com.ankama.haapi.client.okhttp.ankama.api.AlmanaxApi$getEventCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.AlmanaxApi$getEventRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.Almanax
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.TestOnly
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.AlmanaxApi;
import com.ankama.haapi.client.okhttp.ankama.model.Almanax;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

public class bQy {
    private static final Logger kVK = Logger.getLogger(beH.class);
    @NotNull
    public static bQy kVL = new bQy();
    private final Set<String> kVM = new HashSet<String>();

    @NotNull
    public static bQy ejB() {
        return kVL;
    }

    @TestOnly
    public static void a(@NotNull bQy bQy2) {
        kVL = bQy2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(String string, ux_0 ux_02) {
        if (beH.hNP.z(ux_02)) {
            return;
        }
        String string2 = new UT(TimeZone.getDefault()).format(ux_02.bjC());
        AlmanaxApi.getEventRequest getEventRequest2 = this.kVM;
        synchronized (getEventRequest2) {
            if (this.kVM.contains(string2)) {
                return;
            }
            this.kVM.add(string2);
        }
        getEventRequest2 = AlmanaxApi.getEventRequest().lang(string).date(string2);
        AlmanaxApi.getEventCallback getEventCallback2 = AlmanaxApi.getEventCallback().on200(apiResponse -> {
            beG beG2 = beG.a(((Almanax)apiResponse.getData()).getEvent());
            beI beI2 = beI.a(((Almanax)apiResponse.getData()).getMonth());
            beH.hNP.a(beG2, ux_02);
            beH.hNP.a(beI2, ux_02);
            Set<String> set = this.kVM;
            synchronized (set) {
                this.kVM.remove(string2);
            }
            kVK.debug((Object)String.format("Almanac of %s retrieved", string2));
        }).onDefault(apiResponse -> kVK.error((Object)("Unable to get Almanac entry : " + (String)apiResponse.getData()))).onException(throwable -> kVK.error((Object)"Unable to get Almanac entry", throwable));
        WakfuClient.ceU().sendAsync((ApiCallback.Request)getEventRequest2, (ApiCallback.Callback)getEventCallback2);
    }
}

