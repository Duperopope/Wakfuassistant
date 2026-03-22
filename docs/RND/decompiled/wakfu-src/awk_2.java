/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from awk
 */
public class awk_2 {
    private static final Logger dkw = Logger.getLogger(awk_2.class);
    public static final byte dkx = 0;
    public static final byte dky = 1;
    public static final byte dkz = 2;
    public static final String dkA = "plain";
    public static final String dkB = "bold";
    public static final String dkC = "italic";
    public static final String dkD = "bordered";
    public static final String dkE = "shadowed";
    private static final HashMap<awi_2, awh_2> dkF = new HashMap();
    private static byte dkG = (byte)2;
    private static String dkH = "";

    private awk_2() {
    }

    public static void aB(byte by) {
        dkG = by;
    }

    public static void gw(String string) {
        dkH = string;
    }

    public static awh_2 a(awi_2 awi_22, boolean bl) {
        awh_2 awh_22 = awk_2.a(awi_22);
        if (awh_22 == null) {
            return awk_2.b(awi_22, bl);
        }
        return awh_22;
    }

    public static awh_2 gx(String string) {
        return awk_2.a(awi_2.gv(string), false);
    }

    public static awh_2 v(String string, boolean bl) {
        return awk_2.a(awi_2.gv(string), bl);
    }

    public static awh_2 f(String string, int n, int n2) {
        return awk_2.b(string, n, n2, false);
    }

    public static awh_2 b(String string, int n, int n2, boolean bl) {
        return awk_2.a(string, n, n2, 0, 0, bl);
    }

    public static awh_2 a(String string, int n, int n2, int n3, int n4, boolean bl) {
        awi_2 awi_22 = new awi_2(string, n, n2, n3, n4);
        return awk_2.a(awi_22, bl);
    }

    public static int B(String string, String string2) {
        int n = awk_2.gy(string);
        if (string2 == null) {
            return n;
        }
        if (string2.equals(dkD)) {
            n |= 4;
        }
        if (string2.equals(dkE)) {
            n |= 8;
        }
        return n;
    }

    public static int gy(String string) {
        int n = 0;
        if (string == null) {
            return n;
        }
        String string2 = string.toLowerCase();
        if (string2.contains(dkB)) {
            n |= 1;
        }
        if (string2.contains(dkC)) {
            n |= 2;
        }
        if (string2.contains(dkD)) {
            n |= 4;
        }
        if (string2.contains(dkE)) {
            n |= 8;
        }
        return n;
    }

    public static int gz(String string) {
        int n = string.lastIndexOf(45) + 1;
        if (n == 0) {
            return 0;
        }
        String string2 = string.substring(n);
        try {
            return Integer.parseInt(string2);
        }
        catch (Exception exception) {
            return 0;
        }
    }

    public static String gA(String string) {
        int n = string.indexOf(45);
        if (n <= 0) {
            return string;
        }
        return string.substring(0, n);
    }

    private static awh_2 a(awi_2 awi_22) {
        return dkF.get(awi_22);
    }

    private static awh_2 b(awi_2 awi_22, boolean bl) {
        boolean bl2 = awk_2.dj(bl);
        awh_2 awh_22 = awa_1.b(awi_22, dkH, bl2);
        if (awh_22 == null) {
            dkw.warn((Object)("Unable to load the font " + String.valueOf(awi_22) + " from path " + dkH));
            awh_22 = awk_2.b(awi_22);
        }
        dkF.put(awi_22, awh_22);
        return awh_22;
    }

    public static boolean dj(boolean bl) {
        return switch (dkG) {
            case 2 -> true;
            case 1 -> false;
            default -> bl;
        };
    }

    private static awh_2 b(awi_2 awi_22) {
        awh_2 awh_22 = null;
        float f2 = Float.MAX_VALUE;
        for (Map.Entry<awi_2, awh_2> entry : dkF.entrySet()) {
            awi_2 awi_23 = entry.getKey();
            float f3 = awk_2.a(awi_22, awi_23);
            if (!(f3 < f2)) continue;
            f2 = f3;
            awh_22 = entry.getValue();
        }
        return awh_22;
    }

    private static float a(awi_2 awi_22, awi_2 awi_23) {
        String string = awi_22.getName();
        int n = awi_22.bDw();
        int n2 = awi_22.bNf();
        int n3 = awi_22.getDeltaX();
        int n4 = awi_22.getDeltaY();
        String string2 = awi_23.getName();
        int n5 = awi_23.bDw();
        int n6 = awi_23.bNf();
        int n7 = awi_23.getDeltaX();
        int n8 = awi_23.getDeltaY();
        float f2 = 0.0f;
        if (!string2.equals(string)) {
            f2 += 2.0f;
        }
        f2 += (float)Math.abs(n - n5);
        if (n6 != n2) {
            f2 += 4.0f;
        }
        f2 += (float)Math.abs(n3 - n7) / 4.0f;
        return f2 += (float)Math.abs(n4 - n8) / 4.0f;
    }
}

