/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMf
 */
public class amf_0
implements aqz_2 {
    protected int o;
    protected String bdC;
    protected byte aZm;

    public int d() {
        return this.o;
    }

    public String getAnimName() {
        return this.bdC;
    }

    public byte aWO() {
        return this.aZm;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.bdC = null;
        this.aZm = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.bdC = aqh_12.bGL().intern();
        this.aZm = aqh_12.aTf();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAr.d();
    }
}

