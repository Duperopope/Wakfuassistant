/*
 * Decompiled with CFR 0.152.
 */
final class bii
extends eyj_0 {
    private final rp_2 ikg;
    final /* synthetic */ bhJ ikh;

    bii(bhJ bhJ2, rp_2 rp_22) {
        this.ikh = bhJ2;
        this.ikg = rp_22;
        this.ikg.DM().a(this);
    }

    @Override
    public void zl() {
        bhJ.dof().error((Object)"Le client ne devrait pas s\u00e9rialiser les running effects.");
    }

    @Override
    public void zm() {
        this.ikh.doc().clear();
        if (this.ikg.Xz != null) {
            if (this.ikh.bXs) {
                this.ikh.doc();
                ers_0.a(this.ikg.Xz.XD, bhJ.n(this.ikh), this.ikh);
            } else {
                this.ikh.a(this.ikg.Xz.XD);
            }
        }
    }
}

