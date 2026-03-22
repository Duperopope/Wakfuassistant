/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chk
 */
public class chk_0
implements aaq_2<cmb_0> {
    @Override
    public boolean a(cmb_0 cmb_02) {
        fiu_1.uCW.N("marketRetrieveLock", true);
        if (cmb_02.evK().aHz()) {
            bNG.a(byh_1.lAz, cmb_02.evL(), new Object[0]);
            return false;
        }
        if (cmb_02.evK() == fiY.suz) {
            aPh.czg().iY(bNG.b(cmb_02.evL(), new Object[0]));
        }
        cwl_1.eVs();
        if (fyw_0.gqw().to("marketSoldItemsDetailDialog")) {
            cwl_1.eVl().O(0, true);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12171;
    }
}

