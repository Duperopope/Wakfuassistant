/*
 * Decompiled with CFR 0.152.
 */
public class fwC
implements aqz_2 {
    protected int o;
    protected short euL;
    protected fwD[] tzR;

    public int d() {
        return this.o;
    }

    public short cyv() {
        return this.euL;
    }

    public fwD[] goL() {
        return this.tzR;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.euL = 0;
        this.tzR = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.euL = aqh_12.bGG();
        int n = aqh_12.bGI();
        this.tzR = new fwD[n];
        for (int i = 0; i < n; ++i) {
            this.tzR[i] = new fwD();
            this.tzR[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozd.d();
    }
}

