/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aML
 */
public class aml_0
implements aqz_2 {
    protected int o;
    protected int elr;
    protected int els;
    protected int elt;
    protected aMO[] elu;
    protected amn_0[] elv;

    public int d() {
        return this.o;
    }

    public int blh() {
        return this.elr;
    }

    public int rI() {
        return this.els;
    }

    public int coK() {
        return this.elt;
    }

    public aMO[] coL() {
        return this.elu;
    }

    public amn_0[] coM() {
        return this.elv;
    }

    public long coNN() {
        return this.elv == null || this.elv.length == 0 ? 0L : this.elv[0].aqZ();
    }

    public short cmZ() {
        return this.elv == null || this.elv.length == 0 ? (short)0 : this.elv[0].cmZ();
    }

    @Override
    public void reset() {
        this.o = 0;
        this.elr = 0;
        this.els = 0;
        this.elt = 0;
        this.elu = null;
        this.elv = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.elr = aqh_12.bGI();
        this.els = aqh_12.bGI();
        this.elt = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.elu = new aMO[n2];
        for (n = 0; n < n2; ++n) {
            this.elu[n] = new aMO();
            this.elu[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.elv = new amn_0[n];
        for (int i = 0; i < n; ++i) {
            this.elv[i] = new amn_0();
            this.elv[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBe.d();
    }
}

