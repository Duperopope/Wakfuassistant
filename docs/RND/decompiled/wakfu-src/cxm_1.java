/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXm
 */
class cxm_1
implements ceb_0 {
    final /* synthetic */ boolean nUZ;
    final /* synthetic */ cxk_2 nVa;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cxm_1(cxk_2 cxk_22, boolean bl) {
        this.nVa = cxk_22;
        this.nUZ = bl;
    }

    @Override
    public void euw() {
        fyw_0.gqw().gqP();
        fbj_1.getInstance().LZ(0);
        fbj_1.getInstance().LY(0);
        this.nVa.nUU.eus();
        fbj_1.getInstance().setVisible(false);
    }

    @Override
    public void eux() {
        this.nVa.nPK = true;
        aue_0 aue_02 = aue_0.cVJ();
        if (this.nUZ) {
            aue_02.a(cxs_1.eXb());
            cxs_1.eXb().dRJ();
        }
        bci_2.hDG.daM();
        if (aue_02.cVK().dnv()) {
            aue_02.a(cyv_2.eXZ());
        }
        this.nVa.nUU.clean();
    }
}

