/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.shopi.client.model.Cart
 *  org.jetbrains.annotations.NotNull
 */
import com.ankama.shopi.client.model.Cart;
import com.ankamagames.wakfu.client.WakfuClient;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cYU
 */
class cyu_1
implements bqm_2 {
    final /* synthetic */ bpg_2 nZJ;
    final /* synthetic */ bpp_2 nZK;
    final /* synthetic */ bpt_1 nZL;
    final /* synthetic */ cyr_2 nZM;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cyu_1(cyr_2 cyr_22, bpg_2 bpg_22, bpp_2 bpp_22, bpt_1 bpt_12) {
        this.nZM = cyr_22;
        this.nZJ = bpg_22;
        this.nZK = bpp_22;
        this.nZL = bpt_12;
    }

    @Override
    public void b(@NotNull Cart cart) {
        euG.ors.a(cart.getId(), this.nZM.a(this.nZJ.getName(), this.nZJ.eid(), () -> {
            if (!WakfuClient.dSV.cfl().cgh()) {
                this.nZK.a(cart);
            }
        }));
    }

    @Override
    public void IT(int n) {
        cyr_2.nZq.error((Object)("[SHOP] Unable to create cart for following " + String.valueOf(this.nZL)));
    }

    @Override
    public void b(Exception exception) {
        cyr_2.nZq.error((Object)("[SHOP] Unable to create cart for following " + String.valueOf(this.nZL)));
    }
}

