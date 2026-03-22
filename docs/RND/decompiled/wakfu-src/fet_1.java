/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fEt
 */
class fet_1
implements fsh_2 {
    final /* synthetic */ Runnable umh;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fet_1(fes_2 fes_22, Runnable runnable) {
        this.umh = runnable;
    }

    @Override
    public void onTweenEvent(fsr_2 fsr_22, fsg_2 fsg_22) {
        fsr_22.b(this);
        if (this.umh != null) {
            this.umh.run();
        }
    }
}

