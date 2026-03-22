/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOu
 */
class cou_1
implements ffd_2 {
    final /* synthetic */ Runnable ngL;
    final /* synthetic */ cot_2 ngM;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cou_1(cot_2 cot_22, Runnable runnable) {
        this.ngM = cot_22;
        this.ngL = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ngM.ngJ.b(this);
        this.ngM.ngJ.setNeedsToPostProcess();
        this.ngM.ngJ.a(new cov_2(this));
    }
}

