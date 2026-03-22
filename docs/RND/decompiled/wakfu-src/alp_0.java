/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aLP
 */
public class alp_0
implements aqz_2 {
    protected int o;
    protected short eja;
    protected short ejb;
    protected short aWL;
    protected short aWK;

    public int d() {
        return this.o;
    }

    public short cmq() {
        return this.eja;
    }

    public short cmr() {
        return this.ejb;
    }

    public short aVf() {
        return this.aWL;
    }

    public short aVe() {
        return this.aWK;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.eja = 0;
        this.ejb = 0;
        this.aWL = 0;
        this.aWK = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eja = aqh_12.bGG();
        this.ejb = aqh_12.bGG();
        this.aWL = aqh_12.bGG();
        this.aWK = aqh_12.bGG();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAV.d();
    }
}

