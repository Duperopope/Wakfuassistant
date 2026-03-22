/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fxt
 */
public class fxt_0
implements aqz_2 {
    protected int epK;
    protected fxu[] tAV;
    protected fxv[] tAW;

    public int ctn() {
        return this.epK;
    }

    public fxu[] gpO() {
        return this.tAV;
    }

    public fxv[] gpP() {
        return this.tAW;
    }

    @Override
    public void reset() {
        this.epK = 0;
        this.tAV = null;
        this.tAW = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.epK = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.tAV = new fxu[n2];
        for (n = 0; n < n2; ++n) {
            this.tAV[n] = new fxu();
            this.tAV[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.tAW = new fxv[n];
        for (int i = 0; i < n; ++i) {
            this.tAW[i] = new fxv();
            this.tAW[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozv.d();
    }
}

