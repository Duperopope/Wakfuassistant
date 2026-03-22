/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOf
 */
class cof_2
implements ffd_2 {
    final /* synthetic */ Runnable ngm;
    final /* synthetic */ coe_2 ngn;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cof_2(coe_2 coe_22, Runnable runnable) {
        this.ngn = coe_22;
        this.ngm = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ngn.ngk.b(this);
        this.ngn.ngk.setNeedsToPostProcess();
        this.ngn.ngk.a(new cog_2(this));
    }
}

