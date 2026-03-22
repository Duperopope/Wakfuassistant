/*
 * Decompiled with CFR 0.152.
 */
public class aLG
implements aqz_2 {
    protected int o;
    protected int bIi;
    protected short eiK;
    protected short eiL;
    protected String asF;
    protected String[] eiM;
    protected boolean eiN;
    protected ali_0[] eiO;

    public int d() {
        return this.o;
    }

    public int aeV() {
        return this.bIi;
    }

    public short cmb() {
        return this.eiK;
    }

    public short cmc() {
        return this.eiL;
    }

    public String aGr() {
        return this.asF;
    }

    public String[] cmd() {
        return this.eiM;
    }

    public boolean cme() {
        return this.eiN;
    }

    public ali_0[] cmf() {
        return this.eiO;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.bIi = 0;
        this.eiK = 0;
        this.eiL = 0;
        this.asF = null;
        this.eiM = null;
        this.eiN = false;
        this.eiO = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.bIi = aqh_12.bGI();
        this.eiK = aqh_12.bGG();
        this.eiL = aqh_12.bGG();
        this.asF = aqh_12.bGL().intern();
        this.eiM = aqh_12.bGO();
        this.eiN = aqh_12.bxv();
        int n = aqh_12.bGI();
        this.eiO = new ali_0[n];
        for (int i = 0; i < n; ++i) {
            this.eiO[i] = new ali_0();
            this.eiO[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyI.d();
    }
}

