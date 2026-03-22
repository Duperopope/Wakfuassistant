/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhF
 */
final class bhf_0
extends eyj_0 {
    private final sj_1 ihe;
    final /* synthetic */ bhx_0 ihf;

    bhf_0(bhx_0 bhx_02, sj_1 sj_12) {
        this.ihf = bhx_02;
        this.ihe = sj_12;
        this.ihe.DM().a(this);
    }

    @Override
    public void zl() {
        bhx_0.aGS().error((Object)"Le client ne devrait pas s\u00e9rialiser le groupe du NPC");
    }

    @Override
    public void zm() {
        this.ihf.aZA = this.ihe.Zi;
        if (this.ihf.aZA != 0L) {
            bjl_1.dri().b(this.ihf, this.ihe.Zj);
        } else if (!this.ihf.doP() && !this.ihf.doE()) {
            bhx_0.doX().warn((Object)("D\u00e9serialisation d'un NPC id=" + bhx_0.a(this.ihf) + " avec un groupId=0 : anormal"));
        }
    }
}

