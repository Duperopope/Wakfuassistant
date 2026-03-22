/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLZ
 */
public class alz_0
implements aqz_2 {
    protected int ejy;
    protected int eid;
    protected int eie;
    protected int ehO;
    protected int eig;
    protected String ejz;
    protected byte eih;
    protected aop_0 ein;

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

    public int clx() {
        return this.eig;
    }

    public String cmR() {
        return this.ejz;
    }

    public byte cly() {
        return this.eih;
    }

    public aop_0 clE() {
        return this.ein;
    }

    @Override
    public void reset() {
        this.ejy = 0;
        this.eid = 0;
        this.eie = 0;
        this.ehO = 0;
        this.eig = 0;
        this.ejz = null;
        this.eih = 0;
        this.ein = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.ejy = aqh_12.bGI();
        this.eid = aqh_12.bGI();
        this.eie = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.eig = aqh_12.bGI();
        this.ejz = aqh_12.bGL().intern();
        this.eih = aqh_12.aTf();
        if (aqh_12.aTf() != 0) {
            this.ein = new aop_0();
            this.ein.a(aqh_12);
        } else {
            this.ein = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyS.d();
    }
}

