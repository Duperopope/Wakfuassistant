/*
 * Decompiled with CFR 0.152.
 */
public class fvr
implements aqz_2 {
    protected int o;
    protected String eik;
    protected fvs[] tzn;

    public int d() {
        return this.o;
    }

    public String clB() {
        return this.eik;
    }

    public fvs[] goh() {
        return this.tzn;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.eik = null;
        this.tzn = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        int n = aqh_12.bGI();
        this.tzn = new fvs[n];
        for (int i = 0; i < n; ++i) {
            this.tzn[i] = new fvs();
            this.tzn[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyR.d();
    }
}

