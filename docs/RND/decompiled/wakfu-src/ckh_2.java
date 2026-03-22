/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cKH
 */
class ckh_2
implements ffd_2 {
    final /* synthetic */ Runnable neL;
    final /* synthetic */ ckg_2 neM;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ckh_2(ckg_2 ckg_22, Runnable runnable) {
        this.neM = ckg_22;
        this.neL = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.neM.neJ.b(this);
        this.neM.neJ.setNeedsToPostProcess();
        this.neM.neJ.a(new cki_2(this));
    }
}

