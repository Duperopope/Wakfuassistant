/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLo
 */
public class alo_0
implements aqz_2 {
    protected int o;
    protected short ehQ;
    protected int ehR;
    protected int[] ehS;

    public int d() {
        return this.o;
    }

    public short clh() {
        return this.ehQ;
    }

    public int cli() {
        return this.ehR;
    }

    public int[] clj() {
        return this.ehS;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehQ = 0;
        this.ehR = 0;
        this.ehS = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ehQ = aqh_12.bGG();
        this.ehR = aqh_12.bGI();
        this.ehS = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAF.d();
    }
}

