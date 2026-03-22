/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOo
 */
class coo_2
implements ffd_2 {
    final /* synthetic */ Runnable ngB;
    final /* synthetic */ conn_1 ngC;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    coo_2(conn_1 conn_12, Runnable runnable) {
        this.ngC = conn_12;
        this.ngB = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ngC.ngz.b(this);
        this.ngC.ngz.setNeedsToPostProcess();
        this.ngC.ngz.a(new cop_1(this));
    }
}

