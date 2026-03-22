/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVv
 */
class bvv_2
implements ZJ {
    final /* synthetic */ afk_0 lsb;
    final /* synthetic */ afx_1 lsc;
    final /* synthetic */ int lsd;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bvv_2(bvu_1 bvu_12, afk_0 afk_02, afx_1 afx_12, int n) {
        this.lsb = afk_02;
        this.lsc = afx_12;
        this.lsd = n;
    }

    @Override
    public void animationEnded(ZC zC) {
        this.lsb.b(this);
        this.lsc.xK(this.lsd);
    }
}

