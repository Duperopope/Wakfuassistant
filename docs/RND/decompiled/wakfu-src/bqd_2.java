/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.Order
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.Order;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bQd
 */
class bqd_2
implements ApiCallback<Void> {
    final /* synthetic */ Order kUj;
    final /* synthetic */ bqa_2 kUk;

    bqd_2(bqa_2 bqa_22, Order order) {
        this.kUk = bqa_22;
        this.kUj = order;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bpp_2.kSR.error((Object)"Following error occured during initializeSteamWalletTransaction request", (Throwable)apiException);
        this.kUk.kUg.kUe.a(this.kUk.kUg.kUd, "steamWalletTransaction" + n);
    }

    public void a(Void void_, int n, Map<String, List<String>> map) {
        this.kUk.kUg.kUe.kUc.kTH.put(this.kUj.getId(), this.kUk.kUg.kUe.kUb);
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Void)object, n, map);
    }
}

