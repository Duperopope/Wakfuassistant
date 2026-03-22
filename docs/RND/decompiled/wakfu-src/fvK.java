/*
 * Decompiled with CFR 0.152.
 */
public class fvK
implements aqz_2 {
    protected int o;
    protected short ekp;
    protected short ekq;
    protected int[] ekr;

    public int d() {
        return this.o;
    }

    public short cnD() {
        return this.ekp;
    }

    public short cnE() {
        return this.ekq;
    }

    public int[] cnF() {
        return this.ekr;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ekp = 0;
        this.ekq = 0;
        this.ekr = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ekp = aqh_12.bGG();
        this.ekq = aqh_12.bGG();
        this.ekr = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAP.d();
    }
}

