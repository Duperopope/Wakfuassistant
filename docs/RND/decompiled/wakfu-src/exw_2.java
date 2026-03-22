/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXw
 */
public final class exw_2
implements exn_1 {
    private final exa_1<exf_2> rGg;
    private final qi_0 rGh;

    public exw_2(exa_1<exf_2> exa_12, qi_0 qi_02) {
        this.rGg = exa_12;
        this.rGh = qi_02;
    }

    @Override
    public void b(exg_1 exg_12, int n) {
        if (this.rGh == null) {
            return;
        }
        exf_2 exf_22 = this.rGg.b(exx_2.rHn);
        if (exf_22 == null) {
            return;
        }
        eNd eNd2 = eqb_0.a(this.rGh);
        if (eNd2 == null) {
            return;
        }
        exx_2 exx_22 = eNd2.fAU();
        int n2 = this.rGg.c(exx_22);
        int n3 = this.rGg.c(exx_2.rHv);
        int n4 = n2 + n3;
        exf_22.op(n4);
    }

    public String toString() {
        return "StasisDmgRecomputeProcedure{m_manager=" + String.valueOf(this.rGg) + "}";
    }
}

