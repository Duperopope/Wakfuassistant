/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMK
 */
public class amk_0
implements aqz_2 {
    protected int o;
    protected int elq;
    protected int ejx;
    protected int efP;
    protected int cip;

    public int d() {
        return this.o;
    }

    public int coJ() {
        return this.elq;
    }

    public int cmP() {
        return this.ejx;
    }

    public int cjd() {
        return this.efP;
    }

    public int getSoundId() {
        return this.cip;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.elq = 0;
        this.ejx = 0;
        this.efP = 0;
        this.cip = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.elq = aqh_12.bGI();
        this.ejx = aqh_12.bGI();
        this.efP = aqh_12.bGI();
        this.cip = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAm.d();
    }
}

