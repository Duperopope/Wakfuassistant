/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMG
 */
public class amg_0
implements aqz_2 {
    protected int o;
    protected short ekU;
    protected int ejx;
    protected int ekV;
    protected int ekY;

    public int d() {
        return this.o;
    }

    public short coj() {
        return this.ekU;
    }

    public int cmP() {
        return this.ejx;
    }

    public int cok() {
        return this.ekV;
    }

    public int conn() {
        return this.ekY;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ekU = 0;
        this.ejx = 0;
        this.ekV = 0;
        this.ekY = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ekU = aqh_12.bGG();
        this.ejx = aqh_12.bGI();
        this.ekV = aqh_12.bGI();
        this.ekY = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAJ.d();
    }
}

