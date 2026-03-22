/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fxB
 */
public class fxb_0 {
    protected int o;
    protected fxa_0[] tBa;
    protected int eqt;

    public int d() {
        return this.o;
    }

    public fxa_0[] gpT() {
        return this.tBa;
    }

    public int ctW() {
        return this.eqt;
    }

    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.tBa = new fxa_0[n];
        for (int i = 0; i < n; ++i) {
            this.tBa[i] = new fxa_0();
            this.tBa[i].a(aqh_12);
        }
        this.eqt = aqh_12.bGI();
    }
}

