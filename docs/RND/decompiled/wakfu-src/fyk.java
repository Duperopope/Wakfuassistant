/*
 * Decompiled with CFR 0.152.
 */
public class fyk
implements aqz_2 {
    protected int elt;
    protected fyl[] tBx;

    public int coK() {
        return this.elt;
    }

    public fyl[] gqq() {
        return this.tBx;
    }

    @Override
    public void reset() {
        this.elt = 0;
        this.tBx = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.elt = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.tBx = new fyl[n];
        for (int i = 0; i < n; ++i) {
            this.tBx[i] = new fyl();
            this.tBx[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozJ.d();
    }
}

