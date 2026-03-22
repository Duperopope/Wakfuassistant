/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhC
 */
final class bhc_0
extends eyj_0 {
    private final sg_1 igY;
    final /* synthetic */ bhx_0 igZ;

    bhc_0(bhx_0 bhx_02, sg_1 sg_12) {
        this.igZ = bhx_02;
        this.igY = sg_12;
        this.igY.DM().a(this);
    }

    @Override
    public void zl() {
        throw new UnsupportedOperationException("Le client ne devrait pas s\u00e9rialiser les donn\u00e9es sp\u00e9cifiques de collect du NPC");
    }

    @Override
    public void zm() {
        int n = this.igY.Zd.size();
        for (int i = 0; i < n; ++i) {
            si_1 si_12 = this.igY.Zd.get(i);
            this.igZ.igL.add(si_12.Zg);
        }
    }
}

