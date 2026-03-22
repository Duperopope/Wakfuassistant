/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhd
 */
final class bhd_0
extends eyj_0 {
    private final qw_1 ifM;
    final /* synthetic */ bgt_0 ifN;

    bhd_0(bgt_0 bgt_02, qw_1 qw_12) {
        this.ifN = bgt_02;
        this.ifM = qw_12;
        this.ifM.DM().a(this);
    }

    @Override
    public void zl() {
        bgt_0.dof().error((Object)(this.getClass().getSimpleName() + " shouldn't be serialized client-side"));
    }

    @Override
    public void zm() {
        ((bjo_1)this.ifN.dpI()).a(bgt_0.m(this.ifN), this.ifM.UP);
        ((bjo_1)this.ifN.dpI()).ew(this.ifM.UQ);
        this.ifN.dlk();
    }
}

