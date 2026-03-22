/*
 * Decompiled with CFR 0.152.
 */
public class aNJ
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
    protected aNM[] epB;
    protected anl_0[] epC;
    protected aNN[] epD;
    protected aNO[] epE;
    protected int[] epF;
    protected ank_0[] epG;

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

    public aNM[] cte() {
        return this.epB;
    }

    public anl_0[] ctf() {
        return this.epC;
    }

    public aNN[] ctg() {
        return this.epD;
    }

    public aNO[] cth() {
        return this.epE;
    }

    public int[] cti() {
        return this.epF;
    }

    public ank_0[] ctj() {
        return this.epG;
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
        this.epB = null;
        this.epC = null;
        this.epD = null;
        this.epE = null;
        this.epF = null;
        this.epG = null;
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
        this.epB = new aNM[n5];
        for (n4 = 0; n4 < n5; ++n4) {
            this.epB[n4] = new aNM();
            this.epB[n4].a(aqh_12);
        }
        n4 = aqh_12.bGI();
        this.epC = new anl_0[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.epC[n3] = new anl_0();
            this.epC[n3].a(aqh_12);
        }
        n3 = aqh_12.bGI();
        this.epD = new aNN[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.epD[n2] = new aNN();
            this.epD[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.epE = new aNO[n2];
        for (n = 0; n < n2; ++n) {
            this.epE[n] = new aNO();
            this.epE[n].a(aqh_12);
        }
        this.epF = aqh_12.bGM();
        n = aqh_12.bGI();
        this.epG = new ank_0[n];
        for (int i = 0; i < n; ++i) {
            this.epG[i] = new ank_0();
            this.epG[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAB.d();
    }
}

