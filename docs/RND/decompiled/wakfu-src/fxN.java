/*
 * Decompiled with CFR 0.152.
 */
public class fxN
implements aqz_2 {
    protected int o;
    protected int ehb;
    protected fvd tyG;

    public int d() {
        return this.o;
    }

    public int ckr() {
        return this.ehb;
    }

    public fvd gnz() {
        return this.tyG;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehb = 0;
        this.tyG = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ehb = aqh_12.bGI();
        if (aqh_12.aTf() != 0) {
            this.tyG = new fvd();
            this.tyG.a(aqh_12);
        } else {
            this.tyG = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozW.d();
    }
}

