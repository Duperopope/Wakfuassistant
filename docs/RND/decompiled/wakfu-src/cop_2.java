/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOP
 */
class cop_2
implements ffd_2 {
    final /* synthetic */ Runnable nhu;
    final /* synthetic */ coo_1 nhv;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cop_2(coo_1 coo_12, Runnable runnable) {
        this.nhv = coo_12;
        this.nhu = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nhv.nhs.b(this);
        this.nhv.nhs.setNeedsToPostProcess();
        this.nhv.nhs.a(new coq_2(this));
    }
}

