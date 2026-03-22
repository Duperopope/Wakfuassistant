/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJH
 */
class cjh_1
implements ffd_2 {
    final /* synthetic */ Runnable neG;
    final /* synthetic */ cjg_1 neH;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjh_1(cjg_1 cjg_12, Runnable runnable) {
        this.neH = cjg_12;
        this.neG = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.neH.neE.b(this);
        this.neH.neE.setNeedsToPostProcess();
        this.neH.neE.a(new cji_1(this));
    }
}

