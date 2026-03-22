/*
 * Decompiled with CFR 0.152.
 */
public class fxJ
implements aqz_2 {
    protected int o;
    protected int efP;
    protected long cwe;
    protected String eik;
    protected boolean eqG;
    protected int eoY;
    protected int[] baD;
    protected int eqH;
    protected int eqJ;
    protected boolean eqK;
    protected long eqL;
    protected long aZl;
    protected int eqM;
    protected fxK[] tBf;
    protected fxM[] tBg;
    protected fxl_0[] tBh;

    public int d() {
        return this.o;
    }

    public int cjd() {
        return this.efP;
    }

    public long Tz() {
        return this.cwe;
    }

    public String clB() {
        return this.eik;
    }

    public boolean cui() {
        return this.eqG;
    }

    public int tL() {
        return this.eoY;
    }

    public int[] ckm() {
        return this.baD;
    }

    public int cuj() {
        return this.eqH;
    }

    public int cul() {
        return this.eqJ;
    }

    public boolean cum() {
        return this.eqK;
    }

    public long cun() {
        return this.eqL;
    }

    public long pf() {
        return this.aZl;
    }

    public int cuo() {
        return this.eqM;
    }

    public fxK[] gpY() {
        return this.tBf;
    }

    public fxM[] gpZ() {
        return this.tBg;
    }

    public fxl_0[] gqa() {
        return this.tBh;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.efP = 0;
        this.cwe = 0L;
        this.eik = null;
        this.eqG = false;
        this.eoY = 0;
        this.baD = null;
        this.eqH = 0;
        this.eqJ = 0;
        this.eqK = false;
        this.eqL = 0L;
        this.aZl = 0L;
        this.eqM = 0;
        this.tBf = null;
        this.tBg = null;
        this.tBh = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        this.o = aqh_12.bGI();
        this.efP = aqh_12.bGI();
        this.cwe = aqh_12.bGK();
        this.eik = aqh_12.bGL().intern();
        this.eqG = aqh_12.bxv();
        this.eoY = aqh_12.bGI();
        this.baD = aqh_12.bGM();
        this.eqH = aqh_12.bGI();
        this.eqJ = aqh_12.bGI();
        this.eqK = aqh_12.bxv();
        this.eqL = aqh_12.bGK();
        this.aZl = aqh_12.bGK();
        this.eqM = aqh_12.bGI();
        int n3 = aqh_12.bGI();
        this.tBf = new fxK[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.tBf[n2] = new fxK();
            this.tBf[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.tBg = new fxM[n2];
        for (n = 0; n < n2; ++n) {
            this.tBg[n] = new fxM();
            this.tBg[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.tBh = new fxl_0[n];
        for (int i = 0; i < n; ++i) {
            this.tBh[i] = new fxl_0();
            this.tBh[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozw.d();
    }
}

