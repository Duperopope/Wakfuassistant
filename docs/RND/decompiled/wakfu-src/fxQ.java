/*
 * Decompiled with CFR 0.152.
 */
public class fxQ {
    protected int cxt;
    protected fxr_0[] tBm;
    protected int tBn;
    protected fxS[] tBo;

    public int wp() {
        return this.cxt;
    }

    public fxr_0[] gqe() {
        return this.tBm;
    }

    public int gqf() {
        return this.tBn;
    }

    public fxS[] gqg() {
        return this.tBo;
    }

    public void a(aqh_1 aqh_12) {
        int n;
        this.cxt = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.tBm = new fxr_0[n2];
        for (n = 0; n < n2; ++n) {
            this.tBm[n] = new fxr_0();
            this.tBm[n].a(aqh_12);
        }
        this.tBn = aqh_12.bGI();
        n = aqh_12.bGI();
        this.tBo = new fxS[n];
        for (int i = 0; i < n; ++i) {
            this.tBo[i] = new fxS();
            this.tBo[i].a(aqh_12);
        }
    }
}

