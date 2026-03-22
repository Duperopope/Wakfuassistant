/*
 * Decompiled with CFR 0.152.
 */
class cdv
implements adm_0 {
    final /* synthetic */ bgv_2 lQH;
    final /* synthetic */ bdj_2 lQI;
    final /* synthetic */ bmv_2 lQJ;
    final /* synthetic */ bgy lQK;
    final /* synthetic */ bKV lQL;
    final /* synthetic */ byte lQM;
    final /* synthetic */ cdu_0 lQN;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cdv(cdu_0 cdu_02, bgv_2 bgv_22, bdj_2 bdj_22, bmv_2 bmv_22, bgy bgy2, bKV bKV2, byte by) {
        this.lQN = cdu_02;
        this.lQH = bgv_22;
        this.lQI = bdj_22;
        this.lQJ = bmv_22;
        this.lQK = bgy2;
        this.lQL = bKV2;
        this.lQM = by;
    }

    @Override
    public void pathEnded(ads_0 ads_02, int n, int n2, short s) {
        if (this.lQH != null) {
            this.lQI.a(this.lQH, (short)ffS.sgS.shb);
        }
        this.lQN.a(this.lQJ, this.lQK, this.lQL, this.lQI, this.lQM);
        this.lQI.c(this);
    }
}

