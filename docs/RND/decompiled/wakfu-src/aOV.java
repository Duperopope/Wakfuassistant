/*
 * Decompiled with CFR 0.152.
 */
public class aOV
implements aqz_2 {
    protected int euR;
    protected int eid;
    protected int eie;
    protected int eif;
    protected int ehO;
    protected int eig;
    protected byte eih;
    protected boolean euS;
    protected String euT;
    protected int cxt;
    protected int efP;
    protected aop_0 ein;

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

    public int clx() {
        return this.eig;
    }

    public byte cly() {
        return this.eih;
    }

    public boolean cyC() {
        return this.euS;
    }

    public String cyD() {
        return this.euT;
    }

    public int wp() {
        return this.cxt;
    }

    public int cjd() {
        return this.efP;
    }

    public aop_0 clE() {
        return this.ein;
    }

    @Override
    public void reset() {
        this.euR = 0;
        this.eid = 0;
        this.eie = 0;
        this.eif = 0;
        this.ehO = 0;
        this.eig = 0;
        this.eih = 0;
        this.euS = false;
        this.euT = null;
        this.cxt = 0;
        this.efP = 0;
        this.ein = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.euR = aqh_12.bGI();
        this.eid = aqh_12.bGI();
        this.eie = aqh_12.bGI();
        this.eif = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.eig = aqh_12.bGI();
        this.eih = aqh_12.aTf();
        this.euS = aqh_12.bxv();
        this.euT = aqh_12.bGL().intern();
        this.cxt = aqh_12.bGI();
        this.efP = aqh_12.bGI();
        if (aqh_12.aTf() != 0) {
            this.ein = new aop_0();
            this.ein.a(aqh_12);
        } else {
            this.ein = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozN.d();
    }
}

