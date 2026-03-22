/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYa
 */
public class aya_0 {
    public static String b(aoh_1 aoh_12) {
        switch (aoh_12.bEl()) {
            case cLh: {
                return null;
            }
            case cLv: {
                return aum_0.cWf().c("all", new Object[0]);
            }
            case cLk: 
            case cLp: {
                aon_1 aon_12 = (aon_1)aoh_12;
                if (aon_12.bEE() == 0) {
                    return "" + aon_12.bED();
                }
                if (aon_12.bED() == 0) {
                    return "" + aon_12.bEE();
                }
                return aon_12.bEE() + "x" + aon_12.bED();
            }
            case cLi: {
                aoz_2 aoz_22 = (aoz_2)aoh_12;
                return "" + aoz_22.getRadius();
            }
            case cLl: {
                aom_1 aom_12 = (aom_1)aoh_12;
                return "" + aom_12.bEw();
            }
            case cLm: {
                aol_2 aol_22 = (aol_2)aoh_12;
                return aol_22.getHeight() + "x" + aol_22.getWidth();
            }
        }
        return null;
    }
}

