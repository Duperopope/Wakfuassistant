/*
 * Decompiled with CFR 0.152.
 */
public class fxp
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
    protected fxs_0[] tAS;
    protected fxq_0[] tAT;
    protected fxr[] tAU;

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

    public fxs_0[] gpL() {
        return this.tAS;
    }

    public fxq_0[] gpM() {
        return this.tAT;
    }

    public fxr[] gpN() {
        return this.tAU;
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
        this.tAS = null;
        this.tAT = null;
        this.tAU = null;
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
        this.tAS = new fxs_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.tAS[n2] = new fxs_0();
            this.tAS[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.tAT = new fxq_0[n2];
        for (n = 0; n < n2; ++n) {
            this.tAT[n] = new fxq_0();
            this.tAT[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.tAU = new fxr[n];
        for (int i = 0; i < n; ++i) {
            this.tAU[i] = new fxr();
            this.tAU[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozs.d();
    }
}

