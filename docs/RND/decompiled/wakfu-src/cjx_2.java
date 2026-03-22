/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJx
 */
class cjx_2
implements ffd_2 {
    final /* synthetic */ Runnable neC;
    final /* synthetic */ cjw_2 neD;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjx_2(cjw_2 cjw_22, Runnable runnable) {
        this.neD = cjw_22;
        this.neC = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.neD.neA.b(this);
        this.neC.run();
    }
}

