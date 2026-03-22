/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bRE
 */
public final class bre_2 {
    private static final bre_2 lbq = new bre_2();

    public static bre_2 elb() {
        return lbq;
    }

    private bre_2() {
    }

    public boolean a(flr_0 flr_02) {
        if (flr_02 == null) {
            return false;
        }
        int n = flr_02.WA(flr_02.Xt());
        return fkf_0.gcc().WJ(n).b(fkj_0.sAI);
    }

    public boolean b(flr_0 flr_02) {
        if (flr_02 == null) {
            return false;
        }
        int n = flr_02.WA(flr_02.Xt());
        return fkf_0.gcc().WJ(n).b(fkj_0.sAK);
    }

    public boolean a(fjn_0 fjn_02, int n) {
        fjo_0 fjo_02 = fjn_02.ems();
        int n2 = fjn_02.WA(fjo_02.Xt());
        fkd_0 fkd_02 = fkf_0.gcc().WJ(n2);
        return !fkd_02.b(fkj_0.sAQ) && !fjn_02.WB(n);
    }
}

