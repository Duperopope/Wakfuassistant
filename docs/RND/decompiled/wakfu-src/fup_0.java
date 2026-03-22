/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fup
 */
public class fup_0 {
    protected int o;
    protected String egl;
    protected fuq[] tyv;
    protected fus[] tyw;
    protected fuo_0[] tyx;

    public int d() {
        return this.o;
    }

    public String cjx() {
        return this.egl;
    }

    public fuq[] gno() {
        return this.tyv;
    }

    public fus[] gnp() {
        return this.tyw;
    }

    public fuo_0[] gnq() {
        return this.tyx;
    }

    public void a(aqh_1 aqh_12) {
        int n;
        int n2;
        this.o = aqh_12.bGI();
        this.egl = aqh_12.bGL().intern();
        int n3 = aqh_12.bGI();
        this.tyv = new fuq[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.tyv[n2] = new fuq();
            this.tyv[n2].a(aqh_12);
        }
        n2 = aqh_12.bGI();
        this.tyw = new fus[n2];
        for (n = 0; n < n2; ++n) {
            this.tyw[n] = new fus();
            this.tyw[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.tyx = new fuo_0[n];
        for (int i = 0; i < n; ++i) {
            this.tyx[i] = new fuo_0();
            this.tyx[i].a(aqh_12);
        }
    }
}

