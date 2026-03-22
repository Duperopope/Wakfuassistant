/*
 * Decompiled with CFR 0.152.
 */
public class fuA
implements aqz_2 {
    protected int egM;
    protected int efP;
    protected int dfe;
    protected int[] egL;

    public int tJ() {
        return this.egM;
    }

    public int cjd() {
        return this.efP;
    }

    public int bWc() {
        return this.dfe;
    }

    public int[] cjX() {
        return this.egL;
    }

    @Override
    public void reset() {
        this.egM = 0;
        this.efP = 0;
        this.dfe = 0;
        this.egL = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.egM = aqh_12.bGI();
        this.efP = aqh_12.bGI();
        this.dfe = aqh_12.bGI();
        this.egL = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAS.d();
    }
}

