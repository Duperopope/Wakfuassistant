/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.ApiCallback
 *  com.ankama.shopi.client.ApiException
 *  com.ankama.shopi.client.api.CartApi
 *  com.ankama.shopi.client.model.Cart
 *  com.ankama.shopi.client.model.Language
 *  com.ankama.shopi.client.model.ShopKey
 *  org.jetbrains.annotations.NotNull
 */
import com.ankama.shopi.client.ApiCallback;
import com.ankama.shopi.client.ApiException;
import com.ankama.shopi.client.api.CartApi;
import com.ankama.shopi.client.model.Cart;
import com.ankama.shopi.client.model.Language;
import com.ankama.shopi.client.model.ShopKey;
import com.ankamagames.wakfu.client.WakfuClient;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bPY
 */
class bpy_1
implements bqm_2 {
    final /* synthetic */ CartApi kTY;
    final /* synthetic */ Language kTZ;
    final /* synthetic */ ShopKey kUa;
    final /* synthetic */ bpg_2 kUb;
    final /* synthetic */ bpp_2 kUc;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bpy_1(bpp_2 bpp_22, CartApi cartApi, Language language, ShopKey shopKey, bpg_2 bpg_22) {
        this.kUc = bpp_22;
        this.kTY = cartApi;
        this.kTZ = language;
        this.kUa = shopKey;
        this.kUb = bpg_22;
    }

    @Override
    public void b(@NotNull Cart cart) {
        try {
            if (WakfuClient.dSV.cfl().cgf()) {
                bpp_2.kSR.info((Object)("[SHOPI-DEBUG] listPaymentMode with following cart : \"" + cart.getId()));
            }
            this.kTY.listPaymentModeAsync(this.kTZ, this.kUa, cart.getId(), (ApiCallback)new bpz_1(this, cart));
        }
        catch (ApiException apiException) {
            bpp_2.kSR.error((Object)"Following error occured during listPaymentMode request", (Throwable)apiException);
            this.a(cart, "listPaymentModeException");
        }
    }

    @Override
    public void IT(int n) {
        this.kUc.nu("cartCreation" + n);
    }

    @Override
    public void b(Exception exception) {
        this.kUc.nu("cartCreationException");
    }

    void a(@NotNull Cart cart, String string) {
        if (!WakfuClient.dSV.cfl().cgh()) {
            this.kUc.a(this.kTY, this.kTZ, this.kUa, cart);
        }
        this.kUc.nu(string);
    }
}

