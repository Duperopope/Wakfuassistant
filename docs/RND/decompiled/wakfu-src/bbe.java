/*
 * Decompiled with CFR 0.152.
 */
class bbe
implements adi_0 {
    final /* synthetic */ ZH hzQ;
    final /* synthetic */ eSS hzR;
    final /* synthetic */ bbd_0 hzS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bbe(bbd_0 bbd_02, ZH zH, eSS eSS2) {
        this.hzS = bbd_02;
        this.hzQ = zH;
        this.hzR = eSS2;
    }

    public void a(ZH zH, boolean bl, boolean bl2) {
        if (bl) {
            fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
            if (fes_22 != null && fes_22 != fbj_1.getInstance()) {
                return;
            }
            dci_0 dci_02 = new dci_0(this.hzQ, 0);
            dci_02.at(this.hzS.b(this.hzR), null);
            cxq_1.eWO().a(dci_02);
        } else {
            cxq_1.eWO().a(this.hzQ);
        }
        this.hzR.fg(bl);
    }
}

