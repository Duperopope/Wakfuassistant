/*
 * Decompiled with CFR 0.152.
 */
public class fwE
implements aqz_2 {
    protected int o;
    protected byte emX;
    protected fwf_0[] tzS;

    public int d() {
        return this.o;
    }

    public byte cqv() {
        return this.emX;
    }

    public fwf_0[] goM() {
        return this.tzS;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.emX = 0;
        this.tzS = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.emX = aqh_12.aTf();
        int n = aqh_12.bGI();
        this.tzS = new fwf_0[n];
        for (int i = 0; i < n; ++i) {
            this.tzS[i] = new fwf_0();
            this.tzS[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAH.d();
    }
}

