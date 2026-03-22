/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chv
 */
public class chv_0
implements aaq_2<cmx_0> {
    @Override
    public boolean a(cmx_0 cmx_02) {
        fiu_1.uCW.N("marketRetrieveLock", true);
        if (cmx_02.evK().aHz()) {
            bNG.a(byh_1.lAz, cmx_02.evL(), new Object[0]);
            return false;
        }
        if (cmx_02.evK() == fiY.suz) {
            aPh.czg().iY(bNG.b(cmx_02.evL(), new Object[0]));
        }
        cwl_1.eVs();
        if (fyw_0.gqw().to("marketExpiredOffersDetailDialog")) {
            cwl_1.eVl().R(0, true);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13423;
    }
}

