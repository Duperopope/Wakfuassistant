/*
 * Decompiled with CFR 0.152.
 */
public class fvG {
    protected int ejX;
    protected String eik;
    protected fvF[] tzr;
    protected int ejZ;
    protected int eka;
    protected fvH[] tzs;
    protected int ekc;

    public int cnm() {
        return this.ejX;
    }

    public String clB() {
        return this.eik;
    }

    public fvF[] gol() {
        return this.tzr;
    }

    public int cno() {
        return this.ejZ;
    }

    public int cnp() {
        return this.eka;
    }

    public fvH[] gom() {
        return this.tzs;
    }

    public int cnr() {
        return this.ekc;
    }

    public void a(aqh_1 aqh_12) {
        int n;
        this.ejX = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        int n2 = aqh_12.bGI();
        this.tzr = new fvF[n2];
        for (n = 0; n < n2; ++n) {
            this.tzr[n] = new fvF();
            this.tzr[n].a(aqh_12);
        }
        this.ejZ = aqh_12.bGI();
        this.eka = aqh_12.bGI();
        n = aqh_12.bGI();
        this.tzs = new fvH[n];
        for (int i = 0; i < n; ++i) {
            this.tzs[i] = new fvH();
            this.tzs[i].a(aqh_12);
        }
        this.ekc = aqh_12.bGI();
    }
}

