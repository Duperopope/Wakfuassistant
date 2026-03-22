/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhG
 */
final class bhg_0
extends eyj_0 {
    private final sm_1 ihg;
    final /* synthetic */ bhx_0 ihh;

    bhg_0(bhx_0 bhx_02, sm_1 sm_12) {
        this.ihh = bhx_02;
        this.ihg = sm_12;
        this.ihg.DM().a(this);
    }

    @Override
    public void zl() {
        bhx_0.dog().error((Object)"Le client ne devrait pas s\u00e9rialiser les donn\u00e9es sp\u00e9cifiques templates NPC");
    }

    @Override
    public void zm() {
        this.ihh.igN = this.ihg.Zn;
        this.ihh.igM = this.ihg.Zo;
    }
}

