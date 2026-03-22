/*
 * Decompiled with CFR 0.152.
 */
public class fuT
implements aqz_2 {
    protected int o;
    protected int tyQ;
    protected acc_1[] tyR;
    protected acc_1[] tyS;
    protected int[] egL;

    public int d() {
        return this.o;
    }

    public int gnJ() {
        return this.tyQ;
    }

    public acc_1[] gnK() {
        return this.tyR;
    }

    public acc_1[] gnL() {
        return this.tyS;
    }

    public int[] cjX() {
        return this.egL;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tyQ = 0;
        this.tyR = null;
        this.tyS = null;
        this.egL = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.tyQ = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.tyR = new acc_1[n2];
        for (n = 0; n < n2; ++n) {
            this.tyR[n] = new acc_1(aqh_12.bGI(), aqh_12.bGI());
        }
        n = aqh_12.bGI();
        this.tyS = new acc_1[n];
        for (int i = 0; i < n; ++i) {
            this.tyS[i] = new acc_1(aqh_12.bGI(), aqh_12.bGI());
        }
        this.egL = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyA.d();
    }
}

