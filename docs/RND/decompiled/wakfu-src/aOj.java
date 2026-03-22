/*
 * Decompiled with CFR 0.152.
 */
public class aOj
implements aqz_2 {
    protected int o;
    protected aok_0[] eqC;

    public int d() {
        return this.o;
    }

    public aok_0[] cue() {
        return this.eqC;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.eqC = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.eqC = new aok_0[n];
        for (int i = 0; i < n; ++i) {
            this.eqC[i] = new aok_0();
            this.eqC[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBm.d();
    }
}

