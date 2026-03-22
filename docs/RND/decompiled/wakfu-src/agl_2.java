/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aGl
 */
public class agl_2 {
    private final afx_1 dKL;
    private final String dKM;
    private final afq_2[] dKN;
    private boolean dKO;

    public agl_2(afx_1 afx_12, String string, afq_2[] afq_2Array, boolean bl) {
        this.dKL = afx_12;
        this.dKM = string;
        this.dKN = afq_2Array;
        this.dKO = bl;
    }

    public boolean cbs() {
        return this.dKO;
    }

    public int cbt() {
        return this.dKL.caw();
    }

    public void dN(boolean bl) {
        this.dKO = bl;
    }

    public boolean a(agj_2 agj_22) {
        this.dKL.a(this.dKM, this.dKN, agj_22.cbr());
        return false;
    }
}

