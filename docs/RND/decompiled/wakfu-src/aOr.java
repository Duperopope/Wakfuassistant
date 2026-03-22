/*
 * Decompiled with CFR 0.152.
 */
public class aOr {
    protected int cxt;
    protected aos_0[] erg;
    protected int erh;
    protected int eri;
    protected int erj;
    protected int erk;
    protected int cDu;
    protected int erl;

    public int wp() {
        return this.cxt;
    }

    public aos_0[] cuI() {
        return this.erg;
    }

    public int cuJ() {
        return this.erh;
    }

    public int cuK() {
        return this.eri;
    }

    public int cuL() {
        return this.erj;
    }

    public int cuM() {
        return this.erk;
    }

    public int bBE() {
        return this.cDu;
    }

    public int cuN() {
        return this.erl;
    }

    public void a(aqh_1 aqh_12) {
        this.cxt = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.erg = new aos_0[n];
        for (int i = 0; i < n; ++i) {
            this.erg[i] = new aos_0();
            this.erg[i].a(aqh_12);
        }
        this.erh = aqh_12.bGI();
        this.eri = aqh_12.bGI();
        this.erj = aqh_12.bGI();
        this.erk = aqh_12.bGI();
        this.cDu = aqh_12.bGI();
        this.erl = aqh_12.bGI();
    }
}

