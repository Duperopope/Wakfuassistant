/*
 * Decompiled with CFR 0.152.
 */
public class aOK
implements aqz_2 {
    protected int o;
    protected int aXS;
    protected float aQK;
    protected int cDu;
    protected boolean eum;
    protected int eun;
    protected boolean euo;
    protected int eup;
    protected int euq;
    protected boolean eur;
    protected int eus;
    protected aLD ehd;

    public int d() {
        return this.o;
    }

    public int AM() {
        return this.aXS;
    }

    public float aSL() {
        return this.aQK;
    }

    public int bBE() {
        return this.cDu;
    }

    public boolean cxW() {
        return this.eum;
    }

    public int cxX() {
        return this.eun;
    }

    public boolean cxY() {
        return this.euo;
    }

    public int cxZ() {
        return this.eup;
    }

    public int cya() {
        return this.euq;
    }

    public boolean cyb() {
        return this.eur;
    }

    public int cyc() {
        return this.eus;
    }

    public aLD ckt() {
        return this.ehd;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.aXS = 0;
        this.aQK = 0.0f;
        this.cDu = 0;
        this.eum = false;
        this.eun = 0;
        this.euo = false;
        this.eup = 0;
        this.euq = 0;
        this.eur = false;
        this.eus = 0;
        this.ehd = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.aXS = aqh_12.bGI();
        this.aQK = aqh_12.bGH();
        this.cDu = aqh_12.bGI();
        this.eum = aqh_12.bxv();
        this.eun = aqh_12.bGI();
        this.euo = aqh_12.bxv();
        this.eup = aqh_12.bGI();
        this.euq = aqh_12.bGI();
        this.eur = aqh_12.bxv();
        this.eus = aqh_12.bGI();
        if (aqh_12.aTf() != 0) {
            this.ehd = new aLD();
            this.ehd.a(aqh_12);
        } else {
            this.ehd = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozI.d();
    }
}

