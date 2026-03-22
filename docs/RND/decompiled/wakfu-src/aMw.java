/*
 * Decompiled with CFR 0.152.
 */
public class aMw
implements aqz_2 {
    protected int efP;
    protected short ekF;
    protected int ekG;
    protected int egx;
    protected aMx[] ekH;

    public int cjd() {
        return this.efP;
    }

    public short cnT() {
        return this.ekF;
    }

    public int bnd() {
        return this.ekG;
    }

    public int cjJ() {
        return this.egx;
    }

    public aMx[] cnU() {
        return this.ekH;
    }

    @Override
    public void reset() {
        this.efP = 0;
        this.ekF = 0;
        this.ekG = 0;
        this.egx = 0;
        this.ekH = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.efP = aqh_12.bGI();
        this.ekF = aqh_12.bGG();
        this.ekG = aqh_12.bGI();
        this.egx = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.ekH = new aMx[n];
        for (int i = 0; i < n; ++i) {
            this.ekH[i] = new aMx();
            this.ekH[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBh.d();
    }
}

