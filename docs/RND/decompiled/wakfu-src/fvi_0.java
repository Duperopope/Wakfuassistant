/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvi
 */
public class fvi_0
implements aqz_2 {
    protected int eiT;
    protected int[] eiU;

    public int cmk() {
        return this.eiT;
    }

    public int[] cml() {
        return this.eiU;
    }

    @Override
    public void reset() {
        this.eiT = 0;
        this.eiU = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.eiT = aqh_12.bGI();
        this.eiU = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyL.d();
    }
}

