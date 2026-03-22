/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvV
 */
public class fvv_0
implements aqz_2 {
    protected int o;
    protected short ekU;
    protected int ejx;
    protected int ekV;
    protected byte ekW;
    protected byte ekX;
    protected int ekY;
    protected boolean biy;
    protected fvw_0[] tzy;
    protected fvx_0[] tzz;
    protected int[] egL;
    protected fvy_0[] tzA;

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

    public fvw_0[] gos() {
        return this.tzy;
    }

    public fvx_0[] got() {
        return this.tzz;
    }

    public int[] cjX() {
        return this.egL;
    }

    public fvy_0[] gou() {
        return this.tzA;
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
        this.tzy = null;
        this.tzz = null;
        this.egL = null;
        this.tzA = null;
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
        this.tzy = new fvw_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.tzy[n2] = new fvw_0();
            this.tzy[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.tzz = new fvx_0[n2];
        for (n = 0; n < n2; ++n) {
            this.tzz[n] = new fvx_0();
            this.tzz[n].a(aqh_12);
        }
        this.egL = aqh_12.bGM();
        n = aqh_12.bGI();
        this.tzA = new fvy_0[n];
        for (int i = 0; i < n; ++i) {
            this.tzA[i] = new fvy_0();
            this.tzA[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAn.d();
    }
}

