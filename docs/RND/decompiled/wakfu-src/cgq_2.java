/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGq
 */
class cgq_2
implements cgz_1 {
    final /* synthetic */ aff mYn;
    final /* synthetic */ boolean mYo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cgq_2(aff aff2, boolean bl) {
        this.mYn = aff2;
        this.mYo = bl;
    }

    @Override
    public void eKD() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mYn);
        if (bl == this.mYo) {
            return;
        }
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mYn, this.mYo);
        cfj_1.reloadTheme(null);
    }

    @Override
    public void cancel() {
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mYn.getKey());
    }
}

