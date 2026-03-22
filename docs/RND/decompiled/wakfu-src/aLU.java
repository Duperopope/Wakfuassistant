/*
 * Decompiled with CFR 0.152.
 */
public class aLU
implements aqz_2 {
    protected int o;
    protected String bfc;
    protected String bfb;
    protected String eik;
    protected aLV[] ejq;

    public int d() {
        return this.o;
    }

    public String cmG() {
        return this.bfc;
    }

    public String cmH() {
        return this.bfb;
    }

    public String clB() {
        return this.eik;
    }

    public aLV[] cmI() {
        return this.ejq;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.bfc = null;
        this.bfb = null;
        this.eik = null;
        this.ejq = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.bfc = aqh_12.bGL().intern();
        this.bfb = aqh_12.bGL().intern();
        this.eik = aqh_12.bGL().intern();
        int n = aqh_12.bGI();
        this.ejq = new aLV[n];
        for (int i = 0; i < n; ++i) {
            this.ejq[i] = new aLV();
            this.ejq[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyR.d();
    }
}

