/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aNZ
 */
public class anz_0 {
    protected int eqo;
    protected int eqp;
    protected int ekY;
    protected int bap;
    protected int baq;
    protected byte eqq;
    protected aOa[] eqr;

    public int ctR() {
        return this.eqo;
    }

    public int ctS() {
        return this.eqp;
    }

    public int conn() {
        return this.ekY;
    }

    public int getX() {
        return this.bap;
    }

    public int getY() {
        return this.baq;
    }

    public byte ctT() {
        return this.eqq;
    }

    public aOa[] ctU() {
        return this.eqr;
    }

    public void a(aqh_1 aqh_12) {
        this.eqo = aqh_12.bGI();
        this.eqp = aqh_12.bGI();
        this.ekY = aqh_12.bGI();
        this.bap = aqh_12.bGI();
        this.baq = aqh_12.bGI();
        this.eqq = aqh_12.aTf();
        int n = aqh_12.bGI();
        this.eqr = new aOa[n];
        for (int i = 0; i < n; ++i) {
            this.eqr[i] = new aOa();
            this.eqr[i].a(aqh_12);
        }
    }
}

