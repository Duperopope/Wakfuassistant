/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVW
 */
class evw_0
extends evb_0 {
    final /* synthetic */ long rAA;

    evw_0(long l) {
        this.rAA = l;
    }

    @Override
    public boolean a(exP exP2, eVw eVw2) {
        return exP2.Sn() == this.rAA;
    }

    @Override
    protected String name() {
        return "withId";
    }
}

