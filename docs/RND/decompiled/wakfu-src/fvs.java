/*
 * Decompiled with CFR 0.152.
 */
public class fvs {
    protected int o;
    protected String asF;
    protected int bIi;
    protected boolean bfg;
    protected int tzo;
    protected fvt_0[] tzp;

    public int d() {
        return this.o;
    }

    public String aGr() {
        return this.asF;
    }

    public int aeV() {
        return this.bIi;
    }

    public boolean aZu() {
        return this.bfg;
    }

    public int goi() {
        return this.tzo;
    }

    public fvt_0[] goj() {
        return this.tzp;
    }

    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.asF = aqh_12.bGL().intern();
        this.bIi = aqh_12.bGI();
        this.bfg = aqh_12.bxv();
        this.tzo = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.tzp = new fvt_0[n];
        for (int i = 0; i < n; ++i) {
            this.tzp[i] = new fvt_0();
            this.tzp[i].a(aqh_12);
        }
    }
}

