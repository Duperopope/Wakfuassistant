/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cLE
 */
class cle_1
implements ffd_2 {
    final /* synthetic */ Runnable nfn;
    final /* synthetic */ cld_1 nfo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cle_1(cld_1 cld_12, Runnable runnable) {
        this.nfo = cld_12;
        this.nfn = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nfo.nfl.b(this);
        this.nfn.run();
    }
}

