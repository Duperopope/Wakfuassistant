/*
 * Decompiled with CFR 0.152.
 */
public class aMg
implements aqz_2 {
    protected int o;
    protected int cDu;
    protected int ehb;
    protected byte ejU;
    protected boolean ejV;
    protected aMi[] ejW;
    protected aLD ehd;

    public int d() {
        return this.o;
    }

    public int bBE() {
        return this.cDu;
    }

    public int ckr() {
        return this.ehb;
    }

    public byte cnj() {
        return this.ejU;
    }

    public boolean cnk() {
        return this.ejV;
    }

    public aMi[] cnl() {
        return this.ejW;
    }

    public aLD ckt() {
        return this.ehd;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.cDu = 0;
        this.ehb = 0;
        this.ejU = 0;
        this.ejV = false;
        this.ejW = null;
        this.ehd = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.cDu = aqh_12.bGI();
        this.ehb = aqh_12.bGI();
        this.ejU = aqh_12.aTf();
        this.ejV = aqh_12.bxv();
        int n = aqh_12.bGI();
        this.ejW = new aMi[n];
        for (int i = 0; i < n; ++i) {
            this.ejW[i] = new aMi();
            this.ejW[i].a(aqh_12);
        }
        if (aqh_12.aTf() != 0) {
            this.ehd = new aLD();
            this.ehd.a(aqh_12);
        } else {
            this.ehd = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozT.d();
    }
}

