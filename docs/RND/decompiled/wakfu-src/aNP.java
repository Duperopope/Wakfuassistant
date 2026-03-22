/*
 * Decompiled with CFR 0.152.
 */
public class aNP
implements aqz_2 {
    protected int o;
    protected int epc;
    protected int ciZ;
    protected int epJ;

    public int d() {
        return this.o;
    }

    public int AK() {
        return this.epc;
    }

    public int aVt() {
        return this.ciZ;
    }

    public int ctm() {
        return this.epJ;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.epc = 0;
        this.ciZ = 0;
        this.epJ = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.epc = aqh_12.bGI();
        this.ciZ = aqh_12.bGI();
        this.epJ = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oBd.d();
    }
}

