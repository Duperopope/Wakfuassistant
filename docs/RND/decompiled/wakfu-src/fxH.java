/*
 * Decompiled with CFR 0.152.
 */
public class fxH
implements aqz_2 {
    protected int o;
    protected fxI[] tBe;

    public int d() {
        return this.o;
    }

    public fxI[] gpX() {
        return this.tBe;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.tBe = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.tBe = new fxI[n];
        for (int i = 0; i < n; ++i) {
            this.tBe[i] = new fxI();
            this.tBe[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBm.d();
    }
}

