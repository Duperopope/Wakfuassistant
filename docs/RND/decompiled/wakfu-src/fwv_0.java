/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fwv
 */
public class fwv_0
implements aqz_2 {
    protected int o;
    protected byte emI;

    public int d() {
        return this.o;
    }

    public byte cqg() {
        return this.emI;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.emI = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.emI = aqh_12.aTf();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAt.d();
    }
}

