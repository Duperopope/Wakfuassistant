/*
 * Decompiled with CFR 0.152.
 */
public class aOI {
    protected int o;
    protected int euh;
    protected int eui;
    protected short euj;
    protected aoh_0[] euk;
    protected aoh_0[] eul;

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

    public aoh_0[] cxU() {
        return this.euk;
    }

    public aoh_0[] cxV() {
        return this.eul;
    }

    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.euh = aqh_12.bGI();
        this.eui = aqh_12.bGI();
        this.euj = aqh_12.bGG();
        int n2 = aqh_12.bGI();
        this.euk = new aoh_0[n2];
        for (n = 0; n < n2; ++n) {
            this.euk[n] = new aoh_0();
            this.euk[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.eul = new aoh_0[n];
        for (int i = 0; i < n; ++i) {
            this.eul[i] = new aoh_0();
            this.eul[i].a(aqh_12);
        }
    }
}

