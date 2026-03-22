/*
 * Decompiled with CFR 0.152.
 */
public class fuD
implements aqz_2 {
    protected int o;
    protected int bIi;
    protected String[] atp;

    public int d() {
        return this.o;
    }

    public int aeV() {
        return this.bIi;
    }

    public String[] aHm() {
        return this.atp;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.bIi = 0;
        this.atp = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.bIi = aqh_12.bGI();
        this.atp = aqh_12.bGO();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAb.d();
    }
}

