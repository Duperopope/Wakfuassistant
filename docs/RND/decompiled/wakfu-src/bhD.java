/*
 * Decompiled with CFR 0.152.
 */
final class bhD
extends eyj_0 {
    private final sa_2 iha;
    final /* synthetic */ bhx_0 ihb;

    bhD(bhx_0 bhx_02, sa_2 sa_22) {
        this.ihb = bhx_02;
        this.iha = sa_22;
        this.iha.DM().a(this);
    }

    @Override
    public void zl() {
        bhx_0.aGi().error((Object)"L'apparence du NPC ne devrait pas \u00eatre s\u00e9rialis\u00e9e par le client");
    }

    @Override
    public void zm() {
        this.ihb.igP = this.iha.YR;
        this.ihb.igQ = this.iha.YS;
    }
}

