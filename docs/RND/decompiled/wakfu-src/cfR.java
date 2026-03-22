/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cfR
extends ceK<cql_0, bsj_0> {
    private static final Logger lTh = Logger.getLogger(cfR.class);

    cfR() {
    }

    public boolean a(cql_0 cql_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 == null) {
            lTh.warn((Object)"on re\u00e7oit un message de s\u00e9lection de pointEffect hors combat !?");
            return false;
        }
        bgy bgy2 = bsj_02.dGQ().kC(cql_02.OO());
        aWo aWo2 = new aWo(agb_1.cbm(), 0, eui_1.rtk.aJr(), bgy2, cql_02.eyT());
        aVi.cWF().a((bsj_0)this.jkR, (aft_2)aWo2);
        aVi.cWF().m(this.jkR);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cql_0)aam_22);
    }
}

