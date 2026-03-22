/*
 * Decompiled with CFR 0.152.
 */
public class fwj
implements aqz_2 {
    protected int o;
    protected int elr;
    protected int elB;
    protected int elC;

    public int d() {
        return this.o;
    }

    public int blh() {
        return this.elr;
    }

    public int arF() {
        return this.elB;
    }

    public int coT() {
        return this.elC;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.elr = 0;
        this.elB = 0;
        this.elC = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.elr = aqh_12.bGI();
        this.elB = aqh_12.bGI();
        this.elC = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAR.d();
    }
}

