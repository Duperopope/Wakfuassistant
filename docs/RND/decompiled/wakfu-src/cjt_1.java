/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJt
 */
class cjt_1
implements ffd_2 {
    final /* synthetic */ Runnable neu;
    final /* synthetic */ cjs_1 nev;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjt_1(cjs_1 cjs_12, Runnable runnable) {
        this.nev = cjs_12;
        this.neu = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nev.nes.b(this);
        this.neu.run();
    }
}

