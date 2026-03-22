/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fDk
 */
class fdk_1
implements ffg_2 {
    final /* synthetic */ faw_2 udH;
    final /* synthetic */ Runnable udI;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fdk_1(fdh_1 fdh_12, faw_2 faw_22, Runnable runnable) {
        this.udH = faw_22;
        this.udI = runnable;
    }

    @Override
    public void onVisibilityChanged(boolean bl, boolean bl2) {
        if (!bl2) {
            return;
        }
        this.udH.b(this);
        this.udI.run();
    }
}

