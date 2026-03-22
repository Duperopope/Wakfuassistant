/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from che
 */
public class che_0
implements aaq_2<clT> {
    @Override
    public boolean a(clT clT2) {
        fiu_1.uCW.N("marketRetrieveLock", true);
        if (clT2.evK().aHz()) {
            bNG.a(byh_1.lAz, clT2.evL(), new Object[0]);
            return false;
        }
        if (clT2.evK() == fiY.suz) {
            aPh.czg().iY(bNG.b(clT2.evL(), new Object[0]));
        }
        cwl_1.eVl().Q(bhz_2.dWn().dWB().GW(1), true);
        return false;
    }

    @Override
    public int bkq() {
        return 12269;
    }
}

