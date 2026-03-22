/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOA
 */
class coa_1
implements ffd_2 {
    final /* synthetic */ Runnable ngV;
    final /* synthetic */ coz_2 ngW;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    coa_1(coz_2 coz_22, Runnable runnable) {
        this.ngW = coz_22;
        this.ngV = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ngW.ngT.b(this);
        this.ngW.ngT.setNeedsToPostProcess();
        this.ngW.ngT.a(new cob_2(this));
    }
}

