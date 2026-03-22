/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLT
 */
class clt_2
implements ffd_2 {
    final /* synthetic */ Runnable nfy;
    final /* synthetic */ cls_1 nfz;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clt_2(cls_1 cls_12, Runnable runnable) {
        this.nfz = cls_12;
        this.nfy = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nfz.nfw.b(this);
        this.nfz.nfw.setNeedsToPostProcess();
        this.nfz.nfw.a(new clu_1(this));
    }
}

