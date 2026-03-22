/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMR
 */
public class amr_0
implements aqz_2 {
    protected int o;
    protected short aXy;
    protected int asz;
    protected int aXS;
    protected byte aXR;
    protected int ayV;
    protected int aXU;

    public int d() {
        return this.o;
    }

    public short clb() {
        return this.aXy;
    }

    public int aGs() {
        return this.asz;
    }

    public int AM() {
        return this.aXS;
    }

    public byte bcN() {
        return this.aXR;
    }

    public int aJe() {
        return this.ayV;
    }

    public int coU() {
        return this.aXU;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.aXy = 0;
        this.asz = 0;
        this.aXS = 0;
        this.aXR = 0;
        this.ayV = 0;
        this.aXU = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.aXy = aqh_12.bGG();
        this.asz = aqh_12.bGI();
        this.aXS = aqh_12.bGI();
        this.aXR = aqh_12.aTf();
        this.ayV = aqh_12.bGI();
        this.aXU = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyY.d();
    }
}

