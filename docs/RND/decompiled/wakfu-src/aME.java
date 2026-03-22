/*
 * Decompiled with CFR 0.152.
 */
public class aME
implements aqz_2 {
    protected int o;
    protected int egi;
    protected int eld;
    protected int efP;
    protected boolean ele;
    protected short elf;
    protected boolean elg;
    protected int elh;
    protected aMF[] eli;

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

    public boolean coy() {
        return this.elg;
    }

    public int coz() {
        return this.elh;
    }

    public aMF[] coA() {
        return this.eli;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.egi = 0;
        this.eld = 0;
        this.efP = 0;
        this.ele = false;
        this.elf = 0;
        this.elg = false;
        this.elh = 0;
        this.eli = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.egi = aqh_12.bGI();
        this.eld = aqh_12.bGI();
        this.efP = aqh_12.bGI();
        this.ele = aqh_12.bxv();
        this.elf = aqh_12.bGG();
        this.elg = aqh_12.bxv();
        this.elh = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.eli = new aMF[n];
        for (int i = 0; i < n; ++i) {
            this.eli[i] = new aMF();
            this.eli[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAp.d();
    }
}

