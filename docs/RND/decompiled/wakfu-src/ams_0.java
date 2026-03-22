/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMs
 */
public class ams_0 {
    protected int o;
    protected String eik;
    protected float ekw;
    protected aMr[] ekx;

    public int d() {
        return this.o;
    }

    public String clB() {
        return this.eik;
    }

    public float cnK() {
        return this.ekw;
    }

    public aMr[] cnL() {
        return this.ekx;
    }

    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        this.ekw = aqh_12.bGH();
        int n = aqh_12.bGI();
        this.ekx = new aMr[n];
        for (int i = 0; i < n; ++i) {
            this.ekx[i] = new aMr();
            this.ekx[i].a(aqh_12);
        }
    }
}

