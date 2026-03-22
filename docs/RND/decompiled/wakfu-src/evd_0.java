/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVD
 */
class evd_0
extends evb_0 {
    final /* synthetic */ pv_0 rAs;

    evd_0(pv_0 pv_02) {
        this.rAs = pv_02;
    }

    @Override
    public boolean a(exP exP2, eVw eVw2) {
        return exP2.a(this.rAs);
    }

    @Override
    protected String name() {
        return "hasProperty";
    }
}

