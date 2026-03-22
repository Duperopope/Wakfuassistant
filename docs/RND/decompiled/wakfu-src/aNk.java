/*
 * Decompiled with CFR 0.152.
 */
public class aNk
implements aqz_2 {
    protected int o;
    protected byte emX;
    protected aNl[] emY;

    public int d() {
        return this.o;
    }

    public byte cqv() {
        return this.emX;
    }

    public aNl[] cqw() {
        return this.emY;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.emX = 0;
        this.emY = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.emX = aqh_12.aTf();
        int n = aqh_12.bGI();
        this.emY = new aNl[n];
        for (int i = 0; i < n; ++i) {
            this.emY[i] = new aNl();
            this.emY[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAH.d();
    }
}

