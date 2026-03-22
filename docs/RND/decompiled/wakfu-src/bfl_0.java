/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bFL
 */
class bfl_0
extends fmi_2 {
    final /* synthetic */ ffV jTV;
    final /* synthetic */ bfk_1 jTW;

    bfl_0(bfk_1 bfk_12, ffV ffV2) {
        this.jTW = bfk_12;
        this.jTV = ffV2;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12 == null) {
            return false;
        }
        if (fiq_12 instanceof flp_2 && ((flp_2)fiq_12).gEm()) {
            fbj_1.getInstance().b(fzq_0.tJT, this, true);
            fhn_1.gzT().bYz();
            czi_2.eYU().b(this);
        } else if (fiq_12 instanceof flp_2 && ((flp_2)fiq_12).gEk()) {
            ffV ffV2;
            fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
            fcv_1 fcv_12 = fes_22.getParentOfType(fcv_1.class);
            if (fcv_12 == null) {
                return false;
            }
            Object object = fcv_12.getItemValue();
            if (object instanceof ffV) {
                ffV2 = (ffV)object;
            } else if (object instanceof bgp_1) {
                ffV2 = ((bgp_1)object).getItem();
            } else {
                return false;
            }
            if (ffV2.LV() == this.jTV.LV()) {
                return false;
            }
            if (ffV2.bfd() > 1) {
                aPd.e("error.rollElements.itemStack", new Object[0]);
                return false;
            }
            if (!ffV2.dOg().fYA() || ffV2.fWt()) {
                aPd.e("error.rollElements.cantReroll", new Object[0]);
                return false;
            }
            if (ffV2.cmL() > this.jTW.biD && this.jTW.biD != 0) {
                aPd.e("error.item.cantReroll", new Object[0]);
                return false;
            }
            if (this.jTV.bfd() == 1 && this.jTW.fXq()) {
                fbj_1.getInstance().b(fzq_0.tJT, this, true);
                fhn_1.gzT().bYz();
                czi_2.eYU().b(this);
            }
            this.jTW.duS = ffV2.LV();
            fiq_2.gCw().d(fik_2.a(string -> {
                this.jTW.aS(this.jTV);
                cfe_1.addRollElementsParticleToContainer(fcv_12);
            }).l("reroll.itemElementsConfirmation", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1));
        }
        return false;
    }
}

