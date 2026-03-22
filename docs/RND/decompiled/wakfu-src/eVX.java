/*
 * Decompiled with CFR 0.152.
 */
class eVX
extends evb_0 {
    final /* synthetic */ byte rAB;

    eVX(byte by) {
        this.rAB = by;
    }

    @Override
    public boolean a(exP exP2, eVw eVw2) {
        return eVw2.bcP() == this.rAB;
    }

    @Override
    protected String name() {
        return "inTeam";
    }
}

