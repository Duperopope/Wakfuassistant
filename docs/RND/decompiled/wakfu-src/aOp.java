/*
 * Decompiled with CFR 0.152.
 */
public class aOp
implements aqz_2 {
    protected int o;
    protected int ehb;
    protected aLD ehd;

    public int d() {
        return this.o;
    }

    public int ckr() {
        return this.ehb;
    }

    public aLD ckt() {
        return this.ehd;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehb = 0;
        this.ehd = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ehb = aqh_12.bGI();
        if (aqh_12.aTf() != 0) {
            this.ehd = new aLD();
            this.ehd.a(aqh_12);
        } else {
            this.ehd = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozW.d();
    }
}

