/*
 * Decompiled with CFR 0.152.
 */
public class fvO {
    protected int o;
    protected String eik;
    protected float ekw;
    protected fvn_0[] tzv;

    public int d() {
        return this.o;
    }

    public String clB() {
        return this.eik;
    }

    public float cnK() {
        return this.ekw;
    }

    public fvn_0[] gop() {
        return this.tzv;
    }

    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        this.ekw = aqh_12.bGH();
        int n = aqh_12.bGI();
        this.tzv = new fvn_0[n];
        for (int i = 0; i < n; ++i) {
            this.tzv[i] = new fvn_0();
            this.tzv[i].a(aqh_12);
        }
    }
}

