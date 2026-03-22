/*
 * Decompiled with CFR 0.152.
 */
public class fwZ
implements aqz_2 {
    protected int o;
    protected int epa;
    protected int epb;

    public int d() {
        return this.o;
    }

    public int csE() {
        return this.epa;
    }

    public int csF() {
        return this.epb;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.epa = 0;
        this.epb = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.epa = aqh_12.bGI();
        this.epb = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozn.d();
    }
}

