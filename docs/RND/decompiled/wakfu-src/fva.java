/*
 * Decompiled with CFR 0.152.
 */
public class fva
implements aqz_2 {
    protected int o;
    protected fvb_0[] tyU;
    protected byte tyV;

    public int d() {
        return this.o;
    }

    public fvb_0[] gnN() {
        return this.tyU;
    }

    public byte gnO() {
        return this.tyV;
    }

    public ewe_0 gnP() {
        return ewe_0.ew(this.tyV);
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tyU = null;
        this.tyV = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.tyU = new fvb_0[n];
        for (int i = 0; i < n; ++i) {
            this.tyU[i] = new fvb_0();
            this.tyU[i].a(aqh_12);
        }
        this.tyV = aqh_12.aTf();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozR.d();
    }
}

