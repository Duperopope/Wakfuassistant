/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOi
 */
class coi_2
implements ffd_2 {
    final /* synthetic */ Runnable ngr;
    final /* synthetic */ coh_1 ngs;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    coi_2(coh_1 coh_12, Runnable runnable) {
        this.ngs = coh_12;
        this.ngr = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ngs.ngp.b(this);
        this.ngs.ngp.setNeedsToPostProcess();
        this.ngs.ngp.a(new coj_2(this));
    }
}

