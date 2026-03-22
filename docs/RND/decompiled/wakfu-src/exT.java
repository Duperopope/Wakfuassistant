/*
 * Decompiled with CFR 0.152.
 */
final class exT
extends eyj_0 {
    private final pl_1 pgK;
    final /* synthetic */ exP pgL;

    exT(exP exP2, pl_1 pl_12) {
        this.pgL = exP2;
        this.pgK = pl_12;
        this.pgK.DM().a(this);
    }

    @Override
    public void zl() {
        ety_0 ety_02 = this.pgL.dlK();
        this.pgK.Tq = ety_02 != null ? ety_02.d() : -1;
        this.pgK.Tr = this.pgL.fgU();
        this.pgK.Ts = this.pgL.doP();
        this.pgK.Tt = this.pgL.dOp();
        this.pgK.Tu = this.pgL.fhf();
        this.pgK.Tv = this.pgL.bcQ();
        ezw ezw2 = this.pgL.ffE();
        if (ezw2 != null) {
            this.pgK.Tw = new po_1();
            ezw2.a(this.pgK.Tw.TA);
        }
    }

    @Override
    public void zm() {
        int n = this.pgK.Tq;
        this.pgL.CI(n);
        if (n > 0) {
            this.pgL.lo(true);
            this.pgL.dny();
        }
        this.pgL.gf(this.pgK.Ts);
        this.pgL.lm(this.pgK.Tr);
        this.pgL.ll(this.pgK.Tt);
        this.pgL.lp(this.pgK.Tu);
        this.pgL.N(this.pgK.Tv);
        if (this.pgK.Tw != null) {
            ezw ezw2;
            if (this.pgK.Tw.TA.afC != null) {
                ezb_0 ezb_02;
                if (this.pgK.Tw.TA.afC.afH.acs == 1) {
                    ezb_02 = ezb_0.fmI();
                } else if (this.pgK.Tw.TA.afC.afH.acs == 2) {
                    ezb_02 = ezx.fmG();
                } else if (this.pgK.Tw.TA.afC.afH.acs == 3) {
                    ezb_02 = ezd_0.fmK();
                } else {
                    exP.pfX.error((Object)("Type d'invoc de double inconnue " + this.pgK.Tw.TA.afC.afH.acs));
                    ezb_02 = ezb_0.fmI();
                }
                ezw2 = this.pgL.dkB() != null ? ezb_02.b((short)22, this.pgL.dkB().beS(), this.pgL.dkB().beR(), false, false, false) : ezb_02.edS();
            } else {
                ezw2 = this.pgK.Tw.TA.afD != null ? eze_0.fmL().edU() : new ezw();
            }
            ezw2.b(this.pgK.Tw.TA);
            this.pgL.a(ezw2);
        }
        this.pgL.dlm();
    }
}

