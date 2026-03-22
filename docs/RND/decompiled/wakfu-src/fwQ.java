/*
 * Decompiled with CFR 0.152.
 */
public class fwQ
implements aqz_2 {
    protected int o;
    protected int tAv;
    protected int ely;
    protected byte tAw;
    protected fwR[] tAx;

    public int d() {
        return this.o;
    }

    public int gpp() {
        return this.tAv;
    }

    public int coQ() {
        return this.ely;
    }

    public byte gpq() {
        return this.tAw;
    }

    public fwR[] gpr() {
        return this.tAx;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tAv = 0;
        this.ely = 0;
        this.tAw = 0;
        this.tAx = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.tAv = aqh_12.bGI();
        this.ely = aqh_12.bGI();
        this.tAw = aqh_12.aTf();
        int n = aqh_12.bGI();
        this.tAx = new fwR[n];
        for (int i = 0; i < n; ++i) {
            this.tAx[i] = new fwR();
            this.tAx[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozh.d();
    }
}

