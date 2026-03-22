/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvS
 */
public class fvs_0
implements aqz_2 {
    protected int efP;
    protected fvT[] tzx;

    public int cjd() {
        return this.efP;
    }

    public fvT[] gor() {
        return this.tzx;
    }

    @Override
    public void reset() {
        this.efP = 0;
        this.tzx = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.efP = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.tzx = new fvT[n];
        for (int i = 0; i < n; ++i) {
            this.tzx[i] = new fvT();
            this.tzx[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBh.d();
    }
}

