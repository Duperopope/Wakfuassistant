/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aNU
 */
public class anu_0
implements aqz_2 {
    protected int epK;
    protected aNV[] eqd;
    protected anw_0[] eqe;

    public int ctn() {
        return this.epK;
    }

    public aNV[] ctG() {
        return this.eqd;
    }

    public anw_0[] ctH() {
        return this.eqe;
    }

    @Override
    public void reset() {
        this.epK = 0;
        this.eqd = null;
        this.eqe = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.epK = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.eqd = new aNV[n2];
        for (n = 0; n < n2; ++n) {
            this.eqd[n] = new aNV();
            this.eqd[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.eqe = new anw_0[n];
        for (int i = 0; i < n; ++i) {
            this.eqe[i] = new anw_0();
            this.eqe[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozv.d();
    }
}

