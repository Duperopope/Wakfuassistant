/*
 * Decompiled with CFR 0.152.
 */
public class fxD {
    protected int eqv;
    protected byte eqq;
    protected byte eqw;
    protected fxE[] tBc;

    public int ctY() {
        return this.eqv;
    }

    public byte ctT() {
        return this.eqq;
    }

    public byte ctZ() {
        return this.eqw;
    }

    public fxE[] gpV() {
        return this.tBc;
    }

    public void a(aqh_1 aqh_12) {
        this.eqv = aqh_12.bGI();
        this.eqq = aqh_12.aTf();
        this.eqw = aqh_12.aTf();
        int n = aqh_12.bGI();
        this.tBc = new fxE[n];
        for (int i = 0; i < n; ++i) {
            this.tBc[i] = new fxE();
            this.tBc[i].a(aqh_12);
        }
    }
}

