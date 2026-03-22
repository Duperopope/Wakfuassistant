/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEw
 */
class few_1
implements ffd_2 {
    final /* synthetic */ Runnable umo;
    final /* synthetic */ fev_1 ump;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    few_1(fev_1 fev_12, Runnable runnable) {
        this.ump = fev_12;
        this.umo = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ump.umn.b(this);
        if (this.ump.umk.tGE) {
            this.ump.umn.setNeedsToPostProcess();
            this.ump.umn.a(new fex_2(this));
        } else {
            this.umo.run();
        }
    }
}

