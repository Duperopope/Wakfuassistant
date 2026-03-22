/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cQr
 */
class cqr_1
implements adm_0 {
    final /* synthetic */ cqq_1 nlc;

    cqr_1(cqq_1 cqq_12) {
        this.nlc = cqq_12;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        ads_02.c(this.nlc.nlb);
        if (!this.nlc.bxO()) {
            return;
        }
        bhJ bhJ2 = (bhJ)this.nlc.cqO;
        int n3 = bhJ2.bcC() - ads_02.bcC();
        int n4 = bhJ2.bcD() - ads_02.bcD();
        if (Math.abs(n3) <= 1 && Math.abs(n4) <= 1) {
            ads_02.a(acq_1.bo(n3, n4));
            ckd_0 ckd_02 = new ckd_0();
            ckd_02.nd(bhJ2.Sn());
            aue_0.cVJ().etu().d(ckd_02);
        }
    }
}

