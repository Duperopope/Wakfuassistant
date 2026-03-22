/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cMh
 */
class cmh_2
implements ffd_2 {
    final /* synthetic */ Runnable nfX;
    final /* synthetic */ cmg_1 nfY;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cmh_2(cmg_1 cmg_12, Runnable runnable) {
        this.nfY = cmg_12;
        this.nfX = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nfY.nfV.b(this);
        this.nfY.nfV.setNeedsToPostProcess();
        this.nfY.nfV.a(new cmi_2(this));
    }
}

