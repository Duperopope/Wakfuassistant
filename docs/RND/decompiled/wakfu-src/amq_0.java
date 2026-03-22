/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMq
 */
public class amq_0
implements aqz_2 {
    protected int o;
    protected amt_0[] ekt;
    protected aLD ehd;

    public int d() {
        return this.o;
    }

    public amt_0[] cnH() {
        return this.ekt;
    }

    public aLD ckt() {
        return this.ehd;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ekt = null;
        this.ehd = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.ekt = new amt_0[n];
        for (int i = 0; i < n; ++i) {
            this.ekt[i] = new amt_0();
            this.ekt[i].a(aqh_12);
        }
        if (aqh_12.aTf() != 0) {
            this.ehd = new aLD();
            this.ehd.a(aqh_12);
        } else {
            this.ehd = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyV.d();
    }
}

