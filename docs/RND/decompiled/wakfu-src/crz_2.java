/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRZ
 */
class crz_2
implements adm_0 {
    final /* synthetic */ int nEv;
    final /* synthetic */ int nEw;
    final /* synthetic */ crx_2 nEx;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    crz_2(crx_2 crx_22, int n, int n2) {
        this.nEx = crx_22;
        this.nEv = n;
        this.nEw = n2;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        this.nEx.eE(this.nEv, this.nEw);
    }
}

