/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cKZ
 */
class ckz_2
implements ffd_2 {
    final /* synthetic */ Runnable neU;
    final /* synthetic */ cky_1 neV;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ckz_2(cky_1 cky_12, Runnable runnable) {
        this.neV = cky_12;
        this.neU = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.neV.neS.b(this);
        this.neV.neS.setNeedsToPostProcess();
        this.neV.neS.a(new cla_1(this));
    }
}

