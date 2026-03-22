/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abK
 */
class abk_0
implements abw_1 {
    final /* synthetic */ abj_0 ceL;

    abk_0(abj_0 abj_02) {
        this.ceL = abj_02;
    }

    @Override
    public final float h(float f2, float f3, float f4) {
        float f5 = GC.b(f4 * this.ceL.cez + this.ceL.ceA, 0.0f, 1.0f);
        return f5 * this.ceL.ceB + (1.0f - this.ceL.ceB);
    }

    @Override
    public final aca_1 btn() {
        return abx_2.dAn;
    }
}

