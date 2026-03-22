/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLu
 */
public class alu_0
implements aqz_2 {
    protected int o;
    protected int eii;
    protected int eij;
    protected String eik;
    protected String eil;
    protected boolean eim;
    protected aop_0 ein;

    public int d() {
        return this.o;
    }

    public int clz() {
        return this.eii;
    }

    public int clA() {
        return this.eij;
    }

    public String clB() {
        return this.eik;
    }

    public String clC() {
        return this.eil;
    }

    public boolean clD() {
        return this.eim;
    }

    public aop_0 clE() {
        return this.ein;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.eii = 0;
        this.eij = 0;
        this.eik = null;
        this.eil = null;
        this.eim = false;
        this.ein = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eii = aqh_12.bGI();
        this.eij = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        this.eil = aqh_12.bGL().intern();
        this.eim = aqh_12.bxv();
        this.ein = new aop_0();
        this.ein.a(aqh_12);
    }

    @Override
    public final int bGA() {
        return ewj_2.oyz.d();
    }
}

