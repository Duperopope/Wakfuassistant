/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chy
 */
public class chy_0
implements aaq_2<cmE> {
    @Override
    public boolean a(cmE cmE2) {
        fiu_1.uCW.N("marketRetrieveLock", true);
        if (cmE2.evK().aHz()) {
            bNG.a(byh_1.lAz, cmE2.evL(), new Object[0]);
            return false;
        }
        cwl_1.eVs();
        if (fyw_0.gqw().to("marketPurchasedItemsDetailDialog")) {
            if (cmE2.evM() == 1) {
                cwl_1.eVl().S(bhz_2.dWn().dWD().GW(1), true);
            } else {
                cwl_1.eVl().S(0, true);
            }
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12615;
    }
}

