/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aaL
 */
public class aal_0 {
    public static final byte cbb = 0;
    public static final byte cbc = 1;
    public static final byte cbd = 2;
    public static final byte cbe = 3;

    public static byte a(byte by, float[] fArray) {
        switch (by) {
            case 0: {
                aah_0.brY().v(fArray);
                if (aah_0.brY().bsa()) break;
                return 1;
            }
            case 2: {
                aah_0.brY().v(fArray);
                if (aah_0.brY().bsa()) break;
                return 3;
            }
            case 1: {
                aah_0.brY().v(fArray);
                return by;
            }
        }
        return by;
    }
}

