/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.PaymentApi
 *  com.ankama.shopi.client.model.CreateAnkamaFreePaymentRequest
 *  com.ankama.shopi.client.model.CreateAnkamaOgrinePaymentRequest
 *  com.ankama.shopi.client.model.InitializeSteamWalletTransactionRequest
 *  com.ankama.shopi.client.model.Order
 *  com.ankama.shopi.client.model.PaymentRequestOneOf
 *  com.ankama.shopi.client.model.PaymentRequestOneOf$DiscriminatorEnum
 *  com.ankama.shopi.client.model.VirtualPaymentModeId
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.PaymentApi;
import com.ankama.shopi.client.model.CreateAnkamaFreePaymentRequest;
import com.ankama.shopi.client.model.CreateAnkamaOgrinePaymentRequest;
import com.ankama.shopi.client.model.InitializeSteamWalletTransactionRequest;
import com.ankama.shopi.client.model.Order;
import com.ankama.shopi.client.model.PaymentRequestOneOf;
import com.ankama.shopi.client.model.VirtualPaymentModeId;
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bQa
 */
class bqa_2
implements ApiCallback<Order> {
    final /* synthetic */ PaymentRequestOneOf kUf;
    final /* synthetic */ bpz_1 kUg;

    bqa_2(bpz_1 bpz_12, PaymentRequestOneOf paymentRequestOneOf) {
        this.kUg = bpz_12;
        this.kUf = paymentRequestOneOf;
    }

    public void onFailure(ApiException apiException, int n, Map<String, List<String>> map) {
        bpp_2.kSR.error((Object)"Following error occured during createOrder request", (Throwable)apiException);
        this.kUg.kUe.a(this.kUg.kUd, "createOrder" + n);
    }

    public void a(Order order, int n, Map<String, List<String>> map) {
        PaymentApi paymentApi = new PaymentApi(WakfuClient.ceW());
        if (this.kUf.getDiscriminator() == PaymentRequestOneOf.DiscriminatorEnum.FREE) {
            try {
                CreateAnkamaFreePaymentRequest createAnkamaFreePaymentRequest = new CreateAnkamaFreePaymentRequest().orderId(order.getId());
                if (WakfuClient.dSV.cfl().cgf()) {
                    bpp_2.kSR.info((Object)("[SHOPI-DEBUG] createAnkamaFreePayment with following request : " + String.valueOf(createAnkamaFreePaymentRequest)));
                }
                paymentApi.createAnkamaFreePaymentAsync(this.kUg.kUe.kTZ, this.kUg.kUe.kUa, createAnkamaFreePaymentRequest, (ApiCallback)new bqb_2(this));
            }
            catch (ApiException apiException) {
                bpp_2.kSR.error((Object)"Following error occured during createAnkamaOgrinePayment request", (Throwable)apiException);
                this.kUg.kUe.a(this.kUg.kUd, "freePaymentException");
            }
        } else if (this.kUf.getDiscriminator() == PaymentRequestOneOf.DiscriminatorEnum.VIRTUAL && this.kUf.getVirtualPaymentRequest() != null && this.kUf.getVirtualPaymentRequest().getPaymentModeId() == VirtualPaymentModeId.OG) {
            try {
                CreateAnkamaOgrinePaymentRequest createAnkamaOgrinePaymentRequest = new CreateAnkamaOgrinePaymentRequest().orderId(order.getId());
                if (WakfuClient.dSV.cfl().cgf()) {
                    bpp_2.kSR.info((Object)("[SHOPI-DEBUG] createAnkamaOgrinePayment with following request : " + String.valueOf(createAnkamaOgrinePaymentRequest)));
                }
                paymentApi.createAnkamaOgrinePaymentAsync(this.kUg.kUe.kTZ, this.kUg.kUe.kUa, createAnkamaOgrinePaymentRequest, (ApiCallback)new bqc_2(this));
            }
            catch (ApiException apiException) {
                bpp_2.kSR.error((Object)"Following error occured during createAnkamaOgrinePayment request", (Throwable)apiException);
                this.kUg.kUe.a(this.kUg.kUd, "ogrinePaymentException");
            }
        } else if (this.kUf.getDiscriminator() == PaymentRequestOneOf.DiscriminatorEnum.VIRTUAL && this.kUf.getVirtualPaymentRequest() != null && this.kUf.getVirtualPaymentRequest().getPaymentModeId() == VirtualPaymentModeId.SW) {
            try {
                InitializeSteamWalletTransactionRequest initializeSteamWalletTransactionRequest = new InitializeSteamWalletTransactionRequest().orderId(order.getId()).steamUserId(String.valueOf(bMX.kAi.efo().ConvertToUint64()));
                if (WakfuClient.dSV.cfl().cgf()) {
                    bpp_2.kSR.info((Object)("[SHOPI-DEBUG] initializeSteamWalletTransaction with following request : " + String.valueOf(initializeSteamWalletTransactionRequest)));
                }
                paymentApi.initializeSteamWalletTransactionAsync(this.kUg.kUe.kTZ, this.kUg.kUe.kUa, initializeSteamWalletTransactionRequest, (ApiCallback)new bqd_2(this, order));
            }
            catch (ApiException apiException) {
                bpp_2.kSR.error((Object)"Following error occured during initializeSteamWalletTransaction request", (Throwable)apiException);
                this.kUg.kUe.a(this.kUg.kUd, "steamWalletTransactionException");
            }
        } else {
            bpp_2.kSR.error((Object)String.format("Unmanaged payment finalization with %s", this.kUf));
            this.kUg.kUe.a(this.kUg.kUd, "unmanagedPaymentMode");
        }
    }

    public void onUploadProgress(long l, long l2, boolean bl) {
    }

    public void onDownloadProgress(long l, long l2, boolean bl) {
    }

    public /* synthetic */ void onSuccess(Object object, int n, Map map) {
        this.a((Order)object, n, map);
    }
}

