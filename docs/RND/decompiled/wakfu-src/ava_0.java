/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aVA
 */
class ava_0
implements adm_0 {
    final /* synthetic */ bgy hti;
    final /* synthetic */ avz_0 htj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ava_0(avz_0 avz_02, bgy bgy2) {
        this.htj = avz_02;
        this.hti = bgy2;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        abi_1 abi_12 = this.hti.bcB();
        if (abi_12.bVO()) {
            ads_02.a(abi_12);
        } else {
            avz_0.aGh().error((Object)"LE MOBILE SE TROUVE DANS UNE DIRECTION 8 A LA FIN D'UN MOUVEMENT");
            ads_02.a(abi_12.wI(0));
        }
        this.htj.K(this.hti);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.htj.hte.contains(bgt_02.Sn())) {
            bgt_02.fZ(true);
        }
        ads_02.c(this);
    }
}

