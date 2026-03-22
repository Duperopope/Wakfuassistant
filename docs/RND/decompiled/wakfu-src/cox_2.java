/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOx
 */
class cox_2
implements ffd_2 {
    final /* synthetic */ Runnable ngQ;
    final /* synthetic */ cow_1 ngR;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cox_2(cow_1 cow_12, Runnable runnable) {
        this.ngR = cow_12;
        this.ngQ = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ngR.ngO.b(this);
        this.ngR.ngO.setNeedsToPostProcess();
        this.ngR.ngO.a(new coy_2(this));
    }
}

