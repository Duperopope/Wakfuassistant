/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMt
 */
public class amt_0 {
    protected int o;
    protected int ehO;
    protected int eky;
    protected int ekz;
    protected boolean ekA;
    protected int ejx;
    protected int ekB;
    protected ams_0[] ekC;

    public int d() {
        return this.o;
    }

    public int clf() {
        return this.ehO;
    }

    public int cnM() {
        return this.eky;
    }

    public int cnN() {
        return this.ekz;
    }

    public boolean cnO() {
        return this.ekA;
    }

    public int cmP() {
        return this.ejx;
    }

    public int cnP() {
        return this.ekB;
    }

    public ams_0[] cnQ() {
        return this.ekC;
    }

    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.eky = aqh_12.bGI();
        this.ekz = aqh_12.bGI();
        this.ekA = aqh_12.bxv();
        this.ejx = aqh_12.bGI();
        this.ekB = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.ekC = new ams_0[n];
        for (int i = 0; i < n; ++i) {
            this.ekC[i] = new ams_0();
            this.ekC[i].a(aqh_12);
        }
    }
}

