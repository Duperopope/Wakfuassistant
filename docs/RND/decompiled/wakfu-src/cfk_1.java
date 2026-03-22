/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFK
 */
class cfk_1
implements cgz_1 {
    final /* synthetic */ bsg_1 mWU;
    final /* synthetic */ afd mWV;
    final /* synthetic */ float mWW;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfk_1(bsg_1 bsg_12, afd afd2, float f2) {
        this.mWU = bsg_12;
        this.mWV = afd2;
        this.mWW = f2;
    }

    @Override
    public void eKD() {
        this.mWU.a((afe)this.mWV, this.mWW);
        aeg_2.caa().a((aef_2)this.mWU, this.mWV.getKey());
    }

    @Override
    public void cancel() {
        cAY.eHc().eT(this.mWU.c(this.mWV));
    }
}

