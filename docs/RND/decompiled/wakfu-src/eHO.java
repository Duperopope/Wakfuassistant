/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class eHO {
    private static final Logger qtg = Logger.getLogger(eHO.class);

    public boolean a(long l, byte by, int n) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qtg.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        eHZ eHZ2 = ((exP)t).dnN();
        if (eHZ2 == null) {
            return false;
        }
        eHZ2.fj(by, n);
        return true;
    }

    public static boolean a(long l, byte by, byte by2, int n) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qtg.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        eHZ eHZ2 = ((exP)t).dnN();
        if (eHZ2 == null) {
            return false;
        }
        ehy_0 ehy_02 = new ehy_0();
        if (by2 >= 0) {
            eIj eIj2 = ((exP)t).dnK().PR(by2);
            if (eIj2 == null) {
                eHZ2.a(by, ehy_02);
                return true;
            }
            ehy_02.dz((short)n);
        }
        eHZ2.a(by, ehy_02);
        return true;
    }

    public static boolean a(long l, byte by, ehy_0 ehy_02) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qtg.error((Object)("Character unknown, characterId id=" + l));
            return false;
        }
        eHZ eHZ2 = ((exP)t).dnN();
        if (eHZ2 == null) {
            return false;
        }
        eHZ2.a(by, ehy_02);
        return true;
    }
}

