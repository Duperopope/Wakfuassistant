/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhe
 */
final class bhe_0
extends eyj_0 {
    private final qm_2 ifO;
    final /* synthetic */ bgt_0 ifP;

    bhe_0(bgt_0 bgt_02, qm_2 qm_22) {
        this.ifP = bgt_02;
        this.ifO = qm_22;
        this.ifO.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.dou().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        this.ifP.cLw = this.ifO.Ux;
    }
}

