/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fxV
 */
public class fxv_0
implements aqz_2 {
    protected int o;
    protected int[] erx;
    protected String ery;

    public int d() {
        return this.o;
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
        this.erx = null;
        this.ery = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.erx = aqh_12.bGM();
        this.ery = aqh_12.bGL().intern();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozC.d();
    }
}

