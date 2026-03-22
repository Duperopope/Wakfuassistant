/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cMn
 */
class cmn_2
implements ffd_2 {
    final /* synthetic */ Runnable ngh;
    final /* synthetic */ cmm_2 ngi;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cmn_2(cmm_2 cmm_22, Runnable runnable) {
        this.ngi = cmm_22;
        this.ngh = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.ngi.ngf.b(this);
        this.ngi.ngf.setNeedsToPostProcess();
        this.ngi.ngf.a(new cmo_2(this));
    }
}

