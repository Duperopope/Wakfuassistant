/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fwz
 */
public class fwz_0
implements aqz_2 {
    protected int o;
    protected int ehO;
    protected int efU;
    protected int emS;
    protected int emT;
    protected int emU;
    protected boolean ekA;
    protected int emV;
    protected boolean emW;
    protected int ekB;
    protected String eik;
    protected fvd tyG;
    protected fwA[] tzN;
    protected fwb_0[] tzO;

    public int d() {
        return this.o;
    }

    public int clf() {
        return this.ehO;
    }

    public int cji() {
        return this.efU;
    }

    public int cqq() {
        return this.emS;
    }

    public int cqr() {
        return this.emT;
    }

    public int cqs() {
        return this.emU;
    }

    public boolean cnO() {
        return this.ekA;
    }

    public int cqt() {
        return this.emV;
    }

    public boolean cqu() {
        return this.emW;
    }

    public int cnP() {
        return this.ekB;
    }

    public String clB() {
        return this.eik;
    }

    public fvd gnz() {
        return this.tyG;
    }

    public fwA[] goH() {
        return this.tzN;
    }

    public fwb_0[] goI() {
        return this.tzO;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehO = 0;
        this.efU = 0;
        this.emS = 0;
        this.emT = 0;
        this.emU = 0;
        this.ekA = false;
        this.emV = 0;
        this.emW = false;
        this.ekB = 0;
        this.eik = null;
        this.tyG = null;
        this.tzN = null;
        this.tzO = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.efU = aqh_12.bGI();
        this.emS = aqh_12.bGI();
        this.emT = aqh_12.bGI();
        this.emU = aqh_12.bGI();
        this.ekA = aqh_12.bxv();
        this.emV = aqh_12.bGI();
        this.emW = aqh_12.bxv();
        this.ekB = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        if (aqh_12.aTf() != 0) {
            this.tyG = new fvd();
            this.tyG.a(aqh_12);
        } else {
            this.tyG = null;
        }
        int n2 = aqh_12.bGI();
        this.tzN = new fwA[n2];
        for (n = 0; n < n2; ++n) {
            this.tzN[n] = new fwA();
            this.tzN[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.tzO = new fwb_0[n];
        for (int i = 0; i < n; ++i) {
            this.tzO[i] = new fwb_0();
            this.tzO[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozc.d();
    }
}

