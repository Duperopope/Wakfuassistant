/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLZ
 */
class clz_2
implements ffd_2 {
    final /* synthetic */ Runnable nfI;
    final /* synthetic */ cly_1 nfJ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clz_2(cly_1 cly_12, Runnable runnable) {
        this.nfJ = cly_12;
        this.nfI = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nfJ.nfG.b(this);
        this.nfJ.nfG.setNeedsToPostProcess();
        this.nfJ.nfG.a(new cma_2(this));
    }
}

