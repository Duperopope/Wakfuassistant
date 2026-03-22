/*
 * Decompiled with CFR 0.152.
 */
public class aLy
implements aqz_2 {
    protected int eiu;
    protected int ehO;
    protected int eig;
    protected byte eih;
    protected int asA;
    protected int eiv;
    protected aLz[] eiw;

    public int clL() {
        return this.eiu;
    }

    public int clf() {
        return this.ehO;
    }

    public int clx() {
        return this.eig;
    }

    public byte cly() {
        return this.eih;
    }

    public int azv() {
        return this.asA;
    }

    public int clM() {
        return this.eiv;
    }

    public aLz[] clN() {
        return this.eiw;
    }

    @Override
    public void reset() {
        this.eiu = 0;
        this.ehO = 0;
        this.eig = 0;
        this.eih = 0;
        this.asA = 0;
        this.eiv = 0;
        this.eiw = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.eiu = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.eig = aqh_12.bGI();
        this.eih = aqh_12.aTf();
        this.asA = aqh_12.bGI();
        this.eiv = aqh_12.bGI();
        int n = aqh_12.bGI();
        this.eiw = new aLz[n];
        for (int i = 0; i < n; ++i) {
            this.eiw[i] = new aLz();
            this.eiw[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyC.d();
    }
}

