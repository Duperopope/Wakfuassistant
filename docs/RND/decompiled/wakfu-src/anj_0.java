/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aNj
 */
public class anj_0
implements aqz_2 {
    protected int o;
    protected int ehO;
    protected int efU;
    protected int emS;
    protected int emT;
    protected int emU;
    protected boolean ekA;
    protected int emV;
    protected boolean emW;
    protected int ekB;
    protected String eik;
    protected aLD ehd;

    public int d() {
        return this.o;
    }

    public int clf() {
        return this.ehO;
    }

    public int cji() {
        return this.efU;
    }

    public int cqq() {
        return this.emS;
    }

    public int cqr() {
        return this.emT;
    }

    public int cqs() {
        return this.emU;
    }

    public boolean cnO() {
        return this.ekA;
    }

    public int cqt() {
        return this.emV;
    }

    public boolean cqu() {
        return this.emW;
    }

    public int cnP() {
        return this.ekB;
    }

    public String clB() {
        return this.eik;
    }

    public aLD ckt() {
        return this.ehd;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehO = 0;
        this.efU = 0;
        this.emS = 0;
        this.emT = 0;
        this.emU = 0;
        this.ekA = false;
        this.emV = 0;
        this.emW = false;
        this.ekB = 0;
        this.eik = null;
        this.ehd = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.efU = aqh_12.bGI();
        this.emS = aqh_12.bGI();
        this.emT = aqh_12.bGI();
        this.emU = aqh_12.bGI();
        this.ekA = aqh_12.bxv();
        this.emV = aqh_12.bGI();
        this.emW = aqh_12.bxv();
        this.ekB = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        if (aqh_12.aTf() != 0) {
            this.ehd = new aLD();
            this.ehd.a(aqh_12);
        } else {
            this.ehd = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozc.d();
    }
}

