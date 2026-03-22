/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aOJ
 */
public class aoj_0
implements aqz_2 {
    protected int o;
    protected String asF;
    protected int ehO;
    protected aLD ehd;

    public int d() {
        return this.o;
    }

    public String aGr() {
        return this.asF;
    }

    public int clf() {
        return this.ehO;
    }

    public aLD ckt() {
        return this.ehd;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.asF = null;
        this.ehO = 0;
        this.ehd = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.asF = aqh_12.bGL().intern();
        this.ehO = aqh_12.bGI();
        if (aqh_12.aTf() != 0) {
            this.ehd = new aLD();
            this.ehd.a(aqh_12);
        } else {
            this.ehd = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozG.d();
    }
}

