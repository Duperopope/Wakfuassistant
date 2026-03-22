/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCg
 */
class bcg_0
implements adm_0 {
    final /* synthetic */ bdj_2 jGX;
    final /* synthetic */ fdg_0 jGY;
    final /* synthetic */ bCd jGZ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bcg_0(bCd bCd2, bdj_2 bdj_22, fdg_0 fdg_02) {
        this.jGZ = bCd2;
        this.jGX = bdj_22;
        this.jGY = fdg_02;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        this.jGX.c(this);
        if (n == this.jGZ.bcC() && n2 == this.jGZ.bcD()) {
            this.jGZ.a(this.jGX, this.jGY);
        }
    }
}

