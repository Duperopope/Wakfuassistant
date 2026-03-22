/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aNG
 */
public class ang_0
implements aqz_2 {
    protected int o;
    protected String eiI;

    public int d() {
        return this.o;
    }

    public String ajo() {
        return this.eiI;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.eiI = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eiI = aqh_12.bGL().intern();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozp.d();
    }
}

