/*
 * Decompiled with CFR 0.152.
 */
public class fuX
implements aqz_2 {
    protected int eiu;
    protected int ehO;
    protected int asA;
    protected int eiv;
    protected fuY[] tyT;

    public int clL() {
        return this.eiu;
    }

    public int clf() {
        return this.ehO;
    }

    public int azv() {
        return this.asA;
    }

    public int clM() {
        return this.eiv;
    }

    public fuY[] gnM() {
        return this.tyT;
    }

    @Override
    public void reset() {
        this.eiu = 0;
        this.ehO = 0;
        this.asA = 0;
        this.eiv = 0;
        this.tyT = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.eiu = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.asA = aqh_12.bGI();
        this.eiv = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.tyT = new fuY[n];
        for (int i = 0; i < n; ++i) {
            this.tyT[i] = new fuY();
            this.tyT[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyC.d();
    }
}

