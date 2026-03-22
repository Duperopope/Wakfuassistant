/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXv
 */
public final class exv_2
implements exn_1 {
    private final exh_1 rGf;

    public exv_2(exh_1 exh_12) {
        this.rGf = exh_12;
    }

    @Override
    public void b(exg_1 exg_12, int n) {
        exf_2 exf_22 = this.rGf.e(exx_2.rHH);
        exf_2 exf_23 = this.rGf.e(exx_2.rGl);
        if (exf_22 == null || exf_23 == null) {
            return;
        }
        if (exg_12 != exg_1.rFC) {
            return;
        }
        exv_2.a(exf_22, exf_23);
    }

    public static void a(pr_0 pr_02, pr_0 pr_03) {
        pr_02.ot(50 + pr_03.aYD() * 75);
    }
}

