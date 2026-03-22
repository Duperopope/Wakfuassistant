/*
 * Decompiled with CFR 0.152.
 */
public class fvj
implements aqz_2 {
    protected int o;
    protected int ehO;
    protected short ehQ;
    protected boolean bmT;
    protected int eiV;
    protected fvl_0[] tzl;
    protected fvk_0[] tzm;

    public int d() {
        return this.o;
    }

    public int clf() {
        return this.ehO;
    }

    public short clh() {
        return this.ehQ;
    }

    public boolean bfb() {
        return this.bmT;
    }

    public int cmm() {
        return this.eiV;
    }

    public fvl_0[] gof() {
        return this.tzl;
    }

    public fvk_0[] gog() {
        return this.tzm;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehO = 0;
        this.ehQ = 0;
        this.bmT = false;
        this.eiV = 0;
        this.tzl = null;
        this.tzm = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.ehQ = aqh_12.bGG();
        this.bmT = aqh_12.bxv();
        this.eiV = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.tzl = new fvl_0[n2];
        for (n = 0; n < n2; ++n) {
            this.tzl[n] = new fvl_0();
            this.tzl[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.tzm = new fvk_0[n];
        for (int i = 0; i < n; ++i) {
            this.tzm[i] = new fvk_0();
            this.tzm[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyM.d();
    }
}

