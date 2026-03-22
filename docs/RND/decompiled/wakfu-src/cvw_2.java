/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVw
 */
class cvw_2
implements asi_2 {
    boolean nPK;
    final asp_2 nPL = new cvx_2(this);
    final /* synthetic */ cdv_0 nPM;
    final /* synthetic */ bgt_0 nPN;
    final /* synthetic */ aue_0 nPO;
    final /* synthetic */ bgt_0 nPP;
    final /* synthetic */ long nPQ;
    final /* synthetic */ byte nPR;
    final /* synthetic */ cvv_2 nPS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cvw_2(cvv_2 cvv_22, cdv_0 cdv_02, bgt_0 bgt_02, aue_0 aue_02, bgt_0 bgt_03, long l, byte by) {
        this.nPS = cvv_22;
        this.nPM = cdv_02;
        this.nPN = bgt_02;
        this.nPO = aue_02;
        this.nPP = bgt_03;
        this.nPQ = l;
        this.nPR = by;
    }

    @Override
    public void bud() {
    }

    @Override
    public void bue() {
    }

    @Override
    public void buf() {
        cvh_1 cvh_12;
        this.nPM.a(new cvy_2(this));
        asj_2.bJt().a(this.nPL);
        this.nPM.eut();
        if (this.nPO.c(cxt_2.eXB())) {
            this.nPO.b(cxt_2.eXB());
        }
        if (this.nPO.c(cxs_2.nXl)) {
            this.nPO.b(cxs_2.nXl);
        }
        if (this.nPO.c(czj_2.eYW())) {
            this.nPO.b(czj_2.eYW());
        }
        if (this.nPO.c(cvh_12 = bDr.dQP())) {
            this.nPO.b(cvh_12);
        }
        fse_1.gFu().f("isInOwnHavenWorld", bDr.la(this.nPN.aqZ()));
    }

    @Override
    public void bug() {
        this.nPS.nPG = false;
        bvk.dJZ().clean();
        if (this.nPN.dpO()) {
            bvk.dJZ().bkZ();
        }
        asj_2.bJt().b(this);
        asj_2.bJt().b(this.nPL);
        fbj_1.getInstance().setVisible(true);
        aUm.cUI().cD(true);
        ctu_2.nJd.ePN();
        long l = 1L + (System.currentTimeMillis() - this.nPQ) / 1000L;
        if (l < (long)this.nPR) {
            cyt_1.eXX().eXY().bZ((byte)Math.max(0L, (long)this.nPR - l));
        }
        if (this.nPS.nPJ != null) {
            abg_2.bUP().i(this.nPS.nPJ);
        }
    }
}

