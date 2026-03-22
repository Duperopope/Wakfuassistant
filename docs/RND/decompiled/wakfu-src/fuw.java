/*
 * Decompiled with CFR 0.152.
 */
public class fuw
implements aqz_2 {
    protected int o;
    protected String p;
    protected String tyA;
    protected int tyq;
    protected long[] tyr;
    protected String tyu;
    protected boolean egz;

    public int d() {
        return this.o;
    }

    public String getName() {
        return this.p;
    }

    public String gnt() {
        return this.tyA;
    }

    public int bMY() {
        return this.tyq;
    }

    public long[] gnk() {
        return this.tyr;
    }

    public String gnn() {
        return this.tyu;
    }

    public boolean cjL() {
        return this.egz;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.p = null;
        this.tyA = null;
        this.tyq = 0;
        this.tyr = null;
        this.tyu = null;
        this.egz = false;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.p = aqh_12.bGL().intern();
        this.tyA = aqh_12.bGL().intern();
        this.tyq = aqh_12.bGI();
        this.tyr = aqh_12.bxz();
        this.tyu = aqh_12.bGL().intern();
        this.egz = aqh_12.bxv();
    }

    @Override
    public final int bGA() {
        return ewj_2.oys.d();
    }
}

