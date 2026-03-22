/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aOR
 */
public class aor_0
implements aqz_2 {
    protected int o;
    protected aOS[] euK;

    public int d() {
        return this.o;
    }

    public aOS[] cyu() {
        return this.euK;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.euK = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.euK = new aOS[n];
        for (int i = 0; i < n; ++i) {
            this.euK[i] = new aOS();
            this.euK[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oAM.d();
    }
}

