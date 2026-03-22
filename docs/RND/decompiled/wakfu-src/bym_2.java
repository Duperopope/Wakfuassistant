/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bYm
 */
public final class bym_2 {
    private static final Logger lyV = Logger.getLogger(bym_2.class);

    private bym_2() {
    }

    public static boolean ms(long l) {
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.lkq);
        bse_1 bse_12 = bse_1.Jv(n).orElse(bse_1.lhH);
        switch (bse_12) {
            case lhJ: {
                return false;
            }
            case lhI: {
                long l2 = aue_0.cVJ().cVO().xl();
                return l2 == l;
            }
            case lhH: {
                return true;
            }
        }
        lyV.warn((Object)String.format("Following TitleDisplayStyle isn't managed : %s", bse_12));
        return true;
    }
}

