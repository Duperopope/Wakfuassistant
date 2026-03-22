/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLl
 */
public class all_0
implements aqz_2 {
    protected int o;
    protected short aXy;
    protected alm_0[] ehL;

    public int d() {
        return this.o;
    }

    public short clb() {
        return this.aXy;
    }

    public alm_0[] clc() {
        return this.ehL;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.aXy = 0;
        this.ehL = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.aXy = aqh_12.bGG();
        int n = aqh_12.bGI();
        this.ehL = new alm_0[n];
        for (int i = 0; i < n; ++i) {
            this.ehL[i] = new alm_0();
            this.ehL[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyw.d();
    }
}

