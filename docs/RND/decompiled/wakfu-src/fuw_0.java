/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fuW
 */
public class fuw_0
implements aqz_2 {
    protected int o;
    protected byte eis;
    protected int[] eit;

    public int d() {
        return this.o;
    }

    public byte clJ() {
        return this.eis;
    }

    public int[] clK() {
        return this.eit;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.eis = 0;
        this.eit = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eis = aqh_12.aTf();
        this.eit = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAq.d();
    }
}

