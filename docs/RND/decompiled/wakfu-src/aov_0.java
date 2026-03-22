/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aOv
 */
public class aov_0
implements aqz_2 {
    protected int o;
    protected short ejt;
    protected short eru;

    public int d() {
        return this.o;
    }

    public short cmL() {
        return this.ejt;
    }

    public short cuW() {
        return this.eru;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ejt = 0;
        this.eru = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ejt = aqh_12.bGG();
        this.eru = aqh_12.bGG();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAQ.d();
    }
}

