/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvE
 */
public class fve_0
implements aqz_2 {
    protected int o;
    protected int cDu;
    protected int ehb;
    protected byte ejU;
    protected fvG[] tzq;
    protected fvd tyG;

    public int d() {
        return this.o;
    }

    public int bBE() {
        return this.cDu;
    }

    public int ckr() {
        return this.ehb;
    }

    public byte cnj() {
        return this.ejU;
    }

    public fvG[] gok() {
        return this.tzq;
    }

    public fvd gnz() {
        return this.tyG;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.cDu = 0;
        this.ehb = 0;
        this.ejU = 0;
        this.tzq = null;
        this.tyG = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.cDu = aqh_12.bGI();
        this.ehb = aqh_12.bGI();
        this.ejU = aqh_12.aTf();
        int n = aqh_12.bGI();
        this.tzq = new fvG[n];
        for (int i = 0; i < n; ++i) {
            this.tzq[i] = new fvG();
            this.tzq[i].a(aqh_12);
        }
        if (aqh_12.aTf() != 0) {
            this.tyG = new fvd();
            this.tyG.a(aqh_12);
        } else {
            this.tyG = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozT.d();
    }
}

