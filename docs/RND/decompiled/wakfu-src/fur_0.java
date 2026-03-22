/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fuR
 */
public class fur_0
implements aqz_2 {
    protected int eic;
    protected int eid;
    protected int eie;
    protected int eif;
    protected int ehO;

    public int clt() {
        return this.eic;
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

    @Override
    public void reset() {
        this.eic = 0;
        this.eid = 0;
        this.eie = 0;
        this.eif = 0;
        this.ehO = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.eic = aqh_12.bGI();
        this.eid = aqh_12.bGI();
        this.eie = aqh_12.bGI();
        this.eif = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyy.d();
    }
}

