/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOl
 */
class col_2
implements ffd_2 {
    final /* synthetic */ Runnable ngw;
    final /* synthetic */ cok_2 ngx;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    col_2(cok_2 cok_22, Runnable runnable) {
        this.ngx = cok_22;
        this.ngw = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ngx.ngu.b(this);
        this.ngx.ngu.setNeedsToPostProcess();
        this.ngx.ngu.a(new com_1(this));
    }
}

