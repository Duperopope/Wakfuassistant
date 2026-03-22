/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fwG
 */
public class fwg_0
implements aqz_2 {
    protected int o;
    protected int ehb;
    protected int emZ;
    protected fvd tyG;

    public int d() {
        return this.o;
    }

    public int ckr() {
        return this.ehb;
    }

    public int cqx() {
        return this.emZ;
    }

    public fvd gnz() {
        return this.tyG;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehb = 0;
        this.emZ = 0;
        this.tyG = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ehb = aqh_12.bGI();
        this.emZ = aqh_12.bGI();
        if (aqh_12.aTf() != 0) {
            this.tyG = new fvd();
            this.tyG.a(aqh_12);
        } else {
            this.tyG = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozf.d();
    }
}

