/*
 * Decompiled with CFR 0.152.
 */
import java.awt.event.KeyEvent;
import java.util.Set;

/*
 * Renamed from bHm
 */
public class bhm_1
extends cck_2 {
    public static final bhm_1 jYL = new bhm_1();
    private static final Set<String> jYM = Set.of("marketDialog", "inventoryDialog", "marketConfirmPurchaseDialog", "marketFulfillOfferDialog");

    @Override
    protected Set<String> dve() {
        return jYM;
    }

    @Override
    protected String dvf() {
        return "marketWindow";
    }

    @Override
    protected boolean j(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 10) {
            return false;
        }
        if (this.g(keyEvent) || this.h(keyEvent) || this.i(keyEvent)) {
            return false;
        }
        if (cwl_1.eVz()) {
            aaw_1.bUq().h(new dae_0(18709));
            return true;
        }
        if (cwl_1.eVB()) {
            aaw_1.bUq().h(new dae_0(16917));
            return true;
        }
        if (fyw_0.gqw().to("marketConfirmPurchaseDialog")) {
            Object object = fse_1.gFu().vY("marketItemPurchase");
            if (object instanceof bhr_1) {
                bhr_1 bhr_12 = (bhr_1)object;
                cfp_1.confirmPurchase(null, bhr_12);
            }
            return true;
        }
        if (fyw_0.gqw().to("marketFulfillOfferDialog")) {
            cfp_1.confirmOfferFulfillment(null);
            return true;
        }
        return false;
    }
}

