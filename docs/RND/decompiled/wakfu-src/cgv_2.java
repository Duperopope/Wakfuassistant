/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGv
 */
class cgv_2
implements cgz_1 {
    final /* synthetic */ afd mYy;
    final /* synthetic */ boolean mYz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgv_2(afd afd2, boolean bl) {
        this.mYy = afd2;
        this.mYz = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mYy, this.mYz);
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mYy.getKey());
    }

    @Override
    public void cancel() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mYy);
        cAY.eHc().jD(bl);
    }
}

