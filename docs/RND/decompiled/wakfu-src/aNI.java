/*
 * Decompiled with CFR 0.152.
 */
public class aNI
implements aqz_2 {
    protected int o;
    protected float epy;
    protected String eik;
    protected int epz;

    public int d() {
        return this.o;
    }

    public float ctb() {
        return this.epy;
    }

    public String clB() {
        return this.eik;
    }

    public int ctc() {
        return this.epz;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.epy = 0.0f;
        this.eik = null;
        this.epz = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.epy = aqh_12.bGH();
        this.eik = aqh_12.bGL().intern();
        this.epz = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozr.d();
    }
}

