/*
 * Decompiled with CFR 0.152.
 */
public class fyo
implements aqz_2 {
    protected String euA;
    protected int euB;
    protected int euC;
    protected int euD;

    public String cyk() {
        return this.euA;
    }

    public int cyl() {
        return this.euB;
    }

    public int cym() {
        return this.euC;
    }

    public int cyn() {
        return this.euD;
    }

    @Override
    public void reset() {
        this.euA = null;
        this.euB = 0;
        this.euC = 0;
        this.euD = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.euA = aqh_12.bGL().intern();
        this.euB = aqh_12.bGI();
        this.euC = aqh_12.bGI();
        this.euD = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        throw new UnsupportedOperationException();
    }
}

