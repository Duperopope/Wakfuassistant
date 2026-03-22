/*
 * Decompiled with CFR 0.152.
 */
public class aOc {
    protected int o;
    protected aob_0[] eqs;
    protected int eqt;

    public int d() {
        return this.o;
    }

    public aob_0[] ctV() {
        return this.eqs;
    }

    public int ctW() {
        return this.eqt;
    }

    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.eqs = new aob_0[n];
        for (int i = 0; i < n; ++i) {
            this.eqs[i] = new aob_0();
            this.eqs[i].a(aqh_12);
        }
        this.eqt = aqh_12.bGI();
    }
}

