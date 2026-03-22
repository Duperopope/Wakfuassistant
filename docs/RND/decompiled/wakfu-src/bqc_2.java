/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.AnkamaOgrinePayment
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.AnkamaOgrinePayment;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bQc
 */
class bqc_2
implements ApiCallback<AnkamaOgrinePayment> {
    final /* synthetic */ bqa_2 kUi;

    bqc_2(bqa_2 bqa_22) {
        this.kUi = bqa_22;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bpp_2.kSR.error((Object)"Following error occured during createAnkamaOgrinePayment request", (Throwable)apiException);
        this.kUi.kUg.kUe.a(this.kUi.kUg.kUd, "ogrinePayment" + n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(AnkamaOgrinePayment ankamaOgrinePayment, int n, Map<String, List<String>> map) {
        try {
            this.kUi.kUg.kUe.kUc.d(this.kUi.kUg.kUe.kUb);
            this.kUi.kUg.kUe.kUc.a(this.kUi.kUf);
            this.kUi.kUg.kUe.kUc.a(this.kUi.kUg.kUe.kUb);
        }
        catch (Exception exception) {
            bpp_2.kSR.error((Object)"Following error occured during createAnkamaOgrinePayment request", (Throwable)exception);
        }
        finally {
            this.kUi.kUg.kUe.kUc.eje();
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((AnkamaOgrinePayment)object, n, map);
    }
}

