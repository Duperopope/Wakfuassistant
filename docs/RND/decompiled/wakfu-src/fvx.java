/*
 * Decompiled with CFR 0.152.
 */
public class fvx
implements aqz_2 {
    protected int ejy;
    protected int eid;
    protected int eie;
    protected int ehO;
    protected String ejz;
    protected fyo tyP;

    public int cmQ() {
        return this.ejy;
    }

    public int clu() {
        return this.eid;
    }

    public int clv() {
        return this.eie;
    }

    public int clf() {
        return this.ehO;
    }

    public String cmR() {
        return this.ejz;
    }

    public fyo gnI() {
        return this.tyP;
    }

    @Override
    public void reset() {
        this.ejy = 0;
        this.eid = 0;
        this.eie = 0;
        this.ehO = 0;
        this.ejz = null;
        this.tyP = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.ejy = aqh_12.bGI();
        this.eid = aqh_12.bGI();
        this.eie = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.ejz = aqh_12.bGL().intern();
        if (aqh_12.aTf() != 0) {
            this.tyP = new fyo();
            this.tyP.a(aqh_12);
        } else {
            this.tyP = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyS.d();
    }
}

