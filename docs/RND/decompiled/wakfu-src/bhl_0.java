/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhl
 */
final class bhl_0
extends eyj_0 {
    private final sn_1 igc;
    final /* synthetic */ bgt_0 igd;

    bhl_0(bgt_0 bgt_02, sn_1 sn_12) {
        this.igd = bgt_02;
        this.igc = sn_12;
        this.igc.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.dok().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        this.igd.iiX = new bmw_0(this.igd);
        this.igd.iiX.dkB().b(this.igc.Yo);
    }
}

