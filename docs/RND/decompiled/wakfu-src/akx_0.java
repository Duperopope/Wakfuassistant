/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aKX
 */
public class akx_0
implements aqz_2 {
    protected int o;
    protected String p;
    protected boolean egz;

    public int d() {
        return this.o;
    }

    public String getName() {
        return this.p;
    }

    public boolean cjL() {
        return this.egz;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.p = null;
        this.egz = false;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.p = aqh_12.bGL().intern();
        this.egz = aqh_12.bxv();
    }

    @Override
    public final int bGA() {
        return ewj_2.oys.d();
    }
}

