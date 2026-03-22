/*
 * Decompiled with CFR 0.152.
 */
public class fuM
implements aqz_2 {
    protected int o;
    protected int ehO;
    protected int ehP;
    protected fvd tyG;

    public int d() {
        return this.o;
    }

    public int clf() {
        return this.ehO;
    }

    public int clg() {
        return this.ehP;
    }

    public fvd gnz() {
        return this.tyG;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehO = 0;
        this.ehP = 0;
        this.tyG = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.ehP = aqh_12.bGI();
        if (aqh_12.aTf() != 0) {
            this.tyG = new fvd();
            this.tyG.a(aqh_12);
        } else {
            this.tyG = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyx.d();
    }
}

