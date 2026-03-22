/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.AnkamaFreePayment
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.AnkamaFreePayment;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bQb
 */
class bqb_2
implements ApiCallback<AnkamaFreePayment> {
    final /* synthetic */ bqa_2 kUh;

    bqb_2(bqa_2 bqa_22) {
        this.kUh = bqa_22;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bpp_2.kSR.error((Object)"Following error occured during createAnkamaOgrinePayment request", (Throwable)apiException);
        this.kUh.kUg.kUe.a(this.kUh.kUg.kUd, "freePayment" + n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(AnkamaFreePayment ankamaFreePayment, int n, Map<String, List<String>> map) {
        try {
            this.kUh.kUg.kUe.kUc.d(this.kUh.kUg.kUe.kUb);
            this.kUh.kUg.kUe.kUc.a(this.kUh.kUg.kUe.kUb);
        }
        catch (Exception exception) {
            bpp_2.kSR.error((Object)"Following error occured during createAnkamaOgrinePayment request", (Throwable)exception);
        }
        finally {
            this.kUh.kUg.kUe.kUc.eje();
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((AnkamaFreePayment)object, n, map);
    }
}

