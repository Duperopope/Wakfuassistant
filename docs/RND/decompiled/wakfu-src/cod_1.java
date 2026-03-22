/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOD
 */
class cod_1
implements ffd_2 {
    final /* synthetic */ Runnable nha;
    final /* synthetic */ coc_1 nhb;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cod_1(coc_1 coc_12, Runnable runnable) {
        this.nhb = coc_12;
        this.nha = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nhb.ngY.b(this);
        this.nhb.ngY.setNeedsToPostProcess();
        this.nhb.ngY.a(new coe_1(this));
    }
}

