/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aaP
 */
class aap_0
extends agb {
    private static final float cbi = 0.005f;
    private final agg_0 cbj = new agg_0();
    private float cbk = 0.1f;
    private float cbl = 0.1f;
    private float cbm = 1.0f;
    private float aPY;
    private float aPZ;
    private float bRL;

    aap_0(aaj_0 aaj_02) {
        super(aaj_02);
        this.cbj.setSpeed(2.0f);
        this.cbj.cF(0.005f);
    }

    @Override
    public float bsf() {
        return 0.0f;
    }

    @Override
    public float bsg() {
        return 0.0f;
    }

    @Override
    public final float bsh() {
        return this.aPY;
    }

    @Override
    public final float bsi() {
        return this.aPZ;
    }

    @Override
    public float aRX() {
        return 0.0f;
    }

    @Override
    public final float getZoomFactor() {
        return this.bRL;
    }

    @Override
    public void qy(int n) {
        this.cbj.sj(n);
        if (this.byG()) {
            this.byF();
        }
    }

    final void a(agf agf2, float f2, float f3, float f4) {
        this.cbk = f2;
        this.cbl = f3;
        this.bRL = this.cbm = f4;
        if (agf2 == null) {
            this.aPY = 0.0f;
            this.aPZ = 0.0f;
            this.cbj.cG(0.0f);
        } else {
            this.aPY = agf2.bsh();
            this.aPZ = agf2.bsi();
            this.cbj.cG(agf2.getAltitude());
        }
        this.byH();
    }

    final void a(aag_0 aag_02, boolean bl, int n) {
        this.c(aag_02);
        this.cbj.aS(aag_02.getAltitude());
        this.qy(n);
        this.a(aag_02, bl);
    }

    private void c(aag_0 aag_02) {
        float f2 = aag_02.bsh() * this.cbk;
        float f3 = aag_02.bsi() * this.cbk;
        if (this.bsh() != f2 || this.bsi() != f3) {
            this.aPY = f2;
            this.aPZ = f3;
            this.byH();
        }
    }

    private void a(aag_0 aag_02, boolean bl) {
        float f2 = aag_02.getZoomFactor() - 1.0f;
        float f3 = 0.005f * this.cbj.getValue();
        float f4 = this.cbm + (f2 + f3) * this.cbl;
        if (this.getZoomFactor() != f4) {
            this.bRL = f4;
            this.byH();
        }
    }
}

