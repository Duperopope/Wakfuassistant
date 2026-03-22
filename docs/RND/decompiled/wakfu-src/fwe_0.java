/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fwe
 */
public class fwe_0
implements aqz_2 {
    protected int o;
    protected int elr;
    protected int els;
    protected short tzC;
    protected short tzD;
    protected short tzE;
    protected short tzF;
    protected int elt;
    protected fwf[] tzG;
    protected fwf[] tzH;
    protected fwh_0[] tzI;

    public int d() {
        return this.o;
    }

    public int blh() {
        return this.elr;
    }

    public int rI() {
        return this.els;
    }

    public short gow() {
        return this.tzC;
    }

    public short gox() {
        return this.tzD;
    }

    public short goy() {
        return this.tzE;
    }

    public short goz() {
        return this.tzF;
    }

    public int coK() {
        return this.elt;
    }

    public fwf[] goA() {
        return this.tzG;
    }

    public fwf[] goB() {
        return this.tzH;
    }

    public fwh_0[] goC() {
        return this.tzI;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.elr = 0;
        this.els = 0;
        this.tzC = 0;
        this.tzD = 0;
        this.tzE = 0;
        this.tzF = 0;
        this.elt = 0;
        this.tzG = null;
        this.tzH = null;
        this.tzI = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        this.o = aqh_12.bGI();
        this.elr = aqh_12.bGI();
        this.els = aqh_12.bGI();
        this.tzC = aqh_12.bGG();
        this.tzD = aqh_12.bGG();
        this.tzE = aqh_12.bGG();
        this.tzF = aqh_12.bGG();
        this.elt = aqh_12.bGI();
        int n3 = aqh_12.bGI();
        this.tzG = new fwf[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.tzG[n2] = new fwf();
            this.tzG[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.tzH = new fwf[n2];
        for (n = 0; n < n2; ++n) {
            this.tzH[n] = new fwf();
            this.tzH[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.tzI = new fwh_0[n];
        for (int i = 0; i < n; ++i) {
            this.tzI[i] = new fwh_0();
            this.tzI[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBe.d();
    }
}

