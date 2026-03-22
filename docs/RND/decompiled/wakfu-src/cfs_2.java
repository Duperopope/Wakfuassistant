/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFS
 */
class cfs_2
implements cgz_1 {
    final /* synthetic */ bsn_1 mXj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cfs_2(bsn_1 bsn_12) {
        this.mXj = bsn_12;
    }

    @Override
    public void eKD() {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(this.mXj);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)this.mXj, !bl);
    }

    @Override
    public void cancel() {
        aeg_2.caa().a((aef_2)aie_0.cfn().bmH(), this.mXj.getKey());
    }
}

