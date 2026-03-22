/*
 * Decompiled with CFR 0.152.
 */
public class fvZ
implements aqz_2 {
    protected int o;
    protected int egi;
    protected int eld;
    protected int efP;
    protected boolean ele;
    protected short elf;
    protected fwa_0[] tzB;

    public int d() {
        return this.o;
    }

    public int aYs() {
        return this.egi;
    }

    public int cov() {
        return this.eld;
    }

    public int cjd() {
        return this.efP;
    }

    public boolean cow() {
        return this.ele;
    }

    public short cox() {
        return this.elf;
    }

    public fwa_0[] gov() {
        return this.tzB;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.egi = 0;
        this.eld = 0;
        this.efP = 0;
        this.ele = false;
        this.elf = 0;
        this.tzB = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.egi = aqh_12.bGI();
        this.eld = aqh_12.bGI();
        this.efP = aqh_12.bGI();
        this.ele = aqh_12.bxv();
        this.elf = aqh_12.bGG();
        int n = aqh_12.bGI();
        this.tzB = new fwa_0[n];
        for (int i = 0; i < n; ++i) {
            this.tzB[i] = new fwa_0();
            this.tzB[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAp.d();
    }
}

