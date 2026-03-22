/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLB
 */
public class alb_0
implements aqz_2 {
    protected int o;
    protected aLC[] eiA;

    public int d() {
        return this.o;
    }

    public aLC[] clR() {
        return this.eiA;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.eiA = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.eiA = new aLC[n];
        for (int i = 0; i < n; ++i) {
            this.eiA[i] = new aLC();
            this.eiA[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozR.d();
    }
}

