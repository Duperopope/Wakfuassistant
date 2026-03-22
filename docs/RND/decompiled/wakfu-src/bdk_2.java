/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdk
 */
class bdk_2
implements adm_0 {
    final /* synthetic */ bdj_2 hKy;

    bdk_2(bdj_2 bdj_22) {
        this.hKy = bdj_22;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this);
        if (this.hKy.hKl.dkZ() != null) {
            this.hKy.hKm.ddE();
            this.hKy.hKm.ddC();
            this.hKy.hKm.bvg();
        }
    }
}

