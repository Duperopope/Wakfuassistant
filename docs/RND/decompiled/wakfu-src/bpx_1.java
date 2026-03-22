/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.Cart
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.Cart;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bPX
 */
class bpx_1
implements ApiCallback<Cart> {
    final /* synthetic */ bqm_2 kTX;

    bpx_1(bpp_2 bpp_22, bqm_2 bqm_22) {
        this.kTX = bqm_22;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bpp_2.kSR.error((Object)"Following error occured during createCart request", (Throwable)apiException);
        this.kTX.IT(n);
    }

    public void a(Cart cart, int n, Map<String, List<String>> map) {
        this.kTX.b(cart);
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Cart)object, n, map);
    }
}

