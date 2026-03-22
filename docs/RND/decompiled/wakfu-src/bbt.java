/*
 * Decompiled with CFR 0.152.
 */
class bbt
implements adi_0 {
    final /* synthetic */ eSS hAj;
    final /* synthetic */ ZH hAk;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bbt(bbs bbs2, eSS eSS2, ZH zH) {
        this.hAj = eSS2;
        this.hAk = zH;
    }

    public void a(ZH zH, boolean bl, boolean bl2) {
        if (bl) {
            Object object;
            fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
            if (fes_22 != null && fes_22 != fbj_1.getInstance()) {
                return;
            }
            qu_0 qu_02 = this.hAj.bci();
            StringBuilder stringBuilder = new StringBuilder();
            if (qu_02 != null) {
                stringBuilder.append(" [").append(((bgy)qu_02).getName()).append("] ");
            }
            stringBuilder.append(aum_0.cWf().a(6, (long)((int)this.hAj.bcw()), new Object[0]));
            pr_0 pr_02 = this.hAj.fIB();
            pt_0 pt_02 = pr_02.aYQ();
            if (pt_02 == exx_2.rGi) {
                object = "hp.var";
                stringBuilder.append(" (").append(aum_0.cWf().c("hp.var", this.hAj.c(pt_02))).append(")");
            }
            object = new dci_0(this.hAk, 0);
            ((dci_0)object).at(stringBuilder.toString(), null);
            cxq_1.eWO().a((dci_0)object);
        } else {
            cxq_1.eWO().a(this.hAk);
        }
    }
}

