/*
 * Decompiled with CFR 0.152.
 */
public class aOe {
    protected int eqv;
    protected byte eqq;
    protected byte eqw;
    protected aOf[] eqx;

    public int ctY() {
        return this.eqv;
    }

    public byte ctT() {
        return this.eqq;
    }

    public byte ctZ() {
        return this.eqw;
    }

    public aOf[] cua() {
        return this.eqx;
    }

    public void a(aqh_1 aqh_12) {
        this.eqv = aqh_12.bGI();
        this.eqq = aqh_12.aTf();
        this.eqw = aqh_12.aTf();
        int n = aqh_12.bGI();
        this.eqx = new aOf[n];
        for (int i = 0; i < n; ++i) {
            this.eqx[i] = new aOf();
            this.eqx[i].a(aqh_12);
        }
    }
}

