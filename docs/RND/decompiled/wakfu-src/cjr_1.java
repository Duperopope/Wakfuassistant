/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJr
 */
class cjr_1
implements ffd_2 {
    final /* synthetic */ Runnable neq;
    final /* synthetic */ cjq_1 ner;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjr_1(cjq_1 cjq_12, Runnable runnable) {
        this.ner = cjq_12;
        this.neq = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ner.neo.b(this);
        this.neq.run();
    }
}

