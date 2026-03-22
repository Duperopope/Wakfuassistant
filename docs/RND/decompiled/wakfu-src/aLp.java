/*
 * Decompiled with CFR 0.152.
 */
public class aLp
implements aqz_2 {
    protected int o;
    protected int ehT;
    protected aLq[] ehU;
    protected aLr[] ehV;

    public int d() {
        return this.o;
    }

    public int clk() {
        return this.ehT;
    }

    public aLq[] cll() {
        return this.ehU;
    }

    public aLr[] clm() {
        return this.ehV;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehT = 0;
        this.ehU = null;
        this.ehV = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.ehT = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.ehU = new aLq[n2];
        for (n = 0; n < n2; ++n) {
            this.ehU[n] = new aLq();
            this.ehU[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.ehV = new aLr[n];
        for (int i = 0; i < n; ++i) {
            this.ehV[i] = new aLr();
            this.ehV[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAX.d();
    }
}

