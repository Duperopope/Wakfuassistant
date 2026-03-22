/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cgg
extends ceK<cqh_0, bsi_0> {
    private static final Logger lTn = Logger.getLogger(cgg.class);

    cgg() {
    }

    public boolean a(cqh_0 cqh_02) {
        long l = cqh_02.OO();
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            lTn.error((Object)("Personnage id=" + l + " lors du traitement d'un " + cqh_0.class.getSimpleName()));
            return false;
        }
        if (this.a(cqh_02, l, bgy2)) {
            this.a(cqh_02, bgy2);
        }
        return false;
    }

    private void a(cqh_0 cqh_02, bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2();
        apn_0.a(ahv_22, "characterName_" + bgy2.Sn(), bgy2.getName());
        String string = cqh_02.exU() ? "fight.callForHelp" : "fight.cancelCallForHelp";
        aPd.g(string, ahv_22.ceL());
    }

    private boolean a(cqh_0 cqh_02, long l, bgy bgy2) {
        bsi_0 bsi_02 = bgy2.dkW();
        if (bsi_02 == null) {
            bsj_0 bsj_02 = bgy2.dkZ();
            if (bsj_02 == null) {
                lTn.error((Object)("No fight info found for the player with the id " + l + " when he asked for help"));
                return false;
            }
            bsj_02.h(bgy2.bcP(), cqh_02.exU());
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bsj_02 == bgt_02.dkZ() && bsj_02.kp(cqh_02.OO()) == bgt_02.bcP()) {
                fse_1.gFu().f("currentFightRequestHelp", cqh_02.exU());
            }
        } else {
            bsi_02.h(bgy2.bcP(), cqh_02.exU());
            aJL.a(bsi_02, bgy2.bcP(), cqh_02.exU());
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqh_0)aam_22);
    }
}

