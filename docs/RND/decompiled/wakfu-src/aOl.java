/*
 * Decompiled with CFR 0.152.
 */
public class aOl
implements aqz_2 {
    protected int o;
    protected int efP;
    protected long cwe;
    protected String eik;
    protected String eqF;
    protected boolean eqG;
    protected int eoY;
    protected int[] baD;
    protected int eqH;
    protected int[] eqI;
    protected int eqJ;
    protected boolean eqK;
    protected long eqL;
    protected long aZl;
    protected int eqM;
    protected aOm[] eqN;
    protected aOo[] eqO;
    protected aOn[] eqP;

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

    public String cuh() {
        return this.eqF;
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

    public int[] cuk() {
        return this.eqI;
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

    public aOm[] cup() {
        return this.eqN;
    }

    public aOo[] cuq() {
        return this.eqO;
    }

    public aOn[] cur() {
        return this.eqP;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.efP = 0;
        this.cwe = 0L;
        this.eik = null;
        this.eqF = null;
        this.eqG = false;
        this.eoY = 0;
        this.baD = null;
        this.eqH = 0;
        this.eqI = null;
        this.eqJ = 0;
        this.eqK = false;
        this.eqL = 0L;
        this.aZl = 0L;
        this.eqM = 0;
        this.eqN = null;
        this.eqO = null;
        this.eqP = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        this.o = aqh_12.bGI();
        this.efP = aqh_12.bGI();
        this.cwe = aqh_12.bGK();
        this.eik = aqh_12.bGL().intern();
        this.eqF = aqh_12.bGL().intern();
        this.eqG = aqh_12.bxv();
        this.eoY = aqh_12.bGI();
        this.baD = aqh_12.bGM();
        this.eqH = aqh_12.bGI();
        this.eqI = aqh_12.bGM();
        this.eqJ = aqh_12.bGI();
        this.eqK = aqh_12.bxv();
        this.eqL = aqh_12.bGK();
        this.aZl = aqh_12.bGK();
        this.eqM = aqh_12.bGI();
        int n3 = aqh_12.bGI();
        this.eqN = new aOm[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.eqN[n2] = new aOm();
            this.eqN[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.eqO = new aOo[n2];
        for (n = 0; n < n2; ++n) {
            this.eqO[n] = new aOo();
            this.eqO[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.eqP = new aOn[n];
        for (int i = 0; i < n; ++i) {
            this.eqP[i] = new aOn();
            this.eqP[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozw.d();
    }
}

