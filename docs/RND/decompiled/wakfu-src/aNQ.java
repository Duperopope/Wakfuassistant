/*
 * Decompiled with CFR 0.152.
 */
public class aNQ
implements aqz_2 {
    protected int epK;
    protected int ely;
    protected int epL;
    protected int epM;
    protected int epN;
    protected int epO;
    protected int epP;
    protected int epQ;
    protected int epR;
    protected int epS;
    protected int epT;
    protected int epU;
    protected short egr;
    protected int[] epV;
    protected ant_0[] epW;
    protected anr_0[] epX;
    protected aNS[] epY;

    public int ctn() {
        return this.epK;
    }

    public int coQ() {
        return this.ely;
    }

    public int cto() {
        return this.epL;
    }

    public int ctp() {
        return this.epM;
    }

    public int ctq() {
        return this.epN;
    }

    public int ctr() {
        return this.epO;
    }

    public int cts() {
        return this.epP;
    }

    public int Xt() {
        return this.epQ;
    }

    public int ctt() {
        return this.epR;
    }

    public int ctu() {
        return this.epS;
    }

    public int ctv() {
        return this.epT;
    }

    public int ctw() {
        return this.epU;
    }

    public short cjD() {
        return this.egr;
    }

    public int[] ctx() {
        return this.epV;
    }

    public ant_0[] cty() {
        return this.epW;
    }

    public anr_0[] ctz() {
        return this.epX;
    }

    public aNS[] ctA() {
        return this.epY;
    }

    @Override
    public void reset() {
        this.epK = 0;
        this.ely = 0;
        this.epL = 0;
        this.epM = 0;
        this.epN = 0;
        this.epO = 0;
        this.epP = 0;
        this.epQ = 0;
        this.epR = 0;
        this.epS = 0;
        this.epT = 0;
        this.epU = 0;
        this.egr = 0;
        this.epV = null;
        this.epW = null;
        this.epX = null;
        this.epY = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        this.epK = aqh_12.bGI();
        this.ely = aqh_12.bGI();
        this.epL = aqh_12.bGI();
        this.epM = aqh_12.bGI();
        this.epN = aqh_12.bGI();
        this.epO = aqh_12.bGI();
        this.epP = aqh_12.bGI();
        this.epQ = aqh_12.bGI();
        this.epR = aqh_12.bGI();
        this.epS = aqh_12.bGI();
        this.epT = aqh_12.bGI();
        this.epU = aqh_12.bGI();
        this.egr = aqh_12.bGG();
        this.epV = aqh_12.bGM();
        int n3 = aqh_12.bGI();
        this.epW = new ant_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.epW[n2] = new ant_0();
            this.epW[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.epX = new anr_0[n2];
        for (n = 0; n < n2; ++n) {
            this.epX[n] = new anr_0();
            this.epX[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.epY = new aNS[n];
        for (int i = 0; i < n; ++i) {
            this.epY[i] = new aNS();
            this.epY[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozs.d();
    }
}

