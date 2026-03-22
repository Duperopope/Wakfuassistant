/*
 * Decompiled with CFR 0.152.
 */
class aJH
implements adi_0 {
    final /* synthetic */ bsi_0 ebF;
    final /* synthetic */ aJI ebG;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aJH(bsi_0 bsi_02, aJI aJI2) {
        this.ebF = bsi_02;
        this.ebG = aJI2;
    }

    public void a(ZH zH, boolean bl, boolean bl2) {
        if (!bl) {
            cxq_1.eWO().a(zH);
            aIp.d(zH);
            return;
        }
        fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
        if (fes_22 != null && fes_22 != fbj_1.getInstance()) {
            return;
        }
        aIp.b(zH);
        dci_0 dci_02 = new dci_0(zH, 0);
        if (aJC.a(this.ebF, this.ebG.chQ(), dci_02)) {
            cxq_1.eWO().a(dci_02);
        }
    }
}

