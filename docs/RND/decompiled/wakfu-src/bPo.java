/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import java.util.List;
import java.util.Map;

class bPo
implements ApiCallback<Void> {
    final /* synthetic */ bPl kOH;
    final /* synthetic */ int kOI;

    bPo(bPl bPl2, int n) {
        this.kOH = bPl2;
        this.kOI = n;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bPm.kOE.error((Object)"Following error occured during cancelSteamWalletTransaction request", (Throwable)apiException);
        this.kOH.a(this.kOI, bPk.kOw);
    }

    public void a(Void void_, int n, Map<String, List<String>> map) {
        this.kOH.B(this.kOI, false);
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Void)object, n, map);
    }
}

