/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from Wx
 */
public class wx_0 {
    private static final Logger bNZ = Logger.getLogger(wx_0.class);
    public static final byte bOa = -16;
    public static final byte bOb = 15;
    public static final int bOc = 4;
    public static final int bOd = 0;
    public static final byte bOe = 0;
    public static final byte bOf = 1;
    public static final byte bOg = 2;
    public static final byte bOh = 3;
    public static final byte bOi = 4;
    public static final byte bOj = 5;

    public static ww_0 ak(byte by) {
        byte by2 = (byte)((by & 0xF) >> 0);
        switch (by2) {
            case 0: {
                return new WE();
            }
            case 1: {
                return new WF();
            }
            case 2: {
                return new WG();
            }
            case 3: {
                return new WI();
            }
            case 4: {
                return new WJ();
            }
            case 5: {
                return new WK();
            }
        }
        bNZ.error((Object)("Type de map inconnu " + by2));
        return null;
    }
}

