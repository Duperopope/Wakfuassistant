/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chw
 */
public class chw_0
implements aaq_2<cma_0> {
    @Override
    public boolean a(cma_0 cma_02) {
        fiu_1.uCW.N("marketRetrieveLock", true);
        if (cma_02.evK().aHz()) {
            bNG.a(byh_1.lAz, cma_02.evL(), new Object[0]);
            return false;
        }
        cwl_1.eVs();
        if (fyw_0.gqw().to("marketExpiredEntriesDetailDialog")) {
            if (cma_02.evM() == 1) {
                cwl_1.eVl().P(bhz_2.dWn().dWA().GW(1), true);
            } else {
                cwl_1.eVl().P(0, true);
            }
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12529;
    }
}

