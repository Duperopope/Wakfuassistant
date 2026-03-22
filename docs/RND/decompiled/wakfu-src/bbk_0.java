/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bbK
 */
class bbk_0
implements adm_0 {
    final /* synthetic */ bgt_0 hBo;
    final /* synthetic */ bbj_0 hBp;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bbk_0(bbj_0 bbj_02, bgt_0 bgt_02) {
        this.hBp = bbj_02;
        this.hBo = bgt_02;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        int n3 = this.hBo.aZw().A(this.hBp.hBk.dcP().aZw());
        if (n3 == 1) {
            this.hBp.hBm.a(this.hBp.hBl, this.hBp.hBk.Sn());
        }
        ads_02.c(this);
    }
}

