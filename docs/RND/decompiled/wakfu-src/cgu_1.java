/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGu
 */
class cgu_1
implements cgz_1 {
    final /* synthetic */ afd mYw;
    final /* synthetic */ boolean mYx;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgu_1(afd afd2, boolean bl) {
        this.mYw = afd2;
        this.mYx = bl;
    }

    @Override
    public void eKD() {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mYw, this.mYx);
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mYw.getKey());
    }

    @Override
    public void cancel() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mYw);
        cAY.eHc().jw(bl);
    }
}

