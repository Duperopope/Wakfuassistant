/*
 * Decompiled with CFR 0.152.
 */
public class fuC
implements aqz_2 {
    protected int o;
    protected int[] egL;
    protected int[] tyB;

    public int d() {
        return this.o;
    }

    public int[] cjX() {
        return this.egL;
    }

    public int[] gnu() {
        return this.tyB;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.egL = null;
        this.tyB = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.egL = aqh_12.bGM();
        this.tyB = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAa.d();
    }
}

