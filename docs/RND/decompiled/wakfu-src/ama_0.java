/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMA
 */
public class ama_0
implements aqz_2 {
    protected int o;
    protected short ekU;
    protected int ejx;
    protected int ekV;
    protected byte ekW;
    protected byte ekX;
    protected int ekY;
    protected boolean biy;
    protected amb_0[] ekZ;
    protected amc_0[] ela;
    protected int[] egL;
    protected amd_0[] elb;

    public int d() {
        return this.o;
    }

    public short coj() {
        return this.ekU;
    }

    public int cmP() {
        return this.ejx;
    }

    public int cok() {
        return this.ekV;
    }

    public byte col() {
        return this.ekW;
    }

    public byte com() {
        return this.ekX;
    }

    public int conn() {
        return this.ekY;
    }

    public boolean ckf() {
        return this.biy;
    }

    public amb_0[] coo() {
        return this.ekZ;
    }

    public amc_0[] cop() {
        return this.ela;
    }

    public int[] cjX() {
        return this.egL;
    }

    public amd_0[] coq() {
        return this.elb;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ekU = 0;
        this.ejx = 0;
        this.ekV = 0;
        this.ekW = 0;
        this.ekX = 0;
        this.ekY = 0;
        this.biy = false;
        this.ekZ = null;
        this.ela = null;
        this.egL = null;
        this.elb = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        this.o = aqh_12.bGI();
        this.ekU = aqh_12.bGG();
        this.ejx = aqh_12.bGI();
        this.ekV = aqh_12.bGI();
        this.ekW = aqh_12.aTf();
        this.ekX = aqh_12.aTf();
        this.ekY = aqh_12.bGI();
        this.biy = aqh_12.bxv();
        int n3 = aqh_12.bGI();
        this.ekZ = new amb_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.ekZ[n2] = new amb_0();
            this.ekZ[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.ela = new amc_0[n2];
        for (n = 0; n < n2; ++n) {
            this.ela[n] = new amc_0();
            this.ela[n].a(aqh_12);
        }
        this.egL = aqh_12.bGM();
        n = aqh_12.bGI();
        this.elb = new amd_0[n];
        for (int i = 0; i < n; ++i) {
            this.elb[i] = new amd_0();
            this.elb[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAn.d();
    }
}

