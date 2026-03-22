/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhA
 */
final class bha_0
extends eyj_0 {
    private final sc_1 igU;
    final /* synthetic */ bhx_0 igV;

    bha_0(bhx_0 bhx_02, sc_1 sc_12) {
        this.igV = bhx_02;
        this.igU = sc_12;
        this.igU.DM().a(this);
    }

    @Override
    public void zl() {
        bhx_0.aGh().error((Object)"L'apparence du NPC ne devrait pas \u00eatre s\u00e9rialis\u00e9e par le client");
    }

    @Override
    public void zm() {
        this.igV.ddI().setVisible(this.igU.YW);
        this.igV.dkr();
    }
}

