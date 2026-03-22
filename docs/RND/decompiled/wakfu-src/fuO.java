/*
 * Decompiled with CFR 0.152.
 */
public class fuO
implements aqz_2 {
    protected int o;
    protected int ehT;
    protected fuP[] tyN;
    protected fuq_0[] tyO;

    public int d() {
        return this.o;
    }

    public int clk() {
        return this.ehT;
    }

    public fuP[] gnG() {
        return this.tyN;
    }

    public fuq_0[] gnH() {
        return this.tyO;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehT = 0;
        this.tyN = null;
        this.tyO = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.ehT = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.tyN = new fuP[n2];
        for (n = 0; n < n2; ++n) {
            this.tyN[n] = new fuP();
            this.tyN[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.tyO = new fuq_0[n];
        for (int i = 0; i < n; ++i) {
            this.tyO[i] = new fuq_0();
            this.tyO[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAX.d();
    }
}

