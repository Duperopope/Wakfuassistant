/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXk
 */
class cxk_2
implements asi_2 {
    boolean nPK;
    private final asp_2 nUS = new cxl_1(this);
    final /* synthetic */ aue_0 nUT;
    final /* synthetic */ cdv_0 nUU;
    final /* synthetic */ bgt_0 nUV;
    final /* synthetic */ long nUW;
    final /* synthetic */ byte nUX;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cxk_2(cxh_2 cxh_22, aue_0 aue_02, cdv_0 cdv_02, bgt_0 bgt_02, long l, byte by) {
        this.nUT = aue_02;
        this.nUU = cdv_02;
        this.nUV = bgt_02;
        this.nUW = l;
        this.nUX = by;
    }

    @Override
    public void bud() {
    }

    @Override
    public void bue() {
    }

    @Override
    public void buf() {
        boolean bl = this.nUT.c(cxs_1.eXb());
        this.nUU.a(new cxm_1(this, bl));
        asj_2.bJt().a(this.nUS);
        this.nUU.eut();
        if (this.nUT.c(cxt_2.eXB())) {
            this.nUT.b(cxt_2.eXB());
        }
        if (this.nUT.c(cxs_2.nXl)) {
            this.nUT.b(cxs_2.nXl);
        }
        if (this.nUT.c(czj_2.eYW())) {
            this.nUT.b(czj_2.eYW());
        }
    }

    @Override
    public void bug() {
        asj_2.bJt().b(this);
        asj_2.bJt().b(this.nUS);
        fbj_1.getInstance().setVisible(true);
        aUm.cUI().cD(true);
        this.nUV.fZ(true);
        long l = 1L + (System.currentTimeMillis() - this.nUW) / 1000L;
        if (l < (long)this.nUX) {
            cyt_1.eXX().eXY().bZ((byte)Math.max(0L, (long)this.nUX - l));
        }
    }
}

