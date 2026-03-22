/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLI
 */
public class ali_0 {
    protected int o;
    protected short eiK;
    protected String asF;
    protected aLH[] eiP;

    public int d() {
        return this.o;
    }

    public short cmb() {
        return this.eiK;
    }

    public String aGr() {
        return this.asF;
    }

    public aLH[] cmg() {
        return this.eiP;
    }

    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eiK = aqh_12.bGG();
        this.asF = aqh_12.bGL().intern();
        int n = aqh_12.bGI();
        this.eiP = new aLH[n];
        for (int i = 0; i < n; ++i) {
            this.eiP[i] = new aLH();
            this.eiP[i].a(aqh_12);
        }
    }
}

