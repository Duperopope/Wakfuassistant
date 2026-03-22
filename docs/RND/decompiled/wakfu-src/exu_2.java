/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXu
 */
public final class exu_2
implements exn_1 {
    private final exa_1<exf_2> rGd;
    private final qi_0 rGe;

    public exu_2(exa_1<exf_2> exa_12, qi_0 qi_02) {
        this.rGd = exa_12;
        this.rGe = qi_02;
    }

    @Override
    public void b(exg_1 exg_12, int n) {
        if (this.rGe == null) {
            return;
        }
        exf_2 exf_22 = this.rGd.b(exx_2.rHF);
        if (exf_22 == null) {
            return;
        }
        eNd eNd2 = eqb_0.a(this.rGe);
        if (eNd2 == null) {
            return;
        }
        exx_2 exx_22 = eNd2.fAU();
        int n2 = this.rGd.c(exx_22);
        int n3 = this.rGd.c(exx_2.rHE);
        int n4 = n2 + n3;
        exf_22.op(n4);
    }

    public String toString() {
        return "LightDmgRecomputeProcedure{m_manager=" + String.valueOf(this.rGd) + "}";
    }
}

