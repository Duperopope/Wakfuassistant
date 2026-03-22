/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

public class buQ {
    private buQ() {
    }

    public static String a(eyr_2 eyr_22) {
        eyv_2 eyv_22 = eyr_22.dJB();
        switch (eyv_22.fQt()) {
            case rLK: {
                ahv_2 ahv_22 = new ahv_2();
                eze_1 eze_12 = (eze_1)eyv_22;
                fak fak2 = eze_12.fQz();
                ahv_22.c(aum_0.cWf().c("storageCompartmentBonusDesc", fak2.rOO));
                return ahv_22.ceL();
            }
            case rLG: {
                ahv_2 ahv_23 = new ahv_2();
                eyy_1 eyy_12 = (eyy_1)eyv_22;
                int n = eyy_12.aZH();
                enk_0 enk_02 = bat_2.cZD().RN(n);
                eLU eLU2 = new eLU(Collections.singletonList(enk_02), 0, 0);
                ArrayList<String> arrayList = eLU2.fzQ();
                int n2 = arrayList.size();
                for (int i = 0; i < n2; ++i) {
                    ahv_23.c(arrayList.get(i));
                }
                return ahv_23.ceL();
            }
            case rLH: {
                return aum_0.cWf().c("guildBonus.increaseMaxAuthorizedEvolution", new Object[0]);
            }
            case rLI: {
                return aum_0.cWf().c("guildBonus.reduceLearningDuration", new Object[0]);
            }
            case rLL: {
                return aum_0.cWf().c("guildBonus.setWeeklyPointsLimit", new Object[0]);
            }
            case rLM: {
                return aum_0.cWf().c("guildBonus.setPointsEarnedFactor", new Object[0]);
            }
            case rLJ: {
                return aum_0.cWf().a(138, (long)eyr_22.d(), new Object[0]);
            }
            case rLO: {
                String string = aum_0.cWf().c("guildBonus.unlockHavenWorld", new Object[0]);
                if (ewo_0.oBF.k(ewr_0.oEE)) {
                    return string;
                }
                return aum_0.cWf().c("guildBonus.locked", string);
            }
            case rLP: {
                return aum_0.cWf().c("guildBonus.increaseMembersSize", ((eyx_1)eyv_22).dSU());
            }
        }
        return null;
    }

    public static boolean a(ezv_1 ezv_12, eyr_2 eyr_22, ezu_1 ezu_12) {
        return ezt_1.b(ezv_12, eyr_22, buQ.b(ezu_12));
    }

    private static double b(ezu_1 ezu_12) {
        double d2 = ezu_12.fPX().fQF();
        bjn_1 bjn_12 = aue_0.cVJ().cVK().dpI();
        float f2 = ((bjo_1)bjn_12).drm();
        float f3 = ewo_0.oBF.p(ewr_0.oEL);
        return d2 * (double)f2 / (double)f3;
    }

    public static uw_0 b(ezv_1 ezv_12, eyr_2 eyr_22, ezu_1 ezu_12) {
        return ezt_1.a(ezv_12, eyr_22, buQ.b(ezu_12));
    }

    public static uw_0 c(ezv_1 ezv_12, eyr_2 eyr_22, ezu_1 ezu_12) {
        return ezt_1.d(ezv_12, eyr_22, ezu_12.fPX().fQH());
    }

    public static boolean b(eyr_2 eyr_22) {
        return eyr_22.fQq() || eyr_22.Ty();
    }
}

