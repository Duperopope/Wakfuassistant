/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJv
 */
class cjv_2
implements ffd_2 {
    final /* synthetic */ Runnable ney;
    final /* synthetic */ cju_1 nez;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjv_2(cju_1 cju_12, Runnable runnable) {
        this.nez = cju_12;
        this.ney = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nez.new.b(this);
        this.ney.run();
    }
}

