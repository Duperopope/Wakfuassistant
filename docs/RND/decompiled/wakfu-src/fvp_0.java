/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvP
 */
public class fvp_0 {
    protected int o;
    protected int ehO;
    protected int eky;
    protected int ekz;
    protected boolean ekA;
    protected int ejx;
    protected int ekB;
    protected fvO[] tzw;

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

    public fvO[] goq() {
        return this.tzw;
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
        this.tzw = new fvO[n];
        for (int i = 0; i < n; ++i) {
            this.tzw[i] = new fvO();
            this.tzw[i].a(aqh_12);
        }
    }
}

