/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aNy
 */
public class any_0
implements aqz_2 {
    protected int o;
    protected int ena;
    protected int ejK;
    protected short ejt;

    public int d() {
        return this.o;
    }

    public int cqy() {
        return this.ena;
    }

    public int IO() {
        return this.ejK;
    }

    public short cmL() {
        return this.ejt;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ena = 0;
        this.ejK = 0;
        this.ejt = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ena = aqh_12.bGI();
        this.ejK = aqh_12.bGI();
        this.ejt = aqh_12.bGG();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAU.d();
    }
}

