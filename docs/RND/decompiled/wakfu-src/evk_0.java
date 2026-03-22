/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVK
 */
class evk_0
extends evb_0 {
    final /* synthetic */ byte rAv;

    evk_0(byte by) {
        this.rAv = by;
    }

    @Override
    public boolean a(exP exP2, eVw eVw2) {
        return exP2.fhg() == this.rAv;
    }

    @Override
    protected String name() {
        return "controllerInTeam";
    }
}

