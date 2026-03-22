/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLC
 */
class clc_1
implements ffd_2 {
    final /* synthetic */ Runnable nfj;
    final /* synthetic */ clb_1 nfk;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clc_1(clb_1 clb_12, Runnable runnable) {
        this.nfk = clb_12;
        this.nfj = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nfk.nfh.b(this);
        this.nfj.run();
    }
}

