/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fwI
 */
public class fwi_0 {
    protected int eGx;
    protected int tAg;
    protected int tAh;
    protected int tAi;
    protected int tAj;
    protected boolean tAk;
    protected int tAl;
    protected int tAm;
    protected int tAn;
    protected String tAo;
    protected String tAp;
    protected fwp_0[] tAq;

    public int axA() {
        return this.eGx;
    }

    public int gpa() {
        return this.tAg;
    }

    public int gpb() {
        return this.tAh;
    }

    public int gpc() {
        return this.tAi;
    }

    public int gpd() {
        return this.tAj;
    }

    public boolean gpe() {
        return this.tAk;
    }

    public int gpf() {
        return this.tAl;
    }

    public int gpg() {
        return this.tAm;
    }

    public int gph() {
        return this.tAn;
    }

    public String gpi() {
        return this.tAo;
    }

    public String gpj() {
        return this.tAp;
    }

    public fwp_0[] gpk() {
        return this.tAq;
    }

    public void a(aqh_1 aqh_12) {
        this.eGx = aqh_12.bGI();
        this.tAg = aqh_12.bGI();
        this.tAh = aqh_12.bGI();
        this.tAi = aqh_12.bGI();
        this.tAj = aqh_12.bGI();
        this.tAk = aqh_12.bxv();
        this.tAl = aqh_12.bGI();
        this.tAm = aqh_12.bGI();
        this.tAn = aqh_12.bGI();
        this.tAo = aqh_12.bGL().intern();
        this.tAp = aqh_12.bGL().intern();
        int n = aqh_12.bGI();
        this.tAq = new fwp_0[n];
        for (int i = 0; i < n; ++i) {
            this.tAq[i] = new fwp_0();
            this.tAq[i].a(aqh_12);
        }
    }
}

