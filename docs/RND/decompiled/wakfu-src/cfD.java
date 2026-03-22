/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cfD
extends ceK<cqq_0, bsj_0> {
    private static final Logger lTc = Logger.getLogger(cfD.class);

    cfD() {
    }

    public boolean c(cqq_0 cqq_02) {
        if (this.jkR != null) {
            cfC.lTb.lSZ = true;
            cfC.lTb.lTa.i((bsj_0)this.jkR);
            aue_0.cVJ().a(ceG.euA());
            awr_0 awr_02 = new awr_0(agb_1.cbm(), eui_1.rtd.aJr(), 0, (bsj_0)this.jkR, cqq_02, cfC.lTb.lTa);
            aVi.cWF().a((bsj_0)this.jkR, (aft_2)awr_02);
            aVi.cWF().m(this.jkR);
        } else {
            lTc.error((Object)String.format("Impossible de crer le fight typeId=%d fightId=%d !", cqq_02.exZ(), cqq_02.bha()));
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.c((cqq_0)aam_22);
    }
}

