/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhn
 */
final class bhn_0
extends eyj_0 {
    private final qt_1 igg;
    final /* synthetic */ bgt_0 igh;

    bhn_0(bgt_0 bgt_02, qt_1 qt_12) {
        this.igh = bgt_02;
        this.igg = qt_12;
        this.igg.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.dor().error((Object)("[NATION] " + this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        fjn_0 fjn_02 = this.igh.ffF();
        fjn_02.tO(this.igg.VG);
    }
}

