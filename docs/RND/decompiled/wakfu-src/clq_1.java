/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLq
 */
class clq_1
implements ffd_2 {
    final /* synthetic */ Runnable nfe;
    final /* synthetic */ clp_2 nff;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clq_1(clp_2 clp_22, Runnable runnable) {
        this.nff = clp_22;
        this.nfe = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nff.nfc.b(this);
        this.nff.nfc.setNeedsToPostProcess();
        this.nff.nfc.a(new clr_1(this));
    }
}

