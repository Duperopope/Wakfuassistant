/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aON
 */
public class aon_0
implements aqz_2 {
    protected int o;
    protected int atn;
    protected int ciZ;
    protected boolean euE;
    protected int[] egL;

    public int d() {
        return this.o;
    }

    public int aHp() {
        return this.atn;
    }

    public int aVt() {
        return this.ciZ;
    }

    public boolean cyo() {
        return this.euE;
    }

    public int[] cjX() {
        return this.egL;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.atn = 0;
        this.ciZ = 0;
        this.euE = false;
        this.egL = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.atn = aqh_12.bGI();
        this.ciZ = aqh_12.bGI();
        this.euE = aqh_12.bxv();
        this.egL = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozK.d();
    }
}

