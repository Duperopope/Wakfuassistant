/*
 * Decompiled with CFR 0.152.
 */
public class fvw
implements aqz_2 {
    protected int o;
    protected int ehO;
    protected boolean ejv;
    protected int ejw;
    protected int ejx;
    protected String asF;

    public int d() {
        return this.o;
    }

    public int clf() {
        return this.ehO;
    }

    public boolean cmN() {
        return this.ejv;
    }

    public int cmO() {
        return this.ejw;
    }

    public int cmP() {
        return this.ejx;
    }

    public String aGr() {
        return this.asF;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehO = 0;
        this.ejv = false;
        this.ejw = 0;
        this.ejx = 0;
        this.asF = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.ejv = aqh_12.bxv();
        this.ejw = aqh_12.bGI();
        this.ejx = aqh_12.bGI();
        this.asF = aqh_12.bGL().intern();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAC.d();
    }
}

