/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVI
 */
class evi_0
extends evb_0 {
    final /* synthetic */ exP rAt;

    evi_0(exP exP2) {
        this.rAt = exP2;
    }

    @Override
    public boolean a(exP exP2, eVw eVw2) {
        return eVw2.qZ(this.rAt.Sn());
    }

    @Override
    protected String name() {
        return "controlledBy";
    }
}

