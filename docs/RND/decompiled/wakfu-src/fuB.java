/*
 * Decompiled with CFR 0.152.
 */
public class fuB
implements aqz_2 {
    protected int efP;
    protected int[] egN;
    protected int[] egO;

    public int cjd() {
        return this.efP;
    }

    public int[] cjY() {
        return this.egN;
    }

    public int[] cjZ() {
        return this.egO;
    }

    @Override
    public void reset() {
        this.efP = 0;
        this.egN = null;
        this.egO = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.efP = aqh_12.bGI();
        this.egN = aqh_12.bGM();
        this.egO = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAT.d();
    }
}

