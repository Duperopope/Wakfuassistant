/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLR
 */
public class alr_0
implements aqz_2 {
    protected int o;
    protected int cDu;
    protected int ehb;
    protected int ehc;
    protected int[] eji;
    protected aLD ehd;

    public int d() {
        return this.o;
    }

    public int bBE() {
        return this.cDu;
    }

    public int ckr() {
        return this.ehb;
    }

    public int cks() {
        return this.ehc;
    }

    public int[] cmy() {
        return this.eji;
    }

    public aLD ckt() {
        return this.ehd;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.cDu = 0;
        this.ehb = 0;
        this.ehc = 0;
        this.eji = null;
        this.ehd = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.cDu = aqh_12.bGI();
        this.ehb = aqh_12.bGI();
        this.ehc = aqh_12.bGI();
        this.eji = aqh_12.bGM();
        if (aqh_12.aTf() != 0) {
            this.ehd = new aLD();
            this.ehd.a(aqh_12);
        } else {
            this.ehd = null;
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyO.d();
    }
}

