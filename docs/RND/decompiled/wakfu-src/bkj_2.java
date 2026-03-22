/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bkJ
 */
class bkj_2
implements adp_0 {
    final /* synthetic */ bdj_2 irL;
    final /* synthetic */ bkg_2 irM;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bkj_2(bkg_2 bkg_22, bdj_2 bdj_22) {
        this.irM = bkg_22;
        this.irL = bdj_22;
    }

    @Override
    public void pathStarted(ads_0 ads_02, anp_2 anp_22) {
        if (this.irM.irE != null) {
            this.irM.irE.animationEnded(this.irL);
        }
        this.irL.b(this);
    }
}

