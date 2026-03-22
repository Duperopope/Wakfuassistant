/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWh
 */
class awh_0
implements adm_0 {
    final /* synthetic */ bgy huq;
    final /* synthetic */ awf_0 hur;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    awh_0(awf_0 awf_02, bgy bgy2) {
        this.hur = awf_02;
        this.huq = bgy2;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        this.hur.a(ads_02, this.huq);
        ads_02.c(this);
    }
}

