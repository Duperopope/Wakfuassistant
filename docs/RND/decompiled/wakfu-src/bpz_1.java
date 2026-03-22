/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.model.Cart
 *  com.ankama.shopi.client.model.CartPaymentModeList
 *  com.ankama.shopi.client.model.CreateOrderRequest
 *  com.ankama.shopi.client.model.PaymentRequestOneOf
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.model.Cart;
import com.ankama.shopi.client.model.CartPaymentModeList;
import com.ankama.shopi.client.model.CreateOrderRequest;
import com.ankama.shopi.client.model.PaymentRequestOneOf;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bPZ
 */
class bpz_1
implements ApiCallback<CartPaymentModeList> {
    final /* synthetic */ Cart kUd;
    final /* synthetic */ bpy_1 kUe;

    bpz_1(bpy_1 bpy_12, Cart cart) {
        this.kUe = bpy_12;
        this.kUd = cart;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bpp_2.kSR.error((Object)"Following error occured during listPaymentMode request", (Throwable)apiException);
        this.kUe.a(this.kUd, "listPaymentMode" + n);
    }

    public void a(CartPaymentModeList cartPaymentModeList, int n, Map<String, List<String>> map) {
        PaymentRequestOneOf paymentRequestOneOf = byj_2.a(cartPaymentModeList);
        if (paymentRequestOneOf == null) {
            bpp_2.kSR.warn((Object)String.format("No suitable payment methods found to pay this cart from client (In context of following cart : %s with following article : %s)", this.kUd.getId(), this.kUe.kUb.eid()));
            this.kUe.a(this.kUd, "noPaymentModeFound");
            return;
        }
        try {
            CreateOrderRequest createOrderRequest = new CreateOrderRequest().accountId(String.valueOf(aie_0.cfo().cVO().xl())).payment(paymentRequestOneOf);
            if (WakfuClient.dSV.cfl().cgf()) {
                bpp_2.kSR.info((Object)("[SHOPI-DEBUG] createOrder with following cart : \"" + this.kUd.getId() + "\" and following request : " + String.valueOf(createOrderRequest)));
            }
            this.kUe.kTY.createOrderAsync(this.kUe.kTZ, this.kUe.kUa, this.kUd.getId(), createOrderRequest, (ApiCallback)new bqa_2(this, paymentRequestOneOf));
        }
        catch (ApiException apiException) {
            bpp_2.kSR.error((Object)"Following error occured during createOrder request", (Throwable)apiException);
            this.kUe.a(this.kUd, "createOrderException");
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((CartPaymentModeList)object, n, map);
    }
}

