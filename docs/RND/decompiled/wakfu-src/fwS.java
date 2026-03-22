/*
 * Decompiled with CFR 0.152.
 */
public class fwS
implements aqz_2 {
    protected int o;
    protected boolean tAz;
    protected acc_1[] tAA;
    protected acc_1[] tAB;
    protected acc_1[] tAC;

    public int d() {
        return this.o;
    }

    public boolean fLf() {
        return this.tAz;
    }

    public acc_1[] gpt() {
        return this.tAA;
    }

    public acc_1[] gpu() {
        return this.tAB;
    }

    public acc_1[] gpv() {
        return this.tAC;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tAz = false;
        this.tAA = null;
        this.tAB = null;
        this.tAC = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        this.o = aqh_12.bGI();
        this.tAz = aqh_12.bxv();
        int n3 = aqh_12.bGI();
        this.tAA = new acc_1[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.tAA[n2] = new acc_1(aqh_12.bGI(), aqh_12.bGI());
        }
        n2 = aqh_12.bGI();
        this.tAB = new acc_1[n2];
        for (n = 0; n < n2; ++n) {
            this.tAB[n] = new acc_1(aqh_12.bGI(), aqh_12.bGI());
        }
        n = aqh_12.bGI();
        this.tAC = new acc_1[n];
        for (int i = 0; i < n; ++i) {
            this.tAC[i] = new acc_1(aqh_12.bGI(), aqh_12.bGI());
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozi.d();
    }
}

