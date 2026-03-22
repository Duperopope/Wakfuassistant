/*
 * Decompiled with CFR 0.152.
 */
public class aOw
implements aqz_2 {
    protected int o;
    protected int erv;
    protected String erw;
    protected int[] erx;
    protected String ery;

    public int d() {
        return this.o;
    }

    public int cuX() {
        return this.erv;
    }

    public String cuY() {
        return this.erw;
    }

    public int[] cuZ() {
        return this.erx;
    }

    public String cva() {
        return this.ery;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.erv = 0;
        this.erw = null;
        this.erx = null;
        this.ery = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.erv = aqh_12.bGI();
        this.erw = aqh_12.bGL().intern();
        this.erx = aqh_12.bGM();
        this.ery = aqh_12.bGL().intern();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozC.d();
    }
}

