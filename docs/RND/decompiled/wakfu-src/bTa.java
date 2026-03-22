/*
 * Decompiled with CFR 0.152.
 */
public final class bTa
implements fpn<bjw_0> {
    public static final bTa lmC = new bTa();

    private bTa() {
    }

    @Override
    public void a(bjw_0 bjw_02) {
        bjy_0 bjy_02 = bjy_0.HK(bjw_02.d());
        switch (bjy_02) {
            case kmK: {
                this.b(bjw_02);
            }
        }
    }

    private void b(bjw_0 bjw_02) {
        bJr bJr2 = (bJr)bjw_02.doW();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.dkZ() != null) {
            return;
        }
        if (bgt_02.ffF().Xt() != bJr2.gfT()) {
            return;
        }
        if (!bgt_02.ffF().a(fkK.sCl)) {
            return;
        }
        String string2 = aum_0.cWf().c("attacked.protector.joinInFight", String.format("<b>%s</b>", bJr2.getName()));
        fiq_2.gCw().d(fik_2.a(string -> {
            boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljb);
            cks cks2 = new cks(bJr2.d(), bl);
            aue_0.cVJ().etu().d(cks2);
        }).vE(string2).vG(ccp_2.mRJ.byf()).abQ(1));
    }
}

