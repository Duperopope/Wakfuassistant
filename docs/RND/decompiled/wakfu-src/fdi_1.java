/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDi
 */
class fdi_1
implements ffg_2 {
    final /* synthetic */ faw_2 udC;
    final /* synthetic */ Runnable udD;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fdi_1(fdh_1 fdh_12, faw_2 faw_22, Runnable runnable) {
        this.udC = faw_22;
        this.udD = runnable;
    }

    @Override
    public void onVisibilityChanged(boolean bl, boolean bl2) {
        this.udC.b(this);
        this.udD.run();
    }
}

