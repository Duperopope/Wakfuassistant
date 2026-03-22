/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGg
 */
class cgg_2
implements cgz_1 {
    final /* synthetic */ bsg_1 mXT;
    final /* synthetic */ afd mXU;
    final /* synthetic */ float mXV;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgg_2(bsg_1 bsg_12, afd afd2, float f2) {
        this.mXT = bsg_12;
        this.mXU = afd2;
        this.mXV = f2;
    }

    @Override
    public void eKD() {
        this.mXT.a((afe)this.mXU, this.mXV);
        aeg_2.caa().a((aef_2)this.mXT, this.mXU.getKey());
    }

    @Override
    public void cancel() {
        cAY.eHc().eU(this.mXT.c(this.mXU));
    }
}

