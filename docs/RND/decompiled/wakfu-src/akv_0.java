/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aKV
 */
public class akv_0
implements aqz_2 {
    protected int o;
    protected akw_0[] egy;

    public int d() {
        return this.o;
    }

    public akw_0[] cjK() {
        return this.egy;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.egy = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.egy = new akw_0[n];
        for (int i = 0; i < n; ++i) {
            this.egy[i] = new akw_0();
            this.egy[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAz.d();
    }
}

