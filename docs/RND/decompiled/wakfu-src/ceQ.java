/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class ceQ
extends ceK<cqv_0, bsj_0> {
    private static Logger oO = Logger.getLogger(ceQ.class);

    ceQ() {
    }

    public boolean a(cqv_0 cqv_02) {
        awo_0 awo_02 = new awo_0(agb_1.cbm(), eui_1.rtj.aJr(), 0, ((bsj_0)this.jkR).d());
        awo_02.az(cqv_02.bcP());
        awo_02.dO(cqv_02.eyz());
        awo_02.dP(cqv_02.eyy());
        awo_02.eY(cqv_02.OO());
        awo_02.c(cqv_02.eyB());
        aVi.cWF().a((bsj_0)this.jkR, (aft_2)awo_02);
        aVi.cWF().m(this.jkR);
        return false;
    }

    private void a(bgy bgy2, byte[] byArray, byte[] byArray2) {
        if (bgy2 == null) {
            return;
        }
        bgy2.a((bsj_0)this.jkR, byArray, byArray2);
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqv_0)aam_22);
    }
}

