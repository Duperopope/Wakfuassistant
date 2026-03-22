/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXt
 */
public final class ext_2
implements exn_1 {
    private final exh_1 rGb;
    private final float rGc;

    public ext_2(exh_1 exh_12, float f2) {
        this.rGb = exh_12;
        this.rGc = f2;
    }

    @Override
    public void b(exg_1 exg_12, int n) {
        exf_2 exf_22 = this.rGb.e(exx_2.rGi);
        exf_2 exf_23 = this.rGb.e(exx_2.rHp);
        exf_2 exf_24 = this.rGb.e(exx_2.rGQ);
        if (exf_22 == null || exf_24 == null || exf_23 == null) {
            return;
        }
        int n2 = exf_22.aYD() + exf_23.aYD();
        int n3 = (int)((float)n2 * this.rGc);
        int n4 = n2 - (exf_22.aYB() + exf_23.aYB());
        float f2 = Math.min((float)n4 / (float)n3 * 100.0f, 100.0f);
        exf_24.op((int)Math.ceil(f2));
    }
}

