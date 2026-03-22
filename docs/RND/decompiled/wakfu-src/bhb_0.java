/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhB
 */
final class bhb_0
extends eyj_0 {
    private final se_1 igW;
    final /* synthetic */ bhx_0 igX;

    bhb_0(bhx_0 bhx_02, se_1 se_12) {
        this.igX = bhx_02;
        this.igW = se_12;
        this.igW.DM().a(this);
    }

    @Override
    public void zl() {
        bhx_0.aGj().error((Object)"Le client ne devrait pas s\u00e9rialiser les caract\u00e9ristiques");
    }

    @Override
    public void zm() {
        this.igX.ejt = this.igW.Xr;
    }
}

