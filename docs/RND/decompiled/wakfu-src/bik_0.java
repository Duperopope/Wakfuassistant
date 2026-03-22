/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bik
 */
final class bik_0
extends eyj_0 {
    private final st_2 ikk;
    final /* synthetic */ bhJ ikl;

    bik_0(bhJ bhJ2, st_2 st_22) {
        this.ikl = bhJ2;
        this.ikk = st_22;
        this.ikk.DM().a(this);
    }

    @Override
    public void zl() {
        throw new UnsupportedOperationException("Pas de serialisation dans le client (Server->Client only)");
    }

    @Override
    public void zm() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.ikl == bgt_02) {
            if (this.ikk.YD) {
                this.ikl.ddI().setAlpha(this.ikl.ddI().bqk());
            } else {
                this.ikl.ddI().bR(0.5f);
            }
        } else {
            this.ikl.ddI().setVisible(this.ikk.YD);
        }
    }
}

