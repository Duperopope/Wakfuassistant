/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fxi
 */
public class fxi_0
implements aqz_2 {
    protected int o;
    protected int epc;
    protected int ciZ;
    protected int epA;
    protected int epe;
    protected long eph;
    protected long epi;
    protected byte epg;
    protected short epf;
    protected short enc;
    protected fxl[] tAN;
    protected fxk_0[] tAO;
    protected fxm_0[] tAP;
    protected fxn_0[] tAQ;
    protected int[] epF;
    protected fxj_0[] tAR;

    public int d() {
        return this.o;
    }

    public int AK() {
        return this.epc;
    }

    public int aVt() {
        return this.ciZ;
    }

    public int ctd() {
        return this.epA;
    }

    public int agM() {
        return this.epe;
    }

    public long csJ() {
        return this.eph;
    }

    public long csK() {
        return this.epi;
    }

    public byte csI() {
        return this.epg;
    }

    public short csH() {
        return this.epf;
    }

    public short cqA() {
        return this.enc;
    }

    public fxl[] gpG() {
        return this.tAN;
    }

    public fxk_0[] gpH() {
        return this.tAO;
    }

    public fxm_0[] gpI() {
        return this.tAP;
    }

    public fxn_0[] gpJ() {
        return this.tAQ;
    }

    public int[] cti() {
        return this.epF;
    }

    public fxj_0[] gpK() {
        return this.tAR;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.epc = 0;
        this.ciZ = 0;
        this.epA = 0;
        this.epe = 0;
        this.eph = 0L;
        this.epi = 0L;
        this.epg = 0;
        this.epf = 0;
        this.enc = 0;
        this.tAN = null;
        this.tAO = null;
        this.tAP = null;
        this.tAQ = null;
        this.epF = null;
        this.tAR = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        int n3;
        int n4;
        this.o = aqh_12.bGI();
        this.epc = aqh_12.bGI();
        this.ciZ = aqh_12.bGI();
        this.epA = aqh_12.bGI();
        this.epe = aqh_12.bGI();
        this.eph = aqh_12.bGK();
        this.epi = aqh_12.bGK();
        this.epg = aqh_12.aTf();
        this.epf = aqh_12.bGG();
        this.enc = aqh_12.bGG();
        int n5 = aqh_12.bGI();
        this.tAN = new fxl[n5];
        for (n4 = 0; n4 < n5; ++n4) {
            this.tAN[n4] = new fxl();
            this.tAN[n4].a(aqh_12);
        }
        n4 = aqh_12.bGI();
        this.tAO = new fxk_0[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.tAO[n3] = new fxk_0();
            this.tAO[n3].a(aqh_12);
        }
        n3 = aqh_12.bGI();
        this.tAP = new fxm_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.tAP[n2] = new fxm_0();
            this.tAP[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.tAQ = new fxn_0[n2];
        for (n = 0; n < n2; ++n) {
            this.tAQ[n] = new fxn_0();
            this.tAQ[n].a(aqh_12);
        }
        this.epF = aqh_12.bGM();
        n = aqh_12.bGI();
        this.tAR = new fxj_0[n];
        for (int i = 0; i < n; ++i) {
            this.tAR[i] = new fxj_0();
            this.tAR[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAB.d();
    }
}

