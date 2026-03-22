/*
 * Decompiled with CFR 0.152.
 */
public class fyh {
    protected int o;
    protected int euh;
    protected int eui;
    protected short euj;
    protected fyg[] tBv;
    protected fyg[] tBw;

    public int d() {
        return this.o;
    }

    public int cxR() {
        return this.euh;
    }

    public int cxS() {
        return this.eui;
    }

    public short cxT() {
        return this.euj;
    }

    public fyg[] gqo() {
        return this.tBv;
    }

    public fyg[] gqp() {
        return this.tBw;
    }

    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.euh = aqh_12.bGI();
        this.eui = aqh_12.bGI();
        this.euj = aqh_12.bGG();
        int n2 = aqh_12.bGI();
        this.tBv = new fyg[n2];
        for (n = 0; n < n2; ++n) {
            this.tBv[n] = new fyg();
            this.tBv[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.tBw = new fyg[n];
        for (int i = 0; i < n; ++i) {
            this.tBw[i] = new fyg();
            this.tBw[i].a(aqh_12);
        }
    }
}

