/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOJ
 */
class coj_1
implements ffd_2 {
    final /* synthetic */ Runnable nhk;
    final /* synthetic */ coi_1 nhl;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    coj_1(coi_1 coi_12, Runnable runnable) {
        this.nhl = coi_12;
        this.nhk = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.nhl.nhi.b(this);
        this.nhl.nhi.setNeedsToPostProcess();
        this.nhl.nhi.a(new cok_1(this));
    }
}

