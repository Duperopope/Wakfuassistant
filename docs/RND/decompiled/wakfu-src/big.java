/*
 * Decompiled with CFR 0.152.
 */
final class big
extends eyj_0 {
    private final rl_2 ikc;
    final /* synthetic */ bhJ ikd;

    big(bhJ bhJ2, rl_2 rl_22) {
        this.ikd = bhJ2;
        this.ikc = rl_22;
        this.ikc.DM().a(this);
    }

    @Override
    public void zl() {
        throw new UnsupportedOperationException("Pas de serialisation dans le client (Server->Client only)");
    }

    @Override
    public void zm() {
        if (this.ikd.dmc()) {
            return;
        }
        if (this.ikc.Wx != null) {
            this.ikd.c(this.ikc.Wx.WB, this.ikc.Wx.WC, this.ikc.Wx.WD, this.ikc.Wx.WE, this.ikc.Wx.WF);
        } else {
            this.ikd.dpd();
        }
        if (this.ikc.Ww != null) {
            this.ikd.b(this.ikc.Ww.WB, this.ikc.Ww.WC, this.ikc.Ww.WD, this.ikc.Ww.WE, this.ikc.Ww.WF);
        } else {
            this.ikd.dpc();
        }
        fse_1.gFu().a((aef_2)this.ikd, "canRide");
    }
}

