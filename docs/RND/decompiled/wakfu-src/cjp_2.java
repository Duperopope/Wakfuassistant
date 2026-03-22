/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJp
 */
class cjp_2
implements ffd_2 {
    final /* synthetic */ Runnable nem;
    final /* synthetic */ cjo_2 nen;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjp_2(cjo_2 cjo_22, Runnable runnable) {
        this.nen = cjo_22;
        this.nem = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nen.nek.b(this);
        this.nem.run();
    }
}

