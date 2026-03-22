/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVP
 */
class evp_0
extends evb_0 {
    final /* synthetic */ evb_0 rAz;

    evp_0(evb_0 evb_02) {
        this.rAz = evb_02;
    }

    @Override
    public boolean a(exP exP2, eVw eVw2) {
        return !this.rAz.a(exP2, eVw2);
    }

    @Override
    protected String name() {
        return "not(" + this.rAz.name() + ")";
    }
}

