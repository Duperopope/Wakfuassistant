/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLW
 */
class clw_1
implements ffd_2 {
    final /* synthetic */ Runnable nfD;
    final /* synthetic */ clv_2 nfE;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clw_1(clv_2 clv_22, Runnable runnable) {
        this.nfE = clv_22;
        this.nfD = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nfE.nfB.b(this);
        this.nfE.nfB.setNeedsToPostProcess();
        this.nfE.nfB.a(new clx_1(this));
    }
}

