/*
 * Decompiled with CFR 0.152.
 */
public class aMi {
    protected int ejX;
    protected String eik;
    protected amh_0[] ejY;
    protected int ejZ;
    protected int eka;
    protected amj_0[] ekb;
    protected int ekc;

    public int cnm() {
        return this.ejX;
    }

    public String clB() {
        return this.eik;
    }

    public amh_0[] cnn() {
        return this.ejY;
    }

    public int cno() {
        return this.ejZ;
    }

    public int cnp() {
        return this.eka;
    }

    public amj_0[] cnq() {
        return this.ekb;
    }

    public int cnr() {
        return this.ekc;
    }

    public void a(aqh_1 aqh_12) {
        int n;
        this.ejX = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        int n2 = aqh_12.bGI();
        this.ejY = new amh_0[n2];
        for (n = 0; n < n2; ++n) {
            this.ejY[n] = new amh_0();
            this.ejY[n].a(aqh_12);
        }
        this.ejZ = aqh_12.bGI();
        this.eka = aqh_12.bGI();
        n = aqh_12.bGI();
        this.ekb = new amj_0[n];
        for (int i = 0; i < n; ++i) {
            this.ekb[i] = new amj_0();
            this.ekb[i].a(aqh_12);
        }
        this.ekc = aqh_12.bGI();
    }
}

