/*
 * Decompiled with CFR 0.152.
 */
public class aMn
implements aqz_2 {
    protected int o;
    protected int atn;

    public int d() {
        return this.o;
    }

    public int aHp() {
        return this.atn;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.atn = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.atn = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oBj.d();
    }
}

