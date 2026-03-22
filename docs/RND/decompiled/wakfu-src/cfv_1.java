/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFV
 */
class cfv_1
implements cgz_1 {
    final /* synthetic */ bsg_1 mXp;
    final /* synthetic */ afd mXq;
    final /* synthetic */ float mXr;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfv_1(bsg_1 bsg_12, afd afd2, float f2) {
        this.mXp = bsg_12;
        this.mXq = afd2;
        this.mXr = f2;
    }

    @Override
    public void eKD() {
        this.mXp.a((afe)this.mXq, this.mXr);
        aeg_2.caa().a((aef_2)this.mXp, this.mXq.getKey());
    }

    @Override
    public void cancel() {
        cAY.eHc().eV(this.mXp.c(this.mXq));
    }
}

