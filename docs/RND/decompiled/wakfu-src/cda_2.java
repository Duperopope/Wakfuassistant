/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cDa
 */
public class cda_2 {
    private static final Logger mSt = Logger.getLogger(cda_2.class);
    public static final int mSu = 0;
    public static final int mSv = 1;
    public static final int mSw = 2;
    public static final int mSx = 3;
    public static final int mSy = 4;
    public static final int mSz = 5;
    public static final int mSA = 6;
    public static final int mSB = 7;
    public static final int mSC = 8;
    public static final int mSD = 9;

    private cda_2() {
    }

    public static String LS(int n) {
        try {
            return String.format(auc_0.cVq().bS("messageBoxIconsPath"), n);
        }
        catch (fu_0 fu_02) {
            mSt.warn((Object)fu_02.getMessage(), (Throwable)fu_02);
            return null;
        }
    }
}

