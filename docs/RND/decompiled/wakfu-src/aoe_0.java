/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aOE
 */
public class aoe_0
implements aqz_2 {
    protected int o;
    protected int ehO;
    protected boolean etV;
    protected String etW;
    protected aog_0[] etX;
    protected aog_0[] etY;
    protected aof_0[] etZ;
    protected aoh_0[] eua;
    protected aOI[] eub;

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

    public aog_0[] cxH() {
        return this.etX;
    }

    public aog_0[] cxI() {
        return this.etY;
    }

    public aof_0[] cxJ() {
        return this.etZ;
    }

    public aoh_0[] cxK() {
        return this.eua;
    }

    public aOI[] cxL() {
        return this.eub;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehO = 0;
        this.etV = false;
        this.etW = null;
        this.etX = null;
        this.etY = null;
        this.etZ = null;
        this.eua = null;
        this.eub = null;
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
        this.etX = new aog_0[n5];
        for (n4 = 0; n4 < n5; ++n4) {
            this.etX[n4] = new aog_0();
            this.etX[n4].a(aqh_12);
        }
        n4 = aqh_12.bGI();
        this.etY = new aog_0[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.etY[n3] = new aog_0();
            this.etY[n3].a(aqh_12);
        }
        n3 = aqh_12.bGI();
        this.etZ = new aof_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.etZ[n2] = new aof_0();
            this.etZ[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.eua = new aoh_0[n2];
        for (n = 0; n < n2; ++n) {
            this.eua[n] = new aoh_0();
            this.eua[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.eub = new aOI[n];
        for (int i = 0; i < n; ++i) {
            this.eub[i] = new aOI();
            this.eub[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBi.d();
    }
}

