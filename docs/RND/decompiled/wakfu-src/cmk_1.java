/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cMk
 */
class cmk_1
implements ffd_2 {
    final /* synthetic */ Runnable ngc;
    final /* synthetic */ cmj_2 ngd;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cmk_1(cmj_2 cmj_22, Runnable runnable) {
        this.ngd = cmj_22;
        this.ngc = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ngd.nga.b(this);
        this.ngd.nga.setNeedsToPostProcess();
        this.ngd.nga.a(new cml_2(this));
    }
}

