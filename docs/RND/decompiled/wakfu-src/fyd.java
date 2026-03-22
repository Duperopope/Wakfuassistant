/*
 * Decompiled with CFR 0.152.
 */
public class fyd
implements aqz_2 {
    protected int o;
    protected int ehO;
    protected boolean etV;
    protected String etW;
    protected fyf[] tBq;
    protected fyf[] tBr;
    protected fye[] tBs;
    protected fyg[] tBt;
    protected fyh[] tBu;

    public int d() {
        return this.o;
    }

    public int clf() {
        return this.ehO;
    }

    public boolean cxF() {
        return this.etV;
    }

    public String cxG() {
        return this.etW;
    }

    public fyf[] gqj() {
        return this.tBq;
    }

    public fyf[] gqk() {
        return this.tBr;
    }

    public fye[] gql() {
        return this.tBs;
    }

    public fyg[] gqm() {
        return this.tBt;
    }

    public fyh[] gqn() {
        return this.tBu;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehO = 0;
        this.etV = false;
        this.etW = null;
        this.tBq = null;
        this.tBr = null;
        this.tBs = null;
        this.tBt = null;
        this.tBu = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        int n3;
        int n4;
        this.o = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.etV = aqh_12.bxv();
        this.etW = aqh_12.bGL().intern();
        int n5 = aqh_12.bGI();
        this.tBq = new fyf[n5];
        for (n4 = 0; n4 < n5; ++n4) {
            this.tBq[n4] = new fyf();
            this.tBq[n4].a(aqh_12);
        }
        n4 = aqh_12.bGI();
        this.tBr = new fyf[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.tBr[n3] = new fyf();
            this.tBr[n3].a(aqh_12);
        }
        n3 = aqh_12.bGI();
        this.tBs = new fye[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.tBs[n2] = new fye();
            this.tBs[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.tBt = new fyg[n2];
        for (n = 0; n < n2; ++n) {
            this.tBt[n] = new fyg();
            this.tBt[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.tBu = new fyh[n];
        for (int i = 0; i < n; ++i) {
            this.tBu[i] = new fyh();
            this.tBu[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBi.d();
    }
}

