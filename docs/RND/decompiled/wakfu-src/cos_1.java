/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOS
 */
class cos_1
implements ffd_2 {
    final /* synthetic */ Runnable nhz;
    final /* synthetic */ cor_1 nhA;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cos_1(cor_1 cor_12, Runnable runnable) {
        this.nhA = cor_12;
        this.nhz = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nhA.nhx.b(this);
        this.nhA.nhx.setNeedsToPostProcess();
        this.nhA.nhx.a(new cot_1(this));
    }
}

