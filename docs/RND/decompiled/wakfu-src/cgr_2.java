/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGr
 */
class cgr_2
implements cgz_1 {
    final /* synthetic */ afd mYp;
    final /* synthetic */ boolean mYq;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgr_2(afd afd2, boolean bl) {
        this.mYp = afd2;
        this.mYq = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mYp, this.mYq);
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mYp.getKey());
    }

    @Override
    public void cancel() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mYp);
        cAY.eHc().jB(bl);
    }
}

