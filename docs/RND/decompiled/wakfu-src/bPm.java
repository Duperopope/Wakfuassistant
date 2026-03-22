/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$partnerFinalizeTransactionCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.ShopApi$partnerFinalizeTransactionRequest
 *  com.ankama.haapi.client.okhttp.ankama.model.ShopBuyResult
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.PaymentApi
 *  com.ankama.shopi.client.model.CancelSteamWalletTransactionRequest
 *  com.ankama.shopi.client.model.FinalizeSteamWalletTransactionRequest
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.ShopApi;
import com.ankama.haapi.client.okhttp.ankama.model.ShopBuyResult;
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.PaymentApi;
import com.ankama.shopi.client.model.CancelSteamWalletTransactionRequest;
import com.ankama.shopi.client.model.FinalizeSteamWalletTransactionRequest;
import com.ankamagames.wakfu.client.WakfuClient;
import org.apache.log4j.Logger;

public class bPm {
    static final Logger kOE = Logger.getLogger(bPm.class);

    private bPm() {
    }

    public static void a(int n, boolean bl, bPl bPl2) {
        block7: {
            if (byj_2.eoR()) {
                PaymentApi paymentApi = new PaymentApi(WakfuClient.ceW());
                try {
                    if (bl) {
                        if (WakfuClient.dSV.cfl().cgf()) {
                            kOE.info((Object)("[SHOPI-DEBUG] finalizeSteamWalletTransaction for following order : " + n));
                        }
                        FinalizeSteamWalletTransactionRequest finalizeSteamWalletTransactionRequest = new FinalizeSteamWalletTransactionRequest().orderId(String.valueOf(n));
                        paymentApi.finalizeSteamWalletTransactionAsync(byj_2.eoS(), byj_2.lyN, finalizeSteamWalletTransactionRequest, (ApiCallback)new bPn(bPl2, n));
                        break block7;
                    }
                    if (WakfuClient.dSV.cfl().cgf()) {
                        kOE.info((Object)("[SHOPI-DEBUG] cancelSteamWalletTransaction for following order : " + n));
                    }
                    CancelSteamWalletTransactionRequest cancelSteamWalletTransactionRequest = new CancelSteamWalletTransactionRequest().orderId(String.valueOf(n));
                    paymentApi.cancelSteamWalletTransactionAsync(byj_2.eoS(), byj_2.lyN, cancelSteamWalletTransactionRequest, (ApiCallback)new bPo(bPl2, n));
                }
                catch (ApiException apiException) {
                    kOE.error((Object)"Following error occured during PartnerFinalizeTxn request", (Throwable)apiException);
                    bPl2.a(n, bPk.kOw);
                }
            } else {
                ShopApi.partnerFinalizeTransactionRequest partnerFinalizeTransactionRequest2 = ShopApi.partnerFinalizeTransactionRequest().orderId(Long.valueOf(n)).finalize(Boolean.valueOf(bl));
                ShopApi.partnerFinalizeTransactionCallback partnerFinalizeTransactionCallback2 = ShopApi.partnerFinalizeTransactionCallback().on200(apiResponse -> bPl2.b(n, ((ShopBuyResult)apiResponse.getData()).getBalance())).onDefault(apiResponse -> {
                    kOE.error((Object)("Error during PartnerFinalizeTxn request : " + (String)apiResponse.getData()));
                    bPl2.a(n, bPk.kOw);
                }).onException(throwable -> {
                    kOE.error((Object)"Error during PartnerFinalizeTxn request", throwable);
                    bPl2.a(n, bPk.kOw);
                });
                WakfuClient.ceU().sendAsync((ApiCallback.Request)partnerFinalizeTransactionRequest2, (ApiCallback.Callback)partnerFinalizeTransactionCallback2);
            }
        }
    }
}

