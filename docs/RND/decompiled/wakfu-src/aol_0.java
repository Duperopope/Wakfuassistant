/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aOL
 */
public class aol_0
implements aqz_2 {
    protected int elt;
    protected aom_0[] eut;

    public int coK() {
        return this.elt;
    }

    public aom_0[] cyd() {
        return this.eut;
    }

    @Override
    public void reset() {
        this.elt = 0;
        this.eut = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.elt = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.eut = new aom_0[n];
        for (int i = 0; i < n; ++i) {
            this.eut[i] = new aom_0();
            this.eut[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozJ.d();
    }
}

