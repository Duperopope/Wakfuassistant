/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aKQ
 */
public class akq_0 {
    protected int o;
    protected boolean egk;
    protected String egl;
    protected akr_0[] egm;
    protected String egn;
    protected akt_0[] ego;

    public int d() {
        return this.o;
    }

    public boolean cjw() {
        return this.egk;
    }

    public String cjx() {
        return this.egl;
    }

    public akr_0[] cjy() {
        return this.egm;
    }

    public String cjz() {
        return this.egn;
    }

    public akt_0[] cjA() {
        return this.ego;
    }

    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.egk = aqh_12.bxv();
        this.egl = aqh_12.bGL().intern();
        int n2 = aqh_12.bGI();
        this.egm = new akr_0[n2];
        for (n = 0; n < n2; ++n) {
            this.egm[n] = new akr_0();
            this.egm[n].a(aqh_12);
        }
        this.egn = aqh_12.bGL().intern();
        n = aqh_12.bGI();
        this.ego = new akt_0[n];
        for (int i = 0; i < n; ++i) {
            this.ego[i] = new akt_0();
            this.ego[i].a(aqh_12);
        }
    }
}

