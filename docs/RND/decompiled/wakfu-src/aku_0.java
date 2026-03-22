/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aKU
 */
public class aku_0
implements aqz_2 {
    protected int o;
    protected int egx;
    protected String bds;

    public int d() {
        return this.o;
    }

    public int cjJ() {
        return this.egx;
    }

    public String aXE() {
        return this.bds;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.egx = 0;
        this.bds = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.egx = aqh_12.bGI();
        this.bds = aqh_12.bGL().intern();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyt.d();
    }
}

