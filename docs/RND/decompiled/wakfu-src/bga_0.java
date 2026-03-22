/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bgA
 */
class bga_0
implements ZJ {
    final /* synthetic */ eza_0 icC;
    final /* synthetic */ bdj_2 icD;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bga_0(bgy bgy2, eza_0 eza_02, bdj_2 bdj_22) {
        this.icC = eza_02;
        this.icD = bdj_22;
    }

    @Override
    public void animationEnded(ZC zC) {
        adj_0 adj_02 = ((ado_0)((Object)this.icC)).bvp();
        if (this.icD.buU() != adj_02 || adj_02 == null) {
            return;
        }
        adj_02.e(this.icD.bvI(), this.icD.bvJ(), this.icD.bvK() + this.icD.aKu());
        this.icD.b(this);
    }
}

