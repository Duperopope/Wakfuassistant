/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cKX
 */
class ckx_2
implements ffd_2 {
    final /* synthetic */ Runnable neQ;
    final /* synthetic */ ckw_2 neR;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ckx_2(ckw_2 ckw_22, Runnable runnable) {
        this.neR = ckw_22;
        this.neQ = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.neR.neO.b(this);
        this.neQ.run();
    }
}

