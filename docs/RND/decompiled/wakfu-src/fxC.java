/*
 * Decompiled with CFR 0.152.
 */
public class fxC
implements aqz_2 {
    protected int o;
    protected fxD[] tBb;

    public int d() {
        return this.o;
    }

    public fxD[] gpU() {
        return this.tBb;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tBb = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.tBb = new fxD[n];
        for (int i = 0; i < n; ++i) {
            this.tBb[i] = new fxD();
            this.tBb[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBo.d();
    }
}

