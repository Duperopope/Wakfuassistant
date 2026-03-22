/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLQ
 */
class clq_2
implements ffd_2 {
    final /* synthetic */ Runnable nft;
    final /* synthetic */ clp_1 nfu;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clq_2(clp_1 clp_12, Runnable runnable) {
        this.nfu = clp_12;
        this.nft = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nfu.nfr.b(this);
        this.nfu.nfr.setNeedsToPostProcess();
        this.nfu.nfr.a(new clr_2(this));
    }
}

