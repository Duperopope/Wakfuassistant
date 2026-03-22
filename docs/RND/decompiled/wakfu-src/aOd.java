/*
 * Decompiled with CFR 0.152.
 */
public class aOd
implements aqz_2 {
    protected int o;
    protected aOe[] equ;

    public int d() {
        return this.o;
    }

    public aOe[] ctX() {
        return this.equ;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.equ = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.equ = new aOe[n];
        for (int i = 0; i < n; ++i) {
            this.equ[i] = new aOe();
            this.equ[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oBo.d();
    }
}

