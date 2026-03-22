/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fuu
 */
public class fuu_0
implements aqz_2 {
    protected int o;
    protected short euL;
    protected fuv[] tyy;

    public int d() {
        return this.o;
    }

    public short cyv() {
        return this.euL;
    }

    public fuv[] gnr() {
        return this.tyy;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.euL = 0;
        this.tyy = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.euL = aqh_12.bGG();
        int n = aqh_12.bGI();
        this.tyy = new fuv[n];
        for (int i = 0; i < n; ++i) {
            this.tyy[i] = new fuv();
            this.tyy[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAY.d();
    }
}

