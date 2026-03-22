/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOM
 */
class com_2
implements ffd_2 {
    final /* synthetic */ Runnable nhp;
    final /* synthetic */ col_1 nhq;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    com_2(col_1 col_12, Runnable runnable) {
        this.nhq = col_12;
        this.nhp = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nhq.nhn.b(this);
        this.nhq.nhn.setNeedsToPostProcess();
        this.nhq.nhn.a(new conn_2(this));
    }
}

