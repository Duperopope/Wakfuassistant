/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class fnw {
    protected static final Logger sJp = Logger.getLogger(fnw.class);
    public static final int sJq = 1;
    public static final int sJr = 0;

    protected static boolean a(acd_1 acd_12, RH rH, boolean bl) {
        int n = bl ? 0 : 1;
        acd_1 acd_13 = rH.aZw();
        if (Math.abs(acd_13.getX() - acd_12.getX()) > n) {
            return true;
        }
        return Math.abs(acd_13.getY() - acd_12.getY()) > n;
    }
}

