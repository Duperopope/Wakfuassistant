/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aNB
 */
public class anb_0
implements aqz_2 {
    protected int o;
    protected int epc;
    protected int epd;
    protected int epe;
    protected short epf;
    protected short enc;
    protected byte epg;
    protected long eph;
    protected long epi;
    protected int epj;
    protected and_0[] epk;
    protected aNC[] epl;
    protected ane_0[] epm;

    public int d() {
        return this.o;
    }

    public int AK() {
        return this.epc;
    }

    public int csG() {
        return this.epd;
    }

    public int agM() {
        return this.epe;
    }

    public short csH() {
        return this.epf;
    }

    public short cqA() {
        return this.enc;
    }

    public byte csI() {
        return this.epg;
    }

    public long csJ() {
        return this.eph;
    }

    public long csK() {
        return this.epi;
    }

    public int csL() {
        return this.epj;
    }

    public and_0[] csM() {
        return this.epk;
    }

    public aNC[] csN() {
        return this.epl;
    }

    public ane_0[] csO() {
        return this.epm;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.epc = 0;
        this.epd = 0;
        this.epe = 0;
        this.epf = 0;
        this.enc = 0;
        this.epg = 0;
        this.eph = 0L;
        this.epi = 0L;
        this.epj = 0;
        this.epk = null;
        this.epl = null;
        this.epm = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        this.o = aqh_12.bGI();
        this.epc = aqh_12.bGI();
        this.epd = aqh_12.bGI();
        this.epe = aqh_12.bGI();
        this.epf = aqh_12.bGG();
        this.enc = aqh_12.bGG();
        this.epg = aqh_12.aTf();
        this.eph = aqh_12.bGK();
        this.epi = aqh_12.bGK();
        this.epj = aqh_12.bGI();
        int n3 = aqh_12.bGI();
        this.epk = new and_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.epk[n2] = new and_0();
            this.epk[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.epl = new aNC[n2];
        for (n = 0; n < n2; ++n) {
            this.epl[n] = new aNC();
            this.epl[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.epm = new ane_0[n];
        for (int i = 0; i < n; ++i) {
            this.epm[i] = new ane_0();
            this.epm[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBb.d();
    }
}

