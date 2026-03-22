/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ccs
 */
class ccs_0
implements adm_0 {
    final /* synthetic */ abi_1 lOO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ccs_0(cco_0 cco_02, abi_1 abi_12) {
        this.lOO = abi_12;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.a(this.lOO);
        ads_02.c(this);
    }
}

