/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOr
 */
class cor_2
implements ffd_2 {
    final /* synthetic */ Runnable ngG;
    final /* synthetic */ coq_1 ngH;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cor_2(coq_1 coq_12, Runnable runnable) {
        this.ngH = coq_12;
        this.ngG = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ngH.ngE.b(this);
        this.ngH.ngE.setNeedsToPostProcess();
        this.ngH.ngE.a(new cos_2(this));
    }
}

