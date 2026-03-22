/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGw
 */
class cgw_1
implements cgz_1 {
    final /* synthetic */ afd mYA;
    final /* synthetic */ boolean mYB;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgw_1(afd afd2, boolean bl) {
        this.mYA = afd2;
        this.mYB = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mYA, this.mYB);
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mYA.getKey());
    }

    @Override
    public void cancel() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mYA);
        cAY.eHc().jC(bl);
    }
}

