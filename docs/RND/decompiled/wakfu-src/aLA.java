/*
 * Decompiled with CFR 0.152.
 */
public class aLA
implements aqz_2 {
    protected int o;
    protected boolean bKS;
    protected int eiy;
    protected int eiz;
    protected String bKP;

    public int d() {
        return this.o;
    }

    public boolean bkX() {
        return this.bKS;
    }

    public int clP() {
        return this.eiy;
    }

    public int clQ() {
        return this.eiz;
    }

    public String getText() {
        return this.bKP;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.bKS = false;
        this.eiy = 0;
        this.eiz = 0;
        this.bKP = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.bKS = aqh_12.bxv();
        this.eiy = aqh_12.bGI();
        this.eiz = aqh_12.bGI();
        this.bKP = aqh_12.bGL().intern();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyD.d();
    }
}

