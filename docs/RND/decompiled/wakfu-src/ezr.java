/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.commons.lang3.ArrayUtils
 */
import gnu.trove.list.array.TIntArrayList;
import org.apache.commons.lang3.ArrayUtils;

public class ezr {
    private static ezn[] prD;

    private ezr() {
    }

    public static boolean a(eya_2 eya_22, ezz_1 ezz_12, eyh_2 eyh_22) {
        fab fab2 = eya_22.jR(ezz_12.Xm());
        return fab2 != null && fab2.b(eyh_22);
    }

    private static void fmA() {
        if (prD == null) {
            prD = new ezn[]{ezn.pqJ, ezn.pqK, ezn.pqL, ezn.pqM, ezn.pqN, ezn.pqO, ezn.pqP, ezn.pqQ, ezn.pqR, ezn.pqS};
        }
    }

    public static ezn Pf(int n) {
        ezr.fmA();
        for (ezn ezn2 : prD) {
            eyr_2 eyr_22 = ezn2.fmw();
            ezd_1 ezd_12 = (ezd_1)eyr_22.dJB();
            if (ezd_12.fQy().fmy().d() != n) continue;
            return ezn2;
        }
        return null;
    }

    public static boolean a(ezn ezn2) {
        ezr.fmA();
        return ArrayUtils.contains((Object[])prD, (Object)((Object)ezn2));
    }

    public static boolean e(eyr_2 eyr_22) {
        eyv_2 eyv_22 = eyr_22.dJB();
        switch (eyv_22.fQt()) {
            case rLG: {
                eyy_1 eyy_12 = (eyy_1)eyv_22;
                if (eyy_12.aZH() != 0) break;
                return false;
            }
        }
        return true;
    }

    public static int[] K(int[] nArray) {
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (int n : nArray) {
            if (ezq.prB.Pe(n) == null) continue;
            tIntArrayList.add(n);
        }
        return nArray;
    }
}

