/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aED
 */
public interface aed_1 {
    public static final String dGF = ",";
    public static final double dGG = 0.0;
    public static final float dGH = 0.0f;
    public static final int dGI = 0;
    public static final long dGJ = 0L;
    public static final String dGK = "";
    public static final Set<Short> dGL = Collections.emptySet();

    public static boolean hv(String string) {
        return Boolean.parseBoolean(string);
    }

    public static double hw(String string) {
        if (string == null) {
            return 0.0;
        }
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0.0;
        }
    }

    public static float hx(String string) {
        if (string == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0.0f;
        }
    }

    public static int hy(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    public static long hz(String string) {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
    }

    @NotNull
    @Contract(value="!null -> param1", pure=true)
    public static String hA(String string) {
        if (string == null) {
            return dGK;
        }
        return string;
    }

    @NotNull
    public static Set<Short> hB(String string) {
        if (string == null) {
            return dGL;
        }
        HashSet<Short> hashSet = new HashSet<Short>();
        String[] stringArray = string.split(dGF);
        for (int i = 0; i < stringArray.length; ++i) {
            try {
                hashSet.add(Short.parseShort(stringArray[i]));
                continue;
            }
            catch (NumberFormatException numberFormatException) {
                if (!hashSet.isEmpty()) {
                    return hashSet;
                }
                return dGL;
            }
        }
        return hashSet;
    }

    public Set<String> bxf();

    public Map<String, String> bxg();

    default public boolean hC(String string) {
        return this.n(string, false);
    }

    default public boolean hD(String string) {
        if (!this.n(string, true)) {
            return false;
        }
        try {
            Integer.parseInt(this.ep(string));
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }

    public boolean n(String var1, boolean var2);

    public boolean eq(String var1);

    default public boolean hE(String string) {
        return this.eq(string) && !this.n(string, true);
    }

    public String ep(String var1);

    default public boolean aK(String string) {
        return aed_1.hv(this.ep(string));
    }

    default public double bY(String string) {
        return aed_1.hw(this.ep(string));
    }

    default public float bX(String string) {
        return aed_1.hx(this.ep(string));
    }

    default public int hF(String string) {
        return aed_1.hy(this.ep(string));
    }

    default public long hG(String string) {
        return aed_1.hz(this.ep(string));
    }

    @NotNull
    default public String bS(String string) {
        return aed_1.hA(this.ep(string));
    }

    default public Set<Short> hH(String string) {
        return aed_1.hB(this.ep(string));
    }

    public String er(String var1);

    default public boolean hI(String string) {
        return aed_1.hv(this.er(string));
    }

    default public double hJ(String string) {
        return aed_1.hw(this.er(string));
    }

    default public float hK(String string) {
        return aed_1.hx(this.er(string));
    }

    default public int hL(String string) {
        return aed_1.hy(this.er(string));
    }

    default public long hM(String string) {
        return aed_1.hz(this.er(string));
    }

    default public String hN(String string) {
        return aed_1.hA(this.er(string));
    }

    default public Set<Short> hO(String string) {
        return aed_1.hB(this.er(string));
    }
}

