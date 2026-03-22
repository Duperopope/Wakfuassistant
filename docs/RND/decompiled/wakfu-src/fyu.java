/*
 * Decompiled with CFR 0.152.
 */
public class fyu
implements aqz_2 {
    protected int euR;
    protected int eid;
    protected int eie;
    protected int eif;
    protected int ehO;
    protected boolean euS;
    protected String euT;
    protected fyo tyP;

    public int cyB() {
        return this.euR;
    }

    public int clu() {
        return this.eid;
    }

    public int clv() {
        return this.eie;
    }

    public int clw() {
        return this.eif;
    }

    public int clf() {
        return this.ehO;
    }

    public boolean cyC() {
        return this.euS;
    }

    public String cyD() {
        return this.euT;
    }

    public fyo gnI() {
        return this.tyP;
    }

    @Override
    public void reset() {
        this.euR = 0;
        this.eid = 0;
        this.eie = 0;
        this.eif = 0;
        this.ehO = 0;
        this.euS = false;
        this.euT = null;
        this.tyP = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.euR = aqh_12.bGI();
        this.eid = aqh_12.bGI();
        this.eie = aqh_12.bGI();
        this.eif = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.euS = aqh_12.bxv();
        this.euT = aqh_12.bGL().intern();
        if (aqh_12.aTf() != 0) {
            this.tyP = new fyo();
            this.tyP.a(aqh_12);
        } else {
            this.tyP = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozN.d();
    }
}

