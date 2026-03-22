/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVC
 */
class evc_0
extends evb_0 {
    final /* synthetic */ byte rAr;

    evc_0(byte by) {
        this.rAr = by;
    }

    @Override
    public boolean a(exP exP2, eVw eVw2) {
        return exP2.aFW() == this.rAr;
    }

    @Override
    protected String name() {
        return "ofType";
    }
}

