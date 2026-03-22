/*
 * Decompiled with CFR 0.152.
 */
public class aLz {
    protected int o;
    protected int eid;
    protected int eie;
    protected int eif;
    protected int eix;
    protected String eik;
    protected aop_0 ein;

    public int d() {
        return this.o;
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

    public int clO() {
        return this.eix;
    }

    public String clB() {
        return this.eik;
    }

    public aop_0 clE() {
        return this.ein;
    }

    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eid = aqh_12.bGI();
        this.eie = aqh_12.bGI();
        this.eif = aqh_12.bGI();
        this.eix = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        if (aqh_12.aTf() != 0) {
            this.ein = new aop_0();
            this.ein.a(aqh_12);
        } else {
            this.ein = null;
        }
    }
}

