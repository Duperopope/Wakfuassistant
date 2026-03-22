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

class bPn
implements ApiCallback<Void> {
    final /* synthetic */ bPl kOF;
    final /* synthetic */ int kOG;

    bPn(bPl bPl2, int n) {
        this.kOF = bPl2;
        this.kOG = n;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bPm.kOE.error((Object)"Following error occured during finalizeSteamWalletTransaction request", (Throwable)apiException);
        this.kOF.a(this.kOG, bPk.kOw);
    }

    public void a(Void void_, int n, Map<String, List<String>> map) {
        this.kOF.B(this.kOG, true);
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Void)object, n, map);
    }
}

