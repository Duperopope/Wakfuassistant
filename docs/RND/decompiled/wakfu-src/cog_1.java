/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOG
 */
class cog_1
implements ffd_2 {
    final /* synthetic */ Runnable nhf;
    final /* synthetic */ cof_1 nhg;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cog_1(cof_1 cof_12, Runnable runnable) {
        this.nhg = cof_12;
        this.nhf = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nhg.nhd.b(this);
        this.nhg.nhd.setNeedsToPostProcess();
        this.nhg.nhd.a(new coh_2(this));
    }
}

