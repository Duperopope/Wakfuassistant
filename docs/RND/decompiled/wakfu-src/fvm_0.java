/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvM
 */
public class fvm_0
implements aqz_2 {
    protected int o;
    protected fvp_0[] tzu;
    protected fvd tyG;

    public int d() {
        return this.o;
    }

    public fvp_0[] goo() {
        return this.tzu;
    }

    public fvd gnz() {
        return this.tyG;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tzu = null;
        this.tyG = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.tzu = new fvp_0[n];
        for (int i = 0; i < n; ++i) {
            this.tzu[i] = new fvp_0();
            this.tzu[i].a(aqh_12);
        }
        if (aqh_12.aTf() != 0) {
            this.tyG = new fvd();
            this.tyG.a(aqh_12);
        } else {
            this.tyG = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyV.d();
    }
}

